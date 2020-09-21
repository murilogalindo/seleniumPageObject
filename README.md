# seleniumPageObject

Website
desafio_qa Desafio QA

## Configurando e rodando o projeto

Você irá precisar

Instalação Instalar o Java SDK Alguma IDE para JAVA Eclipse ou Intellij Baixar as libs do Selenium - https://www.selenium.dev/downloads/ Baixar o Chromedriver - https://chromedriver.chromium.org/downloads

Iniciando o Java Passo 1 - Instalar o Java em seu computador Baize e Insale o Java Software Development Kit (JDK)

## Estrutura do Projeto
Projeto iciado para estudos

Dificuldade: fácil

Tecnologias escolhidas: Linguagem Java Framework de testes automatizados: Selenium WebDriver Framework de testes automatizados: JUnit * Padrão de escrita de código de testes: PageObjects * Cucumber e linguagem Guerkin

## Resumo:
Encontrar path relativo de driver

Básico de WebDriver

Básico de PageObjects

Criar um método de teste

Validar resultados de teste

## Estrutura do Projeto

## Classe Util:
incluir métodose e variǘaeis que serão usados em todo o projeto, como url, geradaor de CPF

## Classe Asserts
Validação de elementos na tela

## Classe Actions
Contém acões na tela, como: cliquesm em links, fechamento de modal, interação com alerta...

## Classe Base:
Criar pasta e incluir chromedriver (driver do navegador chrome) Contém o WebDriver e o controle do browser

## Classe Page:
Fazer antes de criar os testes para mapear os elementos da tela que será efetuado ações Recomendo utilizar o navegador Mozilla Firefox e usar a extensão e Firebug para ajudar a mapear Criar classe para cada página existente no sistema Mapeie cada elemento: ajuda na hora da manutenção e fica mais legível

## Classe RunTestSuite
Classe que representa uma suíte de testes que irão ser executados

Abre a sua IDE e importe o porjeto mporte as libs do Selenium Configure o caminho da pasta onde está seu arquivo webdriver através do código: System.setProperty("webdriver.chrome.driver", "/home/user/Documentos/webdrivers/chromedriver");

No projeto: Clique com o botão direito sobre a classe RegisterInmroboTest.java
