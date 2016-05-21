public String reverseWords(String s) {
	String[] strarr = s.split(" ");
	String result = "";
	for(int i = strarr.length-1; i >= 0; i --){
		if (strarr[i].equals("")) continue;
		result+= strarr[i]+" ";
	}
	if(result.length() > 0 && result.charAt(result.length()-1) == ' ') result = result.substring(0, result.length()-1);
	return result;
}