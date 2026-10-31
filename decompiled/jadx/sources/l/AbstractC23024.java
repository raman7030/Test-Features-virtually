package l;

import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.᩺ܰۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: V9HU */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23024 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final byte[] f74109 = {0, 0};

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final AbstractC23024 f74108 = new C11736();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final AbstractC23024 f74107 = new C6091();

    /* JADX INFO: renamed from: ֫ */
    public abstract long mo17000(C10325 c10325);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo17001(C10325 c10325, long j);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo17002(C10325 c10325, String str);

    /* JADX INFO: renamed from: ۧ */
    public abstract long mo17003(C10325 c10325);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m51164(C10325 c10325, Charset charset) throws C13146 {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[2];
        c10325.getClass();
        while (true) {
            c10325.m26087(2, bArr);
            if (bArr[0] != 0 || bArr[1] != 0) {
                byteArrayOutputStream.write(bArr, 0, 2);
            } else {
                return new String(byteArrayOutputStream.toByteArray(), charset);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m51163(C10325 c10325, int i, Charset charset) throws C13146 {
        int i2 = i * 2;
        byte[] bArr = new byte[i2];
        c10325.m26087(i2, bArr);
        return new String(bArr, charset);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51165(C0097 c0097, String str) {
        mo17002((C10325) c0097, str);
        c0097.m26077(2, f74109);
    }
}
