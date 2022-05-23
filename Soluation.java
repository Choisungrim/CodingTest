import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int result = 0;
		int T;
		T=sc.nextInt();
		String a = sc.nextLine(); // 첫번째 열의 값을 빼냈기 때문에  공백출력을 담기위함.
		
		String b = sc.nextLine();
		String c = sc.nextLine();
		String d = sc.nextLine();
		for(int test_case = 1; test_case <= T; test_case++)
		{	
			List<String> list = new ArrayList<>();
			if(test_case == 1) {
				String[] b1 = b.replace(" ", ",").split(",");
				list = new ArrayList<>(Arrays.asList(b1));
			}else if(test_case == 2) {
				String[] c1 = c.replace(" ", ",").split(",");
				list = new ArrayList<>(Arrays.asList(c1));
			}else{
				String[] d1 = d.replace(" ", ",").split(",");
				list = new ArrayList<>(Arrays.asList(d1));
			}
			Iterator<String> it = list.iterator();
			int[] itarry = new int[10];
			for(int i = 0 ; i < itarry.length; i++) {
				itarry[i]= Integer.parseInt(it.next());
				if(itarry[i]%2!=0)
					result += itarry[i];
			}
			System.out.println("#"+test_case+" "+result);
			result = 0;
		}
		sc.close();
	}
}