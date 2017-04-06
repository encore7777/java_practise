package dome;

import java.util.ArrayList;

public class Database {
	
//	public ArrayList<CD> listCD = new ArrayList <CD>();
//	public ArrayList<DVD> listDVD = new ArrayList <DVD>();
	public ArrayList<ITEM> listITEM = new ArrayList <ITEM>();
	
	public void add(ITEM item){
		listITEM.add(item);		
	}
	
	
	public void list(){
      for (ITEM item: listITEM){
    	item.print();  
      }  
      
  	}
      
	
	public static void main(String[] args){
		Object o = new Object();
//		o.toString();
		
		Database db = new Database();
		ITEM cd = new CD("abc","def",4,60,"good");
		ITEM cc = new CD("abc","def",4,60,"good");
        
		System.out.println(cd.equals(cc));
//		System.out.println(cd);
//		db.add(cd);
//		
//		ITEM dvd = new DVD("ABC","DEF",100,"bad");
//		db.add(dvd);
//		ITEM game = new Game("i","ii",70,"iii");
//		db.add(game);
//		
//		db.list();
	}
	

}
