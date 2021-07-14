package ch.zli.m223.ksh18a.crm.model;

public interface Memo {
	Long getId();
	Customer getCustomer();
	long getDateInMs();
	String getNote();
}
