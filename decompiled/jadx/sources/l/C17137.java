package l;

import android.media.MediaDataSource;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܿۚۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 978U */
/* JADX INFO: loaded from: classes4.dex */
public final class C17137 extends MediaDataSource {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final byte[] f52519 = {102, 114, 101, 101};

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final long f52520;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f52521;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC7505 f52522;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f52523;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long f52524;

    public C17137(InterfaceC7505 interfaceC7505, long j, long j2, long j3) {
        this.f52522 = interfaceC7505;
        this.f52521 = j;
        this.f52523 = j2;
        this.f52524 = j2 - j;
        this.f52520 = j2 + j3;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00b6  */
    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        int iMin;
        byte b;
        int i3;
        if (i2 == 0) {
            return 0;
        }
        if (j < 0 || j >= this.f52520 || i2 < 0) {
            return -1;
        }
        long j2 = j;
        int i4 = 0;
        while (i4 < i2) {
            long j3 = this.f52520;
            if (j2 >= j3) {
                break;
            }
            long j4 = this.f52521;
            if (j2 < j4) {
                iMin = (int) Math.min(i2 - i4, j4 - j2);
                int i5 = i + i4;
                synchronized (this.f52522) {
                    this.f52522.mo8637(j2, bArr, i5, iMin);
                }
            } else {
                long j5 = this.f52523;
                if (j2 < j5) {
                    iMin = (int) Math.min(i2 - i4, j5 - j2);
                    long j6 = j2 - this.f52521;
                    int i6 = i + i4;
                    for (int i7 = 0; i7 < iMin; i7++) {
                        int i8 = i6 + i7;
                        long j7 = ((long) i7) + j6;
                        byte[] bArr2 = f52519;
                        long j8 = this.f52524;
                        if (j8 <= 0) {
                            b = 0;
                        } else if (j8 <= 4294967295L) {
                            if (j7 < 4) {
                                i3 = 3 - ((int) j7);
                                b = (byte) (j8 >> (i3 * 8));
                            } else if (j7 < 8) {
                                b = bArr2[((int) j7) - 4];
                            } else {
                                b = 0;
                            }
                        } else if (j7 < 4) {
                            if (j7 == 3) {
                                b = 1;
                            } else {
                                b = 0;
                            }
                        } else if (j7 < 8) {
                            b = bArr2[((int) j7) - 4];
                        } else if (j7 < 16) {
                            i3 = 15 - ((int) j7);
                            b = (byte) (j8 >> (i3 * 8));
                        } else {
                            b = 0;
                        }
                        bArr[i8] = b;
                    }
                } else {
                    int iMin2 = (int) Math.min(i2 - i4, j3 - j2);
                    m40230(j2, bArr, i + i4, iMin2);
                    j2 += (long) iMin2;
                    i4 += iMin2;
                }
            }
            j2 += (long) iMin;
            i4 += iMin;
        }
        int i9 = i4;
        if (i9 == 0) {
            return -1;
        }
        return i9;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m40230(long j, byte[] bArr, int i, int i2) {
        synchronized (this.f52522) {
            this.f52522.mo8637(j, bArr, i, i2);
        }
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f52520;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f52522.close();
    }
}
