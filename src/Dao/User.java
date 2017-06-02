package Dao;

public class User {
   private String user;
   private String psd;
   
   public String getUser() {
	return user;
   }

	public void setUser(String user) {
		this.user = user;
	}
	
	public String getPsd() {
		return psd;
	}
	
	public void setPsd(String psd) {
		this.psd = psd;
	}
	
	public boolean login(){
		if((user.equals("1234"))&&(psd.equals("1234"))){
			return true;   
	    }else{
	    	return false;
	    }
    }
}
