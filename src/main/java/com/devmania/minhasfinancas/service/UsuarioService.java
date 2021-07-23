package com.devmania.minhasfinancas.service;

import com.devmania.minhasfinancas.model.Usuario;

public interface UsuarioService {
	
	Usuario autenticar(String email, String senha);
	
	Usuario salvarUsuario(Usuario usuario);
	
	void validarEmail(String email);

}
