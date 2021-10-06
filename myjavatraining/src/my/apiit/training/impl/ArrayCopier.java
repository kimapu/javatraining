package my.apiit.training.impl;

public class ArrayCopier {

	/**
	 * Copy the following array elements to another.
		"Affogato", "Americano", "Cappuccino", "Corretto", "Cortado", "Doppio",
		"Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato", "Marocchino",
		"Ristretto”
	 */
	
	//+ to(String[], String[]) : String[]
	public static String[] to( String[] src, String[] dest ) {
		/**
		 * public static void arraycopy(Object src,
             int srcPos,
             Object dest,
             int destPos,
             int length)
		 */
		System.arraycopy(
				src,
				0, //from index of src
				dest,
				0, //from index of dest
				src.length //nos
				);
		return dest;
		
	}
	
	
	//alternatively, Object.clone()
	
	
}
