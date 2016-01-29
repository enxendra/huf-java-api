package com.enxendra.huf.api.model.customer;

public class Customer {

    private Long id;
    private String tax_number;
    private String name;
    private String first_name;
    private String second_name;
    private String address;
    private String poblation;
    private String province;
    private String post_code;
    private String country_code;
    private String phone;
    private String email;
    private String contact_person;

    public Long getId() {
        return id;
    }

    public String getTaxNumber() {
        return tax_number;
    }

    public String getName() {
        return name;
    }

    public String getFirstName() {
        return first_name;
    }

    public String getSecondName() {
        return second_name;
    }

    public String getAddress() {
        return address;
    }

    public String getPoblation() {
        return poblation;
    }

    public String getProvince() {
        return province;
    }

    public String getPostCode() {
        return post_code;
    }

    public String getCountryCode() {
        return country_code;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getContactPerson() {
        return contact_person;
    }
}
