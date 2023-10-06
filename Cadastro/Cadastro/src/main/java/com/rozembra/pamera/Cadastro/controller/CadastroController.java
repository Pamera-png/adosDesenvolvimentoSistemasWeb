package com.rozembra.pamera.Cadastro.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.rozembra.pamera.Cadastro.Dados;

@Controller
@RequestMapping("/dados")
public class CadastroController {

	@GetMapping("/salvar")
	public ModelAndView ModelAndView() {
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
			System.out.println(bindingResult);
			// Reapresenta formulário
			return new ModelAndView("index");
		}
		// Gera resposta indicando redirecionamento para /resultado
		//ModelAndView mv = new ModelAndView("redirect:/resultado");
		ModelAndView mv = new ModelAndView("resultado");
		mv.addObject("nome", dadosRecebidos.getNome());
		mv.addObject("email", dadosRecebidos.getEmail());
		mv.addObject("telefone", dadosRecebidos.getTelefone());
		mv.addObject("dataNasc", dadosRecebidos.getDataNasc());
		mv.addObject("descricao", dadosRecebidos.getDescricao());
		mv.addObject("numero", dadosRecebidos.getNumero());
		mv.addObject("peso", dadosRecebidos.getPeso());
		mv.addObject("altura", dadosRecebidos.getAltura());
		mv.addObject("genero", dadosRecebidos.getGenero());
		mv.addObject("interesses", dadosRecebidos.getInteresses());

		// Configura os dadosRecebidos como um atributo flash // (mantido em sessão
		// entre duas requisições consecutivas)
		redirAttr.addFlashAttribute("dados", dadosRecebidos);
		return mv;
	}

}
