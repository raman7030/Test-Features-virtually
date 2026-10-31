package l;

/* JADX INFO: renamed from: l.۬ۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12851 implements InterfaceC2974 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ C12851(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // l.InterfaceC2974
    public final InterfaceC15672 s(InterfaceC15672 interfaceC15672) {
        switch (this.a) {
            case 0:
                int iL = interfaceC15672.l(EnumC18496.DAY_OF_WEEK);
                int i = this.b;
                if (iL == i) {
                    return interfaceC15672;
                }
                int i2 = iL - i;
                return interfaceC15672.d(i2 >= 0 ? 7 - i2 : -i2, EnumC8618.DAYS);
            default:
                int iL2 = interfaceC15672.l(EnumC18496.DAY_OF_WEEK);
                int i3 = this.b;
                if (iL2 == i3) {
                    return interfaceC15672;
                }
                int i4 = i3 - iL2;
                return interfaceC15672.w(i4 >= 0 ? 7 - i4 : -i4, EnumC8618.DAYS);
        }
    }
}
