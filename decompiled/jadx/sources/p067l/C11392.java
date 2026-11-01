package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۢۢ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: OJQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C11392 {

    /* JADX INFO: renamed from: ֫ */
    public static final byte[] f31782 = {-3, 55, 122, 88, 90, 0};

    /* JADX INFO: renamed from: ֫ */
    public static boolean m26344(int i, byte[] bArr) {
        if (i < 6) {
            return false;
        }
        for (int i2 = 0; i2 < 6; i2++) {
            if (bArr[i2] != f31782[i2]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m26343(InterfaceC9866 interfaceC9866) throws IOException {
        long length = interfaceC9866.length();
        if (length < 12) {
            throw new IOException("File too small to be a valid XZ file");
        }
        long j = length - 12;
        interfaceC9866.seek(j);
        byte[] bArr = new byte[12];
        interfaceC9866.readFully(bArr);
        interfaceC9866.seek(j - C16676.m37752(bArr).f74508);
        if (interfaceC9866.readByte() != 0) {
            throw new IOException("Invalid XZ index indicator");
        }
        C22121 c22121 = new C22121(interfaceC9866);
        long jM37750 = C16676.m37750(c22121);
        long jM37751 = 0;
        for (int i = 0; i < jM37750; i++) {
            C16676.m37750(c22121);
            jM37751 += C16676.m37750(c22121);
        }
        return jM37751;
    }
}
