package p067l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.᩶᩻֨, reason: contains not printable characters */
/* JADX INFO: compiled from: B2OJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C21845 extends C23186 {

    /* JADX INFO: renamed from: ᩸ */
    public long f68744;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = ((FilterInputStream) this).in.read();
        if (i != -1) {
            long j = this.f68744;
            if (j >= 0) {
                this.f68744 = j + 1;
            }
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (i3 > 0) {
            long j = this.f68744;
            if (j >= 0) {
                this.f68744 = j + ((long) i3);
            }
        }
        return i3;
    }

    public C21845(InputStream inputStream) {
        super(inputStream);
        this.f68744 = 0L;
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m49281() {
        return this.f68744;
    }
}
