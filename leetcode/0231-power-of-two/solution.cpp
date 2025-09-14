class Solution {
public:
    bool isPowerOfTwo(int n) {
        while(n>1){
            int bit=n%2;
            if(bit!=0)
                return false;
        n/=2;
        }
    return n==1;
    }
};
