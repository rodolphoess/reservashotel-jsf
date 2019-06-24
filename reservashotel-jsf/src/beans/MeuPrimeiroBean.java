package beans;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="meuPrimeiroBean")
public class MeuPrimeiroBean {
	private String ola = "Bem vindo ao Sistema de Marcação de Reservas - SISMARV!";
	private boolean exibir = true;

	public String getOla() {
		return ola;
	}

	public boolean isExibir() {
		return exibir;
	}

	public void setExibir(boolean exibir) {
		this.exibir = exibir;
	}
	
	
}
