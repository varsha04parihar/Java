package Day2;

//import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Player
{
	int pid;
	String pname;
	String position;
	
	public Player(int pid,String pname,String position)
	{
		this.pid=pid;
		this.pname=pname;
		this.position=position;
	}
}
public class CollectioArrayList {
	public static void main(String[] args) {
		
		System.out.println("******Array List*********");
		 ArrayList<String> food = new ArrayList<String>();
		    food.add("Pasta");
		    food.add("Fish Fry");
		    food.add("Paneer");
		    food.add("Manchurian");
		    food.add("Pasta");
		    System.out.println(food);
	    	System.out.println("*********");

		    for(int f=0;f<food.size();f++)
		    {
		    	System.out.println(food.get(f));
		    }
	    	System.out.println("*********");

		    for(String i:food)
		    	System.out.println(i);
		    System.out.println("\n");
		    
	    	System.out.println("*********");

	    	Iterator it=food.iterator();
	    	while(it.hasNext())
	    	{
	    		System.out.println(it.next());
	    	}
	    	System.out.println("*********");
	    	System.out.println(food.get(3));
	    	
	    	System.out.println("*********");

	    	System.out.println(food.set(3, "Dry mancurian"));
	    	
	    	System.out.println("*********");
	    	System.out.println(food.get(3));
	    	
	    	System.out.println("*********");
	    	System.out.println("before sort");
	    	for(String i:food)
		    	System.out.println(i);
	    	System.out.println("\n");
	    	Collections.sort(food);
	    	System.out.println("after sort");
	    	for(String i:food)
		    	System.out.println(i);
	    	
	    	System.out.println("************");
	    	ArrayList<Integer> num=new ArrayList<>();
	    	num.add(44);
	    	num.add(22);
	    	num.add(55);
	    	num.add(11);
	    	num.add(33);
	    	System.out.println("before sort");
	    	for(int i:num)
		    	System.out.println(i);
	    	System.out.println("\n");
	    	Collections.sort(num);
	    	System.out.println("after sort");
	    	for(int i:num)
		    	System.out.println(i);
	    	Collections.reverse(num);
	    	System.out.println("\n");
	    	System.out.println("reverse list");
	    	for(int i:num)
		    	System.out.println(i);
	    
	    	
	    	System.out.println("**************");
	    	System.out.println("using class obj");
	    	
	    	Player p1=new Player(1, "Ashish", "Spiker");
	    	Player p2= new Player(2,"Yug","Defender");
	    	Player p3=new Player(3,"Randheer","Ace");
	    	Player p4=new Player(4, "Ashish", "Spiker");
	    	Player p5= new Player(5,"Yug","Defender");
	    	
	    	ArrayList<Player> ply=new ArrayList<>();
	    	ply.add(p1);
	    	ply.add(p2);
	    	ply.add(p3);
	    	ply.add(p4);
	    	ply.add(p5);
	    	
	    	Iterator iter=ply.iterator(); 
	    	System.out.println("\n");
	    	System.out.println("Pid \t Pname \t PPosition");
	    	while(iter.hasNext())
	    	{
	    		Player p=(Player)iter.next();
	    		System.out.println(p.pid+"\t"+p.pname+"\t\t"
	    				+ ""+p.position);
	    	}
	    	
	    	System.out.println("**********");
	    	ply.remove(p5);
	    	ply.remove(3);
	    	
	    	for(Player p:ply)
	    		System.out.println(p.pid+"\t"+p.pname+"\t"+p.position);
		
	}

}
