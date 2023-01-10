package logicalprogram;

public class LicenseKeyFormatting 
{
	public String licenseKeyFormatting(String s, int k) 
	    {
	        StringBuilder output=new StringBuilder();
	        int count=0;
	        for(int i=s.length()-1;i>=0;i--)
	        {
	            if(s.charAt(i)=='-') continue;
	            if(count == k)
	            {
	                output.append('-');
	                count = 0;
	            }  
	        output.append(s.charAt(i));
	        count++;
	    }
	    return output.reverse().toString().toUpperCase();
	}
}
