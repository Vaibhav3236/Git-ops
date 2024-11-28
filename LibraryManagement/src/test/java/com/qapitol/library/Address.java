package com.qapitol.library;

public class Address {
    private String street_name;
    private String complete_addr;
    private long pin_code;

    public String getStreet_name() {
        return street_name;
    }
    public void setStreet_name(String street_name) {
        this.street_name = street_name;
    }
    public String getComplete_addr() {
        return complete_addr;
    }
    public void setComplete_addr(String complete_addr)
    {this.complete_addr = complete_addr;}
    public long getPin_code()
    {return pin_code;}
    public void setPin_code(long pin_code)
    {this.pin_code = pin_code;}

    @Override
    public String toString() {
        return "Address{" +
                "street_name='" + street_name + '\'' +
                ", complete_addr='" + complete_addr + '\'' +
                ", pin_code=" + pin_code +
                '}';
    }
}
