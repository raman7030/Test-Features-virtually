package l;

/* JADX INFO: renamed from: l.ۛۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: NATX */
/* JADX INFO: loaded from: classes2.dex */
public final class C5814 extends ThreadLocal {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11459 f17858;

    public C5814(C11459 c11459) {
        this.f17858 = c11459;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        return this.f17858.matcher((CharSequence) "");
    }

    @Override // java.lang.ThreadLocal
    public final C12164 get() {
        C12164 c12164 = (C12164) super.get();
        C11003.requireNonNull(c12164);
        return c12164;
    }
}
