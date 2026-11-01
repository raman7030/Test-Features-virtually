package p067l;

/* JADX INFO: renamed from: l.ۜ۟ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1BJ4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8664 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩸ */
    public final C24261 f23270;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C22076 f23271;

    public C8664(C22076 c22076) {
        this.f23271 = c22076;
        C12688 c12688 = c22076.f69441;
        c12688.getClass();
        this.f23270 = new C24261(c12688);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20108(C13533 c13533) {
        this.f23270.m53597(c13533);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f23270.m53598()) {
            C22076.m49674(this.f23271);
        }
    }
}
