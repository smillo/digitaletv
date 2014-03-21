package digitaletv;

class Programma{
private String nome;
private String startTime;

Programma(String nome, String start ){
this.nome = nome;
this.startTime = start ;

}

public String toString(){ 
	return startTime + " >> " + nome + "" ;
}
}

