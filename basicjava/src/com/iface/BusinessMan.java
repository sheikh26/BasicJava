package com.iface;

public class BusinessMan implements RichMan, SocialWorker {
	
	private String name;
	private String address;

	public void donation() {
		System.out.println("Giving Donation");
	}

	public void earnMony() {
		System.out.println("Earning Money");
	}

	public void party() {
		System.out.println("Doing Party");
	}

	public void helpToOthers() {
		System.out.println("Helping to Others");
	}

}
