package com.company.Netology;

public class Main {

    public static void main(String[] args) {
        CallCenter callCenter = new CallCenter();
        for (int i = 1; i <= CallCenter.getNumberCalls(); i++) {
            ATS ats = new ATS("абонентa " + i, callCenter);
            ats.start();
        }

        for (int i = 1; i <= CallOperator.getNumberOfOperators(); i++) {
            CallOperator callOperator = new CallOperator(" № " + i, callCenter);
            callOperator.start();
        }
    }

}
