package l;

/* JADX INFO: renamed from: l.ܶ᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 26UL */
/* JADX INFO: loaded from: classes4.dex */
public final class C15525 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C19489 f47457;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C11002 f47458;

    public C15525(C11002 c11002, C19489 c19489) {
        this.f47457 = c19489;
        this.f47458 = c19489 != null ? c19489.m44896() : c11002;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C19489 c19489 = this.f47457;
        if (c19489 != null) {
            c19489.close();
        }
    }
}
