package l;

import com.alipay.sdk.m.w.a;
import com.tencent.mm.opensdk.modelmsg.WXNativeGamePageObject;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ܳۧᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: VAHB */
/* JADX INFO: loaded from: classes3.dex */
public final class C14488 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f44385;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f44386;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f44387;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f44384 = new LinkedHashMap();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f44383 = a.D;

    public C14488(String str, boolean z) {
        this.f44386 = str;
        this.f44385 = z;
        this.f44387 = z ? new StringBuilder() : null;
        m34586("User-Agent", "Mozilla/5.0 (Linux; Android 6.0;)");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m34586(String str, String str2) {
        this.f44384.put(str, str2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34584(String str, String str2) {
        StringBuilder sb = this.f44387;
        if (sb.length() == 0) {
            this.f44384.put("Content-Type", "application/x-www-form-urlencoded");
        } else {
            sb.append('&');
        }
        try {
            sb.append(str);
            sb.append(com.alipay.sdk.m.p.a.h);
            sb.append(C12789.encode(str2, this.f44383));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HttpURLConnection m34583() throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f44386).openConnection();
        boolean z = this.f44385;
        httpURLConnection.setRequestMethod(z ? "POST" : "GET");
        httpURLConnection.setConnectTimeout(6000);
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.setDoOutput(z);
        for (Map.Entry entry : this.f44384.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (z) {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(this.f44387.toString().getBytes(this.f44383));
            outputStream.flush();
            outputStream.close();
        }
        return httpURLConnection;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m34585() throws IOException {
        HttpURLConnection httpURLConnectionM34583 = m34583();
        int responseCode = httpURLConnectionM34583.getResponseCode();
        if (responseCode < 200 || responseCode >= 300) {
            throw new IOException(C19370.m44628(responseCode, "HTTP response code: "));
        }
        InputStream inputStream = httpURLConnectionM34583.getInputStream();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[WXNativeGamePageObject.LENGTH_LIMIT];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                inputStream.close();
                return byteArrayOutputStream.toString(this.f44383);
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }
}
