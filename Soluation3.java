import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Iterator;
class Soluation3 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String result = "";
		
		int T=sc.nextInt();
		String a = sc.nextLine(); // 행 처리
		
		String b = sc.nextLine();
		String c = sc.nextLine();
		String d = sc.nextLine();
		for(int test_case = 1; test_case <= T; test_case++)
		{	
			List<String> list = new ArrayList<>();
			if(test_case == 1){
                String[] b1 = b.replace(" ",",").split(",");
                list=new ArrayList<>(Arrays.asList(b1));
            }else if(test_case == 2){
                String[] c1 = c.replace(" ", ",").split(",");
                list = new ArrayList<>(Arrays.asList(c1));
            }else{
                String[] d1 = d.replace(" ", ",").split(",");
                list = new ArrayList<>(Arrays.asList(d1));
            }

            Iterator<String> it = list.iterator();
            int[] arr = new int[2];

            for(int i = 0 ; i < arr.length; i++)
                arr[i] = Integer.parseInt(it.next());
            if(arr[0] > arr[1]){
                result = ">";
            }else if(arr[0]<arr[1]){
                result = "<";
            }else result = "=";
            
            System.out.println("#"+test_case+" "+result);
            result = "";
		}
		sc.close();
    }    
}
