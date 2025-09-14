class Solution {
public:
    bool isPowerOfThree(int n) {
        while(n>1){
            int bit=n%3;
            if(bit!=0)
                return false;
        n/=3;
        }
    return n==1;
    }
};
