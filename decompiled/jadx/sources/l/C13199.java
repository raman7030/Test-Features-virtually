package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۬ܶᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6QO */
/* JADX INFO: loaded from: classes3.dex */
public final class C13199 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f39467;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C7953 f39468;

    public C13199(C7953 c7953, int i) {
        this.f39468 = c7953;
        this.f39467 = i;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f39468.close();
    }
}
