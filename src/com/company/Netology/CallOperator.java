package com.company.Netology;

public class CallOperator extends Thread{
    private CallCenter callCenter;

    public static int getNumberOfOperators() {
        return NUMBER_OF_OPERATORS;
    }

    private final static int NUMBER_OF_OPERATORS = 5;


    public CallOperator(String name, CallCenter callCenter) {
        super(name);
        this.callCenter = callCenter;
    }

    @Override
    public void run() {
        callCenter.takeCall();
           }
}
