package com.icyplat.app;  
//import cn.icybee.icyplat.interfaces.IcyplatApiAbstract;
import java.util.Map;
import java.util.HashMap;
public class IcyplatApi /*extends IcyplatApiAbstract */{  
    /** 
     * @param args 
     */  
    public HashMap<String,String> recvMessage(HashMap<String,String> input){
        HashMap<String, String> map3 = new HashMap<String, String>();
	// TODO do something with the data
        map3.put("name", "Bernie");
        map3.put("this", "demo");
        return map3;
    }
    public HashMap<String,String> recvAsyncMessage(HashMap<String,String> input){
        return null;
    }

}  
