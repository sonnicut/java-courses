public class Calculate{
	private double result;
	
public void add(double ... args) throws Exception{
		if (args.length>0){
		for(int i=1;i!=args.length;++i){
			this.result += args[i];
			}
		}
		else throw new Exception("Error: minimum two arguments");
}
	
public void sub(double ... args) throws Exception {
		if(args.length>0){
			this.result=args[0];
				for(int i=1;i!=args.length;++i)
					{
					this.result-=args[i];
					}
		}
		else throw new Exception("Error: minimum two arguments");
}

	
public void div(double ... args) throws Exception{
		if(args.length>0){
			this.result=args[0];
			for(int i=1;i!=args.length;++i){
				if(args[i]!=0) this.result/=args[i];
				else throw new Exception("Error: division by 0");
			}
		}
		else throw new Exception("Error: minimum two arguments");
}
	
public void mul(double ... args) throws Exception{
		if(args.length>0){
			this.result=args[0];
			for(int i=1;i!=args.length;++i){
			this.result *=args[i];
		}
	}
	else throw new Exception("Error: minimum two arguments");
}

public double getResult(){
		return this.result;
}
	
public void clearResult(){
		this.result = 0;
}

}