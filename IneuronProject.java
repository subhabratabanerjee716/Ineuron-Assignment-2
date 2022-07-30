package iNeuron;

import java.util.ArrayList;
import java.util.Scanner;

public class IneuronProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the no of players who will be taking part in this game :");
		
		Umpire u1 = new Umpire();
		
		u1.startGame();
		

	}

}

class Guesser {
	
	int guessno;
	
	
	public  int GuessNum() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Kindly guess the number :-");	
		
		guessno=sc.nextInt();
		
		return guessno;
		
		
	}
	
	
}

class Player{
	
	
	int guessno;
	
	Player(int guessno){
		
		this.guessno=guessno;
		
		
	}
	
}

class Umpire{
	
	
	int numfromguesser;
	int players;
	
	ArrayList<Player> playerList=new ArrayList<>();
	
	
	Scanner sc = new Scanner(System.in);
	
	Guesser g1 = new Guesser();
	
	public void startGame() {
		
		
		
		numfromguesser=g1.GuessNum();
		
		
		System.out.println("Enter the no of players needed :-");
		
		players = sc.nextInt();
		
		for(int i=0;i<players;i++) {
			
			int num;
			
			System.out.println("Guess the no :-");
			
			num = sc.nextInt();
			
			if(num>10) {
				
				System.out.println("Please enter no below 10");
				
				players++;
				
				continue;
				
			}
			
			playerList.add(new Player(num));
			
			
		}
		
		
		compare();
		
		
	}
	
	private void compare() {
		
		
		if(numfromguesser==playerList.get(0).guessno) {
			
			if(numfromguesser==playerList.get(1).guessno && numfromguesser==playerList.get(2).guessno) {
				
				System.out.println("Player 1 ,Player 2, Player 3 have guessed correctly .");
				
			}else if(numfromguesser==playerList.get(1).guessno) {
				
				
				System.out.println("Player 1 ,Player 2 have guessed correctly .");
				
			}else if(numfromguesser==playerList.get(2).guessno) {
				
				System.out.println("Player 1 ,Player 3 have guessed correctly .");
				
			}else {
			
			System.out.println("Player 1 has guessed correctly .");
			}
			
		}else if(numfromguesser==playerList.get(1).guessno) {
			
			if(numfromguesser==playerList.get(2).guessno) {
				
				System.out.println("Player 2 ,Player 3 have guessed correctly .");
				
			}else {
			System.out.println("Player 2 has guessed correctly .");
			}
			
		}else if(numfromguesser==playerList.get(2).guessno) {
			
			
			System.out.println("Player 3 has guessed correctly .");
			
		}else {
			
			
			System.out.println("Game Lost ! No one has guessed correctly,please try again.");
			
		}
		
		
	}
	
	
}
