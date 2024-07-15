import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String[] inputTime = sc.nextLine().split(" ");
		int timer = sc.nextInt();		
		int hour = Integer.valueOf(inputTime[0]);
		int minutes = Integer.valueOf(inputTime[1]);
		int plus = (minutes + timer)/60;
		if ( plus >=1) {
			hour += plus;
			minutes += timer-plus*60;
		}
        else
		{
			minutes += timer;
		}
        
        
        
        if (hour>=24) {
			hour-=24;
			
		}
        
		
        sc.close();
		System.out.println(hour+" "+minutes);
		

	}

}
