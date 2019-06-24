package negocio;

import modelo.Pessoa;
import modelo.PessoaFisica;
import modelo.PessoaJuridica;

public class CadastroPessoasFactory {
	
	public Pessoa criarPessoa(String tipoNovaPessoa) {
		
		if (tipoNovaPessoa.equals("PF")) {
			return new PessoaFisica();
		} else {
			return new PessoaJuridica();
		}
	}

}
