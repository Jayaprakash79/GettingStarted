package arrayList_practice;
import java.util.*;
public class ArrayList_Ex {
	public static void main(String[] args) {
		ArrayList<Emp> al = new ArrayList<>();
		al.add(new Emp(111,"jp",99999));
		al.add(new Emp(222,"virat",77999));
		al.add(new Emp(444,"kohli",66999));
		al.add(new Emp(333,"anuskha",1199999));
		al.add(new Emp(001,"vamika",33399));
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}

	}

}
