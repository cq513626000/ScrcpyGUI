import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Scrcpy {
	public static void main(String[] args){
		//Scrcpy.connect("90.147.106.112");
		runScrcpy();
	}
	public static void runScrcpy() {
		System.out.println("MIAO");
		Process p;
		try {
			List<String> cmdList = new ArrayList<String>();
			cmdList.add("cmd");
			cmdList.add("/c");
			cmdList.add("C:\\scrcpy\\scrcpy.exe");
			ProcessBuilder pb = new ProcessBuilder();
			pb.command(cmdList);
			p = pb.start();
			p.waitFor();
			BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void connect(String ip) {
		Process p;
		try {
			List<String> cmdList = new ArrayList<String>();
			cmdList.add("cmd");
			cmdList.add("/c");
			cmdList.add("C:\\scrcpy\\adb connect\\"+ip);
			ProcessBuilder pb = new ProcessBuilder();
			pb.command(cmdList);
			p = pb.start();
			p.waitFor();
			BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

