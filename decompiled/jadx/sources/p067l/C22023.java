package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩷ۛ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: M605 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22023 extends AbstractC23402 {

    /* JADX INFO: renamed from: ۗ */
    public int f69318;

    /* JADX INFO: renamed from: ۙ */
    public int f69319;

    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ InterfaceC15529 f69320;

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ C11294 f69321;

    /* JADX INFO: renamed from: ۬ */
    public int f69322;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22023(C11294 c11294, C14645 c14645, int i, InterfaceC15529 interfaceC15529) {
        super(c14645, i);
        this.f69321 = c11294;
        this.f69320 = interfaceC15529;
        this.f69318 = -1;
    }

    @Override // p067l.AbstractC23402
    /* JADX INFO: renamed from: ֫ */
    public final Object mo9671(C20168 c20168) {
        C11964 c11964;
        int i;
        do {
            int i2 = this.f69319 + 1;
            this.f69319 = i2;
            C11294 c11294 = this.f69321;
            C9952 c9952 = c11294.f31472;
            if (i2 > c9952.f27558) {
                c9952.f27553 = c20168.m45631();
                m6947();
                return null;
            }
            Iterator it = c11294.f31470;
            c11964 = new C11964(c9952.f27561, c20168, c9952, this.f69322, this.f69320, it != null ? ((Integer) it.next()).intValue() : 7);
            i = c11964.f33361;
            this.f69322 = i;
            if (!c11294.f31469) {
                break;
            }
        } while (this.f69318 == i);
        this.f69318 = i;
        return c11964;
    }
}
