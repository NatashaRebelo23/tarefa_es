package br.ufpi.es.tarefa_es.dados;

import java.util.LinkedList;
import java.util.List;

public class rep_lista implements rep_usuario{
	private List<Usuario> lista = new LinkedList<Usuario>();
	
	public void inserir(Usuario u) {
		lista.add(u);
	}

	public List<Usuario> listar() {
		return lista;
	}

	public Usuario buscar(Usuario u) {
		int index = lista.indexOf(u);
		return lista.get(index);
	}

	public void alterar(Usuario original, Usuario novo) {
		// TODO Auto-generated method stub
	}

}