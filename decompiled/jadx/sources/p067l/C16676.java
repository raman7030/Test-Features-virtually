package p067l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ܶۜ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 01TM */
/* JADX INFO: loaded from: classes5.dex */
public final class C16676 extends C3395 {
    /* JADX INFO: renamed from: ֫ */
    public static boolean m37753(int i, byte[] bArr, int i2, int i3) {
        CRC32 crc32 = new CRC32();
        crc32.update(bArr, i, i2);
        long value = crc32.getValue();
        for (int i4 = 0; i4 < 4; i4++) {
            if (((byte) (value >>> (i4 * 8))) != bArr[i3 + i4]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C23383 m37754(byte[] bArr) throws C17347, C23856, C11314 {
        for (int i = 0; i < 6; i++) {
            if (bArr[i] != C10643.f29435[i]) {
                throw new C17347("Input is not in the XZ format");
            }
        }
        if (!m37753(6, bArr, 2, 8)) {
            throw new C23856("XZ Stream Header is corrupt");
        }
        try {
            return m37751(6, bArr);
        } catch (C11314 unused) {
            throw new C11314("Unsupported options in XZ Stream Header");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C23383 m37752(byte[] bArr) throws C23856, C11314 {
        byte b = bArr[10];
        byte[] bArr2 = C10643.f29434;
        if (b != bArr2[0] || bArr[11] != bArr2[1]) {
            throw new C23856("XZ Stream Footer is corrupt");
        }
        if (!m37753(4, bArr, 6, 0)) {
            throw new C23856("XZ Stream Footer is corrupt");
        }
        try {
            C23383 c23383M37751 = m37751(8, bArr);
            c23383M37751.f74508 = 0L;
            for (int i = 0; i < 4; i++) {
                c23383M37751.f74508 |= (long) ((bArr[i + 4] & 255) << (i * 8));
            }
            c23383M37751.f74508 = (c23383M37751.f74508 + 1) * 4;
            return c23383M37751;
        } catch (C11314 unused) {
            throw new C11314("Unsupported options in XZ Stream Footer");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C23383 m37751(int i, byte[] bArr) throws C11314 {
        if (bArr[i] == 0) {
            byte b = bArr[i + 1];
            if ((b & 255) < 16) {
                C23383 c23383 = new C23383();
                c23383.f74509 = b;
                return c23383;
            }
        }
        throw new C11314();
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m37750(InputStream inputStream) throws IOException {
        int i = inputStream.read();
        if (i == -1) {
            throw new EOFException();
        }
        long j = i & 127;
        int i2 = 0;
        while ((i & 128) != 0) {
            i2++;
            if (i2 >= 9) {
                throw new C23856();
            }
            i = inputStream.read();
            if (i == -1) {
                throw new EOFException();
            }
            if (i == 0) {
                throw new C23856();
            }
            j |= ((long) (i & 127)) << (i2 * 7);
        }
        return j;
    }
}
