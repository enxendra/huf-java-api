package com.enxendra.huf.api.testStrands;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.invoice.InvoiceResponse;
import com.enxendra.huf.api.service.SentInvoiceService;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Deadlock extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST);

    public static void main(String[] args) {
        final SentInvoiceService service = new SentInvoiceService(requestOptions, new Long(355));

        try {
            int thread = 100;


            ExecutorService threads = Executors.newFixedThreadPool(thread);
            List<Callable<Boolean>> torun = new ArrayList<Callable<Boolean>>(thread);
            for (int i = 0; i < thread; i++) {
                torun.add(new Callable<Boolean>() {
                    public Boolean call() {
                        Map<String, Object> params = new HashMap<String, Object>(0);
                        params.put("num_months", "1");
                        service.statistics(params);
                        return Boolean.TRUE;
                    }
                });
                torun.add(new Callable<Boolean>() {
                    public Boolean call() {
                        Map<String, Object> params = new HashMap<String, Object>(0);
                        params.put("num_months", "1");
                        service.listInvoices(params);
                        return Boolean.TRUE;
                    }
                });
            }
            // all tasks executed in different threads, at 'once'.
            List<Future<Boolean>> futures = threads.invokeAll(torun);
            // no more need for the threadpool
            threads.shutdown();
            // check the results of the tasks...throwing the first exception, if any.
            for (Future<Boolean> fut : futures) {
                fut.get();
            }
            //check the threadpool is now in fact complete
            if (!threads.isShutdown()) {
                // something went wrong... our accounting is off...
            }
            System.out.println("Ended");


        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
