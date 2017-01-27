package algosprograms;
import java.util.*;
/**
 * Created by pnall on 1/27/17.
 */
public class GroupAnagrams {

    public static void main(String[] args){

        String[] input = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(input));


    }

    public static List<List<String>> groupAnagrams(String[] input){

    if(input == null|| input.length == 0) return new ArrayList<List<String>>();
        Map<String, List<String>> map = new HashMap<>();

        for(String s : input){

            char[] tmp = s.toCharArray();
            Arrays.sort(tmp);

            String keyStr = String.valueOf(tmp);
            if(!map.containsKey(keyStr))
                map.put(keyStr, new ArrayList<String>());
            map.get(keyStr).add(s);

        }

    return new ArrayList<List<String>>(map.values());

    }



}
