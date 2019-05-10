public int teaParty(int t,int c){return (t<5||c<5)?0:(t*2<=c||c*2<=t)?2:(t+c>=10)?1:0;}
