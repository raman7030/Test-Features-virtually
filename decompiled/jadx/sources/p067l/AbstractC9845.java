package p067l;

/* JADX INFO: renamed from: l.۠֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AVK */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9845 {

    /* JADX INFO: renamed from: ۧ */
    public static final ThreadLocal f27314 = new ThreadLocal();

    /* JADX INFO: renamed from: ֫ */
    public static final ThreadLocal f27313 = new ThreadLocal();

    /* JADX INFO: renamed from: ֫ */
    public abstract void m23105();

    /* JADX INFO: renamed from: ֫ */
    public final char m23104(C7834 c7834, Object obj, char c) {
        ThreadLocal threadLocal = f27314;
        threadLocal.set(c7834);
        Character chValueOf = Character.valueOf(c);
        ThreadLocal threadLocal2 = f27313;
        threadLocal2.set(chValueOf);
        m23105();
        threadLocal.set(null);
        return ((Character) threadLocal2.get()).charValue();
    }
}
