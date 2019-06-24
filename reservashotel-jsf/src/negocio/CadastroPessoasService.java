package negocio;

import java.util.Collection;
import java.util.ResourceBundle;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import dao.CadastroPessoasDAO;
import modelo.Pessoa;

public class CadastroPessoasService {

	private CadastroPessoasDAO dao;

	public CadastroPessoasService() {
		this.dao = new CadastroPessoasDAO();
	}

	public void salvar(FacesContext contexto, Pessoa pessoaSelecionada, Collection<Pessoa> lista) {

		if (dao.salvar(lista, pessoaSelecionada))
			contexto.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Edição efetuada com sucesso!", ""));
	}

	public void excluir(Collection<Pessoa> lista, Pessoa pessoaSelecionada) {

		if (dao.excluir(lista, pessoaSelecionada)) {
			pessoaSelecionada = null;
			String mensagem = ResourceBundle
					.getBundle("bundles.mensagens",
							FacesContext.getCurrentInstance().getExternalContext().getRequestLocale())
					.getString("excluida");

			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, mensagem, ""));
		}
	}
}