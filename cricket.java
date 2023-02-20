
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class cricket {
    public static void main(String[] args) {
        ArrayList<String> ar = new ArrayList<>();
   

        ar.add("team1");
        ar.add("team2");
        ar.add("team3");
        ar.add("team4");
        ar.add("team5");
        ArrayList<Object>vis = new ArrayList<>();
        Match one = new Match(ar.get(0));
        Match two = new Match(ar.get(1));
        Match three = new Match(ar.get(2));
        Match four = new Match(ar.get(3));
        Match five = new Match(ar.get(4));
        vis.add(one);
        vis.add(two);
        vis.add(three);
        vis.add(four);
        vis.add(five);
       
          new Match(vis);
        }
    

 
}

class Match {
    String s;

    Match(String str) {
        this.s = str;
    }
    public String toString(){
        return s;
    }
    Match(ArrayList<Object> luc){
      
        for(int i=0;i<=5-1;i++){
            for(int j=0;j<5/2;j++){
                int t1=(i+j)%(5-1);
                int t2=(5-1-j+i)%(5-1);
                if(j==0){
                    t2=5-1;
      }
      System.out.println(luc.get(t1)+"\tvs\t"+luc.get(t2));
    }
}
    }
}