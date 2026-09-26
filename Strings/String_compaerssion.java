public class String_compaerssion {
    public static String compress(String str){
        String newstr = "";
        for(int i=0; i<str.length(); i++){
            //interger count banaya becuase int ka collection
            //aaabbbccc ----> first check a after i+1 check first after a so count a3
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newstr += str.charAt(i);
            if(count>1){
                newstr += count.toString();
            }
        }
        return newstr;
    }


    public static void main(String[] args) {
        //aaabbbccc -----> a3b3c3
        //abc -----> abc
        String str = "aaabbbccc";
        System.out.println(compress(str));
    }
}

//tc ===> linear tc O(n)
//stringBuilder se time complexity best rhegi 