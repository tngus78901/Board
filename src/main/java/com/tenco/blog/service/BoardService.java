package com.tenco.blog.service;


import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tenco.blog.dto.BoardDto;
import com.tenco.blog.repository.entity.Board;


@Service
public class BoardService {
	
	@Transactional
	public void insertBoard(BoardDto dto) {
		Board board = new Board();
		board.setName(dto.getName());
		board.setTitle(dto.getTitle());
		board.setContent(dto.getContent());
		
	}

	public void updateById(BoardDto dto) {
		
	}
	
	public List<Board> findById(Integer id) {
		return null;
	}
	
	public void deleteBoard(BoardDto dto) {
		
	}
	
	// 글목록보기
	// 글수정하기
	// 글삭제하기
	// 리스트출력
	// 리스트페이징
	
	

}
