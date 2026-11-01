package p067l;

import java.io.Closeable;

/* JADX INFO: renamed from: l.ۚۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6VA */
/* JADX INFO: loaded from: classes2.dex */
public final class C7216 implements Closeable {

    /* JADX INFO: renamed from: ᩸ */
    public Closeable f18836;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        Closeable closeable = this.f18836;
        if (closeable == null) {
            return;
        }
        this.f18836 = null;
        closeable.close();
    }

    public C7216(Closeable closeable) {
        this.f18836 = closeable;
    }
}
