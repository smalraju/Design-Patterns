package com.company;

public class RealAccess implements TradeSecret{

    private int employeeId;

    public RealAccess(int id) {
        this.employeeId = id;
    }

    @Override
    public void accessInfo() {
        System.out.println("Trade Secret Access granted for employee id : "+ employeeId);
    }
}
