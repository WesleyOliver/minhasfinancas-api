package com.devmania.minhasfinancas.service;

import java.util.List;

import com.devmania.minhasfinancas.model.Lancamento;
import com.devmania.minhasfinancas.model.enuns.StatusLancamento;

public interface LancamentoService {

	Lancamento salvar(Lancamento lancamento);

	Lancamento atualizar(Lancamento lancamento);

	void deletar(Lancamento lancamento);

	List<Lancamento> buscar(Lancamento lancamentoFiltro);

	void atualizarStatus(Lancamento lancamento, StatusLancamento status);
	
	void validar(Lancamento lancamento);

}
