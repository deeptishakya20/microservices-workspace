package com.capgemini.currentexchange.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.capgemini.currentexchange.entity.ExchangeValue;

@Repository
public interface ExchangeValueService extends JpaRepository<ExchangeValue , Long>{
	
	 ExchangeValue findByFromAndTo(String from, String to);
}
	



