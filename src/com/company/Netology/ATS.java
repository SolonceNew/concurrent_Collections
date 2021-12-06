package com.company.Netology;

public class ATS extends Thread {
    private CallCenter callCenter;

    public ATS(String name, CallCenter callCenter) {
        super(name);
        this.callCenter = callCenter;
    }

    @Override
    public void run() {
        callCenter.incommingCall();
    }
}
