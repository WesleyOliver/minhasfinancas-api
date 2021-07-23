package com.devmania.minhasfinancas.service;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.devmania.minhasfinancas.model.Usuario;
import com.devmania.minhasfinancas.repository.UsuarioRepository;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@ActiveProfiles("test")
public class UsuarioServiceTest {
	
	@Autowired
	UsuarioService service;
	
	@Autowired
	UsuarioRepository repository;
	
	@Test
	public void deveValidarEmail() {
		repository.deleteAll();
		
		service.validarEmail("email@email.com");
		
	}
	
	@Test
	public void deveLancarErroAoValidarEmailExistirEmailCadstrado() {
		Usuario usuario = Usuario.builder().nome("usuario").email("email@email.com").build();
		repository.save(usuario);
		
		RuntimeException runtimeException = assertThrows(RuntimeException.class, () -> service.validarEmail("email@email.com"));
		
		assertTrue(runtimeException.getMessage().contains("Já existe um usuário com este email."));
	}

}
