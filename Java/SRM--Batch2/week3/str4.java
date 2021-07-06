class str4 {
     
    
    static boolean checkPalin(String word)
    {
        int n = word.length();
        word = word.toLowerCase();
        for (int i=0; i<n; i++,n--)
           if (word.charAt(i) != word.charAt(n - 1))
              return false;      
        return true;
    }
     
   
    static int countPalin(String str)
    {       
        
        str = str + " ";
         
       
        String word = "";
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
             
            
            if (ch != ' ')
                word = word + ch;
            else {
                if (checkPalin(word))
                {  count++;
                System.out.println(word);}
                word = "";
            }
        }
         
        return count;
    }
     
    // Driver code
    public static void main(String args[])
    {
        System.out.println(countPalin("mom taught me malayalam"));
                   

    }
}
