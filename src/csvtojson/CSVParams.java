package csvtojson;

public class CSVParams {

    private String URL;
    private String IPClient;
    private String timestamp;
    private String timeSpend;


    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getIPClient() {
        return IPClient;
    }

    public void setIPClient(String IPClient) {
        this.IPClient = IPClient;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String gettimeSpend() {
        return timeSpend;
    }

    public void settimeSpend(String timeSpend) {
        this.timeSpend = timeSpend;
    }
}
