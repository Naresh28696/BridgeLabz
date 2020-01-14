package bridgelab.naresh.day9;

public class PoemWordReplace {
	public static void main(String args[]) { 
        
	      // Initialising String 
	      String Str = new String("Old Macdonald had a farm, E-I-E-I-O\r\n" + 
	      		"And on his farm he had a cow, E-I-E-I-O\r\n" + 
	      		"With a \"moo-moo\" here and a \"moo-moo\" there\r\n" + 
	      		"Here a \"moo\" there a \"moo\"\r\n" + 
	      		"Everywhere a \"moo-moo\"\r\n" + 
	      		"Old Macdonald had a farm, E-I-E-I-O\r\n" + 
	      		"\r\n" + 
	      		"Old Macdonald had a farm, E-I-E-I-O\r\n" + 
	      		"And on his farm he had a pig, E-I-E-I-O\r\n" + 
	      		"With a (snort) here and a (snort) there\r\n" + 
	      		"Here a (snort) there a (snort)\r\n" + 
	      		"Everywhere a (snort-snort)\r\n" + 
	      		"Old Macdonald had a farm, E-I-E-I-O\r\n" + 
	      		"\r\n" + 
	      		"Old Macdonald had a farm, E-I-E-I-O\r\n" + 
	      		"And on his farm he had a horse, E-I-E-I-O\r\n" + 
	      		"With a \"neigh, neigh\" here and a \"neigh, neigh\" there\r\n" + 
	      		"Here a \"neigh\" there a \"neigh\"\r\n" + 
	      		"Everywhere a \"neigh, neigh\"\r\n" + 
	      		"Old Macdonald had a farm, E-I-E-I-O\r\n" + 
	      		"\r\n" + 
	      		"Old Macdonald had a farm, E-I-E-I-O\r\n" + 
	      		"And on his farm he had a chicken, E-I-E-I-O\r\n" + 
	      		"With a \"cluck, cluck\" here and a \"cluck, cluck\" there\r\n" + 
	      		"Here a \"cluck\" there a \"cluck\"\r\n" + 
	      		"Everywhere a \"cluck, cluck\"\r\n" + 
	      		"Old Macdonald had a farm, E-I-E-I-O\r\n" + 
	      		"\r\n" + 
	      		"Old Macdonald had a farm, E-I-E-I-O\r\n" + 
	      		"And on his farm he had a duck, E-I-E-I-O\r\n" + 
	      		"With a \"quack, quack\" here and a \"quack, quack\" there\r\n" + 
	      		"Here a \"quack\" there a \"quack\"\r\n" + 
	      		"Everywhere a \"quack, quack\"\r\n" + 
	      		"Old Macdonald had a farm, E-I-E-I-O"); 
	        
	      // Using replace to replace characters 
	      System.out.print("After replacing all o with T : " ); 
	      System.out.println(Str.replace("farm", "ANIMAL")); 
	        
	      // Using replace to replace characters 
	      System.out.print("After replacing all e with D : " ); 
	      System.out.println(Str.replace("moo", "SOUND")); 
	        
	   } 
}
