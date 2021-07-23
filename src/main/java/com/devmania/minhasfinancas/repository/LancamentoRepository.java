package com.devmania.minhasfinancas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devmania.minhasfinancas.model.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

}
