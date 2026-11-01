package p067l;

/* JADX INFO: renamed from: l.ۖۧۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0BM3 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4734 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩹ */
    public static final C13259 f10723 = C13259.m30303(8, "^\\s*\\.class\\s+([a-z]+\\s+)*(L.+?;)");

    /* JADX INFO: renamed from: ᩸ */
    public InterfaceC8757 f10724;

    /* JADX INFO: renamed from: ֫ */
    public abstract Object mo10027();

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo10028(int i, int i2, InterfaceC22169 interfaceC22169);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo10030(C11084 c11084);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo10031(C14121 c14121, CharSequence charSequence);

    /* JADX INFO: renamed from: ֫ */
    public static String m10026(CharSequence charSequence) {
        C13929 c13929Matcher = f10723.matcher(charSequence);
        if (c13929Matcher.find()) {
            return c13929Matcher.group(2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo10029(InterfaceC8757 interfaceC8757) {
        this.f10724 = interfaceC8757;
    }
}
