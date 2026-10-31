package l;

import com.alipay.sdk.app.OpenAuthTask;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: renamed from: l.᩸ۢܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5RH */
/* JADX INFO: loaded from: classes4.dex */
public final class C21502 extends Thread {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20091 f69159;

    public C21502(C20091 c20091) {
        this.f69159 = c20091;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        String str = "";
        C20091 c20091 = this.f69159;
        String strM29186 = ((C11955) c20091.f65055.m37919()).m29186();
        byte[] bytes = ((C11955) c20091.f65055.m37919()).m29186().getBytes();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(((C11955) c20091.f65055.m37919()).m29186()).openConnection();
            httpURLConnection.setRequestProperty("accept", "*/*");
            httpURLConnection.setRequestProperty("connection", "Keep-Alive");
            httpURLConnection.setRequestProperty("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) Chrome/46.0.2486.0");
            httpURLConnection.setConnectTimeout(OpenAuthTask.Duplex);
            httpURLConnection.setReadTimeout(OpenAuthTask.Duplex);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            httpURLConnection.setRequestProperty("Content-Length", String.valueOf(bytes.length));
            httpURLConnection.connect();
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.write(bytes);
            dataOutputStream.flush();
            dataOutputStream.close();
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
                str = new String(byteArrayOutputStream.toByteArray(), strM29186);
            }
        } catch (Exception unused) {
        }
        c20091.m46310(str);
    }
}
