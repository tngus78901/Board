package com.tenco.blog.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Board {

	private Long id;
	private String Article;
	private String title;
	private String content;
	private String name;
	
	// 글등록
	public void updateById(Long id) {
		this.id = id;
	}
	// 글삭제
	public void deleteById(Long id) {
		this.id = id;
	}
	// 글수정
}
