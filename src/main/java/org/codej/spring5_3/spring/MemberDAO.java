package org.codej.spring5_3.spring;

import java.util.HashMap;
import java.util.Map;

public class MemberDAO {

    private static long nextId=0;

    private Map<String,Member> map = new HashMap<>();

    public Member selectByEmail(String email){
        return map.get(email);
    }

    public void insert(Member member){
        member.setId(++nextId);
        map.put(member.getEmail(),member);
    }

    public void update(Member member){
        map.put(member.getEmail(),member);
    }
}
