package br.com.petshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.petshop.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	Curso findByNome(String nome);

}
