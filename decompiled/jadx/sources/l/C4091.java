package l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;

/* JADX INFO: renamed from: l.ۘܿᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A1VX */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4091 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC0562 m12290(InterfaceC0562 interfaceC0562) {
        int size = (int) (interfaceC0562.size() % ((long) 4096));
        if (size == 0) {
            return interfaceC0562;
        }
        int i = 4096 - size;
        return new C16084(interfaceC0562, new C9030(new byte[i], 0, i));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m12292(InterfaceC0562 interfaceC0562, MessageDigest messageDigest, long j) {
        interfaceC0562.mo2314(new C18908(messageDigest), j);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m12293(InterfaceC0562 interfaceC0562, C23411 c23411, long j) {
        interfaceC0562.mo2314(new C19614(c23411), j);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9030 m12291(C1268 c1268) throws IOException {
        long jMo2316 = c1268.mo2316();
        if (jMo2316 > 2147483647L) {
            throw new IOException("Data too large");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((int) jMo2316);
        c1268.mo2314(byteArrayOutputStream, jMo2316);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        return new C9030(byteArray, 0, byteArray.length);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0562 m12294(C1268 c1268) {
        long jMo2316 = c1268.mo2316();
        if (jMo2316 > 52428800) {
            return c1268;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((int) jMo2316);
        c1268.mo2314(byteArrayOutputStream, jMo2316);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        return new C9030(byteArray, 0, byteArray.length);
    }
}
