package com.qapitol.Model;

public class Address {
    private String streetName;
    private String completeAddress;
    private String pincode;

    public Address(String streetName, String completeAddress, String pincode) {
        this.streetName = streetName;
        this.completeAddress = completeAddress;
        this.pincode = pincode;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getCompleteAddress() {
        return completeAddress;
    }

    public String getPincode() {
        return pincode;
    }
}





























    //    private String street_name;
//    private String complete_addr;
//    private long pin_code;
//
//    public String getStreet_name() {
//        return street_name;
//    }
//    public void setStreet_name(String street_name) {
//        this.street_name = street_name;
//    }
//    public String getComplete_addr() {
//        return complete_addr;
//    }
//    public void setComplete_addr(String complete_addr)
//    {this.complete_addr = complete_addr;}
//    public long getPin_code()
//    {return pin_code;}
//    public void setPin_code(long pin_code)
//    {this.pin_code = pin_code;}
//}
