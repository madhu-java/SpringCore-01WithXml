package com.madhu.beans;

import com.madhu.interfce.IPay;

public class PaymentProcess {
	IPay pay;
	public PaymentProcess(IPay pay) {
		this.pay=pay;
	}
	public PaymentProcess() {}
	//setter injection
	public void setPay(IPay pay) {
		this.pay=pay;
	}
	public void doPayment(Double amt) {
		boolean status=pay.payBill(amt);
		if(status) {
			System.out.println("Payment success");
		}else {
			System.out.println("Payment is not success");
		}
	}
	

}
