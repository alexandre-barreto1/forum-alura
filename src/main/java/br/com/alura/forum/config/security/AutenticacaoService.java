package br.com.alura.forum.config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.alura.forum.model.Usuario;
import br.com.alura.forum.repository.UsuarioRepository;

@Service
public class AutenticacaoService implements UserDetailsService{
	
	@Autowired
	private UsuarioRepository repository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = repository.findByEmail(username).orElseThrow(() -> new UsernameNotFoundException("Dados invalidos !"));
		return usuario;
	}

}
