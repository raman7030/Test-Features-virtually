package l;

import java.util.Collection;

/* JADX INFO: renamed from: l.ۘۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 963I */
/* JADX INFO: loaded from: classes3.dex */
public final class C3855 extends C16885 implements InterfaceC20000 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f12306;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23589 m11612(InterfaceC18877 interfaceC18877) {
        return ((C18672) interfaceC18877).f59006;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C23589 m11613(InterfaceC18877 interfaceC18877) {
        return ((C18672) interfaceC18877).f59007;
    }

    @Override // l.InterfaceC4477
    /* JADX INFO: renamed from: ܳ */
    public final int mo8575(Object obj) {
        return ((C18672) obj).f59005;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C7382 m11614(InterfaceC18877 interfaceC18877) {
        return ((C18672) interfaceC18877).f59004;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m11616(Object obj) {
        return ((C15848) obj).f48961.f59005;
    }

    public C3855(C19357 c19357) {
        super(c19357);
        this.f12306 = new ConcurrentMapC10942();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C18672 m11615(InterfaceC18877 interfaceC18877) {
        ConcurrentMapC10942 concurrentMapC10942 = this.f12306;
        C18672 c18672 = (C18672) concurrentMapC10942.get(interfaceC18877);
        if (c18672 != null) {
            return c18672;
        }
        C19357 c19357 = this.f51819;
        C18672 c18673 = new C18672(c19357.f68957.m34448(interfaceC18877.mo8192()), ((C13731) c19357.f68948).m33032(interfaceC18877.getName()), c19357.f68957.m34448(interfaceC18877.getType()));
        C18672 c18674 = (C18672) concurrentMapC10942.putIfAbsent(c18673, c18673);
        return c18674 == null ? c18673 : c18674;
    }

    @Override // l.InterfaceC4477
    /* JADX INFO: renamed from: ֫ */
    public final Collection mo8571() {
        return new C2444(this.f12306.values());
    }

    @Override // l.InterfaceC4477
    public final int getItemCount() {
        return this.f12306.size();
    }
}
