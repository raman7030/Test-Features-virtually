package l;

/* JADX INFO: renamed from: l.ܶۛ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: A1E3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15051 extends ThreadLocal {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11459 f45939;

    public C15051(C11459 c11459) {
        this.f45939 = c11459;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        return this.f45939.matcher((CharSequence) "");
    }

    @Override // java.lang.ThreadLocal
    public final C12164 get() {
        C12164 c12164 = (C12164) super.get();
        C11003.requireNonNull(c12164);
        return c12164;
    }
}
