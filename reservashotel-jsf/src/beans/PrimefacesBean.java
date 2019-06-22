package beans;

import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.DateSelectEvent;

@ManagedBean
@SessionScoped
public class PrimefacesBean {
	private Date data;

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	public void definirData(DateSelectEvent event) {
		setData(event.getDate());
		FacesContext.getCurrentInstance().addMessage(null, 
				new FacesMessage("Data alterada", "A data agora é: " + data));
	}
}
