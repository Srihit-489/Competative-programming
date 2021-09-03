#include<iostream>
#define mod 1000000007;

using namespace std;


long long int getcount(long long int arr[],int pos){
      if(pos >= 0)
          return arr[pos];
      else
          return 0; 
}



int main(){
	  int n;
	  cin>>n;
	  long long int arr[n+1];
	  arr[0] = 1;
	  arr[1] = 1;
	  for(int i =2;i<=n;i++){
			long long int count = 0;
			for(int j = 1;j<=6;j++){
				  count += getcount(arr,i-j);
				  count = count%mod;
			}
			arr[i] = count;
	  }
      int ans = arr[n]%mod;
	  cout<<ans<<endl;

}

