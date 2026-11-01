package p067l;

/* JADX INFO: renamed from: l.᩺ۢܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: P708 */
/* JADX INFO: loaded from: classes.dex */
public final class C24145 {

    /* JADX INFO: renamed from: ܽ */
    public static final C24145 f76580;

    /* JADX INFO: renamed from: ֫ */
    public final C16689 f76581;

    /* JADX INFO: renamed from: ۧ */
    public final C24320 f76582;

    static {
        EnumC13417 enumC13417 = EnumC13417.TEXT;
        f76580 = new C24145(null, null);
    }

    public C24145(C16689 c16689, C24320 c24320) {
        this.f76581 = c16689;
        this.f76582 = c24320;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C24145 m53390(C16689 c16689) {
        C24320 c24320M53658;
        if (c16689 == null) {
            c24320M53658 = null;
        } else {
            try {
                c24320M53658 = C24320.m53658(c16689);
            } catch (RuntimeException unused) {
                return f76580;
            }
        }
        if (c16689 != null) {
            c16689.m37809(C7026.f18306);
        }
        EnumC13417 enumC13417 = EnumC13417.TEXT;
        return new C24145(c16689, c24320M53658);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C16689 m53391() {
        return this.f76581;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C24320 m53392() {
        return this.f76582;
    }
}
