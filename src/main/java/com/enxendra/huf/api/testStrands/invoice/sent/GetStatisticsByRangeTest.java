package com.enxendra.huf.api.testStrands.invoice.sent;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.exception.HUFException;
import com.enxendra.huf.api.model.invoice.Statistics;
import com.enxendra.huf.api.model.invoice.StatisticsResponse;
import com.enxendra.huf.api.service.SentInvoiceService;
import com.enxendra.huf.api.testStrands.ServiceTest;

import java.util.HashMap;
import java.util.Map;

public class GetStatisticsByRangeTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST);

    public static void main(String[] args) {
        SentInvoiceService service = new SentInvoiceService(requestOptions, new Long(999));

        try {
            Map<String, Object> params = new HashMap<String, Object>(0);
            params.put("num_future_months", "1");
            params.put("num_past_months", "1");

            StatisticsResponse statisticsResponse = service.statisticsByRange(params);

            if (statisticsResponse.getResponseCode().equals(Constants.OK)
                    && statisticsResponse.getData().getStatistics() != null) {
                System.out.println("Se han encontrado " + statisticsResponse.getData().getStatistics().size()
                        + " filas de estadísticas");

                for (Statistics invoiceStatistics : statisticsResponse.getData().getStatistics()) {
                    System.out.println(invoiceStatistics.getMonth() + ": " + invoiceStatistics.getTotal_invoiced_by_due_date()
                            + " - " + invoiceStatistics.getTotal_invoiced_by_issue_date() + " - " + invoiceStatistics.getTotal_paid_by_due_date()  + " - " + invoiceStatistics.getTotal_unpaid_by_issue_date()  + " - " + invoiceStatistics.getTotal_unpaid_by_due_date()  + " - " + invoiceStatistics.getTotal_overdue_by_due_date());
                }
            } else {
                System.out.println("No hay información estadística");

            }

        } catch (HUFException e) {
            System.out.println(" - Error - " + e.getCode() + ": " + e.getMessage());
        }
    }

}
