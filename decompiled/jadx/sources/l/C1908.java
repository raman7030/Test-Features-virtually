package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.֫ܶܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4S0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1908 extends AbstractC11081 implements Serializable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C1908 f6431 = new C1908();

    @Override // l.AbstractC11081
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo6262(Object obj, Object obj2) {
        return false;
    }

    @Override // l.AbstractC11081
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo6261(Object obj) {
        return System.identityHashCode(obj);
    }

    private Object readResolve() {
        return f6431;
    }
}
