package l;

import android.os.SystemClock;
import com.alipay.sdk.m.y.c;
import com.tencent.mm.opensdk.modelmsg.WXNativeGamePageObject;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܳ֡ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0N4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14176 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C8817 f42809 = C8817.m22786(1000);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33825(InputStream inputStream, OutputStream outputStream, long j, InterfaceC5627 interfaceC5627) {
        long j2;
        C2036 c2036M6620 = C2036.m6620(interfaceC5627);
        try {
            byte[] bArr = new byte[WXNativeGamePageObject.LENGTH_LIMIT];
            long jUptimeMillis = SystemClock.uptimeMillis();
            long j3 = 0;
            long j4 = 0;
            while (true) {
                int i = inputStream.read(bArr, 0, WXNativeGamePageObject.LENGTH_LIMIT);
                if (i == -1) {
                    if (c2036M6620 != null) {
                        c2036M6620.mo6622();
                        return;
                    }
                    return;
                }
                outputStream.write(bArr, 0, i);
                long j5 = ((long) i) + j3;
                if (c2036M6620 != null) {
                    long jUptimeMillis2 = SystemClock.uptimeMillis();
                    if (jUptimeMillis2 - jUptimeMillis < c.a || !f42809.m22791()) {
                        j2 = jUptimeMillis;
                    } else {
                        c2036M6620.mo6623();
                        j2 = jUptimeMillis2;
                    }
                    long jMin = outputStream instanceof InterfaceC0687 ? Math.min(j5, Math.max(j4, ((InterfaceC0687) outputStream).mo2776())) : j5;
                    if (jMin > j4) {
                        c2036M6620.mo6621(jMin - j4, jMin, Math.max(j5, j));
                        j4 = jMin;
                    }
                    if (c2036M6620.f6790.mo1526()) {
                        c2036M6620.mo6622();
                        return;
                    }
                    jUptimeMillis = j2;
                }
                j3 = j5;
            }
        } catch (Throwable th) {
            if (c2036M6620 != null) {
                c2036M6620.mo6622();
            }
            throw th;
        }
    }
}
