package Steps;


import Logic.GoogleLogic;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class GoogleSteps {
	
	private GoogleLogic googleLogic;
	
	
	 public  GoogleSteps() {
		 
		  googleLogic = new GoogleLogic();
		 
	 }
	
	@Given("que esteja na pagina do google")
	public void que_esteja_na_pagina_do_google() {
		googleLogic.caminhosite();
	
	   
	}

	@When("escrevo no campo de pesquisa")
	public void escrevo_no_campo_de_pesquisa() {
		googleLogic.inserindopesquisa();
		
	   
	}

	@Then("sou redirecionado para a pesquisa feita")
	public void sou_redirecionado_para_a_pesquisa_feita() {
		googleLogic.validandopaginacachorro();
	    
	}

	

}
