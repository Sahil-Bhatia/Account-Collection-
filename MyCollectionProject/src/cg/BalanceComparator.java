package cg;
import com.cg.bean.*;
import java.util.*;
public class BalanceComparator  implements Comparator<Account>{
//Custom Sorting
	@Override
	public int compare(Account arg0, Account arg1) {
		// TODO Auto-generated method stub
		
		double diff=arg0.getBalance()-arg1.getBalance();
		
		if(diff>0)return 1;
		else if(diff<0)return -1;
		else		
		return 0;
	}

}
