package l;

/* JADX INFO: renamed from: l.ۙᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: M62C */
/* JADX INFO: loaded from: classes3.dex */
public final class C4807 extends AbstractC2541 implements InterfaceC12568 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC12568 f15212;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f15213;

    public C4807(int i, InterfaceC12568 interfaceC12568) {
        this.f15213 = i;
        this.f15212 = interfaceC12568;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C4807 m14019(InterfaceC19583 interfaceC19583) {
        InterfaceC12568 interfaceC12568M46640;
        if (interfaceC19583 instanceof C4807) {
            return (C4807) interfaceC19583;
        }
        int iMo2849 = interfaceC19583.mo2849();
        switch (iMo2849) {
            case 0:
            case 1:
            case 2:
            case 3:
                interfaceC12568M46640 = C20330.m46640((InterfaceC18877) interfaceC19583.mo2850());
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                interfaceC12568M46640 = C13273.m32238((InterfaceC5471) interfaceC19583.mo2850());
                break;
            default:
                throw new C15431(null, "Invalid method handle type: %d", Integer.valueOf(iMo2849));
        }
        return new C4807(iMo2849, interfaceC12568M46640);
    }

    @Override // l.InterfaceC19583
    /* JADX INFO: renamed from: ֫ۧ */
    public final int mo2849() {
        return this.f15213;
    }

    @Override // l.InterfaceC19583
    /* JADX INFO: renamed from: ᩻ۧ */
    public final InterfaceC8293 mo2850() {
        return this.f15212;
    }
}
