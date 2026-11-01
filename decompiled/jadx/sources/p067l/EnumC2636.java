package p067l;

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
public final class EnumC2636 {
    L(1),
    M(0),
    Q(3),
    H(2);


    /* JADX INFO: renamed from: ᩶ */
    public static final EnumC2636[] f4404;

    /* JADX INFO: renamed from: ᩸ */
    public final int f4406;

    public static EnumC2636 valueOf(String str) {
        return (EnumC2636) Enum.valueOf(EnumC2636.class, str);
    }

    public static EnumC2636[] values() {
        return (EnumC2636[]) f4405.clone();
    }

    static {
        f4404 = new EnumC2636[]{enumC2636, new EnumC2636(1), enumC2636, new EnumC2636(3)};
    }

    public EnumC2636(int i) {
        super(str, i);
        this.f4406 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public int m4024() {
        return this.f4406;
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC2636 m4022(int i) {
        if (i >= 0) {
            EnumC2636[] enumC2636Arr = f4404;
            if (i < enumC2636Arr.length) {
                return enumC2636Arr[i];
            }
        }
        throw new IllegalArgumentException();
    }
}
