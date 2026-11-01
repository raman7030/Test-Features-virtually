package p067l;

/* JADX INFO: renamed from: l.ۧ᩸ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: G1PO */
/* JADX INFO: loaded from: classes3.dex */
public final class C13081 extends ThreadLocal {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f36772;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f36773;

    public C13081(boolean z, boolean z2) {
        this.f36772 = z;
        this.f36773 = z2;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        C23616 c23616 = new C23616();
        c23616.f75164 = false;
        c23616.f75168 = true;
        c23616.f75166 = true ^ this.f36772;
        c23616.f75169 = this.f36773;
        return c23616;
    }

    @Override // java.lang.ThreadLocal
    public final C23616 get() {
        C23616 c23616 = (C23616) super.get();
        C12826.requireNonNull(c23616);
        return c23616;
    }
}
