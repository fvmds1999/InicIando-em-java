package teste2;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import condominio.Apartamento;
import condominio.Edificio;
import condominio.Pessoa;

public class Teste2 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Edificio edificio = new Edificio();
		System.out.println("DADOS DO EDIFICIO");
		edificio.setEndereco("Rua 2, numero 54");
		System.out.println("Endereco do edificio: "+edificio.getEndereco());
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		edificio.setDataConstrucao(formato.parse("29/12/1970"));
		System.out.println("Data da construcao do edificio: "+edificio.getDataConstrucao());
		
		edificio.setDataVistoria(formato.parse("23/02/2023"));
	    System.out.println("Data da vistoria: "+edificio.getDataVistoria());
		
	
		Apartamento apartamento = new Apartamento();
		System.out.println("DADOS DO APARTAMENTO:");
		apartamento.setNumeroAp("12");
		System.out.println("Numero do apartamento: "+apartamento.getNumeroAp());
		apartamento.setAreaAp(30);
		System.out.println("Area do apartamento: "+apartamento.getAreaAp());
		
		Pessoa pessoa = new Pessoa();
		System.out.println("DADOS DO INQUILINO:");
		pessoa.setNome("Fernanda Vitoria");
		System.out.println("Nome: "+pessoa.getNome());
		pessoa.setCPF("12345678910");
		System.out.println("CPF: "+pessoa.getCPF());
		pessoa.setDataNasc(formato.parse("14/04/1999"));
		System.out.println("Data de nascimento: "+pessoa.getDataNasc());
		pessoa.setSexo("F");
		System.out.println("Sexo: "+pessoa.getSexo());

	}

}
