package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۜᩳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: L3AO */
/* JADX INFO: loaded from: classes3.dex */
public final class C6919 implements InterfaceC5508 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9742 f21360;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C15384 f21361 = new C15384();

    public C6919(C9742 c9742) {
        this.f21360 = c9742;
    }

    @Override // l.InterfaceC5508
    /* JADX INFO: renamed from: ֫ */
    public final void mo8911(C12521 c12521, long j) {
        synchronized (this.f21360.f29497) {
            if (this.f21360.f29502) {
                throw new IllegalStateException("closed");
            }
            while (j > 0) {
                C9742 c9742 = this.f21360;
                if (c9742.f29499) {
                    throw new IOException("source is closed");
                }
                long j2 = c9742.f29498;
                C12521 c12522 = c9742.f29497;
                long j3 = j2 - c12522.f37625;
                if (j3 == 0) {
                    this.f21361.m36419(c12522);
                } else {
                    long jMin = Math.min(j3, j);
                    this.f21360.f29497.mo8911(c12521, jMin);
                    j -= jMin;
                    this.f21360.f29497.notifyAll();
                }
            }
        }
    }

    @Override // l.InterfaceC5508, java.io.Flushable
    public final void flush() {
        synchronized (this.f21360.f29497) {
            C9742 c9742 = this.f21360;
            if (c9742.f29502) {
                throw new IllegalStateException("closed");
            }
            if (c9742.f29499 && c9742.f29497.f37625 > 0) {
                throw new IOException("source is closed");
            }
        }
    }

    @Override // l.InterfaceC5508, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f21360.f29497) {
            C9742 c9742 = this.f21360;
            if (c9742.f29502) {
                return;
            }
            if (c9742.f29499 && c9742.f29497.f37625 > 0) {
                throw new IOException("source is closed");
            }
            c9742.f29502 = true;
            c9742.f29497.notifyAll();
        }
    }

    @Override // l.InterfaceC5508
    /* JADX INFO: renamed from: ۢ */
    public final C15384 mo8912() {
        return this.f21361;
    }
}
