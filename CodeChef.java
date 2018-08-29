/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		
		Timestamp timestamp;
		String data;
		int node_number;
		String node_id;
		String ref_nodeid;
		String child_ref_nodeid;
		String genesis_refid;
		String hashvalue;
		
		int count=0;
		
		public Date date(){
		    Timestamp ts = new Timestamp(date.getTime());
		    timestamp=ts;
		    return ts;
		}
		public String data(int id,float value,String name){
		    
		    
		    HashSet<String> h = new HashSet<String>();
 
        // Adding elements into HashSet usind add()
    
        h.add(id);
        h.add(value);
        h.add(name);
        data=h;
        return h;
		}
		
		public int nodenumber(){
		    count++;
		    node_number=count;
		    return  count;
		}
		
		public String nodeid(){
		     UUID id = UUID.randomUUID();
		     node_id=id;
		     return id;
		     
		}
		
		public String refrencenodeid(String parentadd){
		    ref_nodeid=parentadd;
		    return parentadd;
		    
		}
		
		public String childreferenceid(String childadd){
		    child_ref_nodeid=childadd;
		    return childadd;
		    
		}
		
		public String genesisrefid(String genesisadd){
		    genesis_refid=genesisadd;
		    return genesisadd;
		    
		}
		
		public String HashValue(){
		    String hashvalue=timestamp+data+ node_number+ node_id+ref_nodeid+child_ref_nodeid+ genesis_refid;
		    return hashvalue;
		
		}
		
		
	
      
      int i=1;
    while(i=1){
        int c=1;
        String n="str"+c;
    LinkedList<String> linky = new LinkedList<String>();
     String  n= new String(timestamp,data,node_number, node_id,ref_nodeid,child_ref_nodeid, genesis_refid);
    
    linky.add(n);
    System.out.println("more inputss ??"+"enter 1 else enter 0");
    int a=in.nextInt();
    if(a==1)
    i=1;
    else
    i=0;
    
    }
	}
}

