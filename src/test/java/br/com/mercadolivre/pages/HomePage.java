package br.com.mercadolivre.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.ClickAndHoldAction;

public class HomePage extends BasePage{

    private static final By campoMercadoLivre =
            new By.ByCssSelector("#cb1-edit");
    private static final By apagarText =
            new By.ByCssSelector("#cb1-edit");

    private static final By escreverNoCampo =
            new By.ByCssSelector("body > header");
    private static final By clicaNoCampoPesquisa =
            new By.ByCssSelector("[class=\"nav-search-btn\"]");

    private static final By validarPesquisa =
            new By.ByCssSelector("[class=\"ui-search-breadcrumb__title shops-custom-primary-font\"]");



    public void setEscreverNoCampoMercadoLivre(String pesquisar){
        sendKeys(campoMercadoLivre, pesquisar);}
    public void setLimparCampo(){ limparCampo(apagarText);}

    public void setClicaNoCampoPesquisa(){
        click(clicaNoCampoPesquisa);}

    public String getValidarPesquisa(){
        return lerText(validarPesquisa);}






    }






