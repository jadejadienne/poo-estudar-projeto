package br.com.ifce.projeton1.armas;
//Essa linha indica que essa classe “Arma” pertence a esse pacote, pacotes servem
//para a organização das classesem diretórios.

public class Arma {
//Declaramos a classe Arma. 
  
	private String nome;
	private int forca;
	private int precisao;
	private String poder;
	private int forcaPoder;
//Declaramos os atributos: nome, forca, precisao, poder,forcapoder. Que representa caracteres.
	
	public Arma(String nome, int forca, int precisao) {
		this.nome = nome;
		this.forca = forca;
		this.precisao = precisao;
	}
	//Criamos o nosso primeiro construtor da classe ele é chamado quando é criado uma
  //uma instância de arma.como nome, forca e precisao. 

  
	public Arma(String poder, int forcaPoder) {
		this.poder = poder;
		this.forcaPoder = forcaPoder;
	}
//Criamos o nosso segundo construtor da classe ele é chamado quando é criado uma uma instância de
//arma. como poder, forcaPoder. e ele inicia os os atributos correspondente. 

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
//Esses são os métodos de acesso  set e get para o atributo nome. eles permite ler e modificar os nomes. 

  
	public int getForca() {
		return forca;
	}
	public void setForca(int forca) {
		this.forca = forca;
	}
	//métodos semelhantes para os atributos forca. 

  
	public int getPrecisao() {
		return precisao;
	}
	public void setPrecisao(int precisao) {
		this.precisao = precisao;
	}
	//Get e set são atributos semelhantes para o atributo precisão. 

  
	public String getPoder() {
		return poder;
	}
	public void setPoder(String poder) {
		this.poder = poder;
	}
//get e set para poder são métodos semelhantes para poder. 
  

	public int getForcaPoder() {
		return forcaPoder;
	}
	public void setForcaPoder(int forcaPoder) {
		this.forcaPoder = forcaPoder;
	}
//get e set para forcapoder são métodos semelhantes para forcapoder. 

  
	public double danoCausado() {
		double dano = (this.forca*0.4) + (this.precisao*0.6);
		return dano;
	}
//Método danocausado, ele calcula e retorna o dano causado pela arma com base na fórmula que considera 
//a  forca e a precisao da arma.  
  

	public double danoCausadoPoder() {
		double intervalo = 60;
		double dano = (Math.random() * intervalo);
		if (dano > 60) {
			dano = 60;
		}
		return (int) (dano + 0.5);
	}
}

//intervalo é para inicializada com o valor 60. esse valor é o valor máximo para o dano causado pelo poder da arma. 
//É um método que gera um número entre 0 (inclusive) a 01(exclusivo). multiplicar pelo intervalo e resulta em um número 
//de 0 a 60.
//verificar se dano é maior que 60 se sim e ajustado para 60. isso é feito para que não ultrapasse o valor definido. 
//o valor final de dano é retornado apois add 0.5, basicamente para ordenar um numero. ex 12.6 se torna 13 e 12.3 se
//torna 12. 
