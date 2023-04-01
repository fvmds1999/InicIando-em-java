package condominio;

import java.util.Date;

public class Edificio {
	
	private String endereco; 
	private Date dataConstrucao, dataVistoria;
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Date getDataConstrucao() {
		return dataConstrucao;
	}
	public void setDataConstrucao(Date dataConstrucao) {
		this.dataConstrucao = dataConstrucao;
	}
	public Date getDataVistoria() {
		return dataVistoria;
	}
	public void setDataVistoria(Date dataVistoria) {
		this.dataVistoria = dataVistoria;
	}


	
    
}
