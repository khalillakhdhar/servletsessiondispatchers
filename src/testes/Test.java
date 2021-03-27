package testes;
import classes.User;
import classes.Users;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
User u1=new User("teste","teste","teste",12);
Users us=new Users();
us.adduser(u1);
String t1=us.exists("teste","teste").toString();
User t2=us.exists("a","b");
System.out.println("le résultat du premier teste est "+t1);
System.out.println("le résultat du deuxiéme teste est "+t2);
	}

}
