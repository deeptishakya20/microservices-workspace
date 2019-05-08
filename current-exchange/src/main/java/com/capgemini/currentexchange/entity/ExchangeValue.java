package com.capgemini.currentexchange.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangeValue {
	
	@Id
	private long Id;
	@Column(name= "From_Currency")
	private String from;
	@Column(name= "To_Currency")
	private String to;
	@Column(name= "conversion_multiple")
	private BigDecimal conversionMultiple;
	private int port;
	
	public ExchangeValue() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ExchangeValue(long id, String from, String to, BigDecimal conversionMultiple, int port) {
		super();
		Id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
			}
	
	public long getId() {
		return Id;
	}
	
	public void setId(long id) {
		Id = id;
	}
	
	public String getFrom() {
		return from;
	}
	
	public void setFrom(String from) {
		this.from = from;
	}
	
	public String getTo() {
		return to;
	}
	
	public void setTo(String to) {
		this.to = to;
	}
	
	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}
	
	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	
	public int getPort() {
		return port;
	}
	
	public void setPort(int port) {
		this.port = port;
	}
	
	@Override
	public String toString() {
		return "ExchangeValue [Id=" + Id + ", from=" + from + ", to=" + to + ", conversionMultiple="
				+ conversionMultiple + ", port=" + port + "]";
	}
	
	
	

}
