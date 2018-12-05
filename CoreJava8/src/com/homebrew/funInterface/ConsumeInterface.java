package com.homebrew.funInterface;

public class ConsumeInterface {

	public static void main(String[] args) {
		
		

		PrintMessage pm = new PrintMessage()  {

			public void printMessage() {
				System.out.println("test");
				
			}
			
		};
		pm.printMessage();
	}

}
