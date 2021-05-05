package spring5_basic_study.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCtx2 {
		
	@Bean
	public MemberRegisterService getMemberRegisterService() {
		return new MemberRegisterService();
	}
	@Bean
	public ChangePasswordService getChangePasswordService() {
		return new ChangePasswordService();
	}
	
	@Bean
	public SelectService getSelectService() {
		return new SelectService();
	}
	@Bean
	public MemberInfoPrint getMemberInfoPrint() {
		MemberInfoPrint infoPrint = new MemberInfoPrint();
		return infoPrint;
	}
	@Bean
	public VersionPrint versionPrint() {
		VersionPrint versionPrint = new VersionPrint();
		versionPrint.setMaiorVersion(5);
		versionPrint.setMinorVersion(0);
		return versionPrint;
	}
}
