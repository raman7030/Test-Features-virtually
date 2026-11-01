package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۜᩳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: L3AO */
/* JADX INFO: loaded from: classes3.dex */
public final class C8944 implements InterfaceC7603 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C11627 f24241;

    /* JADX INFO: renamed from: ᩹ */
    public final C16989 f24242 = new C16989();

    public C8944(C11627 c11627) {
        this.f24241 = c11627;
    }

    @Override // p067l.InterfaceC7603
    /* JADX INFO: renamed from: ֫ */
    public final void mo10979(C14268 c14268, long j) {
        synchronized (this.f24241.f32448) {
            if (this.f24241.f32453) {
                throw new IllegalStateException("closed");
            }
            while (j > 0) {
                C11627 c11627 = this.f24241;
                if (c11627.f32450) {
                    throw new IOException("source is closed");
                }
                long j2 = c11627.f32449;
                C14268 c14269 = c11627.f32448;
                long j3 = j2 - c14269.f40649;
                if (j3 == 0) {
                    this.f24242.m38577(c14269);
                } else {
                    long jMin = Math.min(j3, j);
                    this.f24241.f32448.mo10979(c14268, jMin);
                    j -= jMin;
                    this.f24241.f32448.notifyAll();
                }
            }
        }
    }

    @Override // p067l.InterfaceC7603, java.io.Flushable
    public final void flush() {
        synchronized (this.f24241.f32448) {
            C11627 c11627 = this.f24241;
            if (c11627.f32453) {
                throw new IllegalStateException("closed");
            }
            if (c11627.f32450 && c11627.f32448.f40649 > 0) {
                throw new IOException("source is closed");
            }
        }
    }

    @Override // p067l.InterfaceC7603, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f24241.f32448) {
            C11627 c11627 = this.f24241;
            if (c11627.f32453) {
                return;
            }
            if (c11627.f32450 && c11627.f32448.f40649 > 0) {
                throw new IOException("source is closed");
            }
            c11627.f32453 = true;
            c11627.f32448.notifyAll();
        }
    }

    @Override // p067l.InterfaceC7603
    /* JADX INFO: renamed from: ۢ */
    public final C16989 mo10980() {
        return this.f24242;
    }
}
