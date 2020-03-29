package level1;

/**
 * - 문제 설명
 * 문자열 s는 한 개 이상의 단어로 구성되어 있습니다.
 * 각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
 * 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
 * <p>
 * - 제한 사항
 * 문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
 * 첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.
 * <p>
 * - 입출력 예
 * s = try hello world
 * return = TrY HeLlO WoRlD
 */
public class Lessons12930 {

	public String solution(String s) {
		String answer;
		String[] words = s.split(" ", -1); // limit -1 = 맨 뒤에 공백 문자를 살려준다.
		for (int i = 0; i < words.length; i++) {
			char[] word = words[i].toCharArray();
			for (int j = 0; j < word.length; j++) {
				if (j % 2 == 0) word[j] = Character.toUpperCase(word[j]);
				else word[j] = Character.toLowerCase(word[j]);
			}
			words[i] = new String(word);
		}

		answer = String.join(" ", words);
		return answer;
	}
}
