package com.enxendra.huf.api.model.serie;

public class Serie {

    private Long id;
    private String name;
    private String code;
    private String prefix;
    private String suffix;
    private String fillLeft;
    private String numbering;
    private String defaultSeries;
    private String rebootYear;
    private String nextNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getFillLeft() {
        return fillLeft;
    }

    public void setFillLeft(String fillLeft) {
        this.fillLeft = fillLeft;
    }

    public String getNumbering() {
        return numbering;
    }

    public void setNumbering(String numbering) {
        this.numbering = numbering;
    }

    public String getDefaultSeries() {
        return defaultSeries;
    }

    public void setDefaultSeries(String defaultSeries) {
        this.defaultSeries = defaultSeries;
    }

    public String getRebootYear() {
        return rebootYear;
    }

    public void setRebootYear(String rebootYear) {
        this.rebootYear = rebootYear;
    }

    public String getNextNumber() {
        return nextNumber;
    }

    public void setNextNumber(String nextNumber) {
        this.nextNumber = nextNumber;
    }

}
