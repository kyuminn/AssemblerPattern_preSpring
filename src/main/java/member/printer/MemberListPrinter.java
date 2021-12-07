package member.printer;

import java.util.Collection;

import member.dao.MemberDao;
import member.vo.Member;

public class MemberListPrinter {
	private MemberDao memberDao;
	private MemberPrinter memberPrinter;
	
	public MemberListPrinter(MemberDao memberDao, MemberPrinter memberPrinter) {
		this.memberDao= memberDao;
		this.memberPrinter = memberPrinter;
	}
	
	public void printAll() {
		Collection<Member> members = memberDao.selectAll();
		for(Member m : members) {
			memberPrinter.print(m);
		}
	}
}
