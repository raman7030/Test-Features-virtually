package p067l;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.᩻ۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C24876 extends C4089 implements RandomAccess {
    public static final long serialVersionUID = 1530674583602358482L;

    @Override // p067l.C4089, java.util.List
    public final List subList(int i, int i2) {
        C24876 c24876;
        synchronized (this.f76380b) {
            c24876 = new C24876(this.f9017c.subList(i, i2), this.f76380b);
        }
        return c24876;
    }

    private Object writeReplace() {
        return new C4089(this.f9017c);
    }
}
