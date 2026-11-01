package p067l;

import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;

/* JADX INFO: renamed from: l.۫ۢ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: U7IN */
/* JADX INFO: loaded from: classes3.dex */
public final class C14073 {
    /* JADX INFO: renamed from: ֫ */
    public static boolean m31933(ReadableByteChannel readableByteChannel, ReadableByteChannel readableByteChannel2) {
        if (C12826.equals(readableByteChannel, readableByteChannel2)) {
            return true;
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(8192);
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(8192);
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (!z) {
                int iM31932 = m31932(readableByteChannel, byteBufferAllocateDirect);
                byteBufferAllocateDirect.clear();
                if (iM31932 == 0) {
                    i = iM31932;
                    z2 = true;
                } else {
                    i = iM31932;
                    z2 = false;
                }
            }
            if (!z2) {
                int iM31933 = m31932(readableByteChannel2, byteBufferAllocateDirect2);
                byteBufferAllocateDirect2.clear();
                if (iM31933 == 0) {
                    i2 = iM31933;
                    z = true;
                } else {
                    i2 = iM31933;
                    z = false;
                }
            }
            if (i == -1 && i2 == -1) {
                return byteBufferAllocateDirect.equals(byteBufferAllocateDirect2);
            }
            if (i == 0 || i2 == 0) {
                Thread.yield();
            } else if (i != i2 || !byteBufferAllocateDirect.equals(byteBufferAllocateDirect2)) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m31932(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer) {
        int i;
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException();
        }
        int i2 = 0;
        while (byteBuffer.hasRemaining() && (i = readableByteChannel.read(byteBuffer)) != -1) {
            if (i == 0) {
                Thread.yield();
            } else {
                i2 += i;
            }
        }
        if (i2 != 0) {
            return i2;
        }
        return -1;
    }
}
