package dao;

import java.util.Collection;

import modelo.Pessoa;

public class CadastroPessoasDAO {

	public boolean salvar(Collection<Pessoa> lista, Pessoa pessoaSelecionada) {

		if (!lista.contains(pessoaSelecionada)) {
			lista.add(pessoaSelecionada);

			return true;
		}

		return false;
	}

	public boolean excluir(Collection<Pessoa> lista, Pessoa pessoaSelecionada) {

		if (lista.contains(pessoaSelecionada)) {
			lista.remove(pessoaSelecionada);
			
			return true;
		}
				
		return false;
	}
}