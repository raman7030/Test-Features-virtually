package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.۟۠ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4S0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7347 extends AbstractC11081 implements Serializable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C7347 f22566 = new C7347();

    @Override // l.AbstractC11081
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo6262(Object obj, Object obj2) {
        return obj.equals(obj2);
    }

    @Override // l.AbstractC11081
    /* JADX INFO: renamed from: ֫ */
    public final int mo6261(Object obj) {
        return obj.hashCode();
    }

    private Object readResolve() {
        return f22566;
    }
}
