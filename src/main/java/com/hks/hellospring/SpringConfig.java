package com.hks.hellospring;

import com.hks.hellospring.repository.MemberRepository;
import com.hks.hellospring.repository.MemoryMemberRepository;
import com.hks.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
