package com.ingenico.direct.sdk.client.android.model.paymentproduct.specificdata;

import java.io.Serializable;
import java.util.List;

/**
 * Pojo which holds the payment product 302 specific properties
 * This class is filled by deserialising a JSON string from the GC gateway
 *
 * Copyright 2020 Global Collect Services B.V
 *
 */
public class PaymentProduct302SpecificData implements Serializable {

	private static final long serialVersionUID = 4006738016411138300L;

	private List<String> networks;


	public List<String> getNetworks() {
		return networks;
	}
}
