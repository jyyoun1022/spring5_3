package org.codej.spring5_3.spring;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
    public void read(String email){
        Member value = map.get(email);
        Set<String> key = map.keySet();
        System.out.println(key+ " : "+value);
    }
    public void AllRead(){
//        for (String key : map.keySet()) {
//            Member value = map.get(key);
//            System.out.println(key + " : "+value);
//        }
        map.forEach((key,value)->{
            System.out.println(key + " : "+value);
        });
    }
    public void delete(String email){
        Member remove = map.remove(email);
        System.out.println(email +"<- 해당 이메일에 관련 정보는 삭제되었습니다.");
    }
}
