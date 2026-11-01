package p067l;

import com.alipay.sdk.app.OpenAuthTask;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: renamed from: l.ۚۢܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5RH */
/* JADX INFO: loaded from: classes2.dex */
public final class C7381 extends Thread {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C21463 f19330;

    public C7381(C21463 c21463) {
        this.f19330 = c21463;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        String str;
        String str2 = "";
        C21463 c21463 = this.f19330;
        String strM31240 = ((C13731) c21463.f67695.m40106()).m31240();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(((C13731) c21463.f67695.m40106()).m31240()).openConnection();
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
                str = new String(byteArrayOutputStream.toByteArray(), strM31240);
            } else {
                str = "";
            }
            httpURLConnection.disconnect();
            str2 = str;
        } catch (Exception unused) {
        }
        c21463.m48626(str2);
    }
}
