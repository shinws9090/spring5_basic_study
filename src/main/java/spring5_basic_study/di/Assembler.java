package spring5_basic_study.di;

public class Assembler {
	
	private MemberDao memberDao;
	private MemberRegisterService regSvc;
	private ChangePasswordService pwdSvc;
	private SelectService selSvc;
	
	public Assembler() {
		memberDao = new MemberDao();
//		regSvc = new MemberRegisterService(memberDao);
//		pwdSvc = new ChangePasswordService(memberDao);
//		selSvc = new SelectService(memberDao, new MemberPrint());
	}

	public MemberDao getMemberDao() {
		return memberDao;
	}

	public MemberRegisterService getMemberRegisterService() {
		return regSvc;
	}

	public ChangePasswordService getChangePasswordService() {
		return pwdSvc;
	}
	public SelectService getSelectService() {
		return selSvc;
	}
	
	
}
