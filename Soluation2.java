import java.util.*;
class Solution2 // 평균값 구하기.
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int result = 0;
        double sum = 0;
		int T;
		T=sc.nextInt();
		String a = sc.nextLine(); 
		
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
			int[] itarry = new int[2];
			for(int i = 0 ; i < itarry.length; i++) {
				itarry[i]= Integer.parseInt(it.next());
				}
            result = (int)Math.round(sum/itarry.length);
            sum = 0;
			System.out.println("#"+test_case+" "+result);
			result = 0;
		}
		sc.close();
	}
}