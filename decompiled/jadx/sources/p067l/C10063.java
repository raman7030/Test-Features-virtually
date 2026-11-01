package p067l;

import com.alipay.sdk.app.OpenAuthTask;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: renamed from: l.۠ۢܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5RH */
/* JADX INFO: loaded from: classes3.dex */
public final class C10063 extends Thread {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C21463 f27878;

    public C10063(C21463 c21463) {
        this.f27878 = c21463;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        byte[] byteArray;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(((C13731) this.f27878.f67695.m40106()).m31240()).openConnection();
            httpURLConnection.setRequestProperty("accept", "*/*");
            httpURLConnection.setRequestProperty("connection", "Keep-Alive");
            httpURLConnection.setRequestProperty("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) Chrome/46.0.2486.0");
            httpURLConnection.setConnectTimeout(OpenAuthTask.Duplex);
            httpURLConnection.setReadTimeout(OpenAuthTask.Duplex);
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() == 200) {
                InputStream inputStream = httpURLConnection.getInputStream();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(inputStream.available() * 2);
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i <= 0) {
                        break;
                    } else {
                        byteArrayOutputStream.write(bArr, 0, i);
                    }
                }
                inputStream.close();
                byteArray = byteArrayOutputStream.toByteArray();
            } else {
                byteArray = new byte[0];
            }
            httpURLConnection.disconnect();
        } catch (Exception unused) {
            byteArray = new byte[0];
        }
        C21463 c21463 = this.f27878;
        synchronized (c21463) {
            if (c21463.f67695 != null) {
                C13731 c13731 = new C13731();
                c13731.m31208(byteArray);
                c21463.f67695.m40105(c13731);
                c21463.f67696 = false;
                c21463.f67695 = null;
            }
        }
    }
}
