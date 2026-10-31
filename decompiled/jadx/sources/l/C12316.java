package l;

import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;

/* JADX INFO: renamed from: l.۫ۢ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: U7IN */
/* JADX INFO: loaded from: classes3.dex */
public final class C12316 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m29873(ReadableByteChannel readableByteChannel, ReadableByteChannel readableByteChannel2) {
        if (C11003.equals(readableByteChannel, readableByteChannel2)) {
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
                int iM29872 = m29872(readableByteChannel, byteBufferAllocateDirect);
                byteBufferAllocateDirect.clear();
                if (iM29872 == 0) {
                    i = iM29872;
                    z2 = true;
                } else {
                    i = iM29872;
                    z2 = false;
                }
            }
            if (!z2) {
                int iM29873 = m29872(readableByteChannel2, byteBufferAllocateDirect2);
                byteBufferAllocateDirect2.clear();
                if (iM29873 == 0) {
                    i2 = iM29873;
                    z = true;
                } else {
                    i2 = iM29873;
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m29872(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer) {
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
