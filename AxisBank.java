package org.college;

public class AxisBank extends BankInfo{
public void deposit() {
	System.out.println("Deposit in axis bank");
}
public static void main(String[] args) {
	AxisBank axis = new AxisBank();
	BankInfo bank=new BankInfo();
	axis.deposit();
	bank.deposit();
	bank.saving();
	bank.fixed();
}
}
