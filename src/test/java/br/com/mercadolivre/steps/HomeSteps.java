package br.com.mercadolivre.steps;

import br.com.mercadolivre.pages.HomePage;
import org.junit.Assert;
import org.junit.Test;

public class HomeSteps extends BaseSteps{

    HomePage homePage = new HomePage();

    @Test
    public void validarPesquisaComProdutoExistente(){
        homePage.setEscreverNoCampoMercadoLivre("Smartphone");
        homePage.setLimparCampo();
        homePage.setEscreverNoCampoMercadoLivre("galaxy S22");
        homePage.setClicaNoCampoPesquisa();
        Assert.assertEquals("Galaxy s22", homePage.getValidarPesquisa());

    }
  








    }


