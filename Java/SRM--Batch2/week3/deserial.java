import java.io.*; 
class Student implements Serializable{  
	 int id;  
	 String name;  
	 public Student(int id, String name) {  
	  this.id = id;  
	  this.name = name;  
	 }  
	}
class deserial{  
 public static void main(String args[]){  
  try{  
  //Creating stream to read the object  
  ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));  
  Student s=(Student)in.readObject();  
  //printing the data of the serialized object  
  System.out.println(s.id+" "+s.name);  
  //closing the stream  
  in.close();  
  }catch(Exception e){System.out.println(e);}  
 }  
}
