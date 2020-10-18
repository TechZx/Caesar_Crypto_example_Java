import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{			
		Text TxtKey=new Text();  	
		Scanner input = new Scanner(System.in);
		System.out.println("Pleaee enter a word:");
		TxtKey.setText(input.next());
		System.out.println("Please enter a key of encryption:");
		TxtKey.setKey(input.nextInt());		
		Crypto EncryptText1=new Crypto(TxtKey.getKey(),TxtKey.getText());
		System.out.println(("Encryption : \t") + EncryptText1.encrypt(TxtKey.getText(),TxtKey.getKey()));
		StringBuffer encrypttext;
	    encrypttext=EncryptText1.encrypt(TxtKey.getText(),TxtKey.getKey());
		System.out.println(("Decryption : \t") + EncryptText1.decrypt(encrypttext,TxtKey.getKey()));
	}
}