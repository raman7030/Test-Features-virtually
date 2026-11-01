package p067l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.۟۠ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4S0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9351 extends AbstractC12900 implements Serializable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ᩸ */
    public static final C9351 f25479 = new C9351();

    @Override // p067l.AbstractC12900
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo8464(Object obj, Object obj2) {
        return obj.equals(obj2);
    }

    @Override // p067l.AbstractC12900
    /* JADX INFO: renamed from: ֫ */
    public final int mo8463(Object obj) {
        return obj.hashCode();
    }

    private Object readResolve() {
        return f25479;
    }
}
