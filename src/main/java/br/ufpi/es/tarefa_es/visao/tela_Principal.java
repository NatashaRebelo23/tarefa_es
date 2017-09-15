package br.ufpi.es.tarefa_es.visao;

import java.util.List;
import br.ufpi.es.tarefa_es.controle.controle;
import br.ufpi.es.tarefa_es.dados.rep_usuario;
import br.ufpi.es.tarefa_es.dados.rep_lista;
import br.ufpi.es.tarefa_es.dados.rep_vet_usuarios;
import br.ufpi.es.tarefa_es.dados.Usuario;

public class tela_Principal {
	//static Logger logger = LogManager.getLogger();

	public static void main(String[] args) {
		//cria usuarios
		Usuario u1 = new Usuario();
		Usuario u2 = new Usuario();
		Usuario u3 = new Usuario();
		Usuario u4 = new Usuario();
		Usuario u5 = new Usuario();
		
		u1.setId(1);
		u1.setNome("Maria");
		u2.setId(2);
		u2.setNome("Francisca");
		u3.setId(3);
		u3.setNome("José");
		u4.setId(4);
		u4.setNome("Raimundo");
		u5.setId(5);
		u5.setNome("Fátima");

		
		//cria repositorio
		rep_usuario repositorioLista = new rep_lista();
		rep_usuario repositorioVetor = new rep_vet_usuarios();
		
		//cria o controlador
		controle controlador = new controle(repositorioVetor);
		
		//insere usuarios
		controlador.insere(u1);
		controlador.insere(u2);
		
		//lista usuarios
		List<Usuario> lista = controlador.lista();
		for(Usuario u : lista){
			System.out.println("Id: " + u.getId() + " - " + u.getNome());
			System.out.println("Linha adicionada no branch de desenvolvimento");
		}

		
		System.out.println("Teste do github");
	}
	
}