package br.ufpi.es.tarefa_es.dados;

import java.util.List;

public interface rep_usuario {
	public void inserir(Usuario usuario);
	public List<Usuario> listar();
	public Usuario buscar(Usuario usuario);
	public void alterar(Usuario original, Usuario novo);
}