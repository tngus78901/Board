package com.tenco.blog.repository.interfaces;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.tenco.blog.repository.entity.Board;
import com.tenco.blog.service.BoardService;



public interface BoardRepository {
	
	public int insert(Board board);
	public int updateByNumber(Board board);
	public int deleteByNumber(Integer number);
	
	
	// 리스트
	public List<Board> findAllById(Board board);
	public Board findById(Long id);
	
}
