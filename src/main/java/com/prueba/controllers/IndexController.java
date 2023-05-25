package com.prueba.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.SessionStatus;


import com.prueba.models.PagoQuincena;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/")
public class IndexController {
	
	@GetMapping({"","/index","/","/home"})
	public String index(Model model) {
		PagoQuincena date =new PagoQuincena();
		model.addAttribute("fecha", date);
		return "index";	
	}
	
	@PostMapping("/index")
	
	public String procesar(@Valid PagoQuincena fecha,BindingResult result, Model model,SessionStatus status) {
			
			//model.addAttribute("titulo", "Formulario thymeleaf Registro");
			if(result.hasErrors()) {
				
				return "index";
			}
			
			if (fecha.getDate() == null) {
		        result.rejectValue("date", "error.date", "Por favor, ingrese una fecha válida");
		        return "index";
		    }
			model.addAttribute("fecha", fecha);
			status.setComplete(); // de esta manera conservamos los datos del modelo usuario y datos que no se encuentran en el form
			return "consulta";
		}
	
	

}
