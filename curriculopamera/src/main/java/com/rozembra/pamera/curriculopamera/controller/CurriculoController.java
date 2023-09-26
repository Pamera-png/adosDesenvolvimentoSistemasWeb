package com.rozembra.pamera.curriculopamera.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/curriculo")
@Controller

public class CurriculoController {


	@GetMapping("/abrir")
	public ModelAndView view() {
ModelAndView view = new ModelAndView("index");
view.addObject("nome", "Pamera Rozembra");
view.addObject("dataNasc", "08/10/2000");
view.addObject("curso", "English As A Second Language");
view.addObject("instituicao", "Norquest Colegy, Canadá");
view.addObject("periodo", "06/01/2020 a 18/06/2021");
view.addObject("assuntosAbordados", "Read and write, listening and speaking");

view.addObject("curso2", "Fundamentos de Tecnologia da Informação");
view.addObject("instituicao2", "Fundação Bradesco");
view.addObject("periodo2", "16/01/2019 a 01/02/2019");
view.addObject("assuntosAbordados2", "Fundamentos de hardware, fundamentos de software, segurança da informação e montagem de um microcomputador");
view.addObject("profissao", "Em outubro de 2021 fui contratada pela empresa Itaú Unibanco para trabalhar como analista junior em tecnologia da informação, na área do consignado.\n"
		+ "    Nos primeiros seis meses trabalhei em front end para a squad Credenciamento de Convênios, depois fui escalada para trabalhar no back end para a squad FGTS, onde estou até os dias atuais.    \n"
		+ "    As tecnologias que utilizamos na empresa são as mais diversas e revolucionárias, como AWS, splunk, dotnet e ferramentas próprias do banco.\n"
		+ "Por ter o inglês como segunda língua, também estou me preparando para tirar a certificação AWS practitioner.\n"
		+ "Embora tenha sido contratada para trabalhar com back end, estou tentando uma migração de carreira dentro do banco, afim de trabalhar como QA de acessibilidade, testando sites e aplicativos e assim garantir a inclusão digital para todas as pessoas com deficiência.\n"
		+ "    Para atingir esse objetivo, estou estudando WCAG, web content accessibility guide e me atualizando todos os dias sobre diversos assuntos no tema diversidade.\n");

view.addObject("linkedIn", "linkedIn");
view.addObject("github", "GitHub");
view.addObject("mensagem", "Mande um e-mail para pameranatali@gmail.com ou deixe sua mensagem a baixo");
view.addObject("rodape", "© 2023 todos os direitos reservados");
return view;
	}

}
