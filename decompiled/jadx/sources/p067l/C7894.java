package p067l;

/* JADX INFO: renamed from: l.ۛۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: NATX */
/* JADX INFO: loaded from: classes2.dex */
public final class C7894 extends ThreadLocal {

    /* JADX INFO: renamed from: ֫ */
    public final C13259 f20710;

    public C7894(C13259 c13259) {
        this.f20710 = c13259;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        return this.f20710.matcher((CharSequence) "");
    }

    @Override // java.lang.ThreadLocal
    public final C13929 get() {
        C13929 c13929 = (C13929) super.get();
        C12826.requireNonNull(c13929);
        return c13929;
    }
}
