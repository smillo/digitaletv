package digitaletv;

public class CanaleTv extends Thread {
	
 String name;
 Blackboard<Programma> blackboard;
 Programma[] programmazione;

 CanaleTv(Blackboard<Programma> b, String nomeCanale , Programma[] progs) {
 this.blackboard = b;
 this.name = nomeCanale ;
 this.programmazione = progs ;
 }
 
 public void run() {
 for( int i = 0; i< programmazione.length ; i++){
 System.out.println( this.name + " trasmette alle " + programmazione[i]) ;
 blackboard.write(programmazione[i]) ;
 try {
 Thread.sleep((long)(Math.random()*1000));
 } 
 catch( InterruptedException e){
 e.printStackTrace();
 }
 }
 }}