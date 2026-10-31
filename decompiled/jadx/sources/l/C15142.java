package l;

import java.util.Collection;

/* JADX INFO: renamed from: l.ܶۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z69Q */
/* JADX INFO: loaded from: classes5.dex */
public final class C15142 extends C16885 implements InterfaceC12238 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f46274;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18672 m35846(InterfaceC19583 interfaceC19583) {
        return (C18672) ((C21494) interfaceC19583).f69143;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C12321 m35847(InterfaceC19583 interfaceC19583) {
        return (C12321) ((C21494) interfaceC19583).f69143;
    }

    @Override // l.InterfaceC4477
    /* JADX INFO: renamed from: ܳ */
    public final int mo8575(Object obj) {
        return ((C21494) obj).f69142;
    }

    public C15142(C19357 c19357) {
        super(c19357);
        this.f46274 = new ConcurrentMapC10942();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C21494 m35848(InterfaceC19583 interfaceC19583) {
        InterfaceC11616 interfaceC11616M11615;
        ConcurrentMapC10942 concurrentMapC10942 = this.f46274;
        C21494 c21494 = (C21494) concurrentMapC10942.get(interfaceC19583);
        if (c21494 != null) {
            return c21494;
        }
        int iMo2849 = interfaceC19583.mo2849();
        C19357 c19357 = this.f51819;
        switch (iMo2849) {
            case 0:
            case 1:
            case 2:
            case 3:
                interfaceC11616M11615 = c19357.f68924.m11615((InterfaceC18877) interfaceC19583.mo2850());
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                interfaceC11616M11615 = c19357.f68923.m9577((InterfaceC5471) interfaceC19583.mo2850());
                break;
            default:
                throw new C15431(null, "Invalid method handle type: %d", Integer.valueOf(interfaceC19583.mo2849()));
        }
        C21494 c21495 = new C21494(interfaceC19583.mo2849(), interfaceC11616M11615);
        C21494 c21496 = (C21494) concurrentMapC10942.putIfAbsent(c21495, c21495);
        return c21496 == null ? c21495 : c21496;
    }

    @Override // l.InterfaceC4477
    /* JADX INFO: renamed from: ֫ */
    public final Collection mo8571() {
        return new C8088(this.f46274.values());
    }

    @Override // l.InterfaceC4477
    public final int getItemCount() {
        return this.f46274.size();
    }
}
