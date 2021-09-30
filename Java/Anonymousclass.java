class A{}
class B{}

class Main{
	public static void main(String args[]){
		B ob1 = new B(){};
		System.out.println(ob1);
		
		A ob = new A(){};
		System.out.println(ob);	
	}
}

/*
A@1234
this.x=10

18. A@3456  Main$1@6d06d69c
19. this.x=100
*/






