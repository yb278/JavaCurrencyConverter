import java.io.*;
import java.net.*;

public class RestApi {
    public static String data = null;

    // New method to fetch data from the API
    public static void fetchData() throws IOException {
        String CONNECT_API_URL = "https://api.currencyapi.com/v3/latest?apikey=cur_live_OjTNB0W98jyArTgbpGJ03Fvi5EOLMIDzbQ26iSOH&currencies=EUR%2CUSD%2CCAD&base_currency=GBP";
        String CONNECT_API_KEY = "cur_live_OjTNB0W98jyArTgbpGJ03Fvi5EOLMIDzbQ26iSOH";

        URL url = new URL(CONNECT_API_URL);
        URLConnection urlc = url.openConnection();
        urlc.setRequestProperty("Authorization", "Key " + CONNECT_API_KEY);

        BufferedReader br = new BufferedReader(new InputStreamReader(urlc.getInputStream()));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            sb.append(line);  // Append all lines to build the full data string
        }
        data = sb.toString();  // Assign the result to `data`
        br.close();
    }
}
