package top100;

import java.util.Arrays;

public class lc1576 {
    public String modifyString(String s) {
        if (s.length()==1){
            if (s.charAt(0)=='?'){
                return "a";
            }else {
                return s;
            }
        }
        char[] c=s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i]=='?'){
                if (i==0){
                    for (int j = 0; j < 26; j++) {
                        char c1=(char) ('a'+j);
                        if (c1!=c[i+1]){
                            c[i]=c1;
                            break;
                        }
                    }
                }else if (i==c.length-1){
                    for (int j = 0; j < 26; j++) {
                        char c1=(char) ('a'+j);
                        if (c1!=c[i-1]){
                            c[i]=c1;
                            break;
                        }
                    }
                }else {
                    for (int j = 0; j < 26; j++) {
                        char c1=(char) ('a'+j);
                        if (c1!=c[i-1]&&c1!=c[i+1]){
                            c[i]=c1;
                            break;
                        }
                    }
                }
            }
        }
        String s1="";
        for (int i = 0; i < c.length; i++) {
            s1+=c[i];
        }
        return s1;
    }
}
