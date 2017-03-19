/*
 * Complete the function below.
 */

    static void findFriends(int row, int col, String[] friends, boolean[][] visited) {
        int[] rowcheck = new int[]{0,0,-1,1};
		int[] colcheck = new int[]{-1,1,0,0};
		
		for (int k=0;k<rowcheck.length;k++)
		{
			int checkNextRow = row+rowcheck[k];
			int checkNextCol = col+colcheck[k];
			if( (checkNextRow>=0 && checkNextRow<friends.length) &&
               (checkNextCol>=0 && checkNextCol<friends.length) && 
               (visited[checkNextRow][checkNextCol]!=true) && 
               friends[checkNextRow].charAt(checkNextCol)== 'Y' )
			{
				visited[checkNextRow][checkNextCol]=true;
				findFriends(checkNextRow, checkNextCol,friends, visited); 
			}
		}
    }
    static int friendCircles(String[] friends) {
        int result = 0;
        int length = friends.length;
        boolean visited[][] = new boolean[length][length];
       for (int i=0;i<length;i++){
            for (int j=0;j<length;j++){
            visited[i][j] = false;
            }
       }
        
        for (int i=0;i<length;i++){
            for (int j=0;j<length;j++){
                if(visited[i][j] == false && friends[i].charAt(j) == 'Y'){
                    visited[i][j] = true;
                    findFriends(i,j,friends,visited);
                    result++;
                }
            }
        }
        
        return result;

    }
    
    
    _______________
    
    /*
     * Complete the function below.
     */

        static void findFriends(int row, String[] friends, boolean[] visited) {
    		for (int col=0;col<friends.length;col++)
    			if( (!visited[col]) && friends[row].charAt(col)== 'Y' )
    			{
    				visited[col]=true;
    				findFriends(col,friends, visited); 
    			}
    	}
        

        static int friendCircles(String[] friends) {
            int result = 0;
            int length = friends.length;
            boolean visited[] = new boolean[length];
            
            for (int i=0;i<length;i++){
               visited[i] = false;
            }
            
            for (int i=0;i<length;i++){
                if(visited[i] == false){
                    visited[i] = true;
                    findFriends(i,friends,visited);
                    result++;
                }
            }
            return result;
       }



________________





static int longestChainUtil(String word, HashSet<String> wordSet) {
    Queue<String> queue = new LinkedList<String>();
    
    int current = 1;
    int next = 0;
    int depth =1;
    
    queue.add(word);
    
    while(current != 0) {
        String cur = queue.remove();
        current --;
        
        for (int i=0; i< cur.length(); i++ ){
            StringBuilder sb = new StringBuilder(cur);
            System.out.println(sb);
            
            String temp = sb.deleteCharAt(i).toString();
            System.out.println("TEMP");
            System.out.println(temp)
                ;
            if(wordSet.contains(temp)){
                if(temp.length() == 1){
                    return depth+1;
                }
                queue.add(temp);
                next++;
            }
            
            if(current == 0){
                current = next;
                next = 0;
                depth++;
            }
        }
    }
    return depth-1;    
}

static int longestChain(String[] words) {
    int result = 0;
    HashSet<String> wordSet = new HashSet<String>();
    
    for(int i=0;i<words.length;i++) {
        wordSet.add(words[i]);
    }
    
    for(int i=0;i<words.length;i++) {
       if(words[i].length() < result ||words[i].length() == 1)
           continue;
        result = Math.max(result,longestChainUtil(words[i],wordSet));
    }
    return result;
}

_______________________


static int longestChainUtil(String word, HashSet<String> dict, HashMap<String, Integer> map) {

    int result = 0;
    
    for (int i = 0; i < word.length(); i++) {
        StringBuilder s = new StringBuilder(word);
        s = s.deleteCharAt(i);
        
        String newWord = s.toString();
        if(!dict.contains(newWord)){
            continue;
        }
        if (dict.contains(newWord)) {
            if (map.containsKey(newWord)){
                result = Math.max(result,map.get(newWord) );
            } else{
                result = Math.max(result, longestChainUtil(newWord, dict, map) + 1);
            }
        }
    }
    return result ;
}

static int longestChain(String[] words) {
    int result = 0;
    HashSet<String> wordSet = new HashSet<String>();
    HashMap<String, Integer> map = new HashMap<String, Integer>();
    
    for(int i=0;i<words.length;i++) {
        wordSet.add(words[i]);
    }
    
    for(int i=0;i<words.length;i++) {
       if(words[i].length() <= result) {
           continue;
       }
       int len = longestChainUtil(words[i], wordSet, map) +1;
       map.put(words[i], len);
       result = Math.max(result,len);
    }
    return result;
}

____________________________________

Working Solution:

static int longestChainUtil(String[] words) {
    HashMap<String, Integer> map = new HashMap<String, Integer>();
    int result = 0;
    
    for (int i=0; i<words.length; i++) {
        if (map.containsKey(words[i]))
            continue;
        map.put(words[i],1);
       
        for (int j=0; j<words[i].length(); j++) {
            StringBuilder sb = new StringBuilder(words[i]);
            sb.deleteCharAt(j);
            String newWord = sb.toString();
            if (map.containsKey(newWord) && map.get(newWord)+1 > map.get(words[i])) {
                map.put(words[i], map.get(newWord)+1);
            }
        }
        result = Math.max(result,map.get(words[i]));
    }
    
    return result;
}
static int longestChain(String[] words) {
    if (words==null || words.length==0) 
        return 0;
    
    Arrays.sort(words, new Comparator<String>() {
        public int compare(String str1, String str2) {
            return str1.length()-str2.length();
        }
    });
    
    return longestChainUtil(words);
}


Sample input:
a
b
ba
bca
bda
bcda
	
Output:
	4


