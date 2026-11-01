package p067l;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܽ֫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 9443 */
/* JADX INFO: loaded from: classes5.dex */
public class C17879 extends AbstractC24326 {

    /* JADX INFO: renamed from: ᩹ */
    public boolean f53427;

    /* JADX INFO: renamed from: ֫ */
    public void mo30499() {
        throw null;
    }

    @Override // p067l.AbstractC24326, p067l.InterfaceC7603
    /* JADX INFO: renamed from: ֫ */
    public final void mo10979(C14268 c14268, long j) throws EOFException {
        if (this.f53427) {
            c14268.skip(j);
            return;
        }
        try {
            super.mo10979(c14268, j);
        } catch (IOException unused) {
            this.f53427 = true;
            mo30499();
        }
    }

    @Override // p067l.AbstractC24326, p067l.InterfaceC7603, java.io.Flushable
    public final void flush() {
        if (this.f53427) {
            return;
        }
        try {
            super.flush();
        } catch (IOException unused) {
            this.f53427 = true;
            mo30499();
        }
    }

    @Override // p067l.AbstractC24326, p067l.InterfaceC7603, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f53427) {
            return;
        }
        try {
            super.close();
        } catch (IOException unused) {
            this.f53427 = true;
            mo30499();
        }
    }
}
