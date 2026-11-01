package p067l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ۤ۬ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5608 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12170 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩸ */
    public final Object[] f34007;

    public C12170(Object[] objArr) {
        this.f34007 = objArr;
    }

    public Object readResolve() {
        return AbstractC8146.m18922(this.f34007);
    }
}
