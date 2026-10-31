package l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.᩶᩻֨, reason: contains not printable characters */
/* JADX INFO: compiled from: B2OJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C20493 extends C21904 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f66065;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = ((FilterInputStream) this).in.read();
        if (i != -1) {
            long j = this.f66065;
            if (j >= 0) {
                this.f66065 = j + 1;
            }
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (i3 > 0) {
            long j = this.f66065;
            if (j >= 0) {
                this.f66065 = j + ((long) i3);
            }
        }
        return i3;
    }

    public C20493(InputStream inputStream) {
        super(inputStream);
        this.f66065 = 0L;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m46958() {
        return this.f66065;
    }
}
