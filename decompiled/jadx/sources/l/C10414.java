package l;

/* JADX INFO: renamed from: l.ۤܽۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1EE */
/* JADX INFO: loaded from: classes3.dex */
public final class C10414 extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        return new C22706();
    }

    @Override // java.lang.ThreadLocal
    public final C22706 get() {
        C22706 c22706 = (C22706) super.get();
        C11003.requireNonNull(c22706);
        c22706.m50718();
        return c22706;
    }
}
