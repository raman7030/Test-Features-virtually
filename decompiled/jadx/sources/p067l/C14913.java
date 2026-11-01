package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۬ܶᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6QO */
/* JADX INFO: loaded from: classes3.dex */
public final class C14913 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩸ */
    public final int f42531;

    /* JADX INFO: renamed from: ᩹ */
    public final C9927 f42532;

    public C14913(C9927 c9927, int i) {
        this.f42532 = c9927;
        this.f42531 = i;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f42532.close();
    }
}
