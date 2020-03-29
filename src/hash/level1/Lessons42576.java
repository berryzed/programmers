package hash.level1;

import java.util.*;

/**
 * - 문제 설명
 * 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
 * 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때,
 * 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
 * - 제한 사항
 * 마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
 * completion의 길이는 participant의 길이보다 1 작습니다.
 * 참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
 * 참가자 중에는 동명이인이 있을 수 있습니다.
 * - 입출력 예
 * participant = ["leo", "kiki", "eden"] / ["marina", "josipa", "nikola", "vinko", "filipa"] / ["mislav", "stanko", "mislav", "ana"]
 * completion = ["eden", "kiki"] / ["josipa", "filipa", "marina", "nikola"] / ["stanko", "ana", "mislav"]
 * return = leo / vinko / mislav
 */
public class Lessons42576 {

	public String solution(String[] participant, String[] completion) {
		String answer = null;

		Arrays.sort(participant);
		Arrays.sort(completion);
		HashMap<Integer, List<String>> hashMap = new HashMap<>();

		// 참가자
		for (String player : participant) {
			int key = getHashKey(player);
			List<String> playerNames = hashMap.getOrDefault(key, new ArrayList<>());
			playerNames.add(player);
			hashMap.put(key, playerNames);
		}

		// 완주자
		for (String player : completion) {
			int key = getHashKey(player);
			hashMap.get(key).remove(player);
		}

		for (List<String> value : hashMap.values()) {
			if (!value.isEmpty()) {
				answer = value.get(0);
				break;
			}
		}
		return answer;
	}

	private int getHashKey(String s) {
		return s.charAt(0) - 97;
	}

	/**
	 * 효율성 좋은 코드
	 */
	public String solution2(String[] participant, String[] completion) {
		String answer = null;
		HashMap<String, Integer> hashMap = new HashMap<>();
		for (String player : participant) hashMap.put(player, hashMap.getOrDefault(player, 0) + 1);
		for (String player : completion) hashMap.put(player, hashMap.get(player) - 1);

		for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
			if (entry.getValue() != 0) {
				answer = entry.getKey();
				break;
			}
		}
		return answer;
	}
}
