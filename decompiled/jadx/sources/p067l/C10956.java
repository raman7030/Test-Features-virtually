package p067l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۡᩳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: O4DO */
/* JADX INFO: loaded from: classes3.dex */
public final class C10956 extends OutputStream {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C17660 f30344;

    public C10956(C17660 c17660) {
        this.f30344 = c17660;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        C17660 c17660 = this.f30344;
        if (c17660.f52745) {
            throw new IOException("closed");
        }
        c17660.f52744.m56480writeByte((int) ((byte) i));
        c17660.mo28277();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        C17660 c17660 = this.f30344;
        if (c17660.f52745) {
            throw new IOException("closed");
        }
        c17660.f52744.write(bArr, i, i2);
        c17660.mo28277();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        C17660 c17660 = this.f30344;
        if (c17660.f52745) {
            return;
        }
        c17660.flush();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        this.f30344.close();
    }

    public final String toString() {
        return this.f30344 + ".outputStream()";
    }
}
