package ch.zli.m223.ksh18a.crm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name = "Memo")
public class MemoImpl implements Memo {
	@Id
	@GeneratedValue
	private Long id;
	
	private String note;
	private long dateInMs;
	
	@ManyToOne()
	private CustomerImpl customer;

	protected MemoImpl() {} // JPA only
	
	@Override public Long getId() {return id; }

	@Override public String getNote() { return note; }
	
	@Override public long getDateInMs() { return dateInMs; }
	
	@Override public Customer getCustomer() { return customer; }
}
