package com.zeus.mapper;

import java.util.List;

import com.zeus.domain.Board;

public interface BoardMapper {
	public void create(Board board) throws Exception;
	public Board read(Integer no) throws Exception;
	public void update(Board board) throws Exception;
	public void delete(Integer no) throws Exception;
	public List<Board> list() throws Exception;
	public List<Board> boardSearch(Board board) throws Exception;
	
}
