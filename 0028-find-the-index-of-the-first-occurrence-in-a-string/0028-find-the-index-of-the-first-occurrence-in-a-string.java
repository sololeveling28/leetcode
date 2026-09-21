class Solution {
    public int strStr(String haystack, String needle) {

        if (needle.length() == 0) {
            return 0;
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {

            int j = 0;

            while (j < needle.length() &&
                   haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            if (j == needle.length()) {
                return i;
            }
        }

        return -1;
    }
}






// class Solution {
//     public int strStr(String haystack, String needle) {
      
//       int count =0;
//       int k=-1;

         
//          for(int i=0;i<needle.length();i++){
//                 if(needle.charAt(i) == haystack.charAt(i))
//                 {
//                     if (count == 0) k =i;
//                     count++;
//                 }
//              }

//              if(count != needle.length()) k=-1;
//         return k;
//     }
// }

