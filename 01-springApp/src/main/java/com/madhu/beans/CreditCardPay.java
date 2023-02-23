package com.madhu.beans;

import com.madhu.interfce.IPay;

public class CreditCardPay implements IPay {
public CreditCardPay() {
	System.out.println("credit card pay object is created");
}

	public boolean payBill(Double bill) {
		System.out.println("paying with Credit card..");
		return true;
	}

}
