package p067l;

/* JADX INFO: renamed from: l.᩸۫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56OY */
/* JADX INFO: loaded from: classes4.dex */
public final class C22877 {

    /* JADX INFO: renamed from: ۧ */
    public static final C22877 f72012;

    /* JADX INFO: renamed from: ֫ */
    public final EnumC16840 f72013;

    static {
        new C22877(EnumC16840.PRESERVE_TEXT);
        f72012 = new C22877(EnumC16840.READABLE);
    }

    public C22877(EnumC16840 enumC16840) {
        if (enumC16840 == null) {
            throw new NullPointerException("whitespacePolicy");
        }
        this.f72013 = enumC16840;
    }

    /* JADX INFO: renamed from: ֫ */
    public final EnumC16840 m51092() {
        return this.f72013;
    }
}
