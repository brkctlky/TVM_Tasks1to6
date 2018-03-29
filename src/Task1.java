import java.util.ArrayList;
import java.util.HashMap;

public class Task1 {
	
	public static String[] sortByAs(String[] strArr) {
		int numOfAs, tempInt, start, end;
		String tempStr;
		int[] numOfAsArr = new int[strArr.length];
		for (int i = 0; i < strArr.length; i++) {
			numOfAs = 0;
			for (int j = 0; j < strArr[i].length(); j++) {
				if (strArr[i].charAt(j) == 'a') {
					numOfAs++;
				}
			}
			numOfAsArr[i] = numOfAs;
		}
		for (int i = 0; i < numOfAsArr.length; i++) {
			for (int j = 0; j < numOfAsArr.length; j++) {
				if (numOfAsArr[i] > numOfAsArr[j]) {
					tempInt = numOfAsArr[i];
					tempStr = strArr[i];
					numOfAsArr[i] = numOfAsArr[j];
					strArr[i] = strArr[j];
					numOfAsArr[j] = tempInt;
					strArr[j] = tempStr;
				} else if (numOfAsArr[i] == numOfAsArr[j] && strArr[i].length() > strArr[j].length()) {
					tempInt = numOfAsArr[i];
					tempStr = strArr[i];
					numOfAsArr[i] = numOfAsArr[j];
					strArr[i] = strArr[j];
					numOfAsArr[j] = tempInt;
					strArr[j] = tempStr;
				}
			}
		}
		return strArr;
	}

	public static void main(String[] args) {

		String[] strArr = { "aaaasd", "a", "aab", "aaabcd", "ef", "cssssssd", "fdz", "kf", "zc", "lklklklklklklklkl", "l" };
		strArr = sortByAs(strArr);
		for (int i = 0; i < strArr.length; i++)
			System.out.println(strArr[i]);
	}

}
