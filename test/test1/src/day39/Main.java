package day39;// 本题为考试单行多行输入输出规范示例，无需提交，不计分。
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String str1=in.next();
            String str2=in.next();
            Map<Character,Integer> map=new HashMap();
            for (int i = 0; i < str1.length(); i++) {
                if (map.containsKey(str1.charAt(i))){
                    map.put(str1.charAt(i),map.get(str1.charAt(i))+1);
                }else {
                    map.put(str1.charAt(i),1);
                }
            }
            int count=0;
            for (int i = 0; i < str2.length(); i++) {
                if (map.containsKey(str2.charAt(i))&&map.get(str2.charAt(i))>0){
                    map.put(str2.charAt(i),map.get(str2.charAt(i))-1);
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}