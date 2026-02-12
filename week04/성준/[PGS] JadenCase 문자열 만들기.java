class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean isStart = true; // 단어의 시작 여부

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ') {
                sb.append(c);
                isStart = true;
            } else {
                if (isStart) {
                    // 단어의 첫 문자
                    if (Character.isLetter(c)) {
                        sb.append(Character.toUpperCase(c));
                    } else {
                        sb.append(c); // 숫자
                    }
                    isStart = false;
                } else {
                    // 단어 내부
                    if (Character.isLetter(c)) {
                        sb.append(Character.toLowerCase(c));
                    } else {
                        sb.append(c);
                    }
                }
            }
        }

        return sb.toString();
    }
}
