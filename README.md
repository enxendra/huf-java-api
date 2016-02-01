# huf-java-api
Java API for HUF (HazteUnaFacturae.com)

This Java library connects to our public REST API and allows external applications to use the (HazteUnaFacturae.com) services.
To use properly this library, or to connect by using your own client, check the documentation of our REST API here: (http://docs.huf.apiary.io/)

Additionaly, to find easy examples about how to call our API just by using this library, check the 42 operations that we have already implemented  in the package `com.enxendra.huf.api.test`:

## Organization operations

```
/java-api/src/main/java/com/enxendra/huf/api/test/organization/CreateOrganizationTest.java
/java-api/src/main/java/com/enxendra/huf/api/test/organization/DeleteOrganizationTest.java
/java-api/src/main/java/com/enxendra/huf/api/test/organization/GetOrganizationConfigurationTest.java
/java-api/src/main/java/com/enxendra/huf/api/test/organization/GetOrganizationTest.java
/java-api/src/main/java/com/enxendra/huf/api/test/organization/ListOrganizationsTest.java
/java-api/src/main/java/com/enxendra/huf/api/test/organization/UpdateOrganizationConfigurationTest.java
/java-api/src/main/java/com/enxendra/huf/api/test/organization/UpdateOrganizationTest.java

```

## Invoice operations

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

## Draft operations:

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

## Customer operations:

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
