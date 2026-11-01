package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹ۜ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes.dex */
public final class C23389 implements InterfaceC8453 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C21378 f74535;

    /* JADX INFO: renamed from: ᩶ */
    public final C4848 f74536;

    /* JADX INFO: renamed from: ᩸ */
    public final C2417 f74537;

    /* JADX INFO: renamed from: ᩹ */
    public final C4848 f74538;

    @Override // p067l.InterfaceC8453
    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ boolean mo9173() {
        return false;
    }

    public C23389(C21378 c21378, C2417 c2417, C4848 c4848, C4848 c4849) {
        this.f74535 = c21378;
        this.f74537 = c2417;
        this.f74536 = c4848;
        this.f74538 = c4849;
    }

    @Override // p067l.InterfaceC8453
    /* JADX INFO: renamed from: ֫ */
    public final void mo9171(AbstractC7783 abstractC7783) {
        C21378 c21378;
        C20271 c20271 = new C20271();
        C2417 c2417 = this.f74537;
        c20271.addAll(c2417.f3696);
        C20271 c20272 = new C20271();
        Iterator it = this.f74536.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c21378 = this.f74535;
            if (!zHasNext) {
                break;
            }
            C17681 c17681 = new C17681(c21378.f67412.m49587(c2417, ((C20708) it.next()).f63931));
            c20272.m45777(c17681);
            c20271.m45777(c17681);
        }
        c2417.f3693 = c20272.m45783();
        C20271 c20273 = new C20271();
        for (C20037 c20037 : this.f74538) {
            C20271 c20274 = new C20271();
            Iterator it2 = c20037.f60891.iterator();
            while (it2.hasNext()) {
                c20274.m45777(c21378.f67412.m49587(c2417, (AbstractC12224) it2.next()));
            }
            C22377 c22377 = new C22377(c21378.f67412.m49587(c2417, c20037.f60892), c20274.m45783());
            c20273.m45777(c22377);
            c20271.m45777(c22377);
        }
        c2417.f3701 = c20273.m45783();
        c2417.f3696 = c20271.m45783();
    }
}
