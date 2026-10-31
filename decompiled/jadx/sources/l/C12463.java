package l;

/* JADX INFO: renamed from: l.۫ܳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 82T8 */
/* JADX INFO: loaded from: classes4.dex */
public class C12463 implements InterfaceC18380 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16696 f37471;

    public C12463(C16696 c16696) {
        this.f37471 = c16696;
    }

    @Override // l.InterfaceC18380
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public InterfaceC22677 mo4329(InterfaceC22677 interfaceC22677) {
        if (!(interfaceC22677 instanceof InterfaceC10952)) {
            return interfaceC22677;
        }
        switch (C0468.f2039[interfaceC22677.mo3975().f3316.ordinal()]) {
            case 1:
                return new C8230(this, (InterfaceC0367) interfaceC22677);
            case 2:
                return new C15284(this, (InterfaceC1073) interfaceC22677);
            case 3:
                return new C21636(this, (InterfaceC4601) interfaceC22677);
            case 4:
                return new C22341(this, (InterfaceC22945) interfaceC22677);
            case 5:
                return new C20225(this, (InterfaceC11116) interfaceC22677);
            case 6:
                return new C4702(this, (InterfaceC17465) interfaceC22677);
            case 7:
                return new C3291(this, (InterfaceC6882) interfaceC22677);
            case 8:
                return new C13168(this, (InterfaceC20994) interfaceC22677);
            default:
                throw new IllegalArgumentException(interfaceC22677.mo3975().f3315);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC8293 m30619(C12463 c12463, int i, InterfaceC8293 interfaceC8293) {
        C16696 c16696 = c12463.f37471;
        switch (i) {
            case 0:
                return (InterfaceC8293) c16696.m39246().mo4329((InterfaceC15347) interfaceC8293);
            case 1:
                return new C19086(c16696.m39233(), (InterfaceC21699) interfaceC8293);
            case 2:
                return (InterfaceC8293) c16696.m39237().mo4329((InterfaceC18877) interfaceC8293);
            case 3:
                return (InterfaceC8293) c16696.m39235().mo4329((InterfaceC5471) interfaceC8293);
            case 4:
                return new C1446(c16696.m39233(), (InterfaceC0531) interfaceC8293);
            case 5:
                C3375 c3375M39243 = c16696.m39243();
                c3375M39243.getClass();
                return new C4786(c3375M39243, (InterfaceC4060) interfaceC8293);
            case 6:
                return C21908.m49312((InterfaceC19583) interfaceC8293, c16696);
            default:
                throw new C15431(null, "Invalid reference type: %d", Integer.valueOf(i));
        }
    }
}
