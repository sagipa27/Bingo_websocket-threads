package com.websocktes.websocktes;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class bingo1 extends Thread{
String balota;
//crear arraylist
	    ArrayList Lb = new ArrayList();
	    ArrayList Li = new ArrayList();
	    ArrayList Ln = new ArrayList();
	    ArrayList Lg = new ArrayList();
	    ArrayList Lo = new ArrayList();
	    
	    ArrayList Lb1 = new ArrayList();
	    ArrayList Li1 = new ArrayList();
	    ArrayList Ln1 = new ArrayList();
	    ArrayList Lg1 = new ArrayList();
	    ArrayList Lo1 = new ArrayList();
//Balotas que han salido	    
	    static ArrayList Balotas = new	ArrayList();
	    static bingo1 bn = new bingo1();
	    static bingo1 bn1 = new bingo1();
	   
	    boolean bingo = false; //ternimar juego

	    public void ilistas() {
	        this.Lb.add("B");
	        this.Li.add("I");
	        this.Ln.add("N");
	        this.Lg.add("G");
	        this.Lo.add("O");

	        this.glista();
	    }
	    public void ilistas1() {
	        this.Lb1.add("B");
	        this.Li1.add("I");
	        this.Ln1.add("N");
	        this.Lg1.add("G");
	        this.Lo1.add("O");

	        this.glista1();
	    }

	    public String mcartilla() {
	    	StringBuilder car = new StringBuilder();
	        for (int i = 0; i < this.Lb.size(); i++) {
	       
	        	car.append("\n");
	        	
	        	car.append("<p>|\t" + this.Lb.get(i) + "\t|\t" + this.Li.get(i) + "\t|\t" + this.Ln.get(i) + "\t|\t" + this.Lg.get(i) + "\t|\t" + this.Lo.get(i) + "\t|\t<br></p>");
	        	
	        }
	        return car.toString();
	    }
	    public String mcartilla1() {
	    	StringBuilder car = new StringBuilder();
	        for (int i = 0; i < this.Lb1.size(); i++) {
	       
	        	car.append("\n");
	        	
	        	car.append("<p>|\t" + this.Lb1.get(i) + "\t|\t" + this.Li1.get(i) + "\t|\t" + this.Ln1.get(i) + "\t|\t" + this.Lg1.get(i) + "\t|\t" + this.Lo1.get(i) + "\t|\t<br></p>");
	        	
	        }
	        return car.toString();
	    }

	    public void glista() {
	        Random rd = new Random();
	        for (int i = 0; i < 5; i++) {
	            this.Lb.add(rd.nextInt(15));
	            this.Li.add(rd.nextInt(15) + 15);
	            this.Ln.add(rd.nextInt(15) + 30);
	            this.Lg.add(rd.nextInt(15) + 45);
	            this.Lo.add(rd.nextInt(15) + 60);
	        }
	    }
	    public void glista1() {
	        Random rd = new Random();
	        for (int i = 0; i < 5; i++) {
	            this.Lb1.add(rd.nextInt(15));
	            this.Li1.add(rd.nextInt(15) + 15);
	            this.Ln1.add(rd.nextInt(15) + 30);
	            this.Lg1.add(rd.nextInt(15) + 45);
	            this.Lo1.add(rd.nextInt(15) + 60);
	        }
	    }

	    public String bolillas() {
	        String[] bolillas = new String[5];
	        bolillas[0] = "B";
	        bolillas[1] = "I";
	        bolillas[2] = "N";
	        bolillas[3] = "G";
	        bolillas[4] = "O";

	        Random rd = new Random();

	        String bolilla = bolillas[rd.nextInt(5)];

	        int numero = rd.nextInt(15);
	        switch (bolilla) {
	            case "B":
	                
	                break;
	            case "I":
	                numero += 15;
	              
	                break;
	            case "N":
	                numero += 30;
	               
	                break;
	            case "G":
	                numero += 45;
	               
	                break;
	            case "O":
	                numero += 60;
	               
	                break;
	        }
	        String R = bolilla + numero;
	        
	        return R;
	    }

	
	 
	    public void check(String b) {
	 
	    	 String O = "X";
	    	for (int i = 1; i < this.Lb.size(); i++) {


                if(("B"+this.Lb.get(i)).equals(b)) {
                	
                	this.Lb.set(i,O);
                }
                if(("I"+this.Li.get(i)).equals(b)) {
                	this.Li.set(i,O);
                }
                if(("N"+this.Ln.get(i)).equals(b)) {
                	this.Ln.set(i,O);
                }
                if(("G"+this.Lg.get(i)).equals(b)) {
                	this.Lg.set(i,O);
                }
                if(("O"+this.Lo.get(i)).equals(b)) {
                	this.Lo.set(i,O);
                }
	        }
	    	
	    	
	    }
	    public void check1(String b) {
	   	 
	    	String O = "X";
	    	for (int i = 1; i < this.Lb1.size(); i++) {


                if(("B"+this.Lb1.get(i)).equals(b)) {
                	
                	this.Lb1.set(i,O);
                }
                if(("I"+this.Li1.get(i)).equals(b)) {
                	this.Li1.set(i,O);
                }
                if(("N"+this.Ln1.get(i)).equals(b)) {
                	this.Ln1.set(i,O);
                }
                if(("G"+this.Lg1.get(i)).equals(b)) {
                	this.Lg1.set(i,O);
                }
                if(("O"+this.Lo1.get(i)).equals(b)) {
                	this.Lo1.set(i,O);
                }
	        }
	    	
	    	
	    }
	    
	    
	   public String messa() {
		
		  
		   StringBuilder tablas = new StringBuilder();
	        bn.ilistas();
	        String b =  bn.bolillas();
	        
	        bn1.ilistas1();
	       
	        bn.check(b);
            bn1.check1(b);
	        String y = bn.mcartilla();
		    
	        String x = bn1.mcartilla1();
	        
	        tablas.append("<p>"+y+"<br><br></p>");
	        tablas.append("<p>"+x+"<br><br></p>");
	        tablas.append("<p>"+"La balota de este turno es:"+b+"<br><br></p>");
	        
		   return tablas.toString();
	   }
	   
	   public String messa1() {
			
		   
		   StringBuilder tablas1 = new StringBuilder();
	        
	        String b =  bn.bolillas();
	        
	        
	        bn.check(b);
           bn1.check1(b);
           String y = bn.mcartilla();
		    
	        String x = bn1.mcartilla1();
	        
	        tablas1.append("<p>"+y+"<br><br></p>");
	        tablas1.append("<p>"+x+"<br><br></p>");
	        tablas1.append("<p>"+"La balota de este turno es:"+b+"<br><br></p>");
	        new Thread(new Runnable() {
	            private String myParam;
	          
	            // instance initializer
	            {
	                this.myParam = y;
	              
	            }

	            @Override
	            public void run() {
	                System.out.println("Esto viene de un hilo nuevo.");
	                System.out.println(this.myParam+"\n");
	            }
	        }).start();
	        new Thread(new Runnable() {
	            private String myOtherParam;
	          
	            // instance initializer
	            {
	                this.myOtherParam = x;
	              
	            }

	            @Override
	            public void run() {
	                System.out.println("Esto viene de un hilo nuevo");
	                System.out.println(this.myOtherParam+"\n");
	            }
	        }).start();
		   return tablas1.toString();
	   }
	    	
	  

		
	    
	   
	public void x () {
		// TODO Auto-generated method stub
		{
	        bingo1 bn = new bingo1();
	        bn.ilistas();
	        
	        bingo1 bn1 = new bingo1();
	        bn1.ilistas1();
	        
	        bn.mcartilla();
            bn1.mcartilla1();
            
	        Scanner sc = new Scanner(System.in);
	        while (!bn.bingo || !bn1.bingo) {
	             
	        	
	             bn.bolillas();
	            
	             
	            // Balotas.add(b);
	             
	             System.out.println(Balotas);
	            // System.out.println(b);
	             bn.mcartilla();
	             bn1.mcartilla1();
	             System.out.println("Es bingo?");
	            String bingo = sc.nextLine();
	             if (bingo.equalsIgnoreCase("bingo")) {
	                bn1.bingo = !bn1.bingo;
	             }
	             if (bingo.equalsIgnoreCase("bingo")) {
	                bn.bingo = !bn.bingo;
	             }
	            
	        }
	    }
		
	}

}
