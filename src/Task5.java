
public class Task5 {

	private static final long MEGABYTE = 1024L * 1024L;

	public static long bytesToMegabytes(long bytes) {
		return bytes / MEGABYTE;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "abc"; 				// 332400 bytes
		String str2 = new String("abc"); 	// 332424 bytes
		String str3 = "abc"; 				// 332400 bytes
		Runtime runtime = Runtime.getRuntime();
		runtime.gc();
		long memory = runtime.totalMemory() - runtime.freeMemory();
		System.out.println("Used memory is bytes: " + memory);
		System.out.println("Used memory is megabytes: " + bytesToMegabytes(memory));
		System.out.println("str1 is managed 332400 bytes on Runtime by JVM");
		System.out.println("str2 is managed 332424 bytes on Runtime by JVM");
		System.out.println("str3 is managed 332400 bytes on Runtime by JVM");
		System.out.println("Totally, JVM used " + memory + "bytes on runtime!");

	}

}