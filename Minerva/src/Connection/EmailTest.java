package Connection;

import org.hibernate.Session;

import tables.Profile;
import tables.User;

public class EmailTest {

	/**
	 * @param args
	 */
	
	// m� kj�re ProfileCon.createUsers() f�rst
	public static void main(String[] args) {
		boolean test = ProfileCon.emailExcists("hjem@gogle.com");
		if (test) {
			System.out.println("Finnes");
		}
		else
			System.out.println("Finnes ikke");

	}

}
