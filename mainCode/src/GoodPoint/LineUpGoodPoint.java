package GoodPoint;

import java.util.*;

public class LineUpGoodPoint {
	//List<MakeGoodPoint> list = new ArrayList<MakeGoodPoint>();
	/*
	void setGoodPoint(MakeGoodPoint EX){
		list.add(EX);
	}
	*/
	
	public static void main(String[] args){
	
		List<MakeGoodPoint> list = new ArrayList<MakeGoodPoint>();
		MakeGoodPoint example1 = new MakeGoodPoint();
		example1.setGoodPoint(10);
		list.add(example1);
		
		GPComparator comp = new GPComparator();
		Collections.sort(list, comp);
	
		for (int i=0; i<list.size(); i++){
			MakeGoodPoint example = list.get(i);
			System.out.println(example.getGoodPoint()+" : "+example.getGoodPoint());
		}
	}
}

class GPComparator implements Comparator<MakeGoodPoint>{

	@Override
	public int compare(MakeGoodPoint first, MakeGoodPoint second) {
		// TODO Auto-generated method stub
		int firstGP = first.getGoodPoint();
		int secondGP = second.getGoodPoint();
		
		if(firstGP > secondGP){
			return -1;
		} else if (firstGP < secondGP){
			return 1;
		}else{
			return 0;
		}
	}
	
}
