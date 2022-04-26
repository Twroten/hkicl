package com.hkicl.ecp.bkanvm.b039;

public class App {
    public static void main(String[] args) {
        int result = new BankAcctNoValidator_039().validate("039","03973088888888");
        System.out.println("result = " + result);
    }
}
