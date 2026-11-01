package com.amazonaws.http;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes.dex */
public class UrlHttpClient {

    /* JADX INFO: renamed from: ۧ */
    public static final Log f1369 = LogFactory.m1468(UrlHttpClient.class);

    /* JADX INFO: renamed from: ֫ */
    public final ClientConfiguration f1370;

    public UrlHttpClient(ClientConfiguration clientConfiguration) {
        this.f1370 = clientConfiguration;
        int i = TLS12SocketFactory.f1367;
    }

    /* JADX INFO: renamed from: ֫ */
    public final HttpResponse m1444(HttpRequest httpRequest) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) httpRequest.m1429().toURL().openConnection();
        ClientConfiguration clientConfiguration = this.f1370;
        httpURLConnection.setConnectTimeout(clientConfiguration.m1333());
        httpURLConnection.setReadTimeout(clientConfiguration.m1339());
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setUseCaches(false);
        if (httpRequest.m1427()) {
            httpURLConnection.setChunkedStreamingMode(0);
        }
        if (httpURLConnection instanceof HttpsURLConnection) {
        }
        if (httpRequest.m1428() != null && !httpRequest.m1428().isEmpty()) {
            for (Map.Entry entry : httpRequest.m1428().entrySet()) {
                String str = (String) entry.getKey();
                if (!str.equals("Content-Length") && !str.equals("Host")) {
                    str.equals("Expect");
                    httpURLConnection.setRequestProperty(str, (String) entry.getValue());
                }
            }
        }
        httpURLConnection.setRequestMethod(httpRequest.m1430());
        if (httpRequest.m1424() != null && httpRequest.m1426() >= 0) {
            httpURLConnection.setDoOutput(true);
            if (!httpRequest.m1427()) {
                httpURLConnection.setFixedLengthStreamingMode((int) httpRequest.m1426());
            }
            OutputStream outputStream = httpURLConnection.getOutputStream();
            InputStream inputStreamM1424 = httpRequest.m1424();
            byte[] bArr = new byte[8192];
            while (true) {
                int i = inputStreamM1424.read(bArr);
                if (i == -1) {
                    break;
                }
                outputStream.write(bArr, 0, i);
            }
            outputStream.flush();
            outputStream.close();
        }
        String responseMessage = httpURLConnection.getResponseMessage();
        int responseCode = httpURLConnection.getResponseCode();
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null && !"HEAD".equals(httpRequest.m1430())) {
            try {
                errorStream = httpURLConnection.getInputStream();
            } catch (IOException unused) {
            }
        }
        HttpResponse.Builder builder = new HttpResponse.Builder();
        builder.m1438(responseCode);
        builder.m1440(responseMessage);
        builder.m1439(errorStream);
        for (Map.Entry<String, List<String>> entry2 : httpURLConnection.getHeaderFields().entrySet()) {
            if (entry2.getKey() != null) {
                builder.m1441(entry2.getKey(), entry2.getValue().get(0));
            }
        }
        return builder.m1437();
    }
}
