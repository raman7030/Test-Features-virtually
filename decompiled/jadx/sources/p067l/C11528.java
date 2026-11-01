package p067l;

/* JADX INFO: renamed from: l.ۢܳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes3.dex */
public final class C11528 extends AbstractC10857 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC10857 f32158;

    /* JADX INFO: renamed from: ۧ */
    public final EnumC22257 f32159;

    public C11528(EnumC22257 enumC22257, AbstractC10857 abstractC10857) {
        this.f32159 = enumC22257;
        this.f32158 = abstractC10857;
    }

    public final String toString() {
        int iOrdinal = this.f32159.ordinal();
        if (iOrdinal == 0) {
            return "?";
        }
        AbstractC10857 abstractC10857 = this.f32158;
        if (iOrdinal == 1) {
            return "? extends " + abstractC10857;
        }
        if (iOrdinal == 2) {
            return "? super " + abstractC10857;
        }
        throw new AssertionError();
    }
}
