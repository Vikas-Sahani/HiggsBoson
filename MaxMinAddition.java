/*
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long n = sc.nextLong();
	//	how to calculate mn and mx & if mn or mx is 0 then what to do?
        for (long i = 1; i <= n; i++) {
            long mn = findMin(a);
            long mx = findMax(a);
            a = a + (mx * mn);
        }
        System.out.println(a);
    }

    static long findMin(long a) {
        if (((a / 10) != 0) && ((a%10)!=0)) {
			String s= String.valueOf(a);
			long l = s.length();
            long leftDigit = a/(long)Math.pow(10,l-1);
            // long leftDigit = FindLeftDigit(a);
            long rightDigit = a % 10;
            return Math.min(leftDigit, rightDigit);
        } else // if (a / 10 == 0)
        {
            return a;
        }
    }

    static long findMax(long a) {
        if (((a / 10) != 0) && ((a%10)!=0)) {
			String s= String.valueOf(a);
			long l = s.length();
            long leftDigit = a/(long)Math.pow(10,l-1);
            // long leftDigit = FindLeftDigit(a);
            long rightDigit = a % 10;
            return Math.max(leftDigit, rightDigit);
        } else // if (a / 10 == 0)
        {
            return a;
        }
    }

    // static long FindLeftDigit(long a) {
    //     while (a / 10 != 0) {
    //         a = a / 10;
    //     }
    //     return a;
    // }
}
*/


// /*
#include<bits/stdc++.h>
using namespace std;
#define fast ios_base::sync_with_stdio(false); cin.tie(NULL);
#define int long long
#define pb push_back
#define ff first
#define ss second
#define endl '\n'
#define all(a) a.begin(), a.end()
#define rall(a) a.rbegin(), a.rend()
using T = pair<int, int>;
typedef long double ld;
const int mod = 1e9 + 7;
const int INF = 2e9;
int chk(int n){
    int mi = 100, ma = -1;
    while(n){
        mi = min(mi, n%10);
        ma = max(ma, n%10);
        n /= 10;
    }
    return ma*mi;
}
void solve(){
    int x, y, f=0;
    cin >> x >> y;
    while(y--){
        int a = chk(x);
        x += a;
        if(a == 0){
            break;
        }
    }
    cout << x;
}
signed main(){
    fast
    int t = 1;
    // cin >> t;
    for(int i = 1; i <= t; i++){
        solve();
        if(i != t) cout << endl;
    }
}
// */