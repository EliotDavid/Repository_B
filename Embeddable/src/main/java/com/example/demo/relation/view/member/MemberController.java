package com.example.demo.relation.view.member;

import com.example.demo.relation.domain.academy.Academy;
import com.example.demo.relation.domain.academy.AcademyRepository;
import com.example.demo.relation.domain.member.Address;
import com.example.demo.relation.domain.service.RelationService;
import com.example.demo.relation.view.member.dto.MemberDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("/members")
@RequiredArgsConstructor
@Controller
public class MemberController {
    private final RelationService relationService;
    private final AcademyRepository academyRepository;

    @GetMapping("/new")
    public String insert(@ModelAttribute("form") MemberDto dto) {
        return "members/newMemberForm";
    }

    @PostMapping("/new")
    public String save(@Valid @ModelAttribute("form") MemberDto dto, BindingResult bindingResult) {

        if(bindingResult.hasErrors()) {
            return "members/newMemberForm";
        }











        //List<Academy> academies = academyRepository.findByName(dto.getAcademyName());




        /*
        Academy academy = null;

        if(!academies.isEmpty())
            academy = academies.get(0);
        else
            academy = new Academy(dto.getAcademyName());

        List<Member> members = relationService.findById(dto.getLoginId());

        if(!members.isEmpty())
        {
            System.out.println("Error Message!!!!");
            return "members/newMemberForm";
        }
        else
            relationService.insert(
                    new Member(
                            dto.getLoginId(),
                            dto.getMemberName(),
                            dto.getPassword(),
                            academy) );


        List<Academy> byAcademyName = relationService.findByAcademyName(dto.getAcademyName());
        System.out.println(byAcademyName);

        List<Address> byAddress1Name = relationService.findByAddress1Name((dto.getAddress1()));
        System.out.println(byAddress1Name);

        List<Address> byAddress2Name = relationService.findByAddress2Name((dto.getAddress2()));
        System.out.println(byAddress2Name);

        List<Address> byZipcodeName = relationService.findByAddress2Name((dto.getZipcode());
        System.out.println(byZipcodeName);
        */







        /*s
        List<Academy> academies = academyRepository.findByName(dto.getAcademyName());

        Academy academy = null;

        if(!academies.isEmpty())
            academy = academies.get(0);
        else
            academy = new Academy(dto.getAcademyName());

        List<Member> members = relationService.findById(dto.getLoginId());

        if(!members.isEmpty())
        {
            System.out.println("Error Message!!!!");
            return "members/newMemberForm";
        }
        else
            relationService.insert(
                    new Member(
                            dto.getLoginId(),
                            dto.getMemberName(),
                            dto.getPassword(),
                            academy) );
        */

        return "redirect:/";
    }
}
