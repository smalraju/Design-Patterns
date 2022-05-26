package com.company;

public class ProxyAccess implements TradeSecret{

    private int employeeId;
    private RealAccess  realaccess;
    public ProxyAccess(int id) {
        this.employeeId = id;
    }

    @Override
    public void accessInfo() {
        if (employeeId >= 10)
        {
            realaccess = new RealAccess(employeeId);
            realaccess.accessInfo();
        }

        else
        {
            System.out.println("Cannot access the Trade Secret, as your job level is < 10 i.e.," + employeeId);
        }
    }
}
