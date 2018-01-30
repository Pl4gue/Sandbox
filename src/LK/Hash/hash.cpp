#include <string>
#include <iostream>
#include <bitset>
#include <stdlib.h>
#include <sstream> 
using namespace std;

long hash128(string s) {
    unsigned int result=0;
    unsigned int secresult=0;
    for(int i=0;i<s.length();i++) {
        result = ((result << 5) + result) + s.at(i);
        secresult = secresult * 31 + s.at(i);
    }
    // cout << result << endl;
    bitset<24^5> bitset1{result};
    bitset<24^5> bitset2{secresult};
    return bitset1.to_ulong() + bitset2.to_ulong();
}

string hashcode128(string s) {
    int decHash=(int)(hash128(s));
    char buffer [128];
    stringstream ss;
    ss << hex << decHash; 
    string res ( ss.str() );
    return res;
}

int main() {
    cout << "Enter String to hash:" << endl;
    string hashresult="";
    string s;
    getline( cin, s );
       hashresult = hashcode128(s);
    cout << hashresult << endl;
}
