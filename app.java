// Java program to demonstrate
// how to fetch public IP Address
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.net.URL;
import java.net.MalformedURLException;

class app {
	public static void main(String args[])
		throws UnknownHostException
	{
		// The URL for which IP address needs to be fetched
		String googleUrl = "https://www.google.com/";
		String amazonUrl = "https://www.amazon.com";
		String facebookUrl = "https://www.facebook.com";

		try {
			// Fetch IP address by getByName()
			InetAddress googleIp = InetAddress.getByName(new URL(googleUrl)
													.getHost());

			// Print the IP address
			System.out.println("Public IP Address of: " + googleIp);
			
			
		}
		catch (MalformedURLException e) {
			// It means the URL is invalid
			System.out.println("Invalid URL");
		}
		
		try {
			// Fetch IP address by getByName()
			InetAddress amazonIp = InetAddress.getByName(new URL(amazonUrl)
													.getHost());

			// Print the IP address
			System.out.println("Public IP Address of: " + amazonIp);
			
			
		}
		catch (MalformedURLException e) {
			// It means the URL is invalid
			System.out.println("Invalid URL");
		}
		
		try {
			// Fetch IP address by getByName()
			InetAddress facebookIp = InetAddress.getByName(new URL(facebookUrl)
													.getHost());

			// Print the IP address
			System.out.println("Public IP Address of: " + facebookIp);
			
			
		}
		catch (MalformedURLException e) {
			// It means the URL is invalid
			System.out.println("Invalid URL");
		}
	}
}
