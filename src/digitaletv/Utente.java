package digitaletv;

class Utente extends Thread {
String name;
Blackboard<Programma> blackboard ;
Utente(Blackboard<Programma> b) {
this.blackboard = b;
this.name = "Utente " + getName();
}

public void run(){
try {
Thread.sleep((long)(Math.random()*500)) ;
System.out.println(this.name + ": attendo un programma . . . ") ;
Programma msg = blackboard.read() ;
System.out.println( this.name + ": sto guardando " + msg.toString()) ;
} 
catch(InterruptedException e){ 
	e.printStackTrace() ;
}
}
}
