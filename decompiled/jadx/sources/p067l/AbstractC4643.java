package p067l;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ۖ۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N4FD */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4643 {
    /* JADX INFO: renamed from: ֫ */
    public abstract long mo4352();

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo4353(InterfaceC12257 interfaceC12257);

    /* JADX INFO: renamed from: ܽ */
    public abstract C15545 mo4356();

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC4643 m9817(C15545 c15545, String str) {
        Charset charset = C21407.f67539;
        if (c15545 != null) {
            Charset charsetM35338 = c15545.m35338((Charset) null);
            if (charsetM35338 == null) {
                try {
                    c15545 = C15545.m35336(c15545 + "; charset=utf-8");
                } catch (IllegalArgumentException unused) {
                    c15545 = null;
                }
            } else {
                charset = charsetM35338;
            }
        }
        return m9818(c15545, str.getBytes(charset));
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC4643 m9818(C15545 c15545, byte[] bArr) {
        int length = bArr.length;
        long length2 = bArr.length;
        long j = 0;
        long j2 = length;
        byte[] bArr2 = C21407.f67526;
        if ((j | j2) >= 0 && j <= length2 && length2 - j >= j2) {
            return new C17382(c15545, length, bArr);
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
