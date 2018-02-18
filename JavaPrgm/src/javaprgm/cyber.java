package javaprgm;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.net.HttpURLConnection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class cyber {

  private List<String> cookies;
  private HttpURLConnection conn;

  private final String USER_AGENT = "Mozilla/5.0";

  public static void main(String[] args) throws Exception {

	String url = "http://172.31.1.6:8090/httpclient.html";
	//String gmail = "https://mail.google.com/mail/";

	cyber http = new cyber();
	// make sure cookies is turn on
	CookieHandler.setDefault(new CookieManager());
        
	// 1. Send a "GET" request, so that you can extract the form's data.
	String page = http.GetPageContent(url);
	String postParams = http.getFormParams(page, "101503075", "e2324");

	// 2. Construct above post's content and then send a POST request for
	// authentication
	http.sendPost(url, postParams);

	// 3. success then go to gmail.
	//String result = http.GetPageContent(gmail);
	//System.out.println(result);
  }

  private void sendPost(String url, String postParams) throws Exception {

	URL obj = new URL(url);
	conn = (HttpURLConnection) obj.openConnection();

	// Acts like a browser
	conn.setUseCaches(false);
	conn.setRequestMethod("POST");
	conn.setRequestProperty("Host", "172.31.1.6");
	conn.setRequestProperty("User-Agent", USER_AGENT);
	conn.setRequestProperty("Accept",
		"text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
	conn.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
	for (String cookie : this.cookies) {
		conn.addRequestProperty("Cookie", cookie.split(";", 1)[0]);
	}
	conn.setRequestProperty("Connection", "keep-alive");
	conn.setRequestProperty("Referer", "172.31.1.6:8090/httpcilent.html");
	conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
	conn.setRequestProperty("Content-Length", Integer.toString(postParams.length()));

	conn.setDoOutput(true);
	conn.setDoInput(true);

	// Send post request
	DataOutputStream wr = new DataOutputStream(conn.getOutputStream());
	wr.writeBytes(postParams);
	wr.flush();
	wr.close();

	int responseCode = conn.getResponseCode();
	System.out.println("\nSending 'POST' request to URL : " + url);
	System.out.println("Post parameters : " + postParams);
	System.out.println("Response Code : " + responseCode);

	BufferedReader in =
             new BufferedReader(new InputStreamReader(conn.getInputStream()));
	String inputLine;
	StringBuffer response = new StringBuffer();

	while ((inputLine = in.readLine()) != null) {
		response.append(inputLine);
	}
	in.close();
	// System.out.println(response.toString());

  }

  private String GetPageContent(String url) throws Exception {
         
	URL obj = new URL(url);
	
        conn = (HttpURLConnection) obj.openConnection();
        System.out.println("hello2");
	// default is GET
	conn.setRequestMethod("GET");

	conn.setUseCaches(false);
        System.out.println("hello3");
	// act like a browser
	conn.setRequestProperty("User-Agent", USER_AGENT);
	conn.setRequestProperty("Accept",
		"text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
	conn.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
	conn.setRequestProperty("DNT", "1");
	if (cookies != null) {
		for (String cookie : this.cookies) {
			conn.addRequestProperty("Cookie", cookie.split(";", 1)[0]);
		}
	}
        System.out.println("hello");
	int responseCode = conn.getResponseCode();
	System.out.println("\nSending 'GET' request to URL : " + url);
	System.out.println("Response Code : " + responseCode);

	BufferedReader in =
            new BufferedReader(new InputStreamReader(conn.getInputStream()));
	String inputLine;
	StringBuffer response = new StringBuffer();

	while ((inputLine = in.readLine()) != null) {
		response.append(inputLine);
	}
	in.close();

	// Get the response cookies
	setCookies(conn.getHeaderFields().get("Set-Cookie"));

	return response.toString();

  }

  public String getFormParams(String html, String username, String password)
		throws UnsupportedEncodingException {

	System.out.println("Extracting form's data...");

	Document doc = Jsoup.parse(html);
        	
	// Google form id
	Element loginform = doc.getElementById("usernamelbl");
        System.out.println(loginform);
        System.out.println("2");
        
	Elements inputElements = loginform.getElementsByTag("input");
        System.out.println("3");
        System.out.println(inputElements);
	List<String> paramList = new ArrayList<String>();
	for (Element inputElement : inputElements) {
		String key = inputElement.attr("name");
		String value = inputElement.attr("value");

		if (key.equals("Email"))
			value = username;
		else if (key.equals("Passwd"))
			value = password;
		paramList.add(key + "=" + URLEncoder.encode(value, "UTF-8"));
	}

	// build parameters list
	StringBuilder result = new StringBuilder();
	for (String param : paramList) {
		if (result.length() == 0) {
			result.append(param);
		} else {
			result.append("&" + param);
		}
	}
	return result.toString();
  }

  public List<String> getCookies() {
	return cookies;
  }

  public void setCookies(List<String> cookies) {
	this.cookies = cookies;
  }

}