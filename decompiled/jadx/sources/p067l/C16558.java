package p067l;

import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;

/* JADX INFO: renamed from: l.ܶۖ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 84T7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16558 extends FilterOutputStream {

    /* JADX INFO: renamed from: ᩸ */
    public boolean f48630;

    public C16558(BufferedOutputStream bufferedOutputStream) {
        super(bufferedOutputStream);
        this.f48630 = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        while (true) {
            int i3 = i2 - 1;
            if (i2 > 0) {
                int i4 = i + 1;
                write(bArr[i]);
                i = i4;
                i2 = i3;
            }
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final synchronized void write(int i) {
        try {
            if (i != 10) {
                if (i == 13) {
                    this.f48630 = true;
                    ((FilterOutputStream) this).out.write(13);
                    return;
                }
            } else if (!this.f48630) {
                ((FilterOutputStream) this).out.write(13);
            }
            this.f48630 = false;
            ((FilterOutputStream) this).out.write(i);
        } catch (Throwable th) {
            throw th;
        }
    }
}
