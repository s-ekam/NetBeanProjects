package cyberroam;

import java.io.*;
import java.util.Scanner;
import java.net.*;
import javax.net.ssl.*;
import java.security.*;
import java.security.cert.*;

class Login{
	
	public static void main(String[] args) {
		addExceptionForCertificates();
		
		String user="101503253";
		String pass="meNiDsnaa";
		String responseMsg="";
		try{
			URL loginUrl= new URL("https://172.31.1.6:8090/login.xml");
			HttpsURLConnection conn = (HttpsURLConnection) loginUrl.openConnection();
			String parameters="mode=191&username="+user+"&password="+pass+"&a=1472324922624&producttype=0";
			conn.setUseCaches(false);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Accept","*/*");
			conn.setRequestProperty("Accept-Encoding","gzip, deflate, br");
			conn.setRequestProperty("Accept-Language", "en-US,en;q=0.8");
			conn.setRequestProperty("Connection","keep-alive");
			conn.setRequestProperty("Content-Length", Integer.toString(parameters.length()));
			conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
			conn.setRequestProperty("Host", "172.31.1.6:8090");   
			conn.setRequestProperty("Origin","https://172.31.1.6:8090");
			conn.setRequestProperty("Referer", "https://172.31.1.6:8090/httpclient.html"); 
			conn.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36");			
			conn.setDoOutput(true);
			conn.setDoInput(true);
			DataOutputStream wr = new DataOutputStream(conn.getOutputStream());
			wr.writeBytes(parameters);
			wr.flush();
			wr.close();
						
			String response=null;
			Scanner sc=new Scanner(conn.getInputStream());
			response=sc.nextLine();
			responseMsg=getMessage(response);
			System.out.println(responseMsg);			
		}
		catch(IOException ex){ 
			System.out.println(ex.getMessage());
		}
				
	}

	static String getMessage(String response){
  		int startIndex=response.toLowerCase().indexOf("<message><![CDATA[".toLowerCase())+18;
    	int endIndex=response.toLowerCase().indexOf("]".toLowerCase(),startIndex)-1;
    	return response.substring(startIndex,endIndex+1);
	}

	static boolean addExceptionForCertificates(){
		try{
			Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
			TrustManager[] trustAllCerts = new TrustManager[]{
				new X509TrustManager() {
					public X509Certificate[] getAcceptedIssuers() {
						return null;
					}
					public void checkServerTrusted(X509Certificate[] certs, String authType) throws CertificateException {
						return;
					}
					public void checkClientTrusted(X509Certificate[] certs, String authType) throws CertificateException {
						return;
					}
				}
			};
			SSLContext sc = SSLContext.getInstance("SSL");
			sc.init(null, trustAllCerts, new SecureRandom());
			HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
			HostnameVerifier hv = new HostnameVerifier() {
				public boolean verify(String urlHostName, SSLSession session) {
					if (!urlHostName.equalsIgnoreCase(session.getPeerHost())) {
						System.out.println("Warning: URL host '" + urlHostName + "' is different to SSLSession host '" + session.getPeerHost()+"'.");
					}
					return true;
				}
			};
			HttpsURLConnection.setDefaultHostnameVerifier(hv);
			return true;
		}
		catch(Exception ex){
		
			return false;
		}
	}

}