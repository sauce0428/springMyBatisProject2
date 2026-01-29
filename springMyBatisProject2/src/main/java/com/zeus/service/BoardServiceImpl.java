package com.zeus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zeus.domain.Board;
import com.zeus.mapper.BoardMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardMapper boardMapper;

	@Override
	@Transactional
	public void create(Board b) throws Exception {
		boardMapper.create(b);
	}

	@Override
	@Transactional(readOnly = true)
	public Board read(Board board) throws Exception {
		return boardMapper.read(board.getNo());
	}

	@Override
	@Transactional
	public void update(Board b) throws Exception {
		boardMapper.update(b);
	}

	@Override
	@Transactional
	public void delete(Board board) throws Exception {
		boardMapper.delete(board.getNo());
	}

	@Override
	@Transactional(readOnly = true)
	public List<Board> list() throws Exception {
		return boardMapper.list();
	}

	@Override
	@Transactional(readOnly = true)
	public List<Board> boardSearch(Board board) throws Exception {
		return boardMapper.boardSearch(board);
	}
}
