package l;

/* JADX INFO: renamed from: l.۠֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AVK */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7867 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f24398 = new ThreadLocal();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f24397 = new ThreadLocal();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void m21140();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final char m21139(C5751 c5751, Object obj, char c) {
        ThreadLocal threadLocal = f24398;
        threadLocal.set(c5751);
        Character chValueOf = Character.valueOf(c);
        ThreadLocal threadLocal2 = f24397;
        threadLocal2.set(chValueOf);
        m21140();
        threadLocal.set(null);
        return ((Character) threadLocal2.get()).charValue();
    }
}
