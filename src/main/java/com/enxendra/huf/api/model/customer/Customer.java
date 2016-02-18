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
    private String export;

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

    public String getExport() {
        return export;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTaxNumber(String tax_number) {
        this.tax_number = tax_number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFirstName(String first_name) {
        this.first_name = first_name;
    }

    public void setSecondName(String second_name) {
        this.second_name = second_name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPoblation(String poblation) {
        this.poblation = poblation;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setPostCode(String post_code) {
        this.post_code = post_code;
    }

    public void setCountryCode(String country_code) {
        this.country_code = country_code;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContactPerson(String contact_person) {
        this.contact_person = contact_person;
    }

    public void setExport(String export) {
        this.export = export;
    }

}
