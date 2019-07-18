package GUI;

import java.awt.*;
import java.util.Scanner;

import javax.swing.*;

public class Gui1 extends JFrame{

	public static void main(String[] args) {
		JFrame frame=new JFrame("Éµx±æ±ðÏµÍ³.java");
		frame.setLocation(800, 400);
		frame.setSize(300,300);
		frame.setVisible(true);
		Container con=frame.getContentPane();
		
	}
	public String getText() {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		return str;
	}

}
