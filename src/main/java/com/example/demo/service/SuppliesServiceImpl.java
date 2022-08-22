package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ISuppliesDAO;
import com.example.demo.dto.Supplies;

@Service
public class SuppliesServiceImpl implements ISuppliesService{
	
	@Autowired
	ISuppliesDAO iSuppliesDAO;

	@Override
	public List<Supplies> listAllSupplies() {
		
		return iSuppliesDAO.findAll();
	}

	@Override
	public Supplies saveSupplies(Supplies s) {
		
		return iSuppliesDAO.save(s);
	}

	@Override
	public Supplies suppliesById(Long id) {
		
		return iSuppliesDAO.findById(id).get();
	}

	@Override
	public Supplies updateSupplies(Supplies s) {
		
		return iSuppliesDAO.save(s);
	}

	@Override
	public void deleteSupplies(Long id) {
		iSuppliesDAO.deleteById(id);
		
	}

}
