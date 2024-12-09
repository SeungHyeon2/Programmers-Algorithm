package org.example.level2;

import java.util.*;

// 뉴스 클러스터링
// 여러 언론사에서 쏟아지는 뉴스, 특히 속보성 뉴스를 보면 비슷비슷한 제목의 기사가 많아 정작 필요한 기사를 찾기가 어렵다.
// Daum 뉴스의 개발 업무를 맡게 된 신입사원 튜브는 사용자들이 편리하게 다양한 뉴스를 찾아볼 수 있도록 문제점을 개선하는 업무를 맡게 되었다.
//
// 개발의 방향을 잡기 위해 튜브는 우선 최근 화제가 되고 있는 "카카오 신입 개발자 공채" 관련 기사를 검색해보았다.
//
// 카카오 첫 공채..'블라인드' 방식 채용
// 카카오, 합병 후 첫 공채.. 블라인드 전형으로 개발자 채용
// 카카오, 블라인드 전형으로 신입 개발자 공채
// 카카오 공채, 신입 개발자 코딩 능력만 본다
// 카카오, 신입 공채.. "코딩 실력만 본다"
// 카카오 "코딩 능력만으로 2018 신입 개발자 뽑는다"
// 기사의 제목을 기준으로 "블라인드 전형"에 주목하는 기사와 "코딩 테스트"에 주목하는 기사로 나뉘는 걸 발견했다.
// 튜브는 이들을 각각 묶어서 보여주면 카카오 공채 관련 기사를 찾아보는 사용자에게 유용할 듯싶었다.
//
// 유사한 기사를 묶는 기준을 정하기 위해서 논문과 자료를 조사하던 튜브는 "자카드 유사도"라는 방법을 찾아냈다.
//
// 자카드 유사도는 집합 간의 유사도를 검사하는 여러 방법 중의 하나로 알려져 있다.
// 두 집합 A, B 사이의 자카드 유사도 J(A, B)는 두 집합의 교집합 크기를 두 집합의 합집합 크기로 나눈 값으로 정의된다.
//
// 예를 들어 집합 A = {1, 2, 3}, 집합 B = {2, 3, 4}라고 할 때,
// 교집합 A ∩ B = {2, 3}, 합집합 A ∪ B = {1, 2, 3, 4}이 되므로,
// 집합 A, B 사이의 자카드 유사도 J(A, B) = 2/4 = 0.5가 된다. 집합 A와 집합 B가
// 모두 공집합일 경우에는 나눗셈이 정의되지 않으니 따로 J(A, B) = 1로 정의한다.
//
// 자카드 유사도는 원소의 중복을 허용하는 다중집합에 대해서 확장할 수 있다.
// 다중집합 A는 원소 "1"을 3개 가지고 있고, 다중집합 B는 원소 "1"을 5개 가지고 있다고 하자.
// 이 다중집합의 교집합 A ∩ B는 원소 "1"을 min(3, 5)인 3개, 합집합 A ∪ B는 원소 "1"을 max(3, 5)인 5개 가지게 된다.
// 다중집합 A = {1, 1, 2, 2, 3}, 다중집합 B = {1, 2, 2, 4, 5}라고 하면,
// 교집합 A ∩ B = {1, 2, 2}, 합집합 A ∪ B = {1, 1, 2, 2, 3, 4, 5}가 되므로, 자카드 유사도 J(A, B) = 3/7, 약 0.42가 된다.
//
// 이를 이용하여 문자열 사이의 유사도를 계산하는데 이용할 수 있다.
// 문자열 "FRANCE"와 "FRENCH"가 주어졌을 때, 이를 두 글자씩 끊어서 다중집합을 만들 수 있다.
// 각각 {FR, RA, AN, NC, CE}, {FR, RE, EN, NC, CH}가 되며, 교집합은 {FR, NC},
// 합집합은 {FR, RA, AN, NC, CE, RE, EN, CH}가 되므로,
// 두 문자열 사이의 자카드 유사도 J("FRANCE", "FRENCH") = 2/8 = 0.25가 된다.
//
// 입력 형식
// 입력으로는 str1과 str2의 두 문자열이 들어온다. 각 문자열의 길이는 2 이상, 1,000 이하이다.
// 입력으로 들어온 문자열은 두 글자씩 끊어서 다중집합의 원소로 만든다.
// 이때 영문자로 된 글자 쌍만 유효하고, 기타 공백이나 숫자, 특수 문자가 들어있는 경우는 그 글자 쌍을 버린다.
// 예를 들어 "ab+"가 입력으로 들어오면, "ab"만 다중집합의 원소로 삼고, "b+"는 버린다.
// 다중집합 원소 사이를 비교할 때, 대문자와 소문자의 차이는 무시한다. "AB"와 "Ab", "ab"는 같은 원소로 취급한다.

