package com.amdocs.CargoManagementSystem.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.ManyToAny;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class TruckEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="isbn_no")
	private long isbnno;
	
	@Column(name="truck_name")
	private String truck_name;
	
	@Column(name="manufactureDate")
	@DateTimeFormat(pattern="yyyy-mm-dd")
	@Temporal(TemporalType.DATE)
	private Date manufactureDate;
    
	@ManyToOne
	@JoinColumn(name="cno")
	private CargoEntity cargo;
//	public String getTruck_name() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public Object getManufactureDate() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//    public void setTruck_name(String truck_name) {
//    	
//    }
//	public void setManufactureDate(Object manufactureDate) {
//		// TODO Auto-generated method stub
//		
//	}
//	

}
