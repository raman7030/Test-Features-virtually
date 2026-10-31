package l;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 l.֡۠ۖ, still in use, count: 1, list:
  (r0v0 l.֡۠ۖ) from 0x002f: FILLED_NEW_ARRAY (r1v1 l.֡۠ۖ), (r0v0 l.֡۠ۖ), (r5v1 l.֡۠ۖ), (r4v1 l.֡۠ۖ) A[WRAPPED] elemType: l.֡۠ۖ
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: l.֡۠ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z23J */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC0282 {
    L(1),
    M(0),
    Q(3),
    H(2);


    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final EnumC0282[] f1626;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f1628;

    public static EnumC0282 valueOf(String str) {
        return (EnumC0282) Enum.valueOf(EnumC0282.class, str);
    }

    public static EnumC0282[] values() {
        return (EnumC0282[]) f1627.clone();
    }

    static {
        f1626 = new EnumC0282[]{enumC0282, new EnumC0282(1), enumC0282, new EnumC0282(3)};
    }

    public EnumC0282(int i) {
        super(str, i);
        this.f1628 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int m1624() {
        return this.f1628;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC0282 m1622(int i) {
        if (i >= 0) {
            EnumC0282[] enumC0282Arr = f1626;
            if (i < enumC0282Arr.length) {
                return enumC0282Arr[i];
            }
        }
        throw new IllegalArgumentException();
    }
}
