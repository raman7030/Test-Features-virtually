package l;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.᩻ۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23682 extends C1810 implements RandomAccess {
    public static final long serialVersionUID = 1530674583602358482L;

    @Override // l.C1810, java.util.List
    public final List subList(int i, int i2) {
        C23682 c23682;
        synchronized (this.b) {
            c23682 = new C23682(this.c.subList(i, i2), this.b);
        }
        return c23682;
    }

    private Object writeReplace() {
        return new C1810(this.c);
    }
}
