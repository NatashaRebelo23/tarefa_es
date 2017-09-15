package br.ufpi.es.tarefa_es.controle;


import java.util.List;

import br.ufpi.es.tarefa_es.dados.rep_usuario;
import br.ufpi.es.tarefa_es.dados.Usuario;

public class controle{
	private rep_usuario repositorio;
	
	public controle(rep_usuario tipo){
		this.repositorio = tipo;
	}
	
	public void insere(Usuario u){
		repositorio.inserir(u);
	}
	
	public List<Usuario> lista(){
		return repositorio.listar();
	}
}