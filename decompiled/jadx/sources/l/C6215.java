package l;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;

/* JADX INFO: renamed from: l.ۛᩳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: JB0Y */
/* JADX INFO: loaded from: classes2.dex */
public final class C6215 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6900 m17128(MappedByteBuffer mappedByteBuffer) throws IOException {
        long jM30801;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        C12565 c12565 = new C12565(byteBufferDuplicate);
        c12565.m30799(4);
        int iM30802 = c12565.m30802();
        if (iM30802 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        c12565.m30799(6);
        int i = 0;
        while (true) {
            if (i >= iM30802) {
                jM30801 = -1;
                break;
            }
            int iM30800 = c12565.m30800();
            c12565.m30799(4);
            jM30801 = c12565.m30801();
            c12565.m30799(4);
            if (1835365473 == iM30800) {
                break;
            }
            i++;
        }
        if (jM30801 != -1) {
            c12565.m30799((int) (jM30801 - c12565.m30798()));
            c12565.m30799(12);
            long jM30802 = c12565.m30801();
            for (int i2 = 0; i2 < jM30802; i2++) {
                int iM30801 = c12565.m30800();
                long jM30803 = c12565.m30801();
                c12565.m30801();
                if (1164798569 == iM30801 || 1701669481 == iM30801) {
                    byteBufferDuplicate.position((int) new C10449(jM30803 + jM30801).m26305());
                    return C6900.m18681(byteBufferDuplicate);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }
}
