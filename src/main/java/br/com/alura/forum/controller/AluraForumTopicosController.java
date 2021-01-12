package br.com.alura.forum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.dto.TopicoDTO;
import br.com.alura.forum.model.Topico;
import br.com.alura.forum.repository.TopicoRepository;

@RestController
@RequestMapping("/topicos")
public class AluraForumTopicosController {
	
	@Autowired
	private TopicoRepository topicoRepository;
	
	@GetMapping
	public List<TopicoDTO> listar(String nomeCurso){
		List<Topico> topicos = null;
		if (nomeCurso == null) {
			topicos = topicoRepository.findAll();

		}else {
			topicos = topicoRepository.findByCursoNome(nomeCurso);
		}
		return TopicoDTO.converterListaDto(topicos);
	}
}
