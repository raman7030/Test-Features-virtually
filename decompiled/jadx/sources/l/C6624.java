package l;

/* JADX INFO: renamed from: l.ۜ۟ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1BJ4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6624 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C23035 f20394;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20736 f20395;

    public C6624(C20736 c20736) {
        this.f20395 = c20736;
        C10858 c10858 = c20736.f66760;
        c10858.getClass();
        this.f20394 = new C23035(c10858);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18156(C11747 c11747) {
        this.f20394.m51204(c11747);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f20394.m51205()) {
            C20736.m47347(this.f20395);
        }
    }
}
