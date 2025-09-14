class Solution {
public:
    bool isPowerOfFour(int n) {
               while(n>1){
            int bit=n%4;
            if(bit!=0)
                return false;
        n/=4;
        }
    return n==1; 
    }
};
