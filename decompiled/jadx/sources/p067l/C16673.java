package p067l;

/* JADX INFO: renamed from: l.ܶۛ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: A1E3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16673 extends ThreadLocal {

    /* JADX INFO: renamed from: ֫ */
    public final C13259 f49057;

    public C16673(C13259 c13259) {
        this.f49057 = c13259;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        return this.f49057.matcher((CharSequence) "");
    }

    @Override // java.lang.ThreadLocal
    public final C13929 get() {
        C13929 c13929 = (C13929) super.get();
        C12826.requireNonNull(c13929);
        return c13929;
    }
}
