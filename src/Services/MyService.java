package Services;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MyService {
	private String messageFromService;
	private final String USER_AGENT = "Mozilla/5.0";

	public String getMessageFromServices() {
		return messageFromService;
	}

	public void setMessageFromServices(String messageFromService) {
		System.out.println(messageFromService);
		this.messageFromService = messageFromService.replace("services", "action");
	}

	public String hitApi() throws Exception {

		String url = "https://zoomcar.0x10.info/api/zoomcar?type=json&query=list_cars";

		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		
		// optional default is GET
		con.setRequestMethod("GET");
		con.setRequestProperty("User-Agent", USER_AGENT);

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		// print result
		System.out.println(response.toString());
		return response.toString();
	}

}
