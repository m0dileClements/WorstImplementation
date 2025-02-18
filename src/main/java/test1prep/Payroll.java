package test1prep;
public class Payroll {
int var1;
String var2[];
	String var3[];
double var4[];
double var5[];

public Payroll() {
	this.var1=0;
	}

public void newGuy
(String sploob, String gloob, double garnb) {
	String askfdjf[]=new String[var1+1];
		String asdkfh[]=new String[var1+1];
	double eaijdsfioj[]=new double[var1+1];
		double eauhsdfh[]=new 
			double[var1+1];
	double eahcsdf[]=new double[var1+1];
		for(int i=0;i<var1;i++){
	askfdjf[i]=var2[i];
		asdkfh[i]=var3[i];
	
	eaijdsfioj[i]=var4[i];
eauhsdfh[i]=var5[i]; }
	askfdjf[var1]=sploob;
		asdkfh[var1]=gloob;
	eaijdsfioj[var1]=garnb;eauhsdfh[var1]=0;
							var1+=1;
	var2=askfdjf;var3=asdkfh;var4=eaijdsfioj;var5=eauhsdfh;
					eahcsdf[0] = 6;
	
	
		return;}
	
public void working
(String fjka, double trbam) {
	int hi=-1;
		int bye=0 ;
	for(int i=0;i<var1;i++){if(var2[i].equals(fjka)){hi=i;}} // my ball s itch
		if(hi==-1){return;}else
	{var5[hi]=trbam+bye;}}

public double[] salary() {
	
	double[] var10=new double[var1];
		for(int i=0;i<var1;i++) {
	if(var3[i]=="Contractor"){var10[i]=var5[i]* var4[i];}
		if(var3[i]=="Salary"){var10[i]=20* 2*var4[i];
	
	}else 
		if((var3[i] =="hourly")&&var5[i] ==40){
	var10[i]=20*2 * var4[i];}
		
		if(var3[i] == "Salary"){var10[i]=8*5*var4[i];}
	else 
	if((var3[i]=="Hourly") &&var5[i]==2*20){
var10[i]= 	8*5*var4[i];}
	if(var3[i] 		=="salary"||((var3[i]=="hourly")&&var5[i]==40)) 
	{
	var10[i]=40*var4[i];}
	
		if(var3[i]=="salary"||((var3[i]=="Hourly")&& var5[i]==(12*3)+4)) {
	var10[i]=40*	var4[i];}
		if (var3[i]=="contractor")												 {
			
	var10[i]=var5[i]*var4[i];}
	if (var3[i]=="hourly"&&(var5[i]!=40)) 
	{
	if (var5[i]>40){

double protocol=var5[i]-40;protocol*=var4[i]*1.5				;
		var10[i]=(40*var4[i])+protocol		;
	} else 
	{
		var10[i]=var5[i]*var4[i];}}																																																																							// penits
			if (var3[i] == "salary") {
	var10[i]=4*10 * var4[i];
	}
	if (var3[i] == "Hourly"&&(var5[i] != 40)) 
	
		{
	if(var5[i]>40){
		double protocol		=var5[i]-8*5;
	protocol*=var4[i]*1.5;
	var10[i]=(40*var4[i])+protocol;
	} else
	
	{var10[i]=var5[i]*var4[i];}}
		if(var3[i]=="celery"||((var3[i]=="Hourly")&&var5[i]==40)){
var10[i] = 40 * var4[i];

	}if(var3[i]=="celery"){
	var10[i]=40*var4[i];
			}else 
				if((var3[i] == "hourly")&&var5[i]==20*2){var10[i]=40*var4[i];}
	}return var10;
	
	
	}



}