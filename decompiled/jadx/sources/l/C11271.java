package l;

/* JADX INFO: renamed from: l.ۧ᩸ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: G1PO */
/* JADX INFO: loaded from: classes3.dex */
public final class C11271 extends ThreadLocal {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f33772;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f33773;

    public C11271(boolean z, boolean z2) {
        this.f33772 = z;
        this.f33773 = z2;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        C22357 c22357 = new C22357();
        c22357.f72438 = false;
        c22357.f72442 = true;
        c22357.f72440 = true ^ this.f33772;
        c22357.f72443 = this.f33773;
        return c22357;
    }

    @Override // java.lang.ThreadLocal
    public final C22357 get() {
        C22357 c22357 = (C22357) super.get();
        C11003.requireNonNull(c22357);
        return c22357;
    }
}
