package p067l;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;

/* JADX INFO: renamed from: l.ۛᩳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: JB0Y */
/* JADX INFO: loaded from: classes2.dex */
public final class C8275 {
    /* JADX INFO: renamed from: ֫ */
    public static C8926 m19060(MappedByteBuffer mappedByteBuffer) throws IOException {
        long jM32876;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        C14310 c14310 = new C14310(byteBufferDuplicate);
        c14310.m32874(4);
        int iM32877 = c14310.m32877();
        if (iM32877 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        c14310.m32874(6);
        int i = 0;
        while (true) {
            if (i >= iM32877) {
                jM32876 = -1;
                break;
            }
            int iM32875 = c14310.m32875();
            c14310.m32874(4);
            jM32876 = c14310.m32876();
            c14310.m32874(4);
            if (1835365473 == iM32875) {
                break;
            }
            i++;
        }
        if (jM32876 != -1) {
            c14310.m32874((int) (jM32876 - c14310.m32873()));
            c14310.m32874(12);
            long jM32877 = c14310.m32876();
            for (int i2 = 0; i2 < jM32877; i2++) {
                int iM32876 = c14310.m32875();
                long jM32878 = c14310.m32876();
                c14310.m32876();
                if (1164798569 == iM32876 || 1701669481 == iM32876) {
                    byteBufferDuplicate.position((int) new C12299(jM32878 + jM32876).m28334());
                    return C8926.m20630(byteBufferDuplicate);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }
}
