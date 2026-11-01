package p067l;

import java.io.UTFDataFormatException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۘ᩹ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: S5QZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C6385 {
    /* JADX INFO: renamed from: ֫ */
    public static String m14604(ByteBuffer byteBuffer, StringBuilder sb) throws UTFDataFormatException {
        while (true) {
            char c = (char) (byteBuffer.get() & 255);
            if (c == 0) {
                return sb.toString();
            }
            if (c < 128) {
                sb.append(c);
            } else if ((c & 224) == 192) {
                byte b = byteBuffer.get();
                if ((b & 192) != 128) {
                    throw new UTFDataFormatException("bad second byte");
                }
                sb.append((char) (((c & 31) << 6) | (b & 63)));
            } else if ((c & 240) == 224) {
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                if ((b2 & 192) != 128 || (b3 & 192) != 128) {
                    throw new UTFDataFormatException("bad second or third byte");
                }
                sb.append((char) (((c & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63)));
            } else {
                throw new UTFDataFormatException("bad byte");
            }
        }
    }
}
