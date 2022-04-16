package org.codej.spring5_3.config;

import org.codej.spring5_3.spring.ChangePasswordService;
import org.codej.spring5_3.spring.MemberDAO;
import org.codej.spring5_3.spring.MemberRegisterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCtx {

    @Bean
    public MemberDAO memberDAO(){
        return new MemberDAO();
    }

    @Bean
    public MemberRegisterService memberRegSvc(){
        return new MemberRegisterService(memberDAO());
    }

    @Bean
    public ChangePasswordService changePwdSvc(){
        return new ChangePasswordService(memberDAO());
    }


}
