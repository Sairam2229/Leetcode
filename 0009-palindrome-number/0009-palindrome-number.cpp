class Solution {
public:
    bool isPalindrome(int x) {
        long long rev=0;
        int dup=x;
        while(x>0){
            rev=(rev*10)+(x%10);
            x=x/10;
        }
        if(dup==rev){
            return true;
        }else{
            return false;
        }
    }
};
            
        
    