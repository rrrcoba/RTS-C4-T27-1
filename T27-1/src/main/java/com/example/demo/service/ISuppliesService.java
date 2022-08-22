package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Supplies;

public interface ISuppliesService {
	
	/**
	 * Lists all the Supplies
	 * @return
	 */
	public List<Supplies> listAllSupplies();
	
	/**
	 * Saves an Supplies
	 * @param s
	 * @return
	 */
	public Supplies saveSupplies(Supplies s);
	
	/**
	 * Gets the Supplies by ID
	 * @param id
	 * @return
	 */
	public Supplies suppliesById(Long id);
	
	/**
	 * Updates the Supplies
	 * @param s
	 * @return
	 */
	public Supplies updateSupplies(Supplies s);
	
	/**
	 * Deletes the Supplies
	 * @param id
	 */
	public void deleteSupplies(Long id);

}