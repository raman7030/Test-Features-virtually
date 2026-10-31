package l;

import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.۫ܶ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 08FX */
/* JADX INFO: loaded from: classes3.dex */
public final class C12498 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m30668(C8414 c8414, C1358 c1358, AbstractC15440 abstractC15440, InterfaceC13203 interfaceC13203) throws Throwable {
        m30667(c8414, c1358, abstractC15440, false, interfaceC13203);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m30669(C10531 c10531, C1358 c1358, AbstractC15440 abstractC15440, InterfaceC13203 interfaceC13203) throws Throwable {
        m30667(c10531, c1358, abstractC15440, true, interfaceC13203);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m30667(Closeable closeable, C1358 c1358, AbstractC15440 abstractC15440, boolean z, InterfaceC13203 interfaceC13203) throws Throwable {
        AutoCloseable autoCloseable;
        InputStream inputStreamM26453;
        AutoCloseable autoCloseable2 = null;
        try {
            if (closeable instanceof C10531) {
                inputStreamM26453 = ((C10531) closeable).m26453(c1358);
            } else {
                if (!(closeable instanceof C8414)) {
                    throw new AssertionError(closeable.getClass());
                }
                inputStreamM26453 = (C8414) closeable;
            }
            try {
                OutputStream outputStreamMo23555 = abstractC15440.mo23555(false);
                try {
                    byte[] bArr = new byte[4096];
                    long jM4765 = c1358.m4765();
                    long j = 0;
                    do {
                        int i = inputStreamM26453.read(bArr);
                        if (i > 0) {
                            outputStreamMo23555.write(bArr, 0, i);
                            j += (long) i;
                            if (jM4765 > 0) {
                                interfaceC13203.mo32038(j, jM4765);
                            }
                        } else {
                            outputStreamMo23555.close();
                            if (!z && C4925.m14321()) {
                                abstractC15440.mo18537(c1358.m4758().getTime());
                            }
                            if (inputStreamM26453 != closeable) {
                                C0349.m1793(inputStreamM26453);
                                return;
                            }
                            return;
                        }
                    } while (!interfaceC13203.mo1526());
                    C0349.m1793(outputStreamMo23555);
                    abstractC15440.mo23552();
                    if (inputStreamM26453 != closeable) {
                        C0349.m1793(inputStreamM26453);
                    }
                } catch (Throwable th) {
                    th = th;
                    autoCloseable2 = outputStreamMo23555;
                    InputStream inputStream = inputStreamM26453;
                    autoCloseable = autoCloseable2;
                    autoCloseable2 = inputStream;
                    if (autoCloseable2 != closeable) {
                        C0349.m1793(autoCloseable2);
                    }
                    C0349.m1793(autoCloseable);
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InputStream m30663(BufferedInputStream bufferedInputStream) {
        return m30666(bufferedInputStream, new C1327(bufferedInputStream), false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InputStream m30665(BufferedInputStream bufferedInputStream, InterfaceC1629 interfaceC1629) {
        return m30666(bufferedInputStream, interfaceC1629, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InputStream m30664(BufferedInputStream bufferedInputStream, C1327 c1327) {
        return m30666(bufferedInputStream, c1327, true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InputStream m30666(BufferedInputStream bufferedInputStream, InterfaceC1629 interfaceC1629, boolean z) throws IOException {
        if (!bufferedInputStream.markSupported()) {
            throw new IllegalArgumentException();
        }
        byte[] bArrM37678 = EnumC15915.m37678();
        bufferedInputStream.mark(bArrM37678.length);
        int iM49844 = C22194.m49844(bufferedInputStream, bArrM37678, bArrM37678.length);
        bufferedInputStream.reset();
        InputStream inputStream = null;
        try {
            for (EnumC15915 enumC15915 : EnumC15915.values()) {
                if (enumC15915.m37682(bArrM37678, iM49844)) {
                    InputStream inputStream2 = (InputStream) interfaceC1629.get();
                    try {
                        return z ? enumC15915.m37683(inputStream2) : enumC15915.m37680(inputStream2);
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
