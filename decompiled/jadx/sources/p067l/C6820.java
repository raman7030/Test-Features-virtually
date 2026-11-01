package p067l;

import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ۙܰۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34GF */
/* JADX INFO: loaded from: classes2.dex */
public final class C6820 {

    /* JADX INFO: renamed from: ֫ */
    public C5479 f17704;

    public C6820(C19561 c19561, C5738 c5738, String str, byte[] bArr) throws IOException {
        if (str == null || str.isEmpty()) {
            throw new IOException("Password can not be empty.");
        }
        for (Charset charset : C2796.m4383(str)) {
            try {
                this.f17704 = m15614(c5738, bArr, str.getBytes(charset));
                return;
            } catch (IOException unused) {
            }
        }
        c19561.m44451("");
        throw new C6150(c5738.getName());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15615(int i, int i2, byte[] bArr) {
        C5479 c5479 = this.f17704;
        if (i < 0 || i2 < 0) {
            throw new IOException("One of the input parameters were null in standard decrpyt data");
        }
        for (int i3 = i; i3 < i + i2; i3++) {
            try {
                byte bM12110 = (byte) (((bArr[i3] & 255) ^ c5479.m12110()) & 255);
                c5479.m12111(bM12110);
                bArr[i3] = bM12110;
            } catch (Exception e) {
                throw new IOException(e);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5479 m15614(C5738 c5738, byte[] bArr, byte[] bArr2) throws IOException {
        byte bM12763;
        C5479 c5479 = new C5479();
        c5479.m12112(bArr2);
        int i = 0;
        byte b = bArr[0];
        while (i < 12) {
            i++;
            if (i == 12) {
                byte bM12110 = (byte) (c5479.m12110() ^ b);
                if ((c5738.m12777() & 8) == 8) {
                    bM12763 = (byte) (C4809.m10151(c5738.getTime()) >> 8);
                } else {
                    bM12763 = (byte) (c5738.m12763() >> 24);
                }
                if (bM12110 != bM12763) {
                    throw new IOException();
                }
            }
            c5479.m12111((byte) (c5479.m12110() ^ b));
            if (i != 12) {
                b = bArr[i];
            }
        }
        return c5479;
    }
}
