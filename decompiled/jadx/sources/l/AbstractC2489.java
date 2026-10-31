package l;

/* JADX INFO: renamed from: l.ۖۧۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0BM3 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2489 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C11459 f7935 = C11459.m28259(8, "^\\s*\\.class\\s+([a-z]+\\s+)*(L.+?;)");

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC6722 f7936;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract Object mo7979();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo7980(int i, int i2, InterfaceC20834 interfaceC20834);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo7982(C9170 c9170);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo7983(C12366 c12366, CharSequence charSequence);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m7978(CharSequence charSequence) {
        C12164 c12164Matcher = f7935.matcher(charSequence);
        if (c12164Matcher.find()) {
            return c12164Matcher.group(2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo7981(InterfaceC6722 interfaceC6722) {
        this.f7936 = interfaceC6722;
    }
}
