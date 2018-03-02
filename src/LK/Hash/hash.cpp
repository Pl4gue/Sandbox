#include <string>
#include <iostream>
#include <bitset>
#include <stdlib.h>
#include <sstream> 

using namespace std;

long hash128(string s) {
    unsigned int result=0;
    for(int i=0;i<s.length();i++) {
        result = (((result << 10) + (s.at(i) >> 5)) << 2) * s.at(i) + s.at(i);
        result = result + (s.at(i)*32);
    }
    return (uint64_t) result;
    // bitset<24^5> bitset1{result};
    // bitset<24^5> bitset2{secresult};
    // return bitset1.to_ulong() + bitset2.to_ulong();
}

string hashcode128(string s) {
    int decHash=(int)(hash128(s)) * 7919;
    char buffer [1024];
    stringstream ss;
    ss << hex << decHash; 
    string res ( ss.str() );
    return res;
}

int main() {
    cout << "Enter String to hash:";
    string hashresult="";
    string s;
    getline( cin, s );

    hashresult = hashcode128(s);
    cout << endl << hashresult << endl;
}
