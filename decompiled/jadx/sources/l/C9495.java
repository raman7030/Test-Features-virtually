package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۢۢ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: OJQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C9495 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final byte[] f28834 = {-3, 55, 122, 88, 90, 0};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m24334(int i, byte[] bArr) {
        if (i < 6) {
            return false;
        }
        for (int i2 = 0; i2 < 6; i2++) {
            if (bArr[i2] != f28834[i2]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m24333(InterfaceC7889 interfaceC7889) throws IOException {
        long length = interfaceC7889.length();
        if (length < 12) {
            throw new IOException("File too small to be a valid XZ file");
        }
        long j = length - 12;
        interfaceC7889.seek(j);
        byte[] bArr = new byte[12];
        interfaceC7889.readFully(bArr);
        interfaceC7889.seek(j - C15055.m35594(bArr).f71786);
        if (interfaceC7889.readByte() != 0) {
            throw new IOException("Invalid XZ index indicator");
        }
        C20784 c20784 = new C20784(interfaceC7889);
        long jM35592 = C15055.m35592(c20784);
        long jM35593 = 0;
        for (int i = 0; i < jM35592; i++) {
            C15055.m35592(c20784);
            jM35593 += C15055.m35592(c20784);
        }
        return jM35593;
    }
}
