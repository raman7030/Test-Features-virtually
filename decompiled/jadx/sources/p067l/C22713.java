package p067l;

import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.᩸ۜ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: DBV2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22713 extends C3395 {
    /* JADX INFO: renamed from: ֫ */
    public static void m50842(byte[] bArr, OutputStream outputStream) throws IOException {
        CRC32 crc32 = new CRC32();
        crc32.update(bArr);
        long value = crc32.getValue();
        for (int i = 0; i < 4; i++) {
            outputStream.write((byte) (value >>> (i * 8)));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m50841(OutputStream outputStream, long j) throws IOException {
        while (j >= 128) {
            outputStream.write((byte) (128 | j));
            j >>>= 7;
        }
        outputStream.write((byte) j);
    }
}
