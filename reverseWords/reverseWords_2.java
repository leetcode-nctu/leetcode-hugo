public String reverseWords(String s) {
	int len = s.length();
	     ArrayList<String> strarr = new ArrayList<String>();
	        String result = "";
	        String tmp ="";
	        for(int i = 0; i < len;i++){
	        	if(s.charAt(i) == ' '){
	        		if(tmp.equals("")) continue;
	                strarr.add(tmp);
	                tmp ="";
	            }
	            else{
	                tmp+=""+s.charAt(i);
	            }
	        }
            strarr.add(tmp);
	        for(int i = strarr.size()-1; i >= 0; i --){
	            result += strarr.get(i)+" ";
	        }
	        if(result.length() > 0 && result.charAt(result.length()-1) == ' ') result = result.substring(0, result.length()-1);
	        if(result.length() > 1 && result.charAt(0) == ' ') result = result.substring(1, result.length());
	        //System.out.println(result.length());
	        return result;
}