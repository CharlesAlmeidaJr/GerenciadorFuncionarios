package com.example.gerenciadorFuncionarios.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gerenciadorFuncionarios.model.Funcionario;
import com.example.gerenciadorFuncionarios.model.FuncionarioSetor;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer>{
	List<Funcionario> findBySetor(FuncionarioSetor funcionarioSetor);
}
