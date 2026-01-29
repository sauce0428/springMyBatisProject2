package com.zeus.service;

import java.util.List;

import com.zeus.domain.Board;

public interface BoardService {
	public void create(Board board) throws Exception;
	public Board read(Board board) throws Exception;
	public void update(Board board) throws Exception;
	public void delete(Board board) throws Exception;
	public List<Board> list() throws Exception;
	public List<Board> boardSearch(Board board) throws Exception;
}
