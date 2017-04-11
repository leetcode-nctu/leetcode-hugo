public class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        String tmpString ="";
        int wordCount = 1;
        int wordLenth = words[0].length();
        int solved = 0;
        int redLenth;
        int numSpace;
        List<String> result = new ArrayList<String>();
        
        for(int i = 1;i<words.length;i++){
            if(wordLenth+words[i].length() < maxWidth-(wordCount-1)){
                wordCount++;
                wordLenth+=words[i].length();
            }
            else{
                redLenth = maxWidth-wordLenth;
                for(int j = i-wordCount;j<i;j++){
                    if(wordCount-1>0) numSpace = go(redLenth,wordCount-1);
                    else numSpace = redLenth;
                    tmpString+=words[j]+addSpace(numSpace);
                    redLenth -= numSpace;
                    wordCount -= 1;
                    solved++;
                }
                result.add(tmpString);
                tmpString = "";
                wordCount = 1;
                wordLenth = words[i].length();
            }
        }
        
        if(solved!=words.length){
            redLenth = maxWidth-wordLenth;
            for(int j = solved;j<words.length;j++){
                tmpString+=words[j];
                solved++;
                if(words.length-solved>0){
                    tmpString+=addSpace(1);
                    redLenth -= 1;
                }
            }
            tmpString+=addSpace(redLenth);
            result.add(tmpString);
        }
        
        return result;
    }
    
    public int go(int a,int b){
      if(a%b==0) return a/b;
      else return a/b+1;
    }
    
    public String addSpace(int num){
        String result = "";
        for(int i = 0;i<num;i++){
            result+=" ";
        }
        return result;
    }
}