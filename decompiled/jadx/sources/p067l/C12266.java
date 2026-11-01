package p067l;

/* JADX INFO: renamed from: l.ۤܽۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1EE */
/* JADX INFO: loaded from: classes3.dex */
public final class C12266 extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        return new C23948();
    }

    @Override // java.lang.ThreadLocal
    public final C23948 get() {
        C23948 c23948 = (C23948) super.get();
        C12826.requireNonNull(c23948);
        c23948.m53044();
        return c23948;
    }
}
