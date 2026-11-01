package p067l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.۠ܺۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 16WT */
/* JADX INFO: loaded from: classes3.dex */
public final class C10231 extends FilterInputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ᩸ */
    public final OutputStream f28351;

    /* JADX INFO: renamed from: ᩹ */
    public long f28352;

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C10231(InputStream inputStream, long j, OutputStream outputStream) {
        super(inputStream);
        this.f28351 = outputStream;
        this.f28352 = j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        try {
            C22972.m51297();
            int i3 = -1;
            if (this.f28352 == 0) {
                if (((FilterInputStream) this).in.read() == -1) {
                    return -1;
                }
                throw new IOException("Source grew during text append");
            }
            InputStream inputStream = ((FilterInputStream) this).in;
            int i4 = inputStream.read(bArr, i, (int) Math.min(i2, this.f28352));
            if (i4 != 0) {
                i3 = i4;
            } else {
                int i5 = inputStream.read();
                if (i5 >= 0) {
                    bArr[i] = (byte) i5;
                    i3 = 1;
                }
            }
            if (i3 < 0) {
                throw new IOException("Source ended before its expected size");
            }
            this.f28351.write(bArr, i, i3);
            this.f28352 -= (long) i3;
            return i3;
        } catch (C5276 e) {
            throw new C3525(e);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }
}
