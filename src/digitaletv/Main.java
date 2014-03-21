package digitaletv;

public class Main {

public static void main(String args[]) throws InterruptedException{
 Blackboard<Programma> blackboard3 = new Blackboard<Programma>();
 Blackboard<Programma> blackboard1 = new Blackboard<Programma>();
 Blackboard<Programma> blackboard7 = new Blackboard<Programma>();
 
 for( int i = 0; i< 2; i++){
	 
 new Utente(blackboard3 ).start() ;
 
}

 Programma[] progs3 = new Programma[3];
 progs3[0] = new Programma("Meteo 3 " , "20:05") ;
 progs3[1] = new Programma("Blob " , "20:10") ;
 progs3[2] = new Programma("TG3 " , "20:25") ;
 
for( int i = 0; i< 2; i++){
	 
 new Utente(blackboard1 ).start() ;
 
}
 
 
  Programma[] progs1 = new Programma[3];
 progs1[0] = new Programma("Meteo italia 1 " , "20:05") ;
 progs1[1] = new Programma("italia 1  " , "20:10") ;
 progs1[2] = new Programma("TG6 " , "20:25") ;
	
for( int i = 0; i< 2; i++){
	 
 new Utente(blackboard7 ).start() ;
 
}

Programma[] progs7 = new Programma[3];
 progs7[0] = new Programma("Meteo la 7 " , "20:05") ;
 progs7[1] = new Programma("la 7 " , "20:10") ;
 progs7[2] = new Programma("TG7 " , "20:25") ;



	 new CanaleTv(blackboard3 , "Rai 3" , progs3).start() ;
	 new CanaleTv(blackboard1 , "Italia 1" , progs1).start() ;
	 new CanaleTv(blackboard7 , "La 7" , progs7).start() ;
	 }
 }
 