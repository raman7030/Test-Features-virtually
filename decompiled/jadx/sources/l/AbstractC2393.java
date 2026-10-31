package l;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ۖ۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N4FD */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2393 {
    /* JADX INFO: renamed from: ֫ */
    public abstract long mo1976();

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo1977(InterfaceC10405 interfaceC10405);

    /* JADX INFO: renamed from: ܽ */
    public abstract C13864 mo1980();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC2393 m7754(C13864 c13864, String str) {
        Charset charset = C20032.f64897;
        if (c13864 != null) {
            Charset charsetM33219 = c13864.m33219((Charset) null);
            if (charsetM33219 == null) {
                try {
                    c13864 = C13864.m33217(c13864 + "; charset=utf-8");
                } catch (IllegalArgumentException unused) {
                    c13864 = null;
                }
            } else {
                charset = charsetM33219;
            }
        }
        return m7755(c13864, str.getBytes(charset));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC2393 m7755(C13864 c13864, byte[] bArr) {
        int length = bArr.length;
        long length2 = bArr.length;
        long j = 0;
        long j2 = length;
        byte[] bArr2 = C20032.f64884;
        if ((j | j2) >= 0 && j <= length2 && length2 - j >= j2) {
            return new C15797(c13864, length, bArr);
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
