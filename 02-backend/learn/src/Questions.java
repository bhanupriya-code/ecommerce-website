public class Questions {
    public static void main(String[] args) {
                String str = "Bhaanua";
//                String reverse = "";
                int len = str.length();
//                for(int i = 0; i < len; i++){
//                    reverse = str.charAt(i) + reverse;
//                }
//        System.out.printf(reverse);
               //TO CHECK IF THE STRING IS PALIMDROME
//                if(str.equals(reverse)){
//                    System.out.println("Yes");
//                }
//                else {
//                    System.out.println("not");
//                }

        //TO COUNT THE OCCURENCE OF AN ELEMENT
//                 int count = 0;
//                char search = 'a';
//                for(int i = 0; i < len; i++ ){
//                    if(str.charAt(i) == search){
//                        count++;
//                    }
//                }
//        System.out.println(count);


        //TO COUNT THE NUMBER OF VOWELS AND CONSONANTS IN THE STRING

//        int vowels = 0;
//        int cons = 0;
//        for(int i = 0; i < len; i++){
//            char c = str.charAt(i);
//            if(c =='a'||c == 'e' || c == 'i'|| c=='o'||c=='u'){
//                vowels++;
//            }else{
//                cons++;
//            }
//        }
//        System.out.println("Number of vowels are " + vowels + " and consonansts are "  + cons);
//


        int[] arr = {1,2,3,4,4,5,6};

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }

    }
}
