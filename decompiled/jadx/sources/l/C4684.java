package l;

import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ۙܰۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34GF */
/* JADX INFO: loaded from: classes2.dex */
public final class C4684 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C3273 f14875;

    public C4684(C18090 c18090, C3545 c3545, String str, byte[] bArr) throws IOException {
        if (str == null || str.isEmpty()) {
            throw new IOException("Password can not be empty.");
        }
        for (Charset charset : C0450.m2006(str)) {
            try {
                this.f14875 = m13739(c3545, bArr, str.getBytes(charset));
                return;
            } catch (IOException unused) {
            }
        }
        c18090.m42192("");
        throw new C3979(c3545.getName());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13740(int i, int i2, byte[] bArr) {
        C3273 c3273 = this.f14875;
        if (i < 0 || i2 < 0) {
            throw new IOException("One of the input parameters were null in standard decrpyt data");
        }
        for (int i3 = i; i3 < i + i2; i3++) {
            try {
                byte bM10077 = (byte) (((bArr[i3] & 255) ^ c3273.m10077()) & 255);
                c3273.m10078(bM10077);
                bArr[i3] = bM10077;
            } catch (Exception e) {
                throw new IOException(e);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3273 m13739(C3545 c3545, byte[] bArr, byte[] bArr2) throws IOException {
        byte bM10782;
        C3273 c3273 = new C3273();
        c3273.m10079(bArr2);
        int i = 0;
        byte b = bArr[0];
        while (i < 12) {
            i++;
            if (i == 12) {
                byte bM10077 = (byte) (c3273.m10077() ^ b);
                if ((c3545.m10796() & 8) == 8) {
                    bM10782 = (byte) (C2568.m8118(c3545.getTime()) >> 8);
                } else {
                    bM10782 = (byte) (c3545.m10782() >> 24);
                }
                if (bM10077 != bM10782) {
                    throw new IOException();
                }
            }
            c3273.m10078((byte) (c3273.m10077() ^ b));
            if (i != 12) {
                b = bArr[i];
            }
        }
        return c3273;
    }
}
