package p067l;

import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.۫ܶ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 08FX */
/* JADX INFO: loaded from: classes3.dex */
public final class C14247 {
    /* JADX INFO: renamed from: ֫ */
    public static void m32743(C10365 c10365, C3659 c3659, AbstractC17043 abstractC17043, InterfaceC14917 interfaceC14917) throws Throwable {
        m32742(c10365, c3659, abstractC17043, false, interfaceC14917);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m32744(C12377 c12377, C3659 c3659, AbstractC17043 abstractC17043, InterfaceC14917 interfaceC14917) throws Throwable {
        m32742(c12377, c3659, abstractC17043, true, interfaceC14917);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m32742(Closeable closeable, C3659 c3659, AbstractC17043 abstractC17043, boolean z, InterfaceC14917 interfaceC14917) throws Throwable {
        AutoCloseable autoCloseable;
        InputStream inputStreamM28486;
        AutoCloseable autoCloseable2 = null;
        try {
            if (closeable instanceof C12377) {
                inputStreamM28486 = ((C12377) closeable).m28486(c3659);
            } else {
                if (!(closeable instanceof C10365)) {
                    throw new AssertionError(closeable.getClass());
                }
                inputStreamM28486 = (C10365) closeable;
            }
            try {
                OutputStream outputStreamMo25506 = abstractC17043.mo25506(false);
                try {
                    byte[] bArr = new byte[4096];
                    long jM7003 = c3659.m7003();
                    long j = 0;
                    do {
                        int i = inputStreamM28486.read(bArr);
                        if (i > 0) {
                            outputStreamMo25506.write(bArr, 0, i);
                            j += (long) i;
                            if (jM7003 > 0) {
                                interfaceC14917.mo34136(j, jM7003);
                            }
                        } else {
                            outputStreamMo25506.close();
                            if (!z && C7050.m16218()) {
                                abstractC17043.mo20486(c3659.m6996().getTime());
                            }
                            if (inputStreamM28486 != closeable) {
                                C2700.m4192(inputStreamM28486);
                                return;
                            }
                            return;
                        }
                    } while (!interfaceC14917.mo3924());
                    C2700.m4192(outputStreamMo25506);
                    abstractC17043.mo25503();
                    if (inputStreamM28486 != closeable) {
                        C2700.m4192(inputStreamM28486);
                    }
                } catch (Throwable th) {
                    th = th;
                    autoCloseable2 = outputStreamMo25506;
                    InputStream inputStream = inputStreamM28486;
                    autoCloseable = autoCloseable2;
                    autoCloseable2 = inputStream;
                    if (autoCloseable2 != closeable) {
                        C2700.m4192(autoCloseable2);
                    }
                    C2700.m4192(autoCloseable);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            autoCloseable = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static InputStream m32738(BufferedInputStream bufferedInputStream) {
        return m32741(bufferedInputStream, new C3630(bufferedInputStream), false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static InputStream m32740(BufferedInputStream bufferedInputStream, InterfaceC0923 interfaceC0923) {
        return m32741(bufferedInputStream, interfaceC0923, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static InputStream m32739(BufferedInputStream bufferedInputStream, C3630 c3630) {
        return m32741(bufferedInputStream, c3630, true);
    }

    /* JADX INFO: renamed from: ֫ */
    public static InputStream m32741(BufferedInputStream bufferedInputStream, InterfaceC0923 interfaceC0923, boolean z) throws IOException {
        if (!bufferedInputStream.markSupported()) {
            throw new IllegalArgumentException();
        }
        byte[] bArrM39852 = EnumC17494.m39852();
        bufferedInputStream.mark(bArrM39852.length);
        int iM52171 = C23461.m52171(bufferedInputStream, bArrM39852, bArrM39852.length);
        bufferedInputStream.reset();
        InputStream inputStream = null;
        try {
            for (EnumC17494 enumC17494 : EnumC17494.values()) {
                if (enumC17494.m39856(bArrM39852, iM52171)) {
                    InputStream inputStream2 = (InputStream) interfaceC0923.get();
                    try {
                        return z ? enumC17494.m39857(inputStream2) : enumC17494.m39854(inputStream2);
                    } catch (IOException e) {
                        e = e;
                        inputStream = inputStream2;
                    }
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                throw e;
            }
            return null;
        } catch (IOException e2) {
            e = e2;
        }
    }
}
