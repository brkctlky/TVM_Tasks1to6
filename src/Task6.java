import java.util.ArrayList;
import java.util.Arrays;

public class Task6 {

	public static String getPopularElement(ArrayList<String> strList) {
		int count = 1, tempCount;
		String popular = strList.get(0), temp = null;
		for (int i = 0; i < (strList.size() - 1); i++) {
			temp = strList.get(i);
			tempCount = 0;
			for (int j = 1; j < strList.size(); j++) {
				if (temp == strList.get(j))
					tempCount++;
			}
			if (tempCount > count) {
				popular = temp;
				count = tempCount;
			}
		}
		System.out.println("The most repeated word occured '" + count + "' times!");
		return popular;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> strList = new ArrayList<String>();
		
		//sample list 1
		//strList.addAll(Arrays.asList("apple", "pie", "apple", "red", "red", "red"));
		
		//sample list 2
		//strList.addAll(Arrays.asList("for", "geeks", "a", "portal", "to", "learn", "can", "be", "geeks",
		//					"computer", "science", "geeks", "zoom", "yup", "fire", "in", "be", "data", "geeks"));
		
		//sample list 3
		strList.addAll(Arrays.asList("Eskisehir", "Bursa", "Eskisehir", "Istanbul", "Adana", "Istanbul",
							"Ankara", "Izmir", "Adana", "Ankara", "Istanbul", "Batman", "Izmir", "Eskisehir",
							"Istanbul", "Batman", "Istanbul", "Adana", "Bursa", "Ankara"));
	
		System.out.println("The most repeated word is '" + getPopularElement(strList) + "'!");

	}

}
