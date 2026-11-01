package p067l;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.֨ۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y17M */
/* JADX INFO: loaded from: classes2.dex */
public final class C3329 implements InterfaceC7353 {

    /* JADX INFO: renamed from: ᩸ */
    public final C24618 f6506;

    public C3329(AbstractC17043 abstractC17043) {
        C24618 c24618M38671 = abstractC17043.m38671("rw");
        this.f6506 = c24618M38671;
        c24618M38671.setLength(0L);
    }

    @Override // p067l.InterfaceC7353
    /* JADX INFO: renamed from: ֨ */
    public final OutputStream mo5811(int i) {
        return new C3160(i, this.f6506);
    }

    @Override // p067l.InterfaceC7353
    /* JADX INFO: renamed from: ۚ */
    public final InputStream mo5812(int i) {
        return new C7184(i, this.f6506);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f6506.close();
    }
}
