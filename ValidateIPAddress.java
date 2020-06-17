package com.ds.binarytree;

public class ValidateIPAddress {

	private static final String NEITHER="Neither";
	public static void main(String[] args) {
		ValidateIPAddress validateIPAddress = new ValidateIPAddress();
		System.out.println(validateIPAddress.validIPAddress("1.1.1.1."));
		System.out.println(validateIPAddress.validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334:"));
		System.out.println(validateIPAddress.validIPAddress("2001:db8:85a3:0::8a2E:0370:7334"));
	}
	
	private String validIPAddress(String IP) {
		
		if(IP==null || IP.equals(""))
			return NEITHER;
		
		if(IP.contains(".") && IP.indexOf(".")>0 && IP.lastIndexOf(".")<IP.length()-1)
			return validateIPv4(IP);
		
		if(IP.contains(":") && IP.indexOf(":")>0 && IP.lastIndexOf(":")<(IP.length()-1))
			return validateIPv6(IP);
		
        return NEITHER;
    }

	private String validateIPv6(String IP) 
	{
		String[] ipArray = IP.split(":");
		if(ipArray.length!=8)
			return NEITHER;
		
		for(String ipString : ipArray)
		{
			if(ipString.isEmpty() || ipString.length()>4)
				return NEITHER;
			
			for(char ipChar : ipString.toLowerCase().toCharArray())
			{
				if((ipChar<'0' || ipChar>'9') && ipChar!='a' && ipChar!='b' && ipChar!='c' && ipChar!='d' && ipChar!='e' && ipChar!='f')
				{
					return NEITHER;
				}
			}
		}
		return "IPv6";
	}

	private String validateIPv4(String ip) 
	{
		String[] ipArray = ip.split("\\.");
		if(ipArray.length!=4)
			return NEITHER;
		
		for(String ipString : ipArray)
		{
			if(ipString.isEmpty() || ipString.length() > 3 || (ipString.charAt(0) == '0' && ipString.length() > 1))
				return NEITHER;
			for(char ipChar : ipString.toCharArray())
			{
				if(ipChar<'0' || ipChar>'9')
					return NEITHER;
			}
			int ipNum = Integer.parseInt(ipString);
			if(ipNum<0 || ipNum>255)
				return NEITHER;
		}
		return "IPv4";
	}

}
