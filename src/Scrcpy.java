import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Scrcpy {

	private static List<String> devices = new ArrayList<String>();

	public static void main(String[] args) {
		System.out.println(checkConnection());
		System.out.println(devices);

	}

	public static void runScrcpy() {
		Cmd.run("C:\\scrcpy\\scrcpy.exe");
	}
	
	public static void connect(String ip) {
		Cmd.run("C:\\scrcpy\\adb connect "+ip);
	}

	public static boolean checkConnection() {
		String response  = Cmd.run("C:\\scrcpy\\adb devices");
		String[] devs = response.split("\n");
		if(devs.length>1){
			for(int i = 1; i<devs.length; i++){
				devices.add(devs[i].split("\t")[0]);
			}
			return true;
		}
		return false;
	}

	public static void initialise(JTextArea area){
		checkConnection();
		area.append(devices.get(0));
	}
	}

