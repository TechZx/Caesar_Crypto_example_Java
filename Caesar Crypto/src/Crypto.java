
public class Crypto extends Text 
{	
	public Crypto(int key,String text)
	{
		super();
	}	
	public StringBuffer encrypt(String text, int key) 
	{
		StringBuffer result= new StringBuffer(); 
		  
        for (int i=0; i<text.length(); i++) 
        { 
            if (Character.isUpperCase(text.charAt(i))) 
            { 
                char ch = (char)(((int)text.charAt(i) +  key)); 
                result.append(ch); 
            } 
            else 
            { 
                char ch = (char)(((int)text.charAt(i) + key )); 
                result.append(ch); 
            }       
        } 
        return result; 			
	}
	public StringBuffer decrypt(StringBuffer text, int key) 
	{	
		 StringBuffer result= new StringBuffer(); 
	      
         for (int i=0; i<text.length(); i++) 
         { 
             if (Character.isUpperCase(text.charAt(i))) 
             { 
                 char ch = (char)(((int)text.charAt(i) - key)); 
                 result.append(ch); 
             }    
             else 
             { 
                 char ch = (char)(((int)text.charAt(i) - key )); 
                 result.append(ch); 
             }     
         } 
        return result; 	
	}
}
