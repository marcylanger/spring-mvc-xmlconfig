package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="funcionarios")
public class FuncionarioController {

	@RequestMapping(value="/listar", method=RequestMethod.GET)
	public ModelAndView listarFuncionarios() {
		ModelAndView view = new ModelAndView("listarfuncionarios");
		System.out.println("Listar");
		return view;
	}
}
