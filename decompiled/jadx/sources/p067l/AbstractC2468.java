package p067l;

/* JADX INFO: renamed from: l.֡֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAUJ */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2468 {

    /* JADX INFO: renamed from: ۧ */
    public static final ThreadLocal f3856 = new ThreadLocal();

    /* JADX INFO: renamed from: ֫ */
    public static final ThreadLocal f3855 = new ThreadLocal();

    /* JADX INFO: renamed from: ֫ */
    public abstract void m3489();

    /* JADX INFO: renamed from: ֫ */
    public final char m3488(C7834 c7834, Object obj, char c) {
        ThreadLocal threadLocal = f3856;
        threadLocal.set(c7834);
        Character chValueOf = Character.valueOf(c);
        ThreadLocal threadLocal2 = f3855;
        threadLocal2.set(chValueOf);
        m3489();
        threadLocal.set(null);
        return ((Character) threadLocal2.get()).charValue();
    }
}
