import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); Map<String,List<Integer>> map = new HashMap();
        sc.nextLine();
        List<String> type = new ArrayList();
        for(int i = 1; i<=T;i++){
            String t = sc.nextLine();
            type.add(t); map.put(t,new ArrayList());
        }
        int N = sc.nextInt();
        sc.nextLine();
        for(int i = 1; i<=N;i++){
            String t = sc.nextLine();
            map.get(t).add(i);
        }
        for(String t: type){
            for(int id:map.get(t)){
                System.out.println(id);
            }
        }
    }
}
