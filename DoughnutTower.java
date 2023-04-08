//33574359 Tshimbiluni Theophillus Nedambale
import java.util.Scanner;
import java.util.Random;
public class DoughnutTower {
	Character top = null;
	// create constants for colors
	static Character red = new Character('r');
	static Character blue = new Character('b');
	static Character green = new Character('g');
	// Towers declaration
	
    public static void main(String args[])
    {
		 int moves = 0;
		 int target = 0;
		 int max = 5;
		 Random randomNum = new Random();

		 StackAsMyArrayList Towers[] = new StackAsMyArrayList[5];
		 Towers[0] = new StackAsMyArrayList<Character>();
		 Towers[1] = new StackAsMyArrayList<Character>();
		 Towers[2] = new StackAsMyArrayList<Character>();
		 Towers[3] = new StackAsMyArrayList<Character>();
		 Towers[4] = new StackAsMyArrayList<Character>();
		 
		 while (moves<5)
        {
          target = randomNum.nextInt(max);
          while (Towers[target].getStackSize() == 5)
             {
               target = randomNum.nextInt(max);
             }
          Towers[target].push(blue);
		  target = randomNum.nextInt(max);
		  while (Towers[target].getStackSize() == 5)
             {
               target = randomNum.nextInt(max);
             }
          Towers[target].push(red);
		  target = randomNum.nextInt(max);
		  while (Towers[target].getStackSize() == 5)
             {
               target = randomNum.nextInt(max);
             }
          Towers[target].push(green );
         
          moves++;
        }
		
		for (int i = 0; i<=4; i++){
			if(Towers[i].getStackSize() !=5){
				System.out.println("Tower "+ i+ ": " + Towers[i]);
				System.out.println("Size :"+Towers[i].getStackSize());
				System.out.println("The tower is not full\n");
			}
			else if(Towers[i].getStackSize()==5 && Towers[i].checkStackUniform()==true){
				System.out.println("Tower "+ i+ ": " + Towers[i]);
				System.out.println("Size :"+Towers[i].getStackSize());
				System.out.println("Correct?"+Towers[i].checkStackUniform()+"\n");
			}
			else{
				System.out.println("Tower "+ i+ ": " + Towers[i]);
				System.out.println("Size :"+Towers[i].getStackSize());
				System.out.println("Correct?"+Towers[i].checkStackUniform()+"\n");
			}
		}
				
    }
}
