package com.madhu.beans;

import com.madhu.interfce.IPay;

public class DebitCardPay implements IPay {
public DebitCardPay() {
	System.out.println("Debit card pay object is created..");
}
	public boolean payBill(Double bill) {
		System.out.println("paying with Dedit card..");
		return true;
	}

}
