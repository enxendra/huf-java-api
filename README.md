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

/Users/xmunch/Documents/workspace-sts-3.6.3.RELEASE/java-api/src/main/java/com/enxendra/huf/api/service/InvoiceService.java
/Users/xmunch/Documents/workspace-sts-3.6.3.RELEASE/java-api/src/main/java/com/enxendra/huf/api/service/DraftService.java
/Users/xmunch/Documents/workspace-sts-3.6.3.RELEASE/java-api/src/main/java/com/enxendra/huf/api/service/OrganizationService.java
/Users/xmunch/Documents/workspace-sts-3.6.3.RELEASE/java-api/src/main/java/com/enxendra/huf/api/service/CustomerService.java

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

Each service and method has its own characteristics. So additionaly to the Rest API documentation (see above), to find easy examples about how to call our API just by using this library, check the 42 operations that we have already implemented  in the package `com.enxendra.huf.api.test`:

### Organization operations

```
/java-api/src/main/java/com/enxendra/huf/api/test/organization/CreateOrganizationTest.java
/java-api/src/main/java/com/enxendra/huf/api/test/organization/DeleteOrganizationTest.java
/java-api/src/main/java/com/enxendra/huf/api/test/organization/GetOrganizationConfigurationTest.java
/java-api/src/main/java/com/enxendra/huf/api/test/organization/GetOrganizationTest.java
/java-api/src/main/java/com/enxendra/huf/api/test/organization/ListOrganizationsTest.java
/java-api/src/main/java/com/enxendra/huf/api/test/organization/UpdateOrganizationConfigurationTest.java
/java-api/src/main/java/com/enxendra/huf/api/test/organization/UpdateOrganizationTest.java

```

### Invoice operations

```
/java-api/src/main/java/com/enxendra/huf/api/test/invoice/DeleteInvoiceTest.java
/java-api/src/main/java/com/enxendra/huf/api/test/invoice/ExportInvoiceTest.java
/java-api/src/main/java/com/enxendra/huf/api/test/invoice/GetInvoiceAttachmentTest.java
/java-api/src/main/java/com/enxendra/huf/api/test/invoice/GetInvoiceTest.java
/java-api/src/main/java/com/enxendra/huf/api/test/invoice/GetOriginalInvoiceTest.java
/java-api/src/main/java/com/enxendra/huf/api/test/invoice/GetPdfInvoiceTest.java
/java-api/src/main/java/com/enxendra/huf/api/test/invoice/ListInvoiceAttachmentsTest.java
/java-api/src/main/java/com/enxendra/huf/api/test/invoice/ListInvoicesTest.java
/java-api/src/main/java/com/enxendra/huf/api/test/invoice/UpdateInvoiceStateTest.java

```

### Draft operations:

```

/java-api/src/main/java/com/enxendra/huf/api/test/draft/CreateDraftItem.java
/java-api/src/main/java/com/enxendra/huf/api/test/draft/CreateDraftTest.java
/java-api/src/main/java/com/enxendra/huf/api/test/draft/DeleteDraftAttachmentTest.java
/java-api/src/main/java/com/enxendra/huf/api/test/draft/DeleteDraftItem.java
/java-api/src/main/java/com/enxendra/huf/api/test/draft/DeleteDraftTest.java
/java-api/src/main/java/com/enxendra/huf/api/test/draft/GetDraftAttachmentTest.java
/java-api/src/main/java/com/enxendra/huf/api/test/draft/GetDraftItemTest.java
/java-api/src/main/java/com/enxendra/huf/api/test/draft/GetDraftTest.java
/java-api/src/main/java/com/enxendra/huf/api/test/draft/ListDraftAttachmentsTest.java
/java-api/src/main/java/com/enxendra/huf/api/test/draft/ListDraftItemsTest.java
/java-api/src/main/java/com/enxendra/huf/api/test/draft/ListDraftsTest.java
/java-api/src/main/java/com/enxendra/huf/api/test/draft/PreviewDraftTest.java
/java-api/src/main/java/com/enxendra/huf/api/test/draft/SendDraftTest.java
/java-api/src/main/java/com/enxendra/huf/api/test/draft/UpdateDraftItem.java
/java-api/src/main/java/com/enxendra/huf/api/test/draft/UpdateDraftTest.java
/java-api/src/main/java/com/enxendra/huf/api/test/draft/UploadDraftAttachmentTest.java
/java-api/src/main/java/com/enxendra/huf/api/test/draft/ValidateDraftTest.java

```

### Customer operations:

```
/java-api/src/main/java/com/enxendra/huf/api/test/customer/CreateCustomerTest.java
/java-api/src/main/java/com/enxendra/huf/api/test/customer/DeleteCustomerTest.java
/java-api/src/main/java/com/enxendra/huf/api/test/customer/ExportCustomersTest.java
/java-api/src/main/java/com/enxendra/huf/api/test/customer/GetCustomerConfigurationTest.java
/java-api/src/main/java/com/enxendra/huf/api/test/customer/GetCustomerTest.java
/java-api/src/main/java/com/enxendra/huf/api/test/customer/ListCustomersTest.java
/java-api/src/main/java/com/enxendra/huf/api/test/customer/TopCustomersTest.java
/java-api/src/main/java/com/enxendra/huf/api/test/customer/UpdateCustomerConfigurationTest.java
/java-api/src/main/java/com/enxendra/huf/api/test/customer/UpdateCustomerTest.java

```




* More info: dev (at) enxendra.com
