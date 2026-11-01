package p067l;

/* JADX INFO: renamed from: l.ۙᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: M62C */
/* JADX INFO: loaded from: classes3.dex */
public final class C6937 extends AbstractC4783 implements InterfaceC14313 {

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC14313 f18045;

    /* JADX INFO: renamed from: ᩹ */
    public final int f18046;

    public C6937(int i, InterfaceC14313 interfaceC14313) {
        this.f18046 = i;
        this.f18045 = interfaceC14313;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C6937 m15899(InterfaceC20980 interfaceC20980) {
        InterfaceC14313 interfaceC14313M48963;
        if (interfaceC20980 instanceof C6937) {
            return (C6937) interfaceC20980;
        }
        int iMo5178 = interfaceC20980.mo5178();
        switch (iMo5178) {
            case 0:
            case 1:
            case 2:
            case 3:
                interfaceC14313M48963 = C21690.m48963((InterfaceC20309) interfaceC20980.mo5179());
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                interfaceC14313M48963 = C14983.m34337((InterfaceC7568) interfaceC20980.mo5179());
                break;
            default:
                throw new C17034(null, "Invalid method handle type: %d", Integer.valueOf(iMo5178));
        }
        return new C6937(iMo5178, interfaceC14313M48963);
    }

    @Override // p067l.InterfaceC20980
    /* JADX INFO: renamed from: ֫ۧ */
    public final int mo5178() {
        return this.f18046;
    }

    @Override // p067l.InterfaceC20980
    /* JADX INFO: renamed from: ᩻ۧ */
    public final InterfaceC10250 mo5179() {
        return this.f18045;
    }
}
