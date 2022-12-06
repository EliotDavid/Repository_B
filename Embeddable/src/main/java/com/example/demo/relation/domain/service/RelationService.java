package com.example.demo.relation.domain.service;

import com.example.demo.relation.domain.academy.Academy;
import com.example.demo.relation.domain.member.Address;
import com.example.demo.relation.domain.member.Member;
import com.example.demo.relation.domain.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class RelationService {
    private final MemberRepository memberRepository;


    @Transactional
    public void insert(Member member) {
        memberRepository.save(member);
    }

    public List<Member> findById(String loginId) {
        return memberRepository.findById(loginId);
    }

    public List<Academy> findByAcademyName(String academyName) {
        return memberRepository.findByAcademyName(academyName);
    }

    public List<Address> findByAddress1Name(String address1){
        return memberRepository.findByAddress1yName(address1);
    }

    public List<Address> findByAddress2Name(String address2){
        return memberRepository.findByAddress2yName(address2);
    }

    public List<Address> findByZipcodeName(String zipcode){
        return memberRepository.findByZipcodeName(zipcode);
    }


}
