package p067l;

import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.᩺ܰۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: V9HU */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24250 {

    /* JADX INFO: renamed from: ܽ */
    public static final byte[] f76848 = {0, 0};

    /* JADX INFO: renamed from: ۧ */
    public static final AbstractC24250 f76847 = new C13522();

    /* JADX INFO: renamed from: ֫ */
    public static final AbstractC24250 f76846 = new C8157();

    /* JADX INFO: renamed from: ֫ */
    public abstract long mo18931(C12181 c12181);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo18932(C12181 c12181, long j);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo18933(C12181 c12181, String str);

    /* JADX INFO: renamed from: ۧ */
    public abstract long mo18934(C12181 c12181);

    /* JADX INFO: renamed from: ֫ */
    public static String m53557(C12181 c12181, Charset charset) throws C14862 {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[2];
        c12181.getClass();
        while (true) {
            c12181.m28112(2, bArr);
            if (bArr[0] != 0 || bArr[1] != 0) {
                byteArrayOutputStream.write(bArr, 0, 2);
            } else {
                return new String(byteArrayOutputStream.toByteArray(), charset);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m53556(C12181 c12181, int i, Charset charset) throws C14862 {
        int i2 = i * 2;
        byte[] bArr = new byte[i2];
        c12181.m28112(i2, bArr);
        return new String(bArr, charset);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53558(C2460 c2460, String str) {
        mo18933((C12181) c2460, str);
        c2460.m28102(2, f76848);
    }
}
