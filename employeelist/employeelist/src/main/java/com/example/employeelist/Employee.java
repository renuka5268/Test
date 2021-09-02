package com.example.employeelist;


public class Employee {
    public   static String name;
    public static   String id;
    public  static  String companyname;

    public static String getName() {
        return name;
    }
    public  static void setName(String name) {
        Employee.name = name;
    }
    public static String  getId() {
        return id;

    }
    public static void setId(String id) {
        Employee.id = id;
    }
    public static String getCompanyname() {
        return companyname;
    }

    public static void setCompanyname(String companyname) {
        Employee.companyname = companyname;
    }


    @Override
    public String toString() {
        return "Contact [ name=" + name + ", id=" + id + ", companyname=" + companyname + "]";
    }

}


