package com.rozembra.pamera.Cadastro.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.rozembra.pamera.Cadastro.Dados;

@Controller
public class CadastroController {

	/*
	 * POST básico
	 * 
	 * @PostMapping("/salvar") public ModelAndView salvar(@ModelAttribute Dados
	 * dadosRecebidos) { // *** IMPLEMENTAR A LÓGICA PARA TRATAR OS DADOS RECEBIDOS
	 * *** // Monta tela resposta com o resultado do processamento ModelAndView mv =
	 * new ModelAndView("resultado"); mv.addFlashAttribute("dados", dadosRecebidos);
	 * return mv; }
	 */

	// POST-REDIRECT-GET
	@PostMapping("/salvarDados")
	public ModelAndView salvar(@ModelAttribute("dados") Dados dadosRecebidos, RedirectAttributes redirAttr) {
		// Gera resposta indicando redirecionamento para /resultado
		ModelAndView mv = new ModelAndView("redirect:/resultado");
		// Configura os dadosRecebidos como um atributo flash // (mantido em sessão
		// entre duas requisições consecutivas)
		redirAttr.addFlashAttribute("dados", dadosRecebidos);
		return mv;
	}

	@GetMapping("/salvar")
	public ModelAndView exibirForm() {
		ModelAndView mv = new ModelAndView("index"); 
		mv.addObject("dados", new Dados());
	return mv;
	}
	
	// POST com validação e POST-REDIRECT-GET
	@PostMapping("/salvar")
	public ModelAndView salvar(@ModelAttribute("dados") @Valid Dados dadosRecebidos, BindingResult bindingResult,
			RedirectAttributes redirAttr) {
		// Verifica se houve erros durante validação
		if (bindingResult.hasErrors()) {
			// Reapresenta formulário
			return new ModelAndView("index");
		}
		// Gera resposta indicando redirecionamento para /resultado
		ModelAndView mv = new ModelAndView("redirect:/resultado");
		// Configura os dadosRecebidos como um atributo flash // (mantido em sessão
		// entre duas requisições consecutivas)
		redirAttr.addFlashAttribute("dados", dadosRecebidos);
		return mv;
	}

}
