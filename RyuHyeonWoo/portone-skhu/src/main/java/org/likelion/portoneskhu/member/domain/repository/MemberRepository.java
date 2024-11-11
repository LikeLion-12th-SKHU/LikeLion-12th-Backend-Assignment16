package org.likelion.portoneskhu.member.domain.repository;

import org.likelion.portoneskhu.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}
