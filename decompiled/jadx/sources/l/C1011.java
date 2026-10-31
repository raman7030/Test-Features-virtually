package l;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.֨ۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y17M */
/* JADX INFO: loaded from: classes2.dex */
public final class C1011 implements InterfaceC5245 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C23411 f3732;

    public C1011(AbstractC15440 abstractC15440) {
        C23411 c23411M36513 = abstractC15440.m36513("rw");
        this.f3732 = c23411M36513;
        c23411M36513.setLength(0L);
    }

    @Override // l.InterfaceC5245
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final OutputStream mo3524(int i) {
        return new C0833(i, this.f3732);
    }

    @Override // l.InterfaceC5245
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InputStream mo3525(int i) {
        return new C5067(i, this.f3732);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3732.close();
    }
}
