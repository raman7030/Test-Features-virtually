package p067l;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: l.۬ܰۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAQV */
/* JADX INFO: loaded from: classes3.dex */
public final class C14866 implements Closeable {

    /* JADX INFO: renamed from: ۙ */
    public static final long[] f42367 = new long[64];

    /* JADX INFO: renamed from: ᩶ */
    public final InputStream f42368;

    /* JADX INFO: renamed from: ᩸ */
    public long f42369;

    /* JADX INFO: renamed from: ᩹ */
    public int f42370;

    public C14866(InputStream inputStream) {
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        this.f42368 = inputStream;
    }

    static {
        for (int i = 1; i <= 63; i++) {
            long[] jArr = f42367;
            jArr[i] = (jArr[i - 1] << 1) + 1;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f42368.close();
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m33971(int i) throws IOException {
        int i2;
        InputStream inputStream;
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        if (i < 0 || i > 63) {
            throw new IOException("count must not be negative or greater than 63");
        }
        while (true) {
            i2 = this.f42370;
            inputStream = this.f42368;
            if (i2 >= i || i2 >= 57) {
                break;
            }
            long j = inputStream.read();
            if (j < 0) {
                return -1L;
            }
            ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
            long j2 = this.f42369;
            int i3 = this.f42370;
            this.f42369 = j2 | (j << i3);
            this.f42370 = i3 + 8;
        }
        if (i2 >= i) {
            return m33970(i);
        }
        int i4 = i - i2;
        int i5 = 8 - i4;
        long j3 = inputStream.read();
        if (j3 < 0) {
            return j3;
        }
        ByteOrder byteOrder3 = ByteOrder.LITTLE_ENDIAN;
        long[] jArr = f42367;
        long j4 = ((jArr[i4] & j3) << this.f42370) | this.f42369;
        this.f42369 = j4;
        long j5 = (j3 >>> i4) & jArr[i5];
        long j6 = jArr[i] & j4;
        this.f42369 = j5;
        this.f42370 = i5;
        return j6;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m33974() {
        return this.f42370;
    }

    /* JADX INFO: renamed from: ܽ */
    public final long m33973() {
        return (((long) this.f42368.available()) * 8) + ((long) this.f42370);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33972() {
        int i = this.f42370 % 8;
        if (i > 0) {
            m33970(i);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private long m33970(int i) {
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        long j = this.f42369;
        long j2 = f42367[i] & j;
        this.f42369 = j >>> i;
        this.f42370 -= i;
        return j2;
    }
}
