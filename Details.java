
public class Details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "sachin";
		String place = "banglore";
		String phn = "977777777";
		String pincode = "123654";
		String mail = "sachinbazz125@gmail.com";
		
		if ( name.length() < 3  || name.isEmpty()) {
			
			System.out.println("invalid name");
			
		}
		System.out.println(name);
		
		if ( place.length() < 4 || place.isEmpty()) {
			System.out.println("invalid place");                     
		}
		System.out.println(place);

		
		if ( phn.length() < 10 || phn.startsWith("1") || phn.startsWith("2") || phn.startsWith("3") || phn.startsWith("4") || phn.startsWith("5") || phn.startsWith("0") ) {
			System.out.println("invalid number");
		}
		System.out.println(phn);
		
		if ( pincode.length() < 6 || pincode.isEmpty() ) {
			 System.out.println("invalid pin");
			
		}
		
		System.out.println(pincode);
	    
      boolean e =  ( mail.endsWith(".com") && mail.contains("@") && mail.length() < 25) ;
		System.out.println(e);
	
		System.out.println(mail);
		
       
		}
	
}
