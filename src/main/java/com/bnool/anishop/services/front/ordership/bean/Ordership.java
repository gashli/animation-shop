package com.bnool.anishop.services.front.ordership.bean;import java.io.Serializable;public class Ordership extends com.bnool.anishop.services.common.Ordership implements		Serializable {	private static final long serialVersionUID = 1L;	public Ordership() {		super();	}	public Ordership(String orderid) {		super(orderid);	}	public void clear() {		super.clear();	}}