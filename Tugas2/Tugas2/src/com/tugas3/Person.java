package com.tugas3;

class Person {
    protected String name;
    protected String address;
    protected String hobi;

    public void Identity() {
        System.out.println("Name : " + name);
        System.out.println("Address : " + address);
        System.out.println("Hobi : " + hobi);
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setHobi(String hobi) {
        this.hobi = hobi;
    }


}
