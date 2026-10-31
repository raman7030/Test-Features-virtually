package l;

/* JADX INFO: renamed from: l.᩶ۧܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: OBBJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C20131 extends AbstractC23822 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC6162 f65169;

    @Override // l.InterfaceC12575
    /* JADX INFO: renamed from: ֫ */
    public final int mo9828() {
        return 8;
    }

    public C20131(AbstractC6162 abstractC6162) {
        super("ConstantValue");
        if ((abstractC6162 instanceof C13217) || (abstractC6162 instanceof C2635) || (abstractC6162 instanceof C8279) || (abstractC6162 instanceof C16039) || (abstractC6162 instanceof C20980)) {
            this.f65169 = abstractC6162;
        } else {
            if (abstractC6162 == null) {
                throw new NullPointerException("constantValue == null");
            }
            throw new IllegalArgumentException("bad type for constantValue");
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC6162 m46378() {
        return this.f65169;
    }
}
