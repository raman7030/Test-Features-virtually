package p067l;

/* JADX INFO: renamed from: l.ۡܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: EBG3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10908 extends AbstractC16941 {
    @Override // p067l.AbstractC15405
    /* JADX INFO: renamed from: ᩻ */
    public final String mo10336() {
        return "field";
    }

    /* JADX INFO: renamed from: ֫ */
    public static C10908 m25164(C9566 c9566) {
        C14260 c14260;
        C14260 c14261 = C14260.f40621;
        switch (c9566.mo7484()) {
            case 0:
                c14260 = C14260.f40624;
                break;
            case 1:
                c14260 = C14260.f40623;
                break;
            case 2:
                c14260 = C14260.f40607;
                break;
            case 3:
                c14260 = C14260.f40616;
                break;
            case 4:
                c14260 = C14260.f40609;
                break;
            case 5:
                c14260 = C14260.f40625;
                break;
            case 6:
                c14260 = C14260.f40611;
                break;
            case 7:
                c14260 = C14260.f40614;
                break;
            case 8:
                c14260 = C14260.f40619;
                break;
            default:
                throw new IllegalArgumentException("not primitive: " + c9566);
        }
        return new C10908(c14260, C21637.f68193);
    }

    public C10908(C14260 c14260, C21637 c21637) {
        super(c14260, c21637);
    }

    @Override // p067l.InterfaceC3830
    public final C9566 getType() {
        return m38522().m48855();
    }

    @Override // p067l.AbstractC16941, p067l.AbstractC15405
    /* JADX INFO: renamed from: ۧ */
    public final int mo4595(AbstractC15405 abstractC15405) {
        int iMo4595 = super.mo4595(abstractC15405);
        return iMo4595 != 0 ? iMo4595 : m38522().m48854().compareTo(((C10908) abstractC15405).m38522().m48854());
    }
}
