package p067l;

/* JADX INFO: renamed from: l.۬ۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14582 implements InterfaceC5195 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41651a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f41652b;

    public /* synthetic */ C14582(int i, int i2) {
        this.f41651a = i2;
        this.f41652b = i;
    }

    @Override // p067l.InterfaceC5195
    /* JADX INFO: renamed from: s */
    public final InterfaceC17263 mo6954s(InterfaceC17263 interfaceC17263) {
        switch (this.f41651a) {
            case 0:
                int iMo6952l = interfaceC17263.mo6952l(EnumC19947.DAY_OF_WEEK);
                int i = this.f41652b;
                if (iMo6952l == i) {
                    return interfaceC17263;
                }
                int i2 = iMo6952l - i;
                return interfaceC17263.mo7153d(i2 >= 0 ? 7 - i2 : -i2, EnumC10559.DAYS);
            default:
                int iMo6952l2 = interfaceC17263.mo6952l(EnumC19947.DAY_OF_WEEK);
                int i3 = this.f41652b;
                if (iMo6952l2 == i3) {
                    return interfaceC17263;
                }
                int i4 = i3 - iMo6952l2;
                return interfaceC17263.mo16131w(i4 >= 0 ? 7 - i4 : -i4, EnumC10559.DAYS);
        }
    }
}
