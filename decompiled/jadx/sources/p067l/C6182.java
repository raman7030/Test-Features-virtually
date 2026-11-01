package p067l;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۘܶ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: U6AJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C6182 extends C12888 {

    /* JADX INFO: renamed from: ۗ */
    public boolean f15557;

    /* JADX INFO: renamed from: ۬ */
    public final ArrayList f15558;

    @Override // p067l.C12888, p067l.AbstractC10205
    /* JADX INFO: renamed from: ܿ */
    public final void mo14008() {
    }

    public C6182(C3499 c3499, int i, InterfaceC17625 interfaceC17625) {
        super(c3499, i, interfaceC17625);
        int iM6258 = c3499.m6258(i);
        this.f15558 = new ArrayList();
        if (iM6258 >= 0) {
            for (InterfaceC19482 interfaceC19482 : interfaceC17625.mo10139()) {
                this.f15558.add(new C10876(interfaceC19482.getKey(), c3499.m6256().m17426(new C20935(c3499.f7058, interfaceC19482.mo13943() + iM6258, "sswitch_"))));
            }
            return;
        }
        this.f15557 = true;
        for (InterfaceC19482 interfaceC19483 : interfaceC17625.mo10139()) {
            this.f15558.add(new C17580(interfaceC19483.getKey(), interfaceC19483.mo13943()));
        }
    }

    @Override // p067l.C12888, p067l.AbstractC10205
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4018(C5636 c5636) throws IOException {
        if (this.f15557) {
            c5636 = new C10010(c5636);
        }
        boolean z = this.f36246.f7058.f75164;
        c5636.getClass();
        c5636.write(".sparse-switch\n", 0, 15);
        c5636.m12536();
        for (AbstractC4841 abstractC4841 : this.f15558) {
            C21605.m48807(c5636, abstractC4841.m10270());
            c5636.write(" -> ", 0, 4);
            abstractC4841.mo10271(c5636);
            if (z) {
                m29521(c5636, abstractC4841.m10270());
            }
            c5636.write(10);
        }
        c5636.m12532();
        c5636.write(".end sparse-switch", 0, 18);
        return true;
    }
}
