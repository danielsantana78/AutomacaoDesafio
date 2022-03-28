package paginas;

import core.BaseSelenium;
import elementos.Elementos_AbaSendQuote;

public class Paginas_AbaSendQuote extends BaseSelenium {

	private Elementos_AbaSendQuote eleDesafio = new Elementos_AbaSendQuote();

	public void preenchoOFormularioAbaSendQuoteEPressioneSend() {
		preencheCampoEMail();
		preencheCampoPhone();
		preencheCampoUsername();
		preencheCampoPassword();
		preencheCampoConfirmPassword();
		preencheCampoComments();
		clicaNoBotaoSend();
	}

	public void verificoAMensagemSendingEMailSuccessNaTela() {
		verificaAMensagem();
	}

	// métodos dos preenchimentos

	private void preencheCampoEMail() {
		esperarElementoExistir(eleDesafio.getCmpEMail());
		System.out.println("verifica se o objeto email existe na tela");
		escreveNoCampo(eleDesafio.getCmpEMail(), "daniel78santana@gmail.com");
		System.out.println("preenche o campo E-Mail com o meu e-mail pessoal");
	}

	private void preencheCampoPhone() {
		esperarElementoExistir(eleDesafio.getCmpPhone());
		System.out.println("verifica se o objeto phone existe na tela");
		escreveNoCampo(eleDesafio.getCmpPhone(), "11949038146");
		System.out.println("preenche o campo Phone com o meu número de telefone celular");
	}

	private void preencheCampoUsername() {
		esperarElementoExistir(eleDesafio.getCmpUsername());
		System.out.println("verifica se o objeto username existe na tela");
		escreveNoCampo(eleDesafio.getCmpUsername(), "daniel78santana");
		System.out.println("preenche o campo Username com o nome de usuário");
	}

	private void preencheCampoPassword() {
		esperarElementoExistir(eleDesafio.getCmpPassword());
		System.out.println("verifica se o objeto password existe na tela");
		escreveNoCampo(eleDesafio.getCmpPassword(), "D4n1el");
		System.out.println("preenche o campo Password com a senha criada");
	}

	private void preencheCampoConfirmPassword() {
		esperarElementoExistir(eleDesafio.getCmpConfirmPassword());
		System.out.println("verifica se o objeto Confirmpassword existe na tela");
		escreveNoCampo(eleDesafio.getCmpConfirmPassword(), "D4n1el");
		System.out.println("preenche o campo Confirm Password com a senha criada");
	}

	private void preencheCampoComments() {
		esperarElementoExistir(eleDesafio.getCmpComments());
		System.out.println("verifica se o objeto Comments existe na tela");
		escreveNoCampo(eleDesafio.getCmpComments(), "Desejo muitíssimo fazer parte do time da Accenture!");
		System.out.println("preenche o campo Comments com um texto");
	}

	private void clicaNoBotaoSend() {
		esperarElementoExistir(eleDesafio.getBtnsendemail());
		System.out.println("verifica se o objeto sendemail do botão Send existe na tela");
		clicar(eleDesafio.getBtnsendemail());
		System.out.println("clicou no botão << Send >>");
		System.out.println(" ");
		System.out.println("exibe o Pop-Up com a mensagem " + "Sending e-mail success!");
	}

	private void verificaAMensagem() {
		esperarPadrao(15);
		esperarElementoExistir(eleDesafio.getLblSuccess());
		System.out.println("verifica se o objeto outline: green dotted 2px !important; existe na tela");
		extrairTextoDoObjeto(eleDesafio.getLblSuccess(), "Sending e-mail success!");
		System.out.println("verificar a mensagem “Sending e-mail success!” na tela");
	}
}
