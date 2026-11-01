package p067l;

import java.io.EOFException;

/* JADX INFO: renamed from: l.ܿᩳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: J4DP */
/* JADX INFO: loaded from: classes5.dex */
public final class C19002 implements InterfaceC7603 {
    @Override // p067l.InterfaceC7603, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // p067l.InterfaceC7603, java.io.Flushable
    public final void flush() {
    }

    @Override // p067l.InterfaceC7603
    /* JADX INFO: renamed from: ֫ */
    public final void mo10979(C14268 c14268, long j) throws EOFException {
        c14268.skip(j);
    }

    @Override // p067l.InterfaceC7603
    /* JADX INFO: renamed from: ۢ */
    public final C16989 mo10980() {
        return C16989.f50239;
    }
}
