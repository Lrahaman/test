package Day16;

public class InterviewQ2 {

	public static void main(String[] args) {
		 {
				String input="I'm trying to make a program on word count which I partially made and it is giving the correct result but the moment";  //Input String 
			      String[] words=input.split(" ");  //Split the word from String
			      int wrc=1;    //Variable for getting Repeated word count
			      
			      for(int i=0;i<words.length;i++) //Outer loop for Comparison       
			      {
			         for(int j=i+1;j<words.length;j++) //Inner loop for Comparison
			         {
			            
			         if(words[i].equals(words[j]))  //Checking for both strings are equal
						{
							wrc = wrc + 1; // if equal increment the count
							words[j] = "0"; // Replace repeated words by zero
						}
			         }
			         if(words[i]!="0")
			         System.out.println(words[i]+"--"+wrc); //Printing the word along with count
			         wrc=1;
			         
			        }  
			         
			   }

			}


	}


