package spring5_basic_study.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCtx1 {
	
	@Bean
	public MemberDao getMemberDao() {
		return new MemberDao();
	}

	@Bean
	public MemberPrint getMemberPrint() {
		return new MemberPrint();
	}

}
