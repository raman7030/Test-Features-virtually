package p067l;

import java.io.IOException;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.֫۫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6UY */
/* JADX INFO: loaded from: classes2.dex */
public final class C4107 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f9046 = 0;

    /* JADX INFO: renamed from: ۧ */
    public static final int[] f9047;

    /* JADX INFO: renamed from: ֫ */
    public static void m8264(C11996 c11996, int i, long j, int i2, int i3) {
        if (i2 < 0 || i2 > 1048576 || j <= 0 || i < 1 || i > 6) {
            throw new IOException("Invalid recovery record");
        }
        int position = (int) c11996.getPosition();
        c11996.writeInt(1380266573);
        c11996.writeInt(i);
        c11996.writeInt(i2);
        c11996.writeInt(i3);
        c11996.m27451(j);
        c11996.writeInt(m8260(position, c11996.m27458()));
        c11996.writeInt(0);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C9490 m8263(C14677 c14677) {
        if (c14677.available() < 32) {
            throw new IOException("Truncated recovery header");
        }
        int iM33575 = c14677.m33575();
        if (c14677.readInt() != 1380266573) {
            throw new IOException("Invalid recovery record magic");
        }
        int i = c14677.readInt();
        int i2 = c14677.readInt();
        int i3 = c14677.readInt();
        long j = c14677.readLong();
        int i4 = c14677.readInt();
        if (i < 1 || i > 6 || i2 < 0 || i2 > 1048576 || j <= 0 || i4 != m8260(iM33575, c14677.f41893) || c14677.readInt() != 0) {
            throw new IOException("Invalid recovery record header");
        }
        return new C9490(i, i2, i3, j);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m8260(int i, byte[] bArr) {
        int i2 = i + 24;
        int i3 = -1;
        while (i < i2) {
            i3 = f9047[(i3 ^ bArr[i]) & 255] ^ (i3 >>> 8);
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
        f9047 = iArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m8265(C11996 c11996, long j, int i) {
        if (j < 0 || i < 0 || i > 1048576) {
            throw new IOException("Invalid recovery footer");
        }
        c11996.writeInt(1178939981);
        c11996.writeInt(i + 48);
        c11996.m27451(j);
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m8261(long j, byte[] bArr) throws IOException {
        if (bArr.length != 16) {
            throw new IOException("Truncated recovery footer");
        }
        return m8262(new C14677(bArr), j);
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m8262(C14677 c14677, long j) throws IOException {
        if (c14677.available() < 16) {
            throw new IOException("Truncated recovery footer");
        }
        int i = c14677.readInt();
        int i2 = c14677.readInt();
        long j2 = c14677.readLong();
        if (i == 1178939981 && i2 >= 48 && i2 <= 1048624 && j2 >= 0) {
            long j3 = i2;
            if (j >= j3 && j2 == j - j3) {
                return j2;
            }
        }
        throw new IOException("Invalid recovery record footer");
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m8259(int i, int i2, byte[] bArr) {
        CRC32 crc32 = new CRC32();
        crc32.update(bArr, i, i2);
        return (int) crc32.getValue();
    }
}
