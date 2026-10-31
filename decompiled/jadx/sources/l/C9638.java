package l;

/* JADX INFO: renamed from: l.ۢܳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes3.dex */
public final class C9638 extends AbstractC8932 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC8932 f29209;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final EnumC20927 f29210;

    public C9638(EnumC20927 enumC20927, AbstractC8932 abstractC8932) {
        this.f29210 = enumC20927;
        this.f29209 = abstractC8932;
    }

    public final String toString() {
        int iOrdinal = this.f29210.ordinal();
        if (iOrdinal == 0) {
            return "?";
        }
        AbstractC8932 abstractC8932 = this.f29209;
        if (iOrdinal == 1) {
            return "? extends " + abstractC8932;
        }
        if (iOrdinal == 2) {
            return "? super " + abstractC8932;
        }
        throw new AssertionError();
    }
}
