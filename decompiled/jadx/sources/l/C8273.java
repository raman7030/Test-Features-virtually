package l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.۠ܺۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 16WT */
/* JADX INFO: loaded from: classes3.dex */
public final class C8273 extends FilterInputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final OutputStream f25441;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f25442;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C8273(InputStream inputStream, long j, OutputStream outputStream) {
        super(inputStream);
        this.f25441 = outputStream;
        this.f25442 = j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        try {
            C21679.m48948();
            int i3 = -1;
            if (this.f25442 == 0) {
                if (((FilterInputStream) this).in.read() == -1) {
                    return -1;
                }
                throw new IOException("Source grew during text append");
            }
            InputStream inputStream = ((FilterInputStream) this).in;
            int i4 = inputStream.read(bArr, i, (int) Math.min(i2, this.f25442));
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
            this.f25441.write(bArr, i, i3);
            this.f25442 -= (long) i3;
            return i3;
        } catch (C3059 e) {
            throw new C1217(e);
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
