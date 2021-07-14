package ch.zli.m223.ksh18a.crm.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "Customer")
public class CustomerImpl implements Customer {

	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	private String city;
	private String street;
	
	@OneToMany(
		mappedBy = "customer", 
		cascade = CascadeType.ALL, //delete
		fetch = FetchType.EAGER)
	private List<MemoImpl> memos;

	protected CustomerImpl() {} // JPA only
	
	@Override public Long getId() { return id; }

	@Override public String getName() { return name; }

	@Override public String getStreet() { return street; }

	@Override public String getCity() { return city; }

	@Override public List<Memo> getMemos() {
		return new ArrayList<>(memos);
	}
}
