package com.tenco.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tenco.blog.service.BoardService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/")
public class BoardController {

	@Autowired
	private HttpSession session;
	@Autowired
	private BoardService boardService;
	
	@GetMapping("/board")
    public String index() {
        return "index";
    }

    //
    //http://localhost:80/board/saveForm
    @GetMapping("/board/saveForm")
    public String saveForm() {
        return "board/saveForm";
    }

    @GetMapping("/board/{id}/updateForm")
    public String updateForm(@PathVariable int id) {
        return "board/updateForm";
    }
    
    @PostMapping("/board/save")
    public String save(){
        return "redirect:/";
    }

    @PostMapping("/board/{id}/update")
    public String update(@PathVariable int id){
        return "redirect:/board/list";
    }

    @PostMapping("/board/{id}/delete")
    public String delete(@PathVariable int id){
        return "redirect:/";
    }
}
