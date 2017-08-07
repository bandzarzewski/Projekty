package pl.sda.day11;

/**
 * Created by sp0rk on 11/07/17.
 */
public class HTTPUtils {
    private static final String BESE_URL = "http.cat/"; // BASE_URL jest stałą

    public static byte[] getData(String url) {
        byte[] data = new byte[100];

        String requestUrl = BESE_URL + url;

        //Get data, do some stuff

        return data;
    }
}
