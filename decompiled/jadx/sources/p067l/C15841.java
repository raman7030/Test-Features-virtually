package p067l;

import android.os.SystemClock;
import com.alipay.sdk.p010m.p058y.C0240c;
import com.tencent.p062mm.opensdk.modelmsg.WXNativeGamePageObject;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܳ֡ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0N4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15841 {

    /* JADX INFO: renamed from: ֫ */
    public static final C10748 f45896 = C10748.m24756(1000);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public static void m35957(InputStream inputStream, OutputStream outputStream, long j, InterfaceC7717 interfaceC7717) {
        long j2;
        C4304 c4304M8746 = C4304.m8746(interfaceC7717);
        try {
            byte[] bArr = new byte[WXNativeGamePageObject.LENGTH_LIMIT];
            long jUptimeMillis = SystemClock.uptimeMillis();
            long j3 = 0;
            long j4 = 0;
            while (true) {
                int i = inputStream.read(bArr, 0, WXNativeGamePageObject.LENGTH_LIMIT);
                if (i == -1) {
                    if (c4304M8746 != null) {
                        c4304M8746.mo8748();
                        return;
                    }
                    return;
                }
                outputStream.write(bArr, 0, i);
                long j5 = ((long) i) + j3;
                if (c4304M8746 != null) {
                    long jUptimeMillis2 = SystemClock.uptimeMillis();
                    if (jUptimeMillis2 - jUptimeMillis < C0240c.f1145a || !f45896.m24761()) {
                        j2 = jUptimeMillis;
                    } else {
                        c4304M8746.mo8749();
                        j2 = jUptimeMillis2;
                    }
                    long jMin = outputStream instanceof InterfaceC3022 ? Math.min(j5, Math.max(j4, ((InterfaceC3022) outputStream).mo5115())) : j5;
                    if (jMin > j4) {
                        c4304M8746.mo8747(jMin - j4, jMin, Math.max(j5, j));
                        j4 = jMin;
                    }
                    if (c4304M8746.f9574.mo3924()) {
                        c4304M8746.mo8748();
                        return;
                    }
                    jUptimeMillis = j2;
                }
                j3 = j5;
            }
        } catch (Throwable th) {
            if (c4304M8746 != null) {
                c4304M8746.mo8748();
            }
            throw th;
        }
    }
}
