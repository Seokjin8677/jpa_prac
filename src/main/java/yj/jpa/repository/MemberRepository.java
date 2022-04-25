package yj.jpa.repository;

import yj.jpa.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);

    Optional<Member> findById(Long id);

    List<Member> findAll();
}
