package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Piece;

public interface IPieceService {
	
	/**
	 * Lists all the Piece
	 * @return
	 */
	public List<Piece> listAllPieces();
	
	/**
	 * Saves an Piece
	 * @param p
	 * @return
	 */
	public Piece savePiece(Piece p);
	
	/**
	 * Gets the Box by ID
	 * @param id
	 * @return
	 */
	public Piece pieceById(Long id);
	
	/**
	 * Updates the Piece
	 * @param p
	 * @return
	 */
	public Piece updatePiece(Piece p);
	
	/**
	 * Deletes the Piece
	 * @param id
	 */
	public void deletePiece(Long id);

}
