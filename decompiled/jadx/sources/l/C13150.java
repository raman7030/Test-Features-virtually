package l;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: l.۬ܰۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAQV */
/* JADX INFO: loaded from: classes3.dex */
public final class C13150 implements Closeable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final long[] f39312 = new long[64];

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InputStream f39313;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f39314;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f39315;

    public C13150(InputStream inputStream) {
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        this.f39313 = inputStream;
    }

    static {
        for (int i = 1; i <= 63; i++) {
            long[] jArr = f39312;
            jArr[i] = (jArr[i - 1] << 1) + 1;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f39313.close();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m31878(int i) throws IOException {
        int i2;
        InputStream inputStream;
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        if (i < 0 || i > 63) {
            throw new IOException("count must not be negative or greater than 63");
        }
        while (true) {
            i2 = this.f39315;
            inputStream = this.f39313;
            if (i2 >= i || i2 >= 57) {
                break;
            }
            long j = inputStream.read();
            if (j < 0) {
                return -1L;
            }
            ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
            long j2 = this.f39314;
            int i3 = this.f39315;
            this.f39314 = j2 | (j << i3);
            this.f39315 = i3 + 8;
        }
        if (i2 >= i) {
            return m31877(i);
        }
        int i4 = i - i2;
        int i5 = 8 - i4;
        long j3 = inputStream.read();
        if (j3 < 0) {
            return j3;
        }
        ByteOrder byteOrder3 = ByteOrder.LITTLE_ENDIAN;
        long[] jArr = f39312;
        long j4 = ((jArr[i4] & j3) << this.f39315) | this.f39314;
        this.f39314 = j4;
        long j5 = (j3 >>> i4) & jArr[i5];
        long j6 = jArr[i] & j4;
        this.f39314 = j5;
        this.f39315 = i5;
        return j6;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m31881() {
        return this.f39315;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m31880() {
        return (((long) this.f39313.available()) * 8) + ((long) this.f39315);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31879() {
        int i = this.f39315 % 8;
        if (i > 0) {
            m31877(i);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private long m31877(int i) {
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        long j = this.f39314;
        long j2 = f39312[i] & j;
        this.f39314 = j >>> i;
        this.f39315 -= i;
        return j2;
    }
}
