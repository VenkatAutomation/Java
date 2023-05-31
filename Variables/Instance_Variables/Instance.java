package Instance_Variables;

public class Instance 
{
	
	String name;         //Instance Variables
	int age;                //Instance Variables
	String adress;      //Instance Variables
	String role;  //Instance Variables
    int num;            //Instance Variables
    
    void rathod(String name,int age,String adress,String role,int num)
    {
    	this.name=name;
    	this.age=age;
    	this.adress=adress;
    	this.role=role;
    	this.num=num;
    	
    	System.out.println(name+","+age+","+adress+","+role+","+num);
    }
    
    public static void main(String[] args) {
		
    	Instance i = new Instance();
    	
//    	System.out.println(i.name);
//    	System.out.println(i.age);
//    	System.out.println(i.adress);
//    	System.out.println(i.role);
//    	System.out.println(i.num);
    	
    	i.rathod("Rathod", 24, "Kukatpally", "Automation Test Engineer", 40000);
    	
	}
	
}
