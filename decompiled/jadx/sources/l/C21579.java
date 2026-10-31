package l;

/* JADX INFO: renamed from: l.᩸۫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56OY */
/* JADX INFO: loaded from: classes4.dex */
public final class C21579 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C21579 f69310;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC15227 f69311;

    static {
        new C21579(EnumC15227.PRESERVE_TEXT);
        f69310 = new C21579(EnumC15227.READABLE);
    }

    public C21579(EnumC15227 enumC15227) {
        if (enumC15227 == null) {
            throw new NullPointerException("whitespacePolicy");
        }
        this.f69311 = enumC15227;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC15227 m48746() {
        return this.f69311;
    }
}
