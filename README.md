# HUF Java API

**This Java library enables the use of the HUF (HazteUnaFacturae.com) services by external applications.**

## Description

This library provides a Java API to connect with the Rest API of HazteUnaFacturae (http://premium.hazteUnaFacturae.com) and use all is services.

It requires a valid API Key and the endpoint of the instance which will be used by the client. To get your API Key and the proper URL contact to Enxendra Technologies.

## How to

To use properly this library, or to connect by using your own client, check the documentation of our REST API here: (http://docs.huf.apiary.io/)

The first step to use this library is to specify both your API Key and the endpoint of the service in the `RequestOptions` object:

``` java

  static RequestOptions requestOptions = new RequestOptions(<API_KEY>, <ENDPOINT>);

```

After that, you can create an instance of one of the four services (`InvoiceService`,`DraftService`,`OrganizationService`,`CustomerService`) to invoke the operation you need.

### Available services
```

src/main/java/com/enxendra/huf/api/service/InvoiceService.java
src/main/java/com/enxendra/huf/api/service/DraftService.java
src/main/java/com/enxendra/huf/api/service/OrganizationService.java
src/main/java/com/enxendra/huf/api/service/CustomerService.java

```

## Service instance example

```java

// We create a new DraftService with the defined `requestOperations` and the `id` of the organization.
DraftService service = new DraftService(requestOptions, new Long(27));

// We call the `getDraftItem` service to retrieve a `DraftItem` with id **1407** from the Draft with id **17028**.
DraftItemResponse draftItemResponse = service.getDraftItem(new Long(17028), new Long(1407));

// We print the response data or errors
if (draftItemResponse.getResponseCode().equals(Constants.OK)) {
                System.out.println(draftItemResponse.getData().getDescription());
                System.out.println(draftItemResponse.getData().getPrice());
            } else {
                System.out.println("ERROR " + draftItemResponse.getErrorCode() + ": "
                        + draftItemResponse.getErrorMessage());
            }

```

Each service and method has its own characteristics. So additionaly to the Rest API documentation (see above), to learn how to call our API just by using this library, check the 42 examples (one for each posible operation) that we have already implemented  in the package `com.enxendra.huf.api.test`:

### Organization operations

```
/src/main/java/com/enxendra/huf/api/test/organization/CreateOrganizationTest.java
/src/main/java/com/enxendra/huf/api/test/organization/DeleteOrganizationTest.java
/src/main/java/com/enxendra/huf/api/test/organization/GetOrganizationConfigurationTest.java
/src/main/java/com/enxendra/huf/api/test/organization/GetOrganizationTest.java
/src/main/java/com/enxendra/huf/api/test/organization/ListOrganizationsTest.java
/src/main/java/com/enxendra/huf/api/test/organization/UpdateOrganizationConfigurationTest.java
/src/main/java/com/enxendra/huf/api/test/organization/UpdateOrganizationTest.java

```

### Invoice operations

```
/src/main/java/com/enxendra/huf/api/test/invoice/DeleteInvoiceTest.java
/src/main/java/com/enxendra/huf/api/test/invoice/ExportInvoiceTest.java
/src/main/java/com/enxendra/huf/api/test/invoice/GetInvoiceAttachmentTest.java
/src/main/java/com/enxendra/huf/api/test/invoice/GetInvoiceTest.java
/src/main/java/com/enxendra/huf/api/test/invoice/GetOriginalInvoiceTest.java
/src/main/java/com/enxendra/huf/api/test/invoice/GetPdfInvoiceTest.java
/src/main/java/com/enxendra/huf/api/test/invoice/ListInvoiceAttachmentsTest.java
/src/main/java/com/enxendra/huf/api/test/invoice/ListInvoicesTest.java
/src/main/java/com/enxendra/huf/api/test/invoice/UpdateInvoiceStateTest.java

```

### Draft operations:

```

/src/main/java/com/enxendra/huf/api/test/draft/CreateDraftItem.java
/src/main/java/com/enxendra/huf/api/test/draft/CreateDraftTest.java
/src/main/java/com/enxendra/huf/api/test/draft/DeleteDraftAttachmentTest.java
/src/main/java/com/enxendra/huf/api/test/draft/DeleteDraftItem.java
/src/main/java/com/enxendra/huf/api/test/draft/DeleteDraftTest.java
/src/main/java/com/enxendra/huf/api/test/draft/GetDraftAttachmentTest.java
/src/main/java/com/enxendra/huf/api/test/draft/GetDraftItemTest.java
/src/main/java/com/enxendra/huf/api/test/draft/GetDraftTest.java
/src/main/java/com/enxendra/huf/api/test/draft/ListDraftAttachmentsTest.java
/src/main/java/com/enxendra/huf/api/test/draft/ListDraftItemsTest.java
/src/main/java/com/enxendra/huf/api/test/draft/ListDraftsTest.java
/src/main/java/com/enxendra/huf/api/test/draft/PreviewDraftTest.java
/src/main/java/com/enxendra/huf/api/test/draft/SendDraftTest.java
/src/main/java/com/enxendra/huf/api/test/draft/UpdateDraftItem.java
/src/main/java/com/enxendra/huf/api/test/draft/UpdateDraftTest.java
/src/main/java/com/enxendra/huf/api/test/draft/UploadDraftAttachmentTest.java
/src/main/java/com/enxendra/huf/api/test/draft/ValidateDraftTest.java

```

### Customer operations:

```
/src/main/java/com/enxendra/huf/api/test/customer/CreateCustomerTest.java
/src/main/java/com/enxendra/huf/api/test/customer/DeleteCustomerTest.java
/src/main/java/com/enxendra/huf/api/test/customer/ExportCustomersTest.java
/src/main/java/com/enxendra/huf/api/test/customer/GetCustomerConfigurationTest.java
/src/main/java/com/enxendra/huf/api/test/customer/GetCustomerTest.java
/src/main/java/com/enxendra/huf/api/test/customer/ListCustomersTest.java
/src/main/java/com/enxendra/huf/api/test/customer/TopCustomersTest.java
/src/main/java/com/enxendra/huf/api/test/customer/UpdateCustomerConfigurationTest.java
/src/main/java/com/enxendra/huf/api/test/customer/UpdateCustomerTest.java

```




* More info: dev (at) enxendra.com
