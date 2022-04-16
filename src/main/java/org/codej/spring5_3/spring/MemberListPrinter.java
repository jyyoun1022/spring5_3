package org.codej.spring5_3.spring;

import java.util.Collection;

public class MemberListPrinter {

    private MemberDAO memberDAO;
    private MemberPrinter memberPrinter;

    public MemberListPrinter(MemberDAO memberDAO, MemberPrinter memberPrinter) {
        this.memberDAO = memberDAO;
        this.memberPrinter = memberPrinter;
    }

    public void printAll(){
        Collection<Member> members = memberDAO.selectAll();
        members.forEach(member -> memberPrinter.print(member));
    }
}
