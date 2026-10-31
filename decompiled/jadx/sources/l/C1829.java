package l;

import java.io.IOException;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.֫۫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6UY */
/* JADX INFO: loaded from: classes2.dex */
public final class C1829 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f6267 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final int[] f6268;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m6066(C10130 c10130, int i, long j, int i2, int i3) {
        if (i2 < 0 || i2 > 1048576 || j <= 0 || i < 1 || i > 6) {
            throw new IOException("Invalid recovery record");
        }
        int position = (int) c10130.getPosition();
        c10130.writeInt(1380266573);
        c10130.writeInt(i);
        c10130.writeInt(i2);
        c10130.writeInt(i3);
        c10130.m25431(j);
        c10130.writeInt(m6062(position, c10130.m25438()));
        c10130.writeInt(0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7493 m6065(C12951 c12951) {
        if (c12951.available() < 32) {
            throw new IOException("Truncated recovery header");
        }
        int iM31488 = c12951.m31488();
        if (c12951.readInt() != 1380266573) {
            throw new IOException("Invalid recovery record magic");
        }
        int i = c12951.readInt();
        int i2 = c12951.readInt();
        int i3 = c12951.readInt();
        long j = c12951.readLong();
        int i4 = c12951.readInt();
        if (i < 1 || i > 6 || i2 < 0 || i2 > 1048576 || j <= 0 || i4 != m6062(iM31488, c12951.f38849) || c12951.readInt() != 0) {
            throw new IOException("Invalid recovery record header");
        }
        return new C7493(i, i2, i3, j);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m6062(int i, byte[] bArr) {
        int i2 = i + 24;
        int i3 = -1;
        while (i < i2) {
            i3 = f6268[(i3 ^ bArr[i]) & 255] ^ (i3 >>> 8);
            i++;
        }
        return ~i3;
    }

    static {
        int[] iArr = new int[256];
        for (int i = 0; i < 256; i++) {
            int i2 = i;
            for (int i3 = 0; i3 < 8; i3++) {
                i2 = ((i2 & 1) == 0 ? 0 : -306674912) ^ (i2 >>> 1);
            }
            iArr[i] = i2;
        }
        f6268 = iArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m6067(C10130 c10130, long j, int i) {
        if (j < 0 || i < 0 || i > 1048576) {
            throw new IOException("Invalid recovery footer");
        }
        c10130.writeInt(1178939981);
        c10130.writeInt(i + 48);
        c10130.m25431(j);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m6063(long j, byte[] bArr) throws IOException {
        if (bArr.length != 16) {
            throw new IOException("Truncated recovery footer");
        }
        return m6064(new C12951(bArr), j);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m6064(C12951 c12951, long j) throws IOException {
        if (c12951.available() < 16) {
            throw new IOException("Truncated recovery footer");
        }
        int i = c12951.readInt();
        int i2 = c12951.readInt();
        long j2 = c12951.readLong();
        if (i == 1178939981 && i2 >= 48 && i2 <= 1048624 && j2 >= 0) {
            long j3 = i2;
            if (j >= j3 && j2 == j - j3) {
                return j2;
            }
        }
        throw new IOException("Invalid recovery record footer");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m6061(int i, int i2, byte[] bArr) {
        CRC32 crc32 = new CRC32();
        crc32.update(bArr, i, i2);
        return (int) crc32.getValue();
    }
}
