package p067l;

import com.alipay.sdk.p010m.p041p.C0184a;
import com.alipay.sdk.p010m.p055w.C0233a;
import com.tencent.p062mm.opensdk.modelmsg.WXNativeGamePageObject;
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
public final class C16138 {

    /* JADX INFO: renamed from: ܽ */
    public final boolean f47486;

    /* JADX INFO: renamed from: ܿ */
    public final String f47487;

    /* JADX INFO: renamed from: ᩳ */
    public final StringBuilder f47488;

    /* JADX INFO: renamed from: ۧ */
    public final LinkedHashMap f47485 = new LinkedHashMap();

    /* JADX INFO: renamed from: ֫ */
    public String f47484 = C0233a.f1077D;

    public C16138(String str, boolean z) {
        this.f47487 = str;
        this.f47486 = z;
        this.f47488 = z ? new StringBuilder() : null;
        m36727("User-Agent", "Mozilla/5.0 (Linux; Android 6.0;)");
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m36727(String str, String str2) {
        this.f47485.put(str, str2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36725(String str, String str2) {
        StringBuilder sb = this.f47488;
        if (sb.length() == 0) {
            this.f47485.put("Content-Type", "application/x-www-form-urlencoded");
        } else {
            sb.append('&');
        }
        try {
            sb.append(str);
            sb.append(C0184a.f880h);
            sb.append(C14523.encode(str2, this.f47484));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final HttpURLConnection m36724() throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f47487).openConnection();
        boolean z = this.f47486;
        httpURLConnection.setRequestMethod(z ? "POST" : "GET");
        httpURLConnection.setConnectTimeout(6000);
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.setDoOutput(z);
        for (Map.Entry entry : this.f47485.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (z) {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(this.f47488.toString().getBytes(this.f47484));
            outputStream.flush();
            outputStream.close();
        }
        return httpURLConnection;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m36726() throws IOException {
        HttpURLConnection httpURLConnectionM36724 = m36724();
        int responseCode = httpURLConnectionM36724.getResponseCode();
        if (responseCode < 200 || responseCode >= 300) {
            throw new IOException(C20778.m46922(responseCode, "HTTP response code: "));
        }
        InputStream inputStream = httpURLConnectionM36724.getInputStream();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[WXNativeGamePageObject.LENGTH_LIMIT];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                inputStream.close();
                return byteArrayOutputStream.toString(this.f47484);
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }
}
