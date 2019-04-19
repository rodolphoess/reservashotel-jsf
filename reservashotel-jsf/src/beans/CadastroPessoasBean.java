package beans;

import java.util.ArrayList;
import java.util.Collection;

import javax.annotation.*;
import javax.enterprise.context.*;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import modelo.Pessoa;
import modelo.PessoaFisica;

//@ManagedBean
//@SessionScoped
@ManagedBean
@SessionScoped
public class CadastroPessoasBean {
	private Pessoa pessoaSelecionada;
	private Collection<Pessoa> lista;
	
	public CadastroPessoasBean() {
		pessoaSelecionada = new PessoaFisica();
		lista = new ArrayList<Pessoa>();
		
		for (int i = 0; i < 10; i++) {
			Pessoa p = new PessoaFisica();
			
			p.setNome("Fulano 0" + i);
			p.setEmail("fulano0" + i + "@gmail.com");
			p.setTelefone("9999-999" + i);
			
			lista.add(p);
		}
	}

	public void salvar() {
		if (!lista.contains(pessoaSelecionada)) {
			lista.add(pessoaSelecionada);
		}
	}
	
	public void excluir() {
		lista.remove(pessoaSelecionada);
		
		pessoaSelecionada = new PessoaFisica();
	}
	
	public Pessoa getPessoaSelecionada() {
		return pessoaSelecionada;
	}
	public void setPessoaSelecionada(Pessoa pessoaSelecionada) {
		this.pessoaSelecionada = pessoaSelecionada;
	}
	public Collection<Pessoa> getLista() {
		return lista;
	}
	public void setLista(Collection<Pessoa> lista) {
		this.lista = lista;
	}
}
