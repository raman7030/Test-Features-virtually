package p067l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.֫ܶܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4S0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4182 extends AbstractC12900 implements Serializable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ᩸ */
    public static final C4182 f9211 = new C4182();

    @Override // p067l.AbstractC12900
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo8464(Object obj, Object obj2) {
        return false;
    }

    @Override // p067l.AbstractC12900
    /* JADX INFO: renamed from: ֫ */
    public final int mo8463(Object obj) {
        return System.identityHashCode(obj);
    }

    private Object readResolve() {
        return f9211;
    }
}
