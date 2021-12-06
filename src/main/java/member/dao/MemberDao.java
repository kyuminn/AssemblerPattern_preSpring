package member.dao;

import java.util.HashMap;
import java.util.Map;

import member.vo.Member;

public class MemberDao {
	private static long nextId = 0;
	private Map<String,Member> map = new HashMap<>(); // db개념으로 생각하기
	// email에 대응하는 Member 객체를 가지고 있는 mapa
	
	public Member selectByEmail(String email) {
		return map.get(email);
	}
	
	public void insert(Member member) {
		member.setId(++nextId);
		map.put(member.getEmail(), member);
	}
	
	public void update(Member member) {
		map.put(member.getEmail(), member);
	}
}
