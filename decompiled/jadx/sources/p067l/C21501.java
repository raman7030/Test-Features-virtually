package p067l;

/* JADX INFO: renamed from: l.᩶ۧܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: OBBJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C21501 extends AbstractC25009 {

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC8225 f67808;

    @Override // p067l.InterfaceC14320
    /* JADX INFO: renamed from: ֫ */
    public final int mo11873() {
        return 8;
    }

    public C21501(AbstractC8225 abstractC8225) {
        super("ConstantValue");
        if ((abstractC8225 instanceof C14930) || (abstractC8225 instanceof C4873) || (abstractC8225 instanceof C10237) || (abstractC8225 instanceof C17612) || (abstractC8225 instanceof C22308)) {
            this.f67808 = abstractC8225;
        } else {
            if (abstractC8225 == null) {
                throw new NullPointerException("constantValue == null");
            }
            throw new IllegalArgumentException("bad type for constantValue");
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC8225 m48694() {
        return this.f67808;
    }
}
