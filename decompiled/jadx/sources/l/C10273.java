package l;

/* JADX INFO: renamed from: l.ۤۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 45RK */
/* JADX INFO: loaded from: classes3.dex */
public final class C10273 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f30943 = new C12389();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static char[] m26025() {
        char[] cArr = (char[]) f30943.get();
        C11003.requireNonNull(cArr);
        return cArr;
    }
}
