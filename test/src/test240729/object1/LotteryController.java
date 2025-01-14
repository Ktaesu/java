package test240729.object1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class LotteryController {
	
	private HashSet lottery = new HashSet();
	private HashSet win = new HashSet();
	
	public boolean insertObject(Lottery l) {
		return lottery.add(l);
	}
	
	public boolean deleteObject(Lottery l) {
		boolean isRemove = lottery.remove(l);
		if( isRemove && win != null) {
			win.remove(l);
		}
		return isRemove;
		
	}
	
	public HashSet winObject() {
		if(lottery.size() < 4) {
			return null;
		}
		
		List<Lottery> list = new ArrayList<>();
		list.addAll(lottery);
		
		//당첨자 4명을 뽑기위한 반복4변
		while(win.size() < 4) { //사이즈확인해서 4명이하면
			int rand = (int)(Math.random() * list.size()); //랜덤발생
			win.add(list.get(rand));// 랜덤자리에있는 사람을
		}
		
		return win;
	
	}
	
	public TreeSet sortedWinObject() {
		TreeSet sortedWinSet = new TreeSet(new SortedLottery());
		sortedWinSet.addAll(win);
		return sortedWinSet;
	}
	
	public boolean searchWinner(Lottery l) {
		return win.contains(l);
	}

}
