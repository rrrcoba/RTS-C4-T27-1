package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Provider;

public interface IProviderService {
	/**
	 * Lists all the Provider
	 * @return
	 */
	public List<Provider> listAllProviders();
	
	/**
	 * Saves a Provider
	 * @param pr
	 * @return
	 */
	public Provider saveProvider(Provider pr);
	
	/**
	 * Gets the Provider by ID
	 * @param id
	 * @return
	 */
	public Provider providerById(Long id);
	
	/**
	 * Updates the Provider
	 * @param pr
	 * @return
	 */
	public Provider updateProvider(Provider pr);
	
	/**
	 * Deletes the Provider
	 * @param id
	 */
	public void deleteProvider(Long id);
}