// 출력 형식
// 입력으로 들어온 두 문자열의 자카드 유사도를 출력한다. 유사도 값은 0에서 1 사이의 실수이므로, 이를 다루기 쉽도록 65536을 곱한 후에 소수점 아래를 버리고 정수부만 출력한다.
//
// 예제 입출력
// str1	            str2	        answer
// FRANCE	        french	        16384
// handshake	    shake hands	    65536
// aa1+aa2	        AAAA12	        43690
// E=M*C^2	        e=m*c^2	        65536

public class newsClustering_17677 {

    public static void main(String[] args) {
        // String str1 = "ABABAB";
        // String str2 = "BABABA";
        String str1 = "FRANCE";
        String str2 = "french";
        solution(str1, str2);
    }

    public static int solution(String str1, String str2) {
        ArrayList<String> al1 = new ArrayList<String>();
        ArrayList<String> al2 = new ArrayList<String>();

        for(int i = 0; i < str1.length() - 1; i++) {
            String s = str1.substring(i, i + 2);
            if(Character.isAlphabetic(s.charAt(0)) && Character.isAlphabetic(s.charAt(1))) {
                al1.add(s.toLowerCase());
            }
        }

        for(int i = 0; i < str2.length() - 1; i++) {
            String s = str2.substring(i, i + 2);
            if(Character.isAlphabetic(s.charAt(0)) && Character.isAlphabetic(s.charAt(1))) {
                al2.add(s.toLowerCase());
            }
        }

        System.out.println("al1 : " + al1);
        System.out.println("al2 : " + al2);

        int n = 0;
        int u = 0;
        // 교집합 구하기
        HashMap<String, Integer> hm1 = new HashMap<String, Integer>();
        HashMap<String, Integer> hm2 = new HashMap<String, Integer>();
        HashMap<String, Integer> hm3 = new HashMap<String, Integer>();
        for(String key : al1){
            if(!hm1.containsKey(key)){
                hm1.put(key, 1);
            }else{
                hm1.put(key, hm1.get(key) + 1);
            }
        }

        for(String key : al2){
            if(!hm2.containsKey(key)){
                hm2.put(key, 1);
            }else{
                hm2.put(key, hm2.get(key) + 1);
            }
        }
        System.out.println("hm1 : " + hm1);
        System.out.println("hm2 : " + hm2);

        if(hm1.size() > hm2.size()){
            for(String key : hm1.keySet()){
                if(hm2.containsKey(key) && hm2.get(key) <= 1){
                    hm3.put(key, hm2.get(key));
                }else if(hm2.containsKey(key) && hm2.get(key) > 1){
                    hm3.put(key, Math.min(hm2.get(key), hm1.get(key)));
                }
            }
        }else{
            for(String key : hm2.keySet()){
                if(hm1.containsKey(key) && hm1.get(key) <= 1){
                    hm3.put(key, hm1.get(key));
                }else if(hm1.containsKey(key) && hm1.get(key) > 1){
                    hm3.put(key, Math.min(hm1.get(key), hm2.get(key)));
                }
            }
        }

        System.out.println("hm3 : " + hm3);
        for(String index : hm3.keySet()){
            n += hm3.get(index);
        }

        // 합집합 구하기
        HashMap<String, Integer> m1 = new HashMap<String, Integer>();
        HashMap<String, Integer> m2 = new HashMap<String, Integer>();
        HashMap<String, Integer> m3 = new HashMap<String, Integer>();

        for(String key : al1){
            if(!m1.containsKey(key)){
                m1.put(key, 1);
            }else{
                m1.put(key, m1.get(key) + 1);
            }
        }

        for(String key : al2){
            if(!m2.containsKey(key)){
                m2.put(key, 1);
            }else{
                m2.put(key, m2.get(key) + 1);
            }
        }

        // System.out.println("m1 : " + m1);
        // System.out.println("m2 : " + m2);

        m3 = m1;

        for(String index : m2.keySet()){
            if(m3.containsKey(index)){
                m3.put(index, Math.max(m3.get(index) , m2.get(index)));
            }else{
                m3.put(index, m2.get(index));
            }
        }

        for(String index : m3.keySet()){
            u += m3.get(index);
        }

        if(n ==0 && u == 0){
            return 65536;
        }

        System.out.println("n : " + n);
        System.out.println("u : " + u);

        double value = (double) n/u * 65536;

        return (int) Math.floor(value);
    }
}
