import java.util.*;

class Solution {

    // 조합된 코스 문자열, 횟수
    Map<String, Integer> orderComb = new HashMap<>();

    // 조합된 코드 길이
    Map<Integer, List<String>> combLength = new HashMap<>();

    // 1. 주문별로 가능한 메뉴 조합과 횟수를 저장
    // 2. 길이별로 메뉴 조합 저장
    public String[] solution(String[] orders, int[] course) {
        String[] answer = {};

        // 주문된 음식에 대한 조합과 길이를 저장
        for (String order : orders) {
            makeCombination(order, orderComb);
        }

        // 조합된 코스를 횟수 기준으로 내림차순으로 정렬
        List<Integer> ordered = new ArrayList<>(combLength.keySet());
        // 길이별로 정렬
        for (int count : ordered) {
            // 각 길이에 대한 코스 리스트
            List<String> list = combLength.get(count);
            list.sort(new Comparator<String>() {
                @Override
                public int compare(String s1, String s2) {
                    // 횟수 기준 내림차순 정렬
                    return orderComb.get(s2) - orderComb.get(s1);
                }
            });
        }

        // 메뉴 담기
        List<String> list = new ArrayList<>();
        for (int cor : course) {
            List<String> cuisine = combLength.get(cor);

            if (cuisine != null) {
                for (int i = 0; i < cuisine.size(); i++) {
                    // 최소 두 명 이상의 손님에게 주문된 조합 중
                    // 가장 많이 주문된 조합의 주문 횟수와 같은 조합들을 모두 리스트에 저장
                    if (orderComb.get(cuisine.get(i)) >= 2
                            && orderComb.get(cuisine.get(i)) == orderComb.get(cuisine.get(0))) {
                        list.add(cuisine.get(i));
                    }
                }
            }
        }

        // 리스트를 배열로 변환
        answer = list.stream().toArray(String[]::new);
        Arrays.sort(answer); // 문자열 기준 정렬

        return answer;
    }

    // str의 조합을 모두 result에 횟수와 저장
    private void makeCombination(String str, Map<String, Integer> result) {
        // "ABCFG" -> "AB" "AC" "AF" "AG" "ABC" "ABF" "ABG"
        dfs(str, result, "", 0, 0);
    }

    // 조합
    private void dfs(String str, Map<String, Integer> result, String com, int depth, int start) {
        if (com.length() > 1) {
            // com을 알파벳 순으로 정렬 "FAB" -> "ABF"
            char[] temp = com.toCharArray();
            Arrays.sort(temp);
            com = String.valueOf(temp);

            // 만들어지지 않은 조합에 대해서만 combLength에 저장
            if (!result.containsKey(com)) {
                combLength.computeIfAbsent(com.length(), l -> new ArrayList<>()).add(com);
            }

            // 만들어진 조합에 대해 map에 횟수 갱신
            result.put(com, result.getOrDefault(com, 0) + 1);
        }

        if (depth == str.length()) {
            return;
        }

        for (int i = start; i < str.length(); i++) {
            dfs(str, result, com + String.valueOf(str.charAt(i)), depth + 1, i + 1);
        }
    }
}