package com.amdocs.CargoManagementSystem.entity;





import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
@Entity
@Table(name="CARGO")
public class CargoEntity {
	
	@Id
	@Column(name="CargoNo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cno;
	@Column(name = "NAME")
	private String name;
	@Column(name = "PHONE")
	private String phone;
	@Column(name = "EMAIL")
	private String email;
	
	@OneToMany(mappedBy = "cargo", cascade=CascadeType.ALL)
	private Set<TruckEntity> truck =new HashSet<>();
	
	public Integer getCno() {
		return cno;
	}
	public void setCno(Integer cno) {
		this.cno = cno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public CargoEntity(Integer cno, String name, String phone, String email) {
		super();
		this.cno = cno;
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	public CargoEntity() {
		
	}
	
}
