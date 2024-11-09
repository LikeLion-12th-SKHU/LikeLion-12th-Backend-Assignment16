package org.likelion.portoneskhu.member.application;

import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.likelion.portoneskhu.member.domain.Member;
import org.likelion.portoneskhu.member.domain.repository.MemberRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    // 자동 회원가입
    @Transactional
    public Member signUp() {
        Member member = Member.builder()
                .name(UUID.randomUUID().toString())
                .email("payment@example.com")
                .address("경기도 양평군")
                .build();

        return memberRepository.save(member);
    }
}
