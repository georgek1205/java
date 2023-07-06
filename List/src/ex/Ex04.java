package ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class Ex04 {

	public static void main(String[] args) {
		
			List<Member> memberList = new ArrayList<>();
			Member member = new Member("김승규", "01012345678");
			memberList.add(member);
			memberList.add(new Member("유재석", "01087654321"));
			memberList.add(new Member("강호동", "01083752938"));
			memberList.add(new Member("박명수", "01029481111"));
			
			//toString 오버라이드 해줘야한다. 예전에객채배울때햇던거
			System.out.println(memberList);
			
			System.out.println(memberList.get(0));
			
			Member firstMember = memberList.get(0);
			System.out.println(firstMember.getName());
			
			//모든 이름 출력
			for(int i = 0; i < memberList.size(); i++)
			{
				System.out.print(memberList.get(i).getName() + " ");
			}
			System.out.println();
			
			for(Member member_1 : memberList)
			{
				System.out.print(member_1.getPhoneNumber() + " ");
			}
			System.out.println();
			
			Iterator<Member> iter = memberList.iterator();
			while(iter.hasNext())
			{
				Member member_iter = iter.next();
				String part1 = member_iter.getPhoneNumber().substring(0, 3);
				String part2 = member_iter.getPhoneNumber().substring(3, 7);
				String part3 = member_iter.getPhoneNumber().substring(7);
				System.out.println(part1 + "-" + part2 + "-" + part3);
				
				if(part3.equals("1111"))
				{
					iter.remove();
				}
				
				
				
			}
			System.out.println(memberList);
			
	}

}
