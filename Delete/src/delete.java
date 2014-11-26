import java.io.File;

public class delete {
	public static boolean deleteAll(String path) {
		File dir = new File(path);

		if (dir.exists()) {
			if (dir.isFile()) {
				dir.delete();
			} if (dir.isDirectory()) {
				File[] d = dir.listFiles();
				for (File f : d) {
					deleteAll(f.toString());
				}
//				dir.delete();
			}
			
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		String d = "D:\\f";
		System.out.println(deleteAll(d));
	}
}
