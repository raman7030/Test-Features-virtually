package l;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܽ֫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 9443 */
/* JADX INFO: loaded from: classes5.dex */
public class C16321 extends AbstractC23104 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f50255;

    /* JADX INFO: renamed from: ֫ */
    public void mo28453() {
        throw null;
    }

    @Override // l.AbstractC23104, l.InterfaceC5508
    /* JADX INFO: renamed from: ֫ */
    public final void mo8911(C12521 c12521, long j) throws EOFException {
        if (this.f50255) {
            c12521.skip(j);
            return;
        }
        try {
            super.mo8911(c12521, j);
        } catch (IOException unused) {
            this.f50255 = true;
            mo28453();
        }
    }

    @Override // l.AbstractC23104, l.InterfaceC5508, java.io.Flushable
    public final void flush() {
        if (this.f50255) {
            return;
        }
        try {
            super.flush();
        } catch (IOException unused) {
            this.f50255 = true;
            mo28453();
        }
    }

    @Override // l.AbstractC23104, l.InterfaceC5508, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f50255) {
            return;
        }
        try {
            super.close();
        } catch (IOException unused) {
            this.f50255 = true;
            mo28453();
        }
    }
}
