package l;

import java.util.Collection;

/* JADX INFO: renamed from: l.ۗۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 35MO */
/* JADX INFO: loaded from: classes3.dex */
public final class C3149 extends C16885 implements InterfaceC10122 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f9839;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23589 m9573(InterfaceC5471 interfaceC5471) {
        return ((C12321) interfaceC5471).f36874;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C12321 m9574(Object obj) {
        return ((C1032) obj).f3773;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C7382 m9575(InterfaceC5471 interfaceC5471) {
        return ((C12321) interfaceC5471).f36873;
    }

    @Override // l.InterfaceC4477
    /* JADX INFO: renamed from: ܳ */
    public final int mo8575(Object obj) {
        return ((C12321) obj).f36875;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C13026 m9576(InterfaceC5471 interfaceC5471) {
        return ((C12321) interfaceC5471).f36872;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C13026 m9578(Object obj) {
        return ((C1032) obj).f3773.f36872;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m9579(Object obj) {
        return ((C1032) obj).f3773.f36875;
    }

    public C3149(C19357 c19357) {
        super(c19357);
        this.f9839 = new ConcurrentMapC10942();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C12321 m9577(InterfaceC5471 interfaceC5471) {
        String string = interfaceC5471.toString();
        ConcurrentMapC10942 concurrentMapC10942 = this.f9839;
        C12321 c12321 = (C12321) concurrentMapC10942.get(string);
        if (c12321 != null) {
            return c12321;
        }
        C19357 c19357 = this.f51819;
        C23589 c23589M34448 = c19357.f68957.m34448(interfaceC5471.mo3566());
        C7382 c7382M33032 = ((C13731) c19357.f68948).m33032(interfaceC5471.getName());
        C5971 c5971 = c19357.f68928;
        c5971.getClass();
        C12321 c12322 = new C12321(c23589M34448, c7382M33032, c5971.m16734(new C3396(interfaceC5471.mo3568(), interfaceC5471.mo3565())));
        C12321 c12323 = (C12321) concurrentMapC10942.putIfAbsent(string, c12322);
        return c12323 == null ? c12322 : c12323;
    }

    @Override // l.InterfaceC4477
    /* JADX INFO: renamed from: ֫ */
    public final Collection mo8571() {
        return new C20083(this.f9839.values());
    }

    @Override // l.InterfaceC4477
    public final int getItemCount() {
        return this.f9839.size();
    }
}
