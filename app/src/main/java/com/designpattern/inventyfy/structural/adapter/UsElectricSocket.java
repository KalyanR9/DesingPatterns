package com.designpattern.inventyfy.structural.adapter;

/**
 * Created by desaidr
 */

public class UsElectricSocket {

    public void plugChargerIn(UsPlugConnector plugConnector) {
        plugConnector.provideElectricity();
    }
}
