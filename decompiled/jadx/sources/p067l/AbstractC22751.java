package p067l;

/* JADX INFO: renamed from: l.᩸۠֡, reason: contains not printable characters */
/* JADX INFO: compiled from: R4HY */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC22751 extends AbstractC10205 {

    /* JADX INFO: renamed from: ᩹ */
    public final int f71758;

    public AbstractC22751(int i, int i2) {
        super(i);
        this.f71758 = i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC22751 m50919(C16909 c16909, InterfaceC9838 interfaceC9838) {
        int iMo16884 = interfaceC9838.mo16884();
        switch (interfaceC9838.mo10470()) {
            case 3:
                return new C12022(iMo16884, c16909, (InterfaceC5145) interfaceC9838);
            case 4:
            default:
                throw new C17034(null, "Invalid debug item type: %d", Integer.valueOf(interfaceC9838.mo10470()));
            case 5:
                return new C23421(iMo16884, c16909, (InterfaceC16543) interfaceC9838);
            case 6:
                return new C14703(iMo16884, c16909, (InterfaceC21239) interfaceC9838);
            case 7:
                return new C21410(iMo16884, -4);
            case 8:
                return new C16714(iMo16884, -4);
            case 9:
                return new C14033(iMo16884, (InterfaceC6486) interfaceC9838);
            case 10:
                return C6657.m15160(iMo16884, (InterfaceC22580) interfaceC9838);
        }
    }

    @Override // p067l.AbstractC10205
    /* JADX INFO: renamed from: ۧ */
    public final double mo4019() {
        return this.f71758;
    }
}
