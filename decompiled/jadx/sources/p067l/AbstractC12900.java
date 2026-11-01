package p067l;

/* JADX INFO: renamed from: l.ۧܶܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4S0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12900 {
    /* JADX INFO: renamed from: ֫ */
    public abstract int mo8463(Object obj);

    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo8464(Object obj, Object obj2);

    /* JADX INFO: renamed from: ۧ */
    public final boolean m29558(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return mo8464(obj, obj2);
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m29557(Object obj) {
        if (obj == null) {
            return 0;
        }
        return mo8463(obj);
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC12900 m29555() {
        return C9351.f25479;
    }

    /* JADX INFO: renamed from: ۧ */
    public static AbstractC12900 m29556() {
        return C4182.f9211;
    }
}
