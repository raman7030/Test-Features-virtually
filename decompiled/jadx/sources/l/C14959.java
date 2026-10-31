package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܶۗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 41VB */
/* JADX INFO: loaded from: classes4.dex */
public final class C14959 extends AbstractC2821 implements InterfaceC8898, InterfaceC2548 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C3671 f45613;

    public C14959(C3671 c3671) {
        super(2);
        this.f45613 = c3671;
    }

    @Override // l.AbstractC2821, l.InterfaceC8898
    /* JADX INFO: renamed from: ֫ */
    public final void mo1225(C2966 c2966) {
        String str = "L" + c2966.m45794() + l.b;
        String strM20585 = C7695.m20585(c2966);
        C2260 c2260 = new C2260(str, strM20585 == null ? str : C4860.m14172("L", strM20585, l.b));
        this.f45613.m11181(c2260);
        c2966.m45788(true, true, true, false, new C7904(new C0848(c2260)));
    }
}
