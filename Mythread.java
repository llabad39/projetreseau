import java.lang.*;
import java.io.*;

public class Mythread implements Runnable{
    ServeurTcp serv;
    boolean r;
    public Mythread(ServeurTcp s){
	this.serv = s;
    }
    public void run(){
	try{
	    this.serv.runServ(r);
	}
	catch(Exception e){
	    System.out.println("can't run server");
	}
    }
    public void arret(){
	r =false;
    }
}
