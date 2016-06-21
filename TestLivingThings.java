 interface LivingThings{
	void walk();
	void eat();
	void grow();
	void die();

} 
 abstract class Mammals implements LivingThings{
	public void grow(){
		System.out.println("person");
	}
	public void die(){
		System.out.println("50 years");
	}

	
}
abstract class Reptile implements LivingThings{
	public void grow(){
		System.out.println("lizard");
	}
	public void die(){
		System.out.println("4 years");
	}
	
}
abstract class Avians implements LivingThings{
	public void grow(){
		System.out.println("Dove");
	}
	public void die(){
		System.out.println("2 years");
	}
  }
  class person extends Mammals{
  	public void walk(){
  		System.out.println(" 2 legs");
  	}
  	public void eat(){
  		System.out.println("Mouth");
  	}

  }
  class snake extends Reptile{
  	public void walk(){
  		System.out.println("1");
  	}
  	public void eat(){
  		System.out.println("Mouth");
  	}
  	
  }
    class chicken extends Avians{
  	public void walk(){
  		System.out.println(" 2 legs");
  	}
  	public void eat(){
  		System.out.println("Mouth");
  	}
  }
  public class TestLivingThings{
  	public static void print(LivingThings l){
  		l.eat();
  		l.walk();
  		l.grow();
  		l.die();
  	}
  	public static void main(String[] args){
  		Mammals p= new person();
  		print(p);
  		Reptile r=new snake();
  		print(r);
  		Avians a=new chicken();
  		print(a);


  		
  	}

  

  }


  
