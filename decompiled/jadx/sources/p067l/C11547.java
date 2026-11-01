package p067l;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۢܶ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: R69D */
/* JADX INFO: loaded from: classes4.dex */
public final class C11547 extends C12888 {

    /* JADX INFO: renamed from: ۗ */
    public boolean f32201;

    /* JADX INFO: renamed from: ۫ */
    public final ArrayList f32202;

    /* JADX INFO: renamed from: ۬ */
    public final int f32203;

    @Override // p067l.C12888, p067l.AbstractC10205
    /* JADX INFO: renamed from: ܿ */
    public final void mo14008() {
    }

    public C11547(C3499 c3499, int i, InterfaceC10921 interfaceC10921) {
        int key;
        super(c3499, i, interfaceC10921);
        int iM6254 = c3499.m6254(i);
        this.f32202 = new ArrayList();
        boolean z = true;
        if (iM6254 >= 0) {
            key = 0;
            boolean z2 = true;
            for (InterfaceC19482 interfaceC19482 : interfaceC10921.mo10139()) {
                if (z2) {
                    key = interfaceC19482.getKey();
                    z2 = false;
                }
                C20935 c20935M17426 = c3499.m6256().m17426(new C20935(c3499.f7058, interfaceC19482.mo13943() + iM6254, "pswitch_"));
                if (c20935M17426.m47236()) {
                    c20935M17426.m47235(String.format("%s, 0x%x", c20935M17426.m47240(), Integer.valueOf(interfaceC19482.getKey())));
                } else {
                    c20935M17426.m47235(String.format("0x%x", Integer.valueOf(interfaceC19482.getKey())));
                }
                this.f32202.add(new C24957(c20935M17426));
            }
        } else {
            this.f32201 = true;
            key = 0;
            for (InterfaceC19482 interfaceC19483 : interfaceC10921.mo10139()) {
                if (z) {
                    key = interfaceC19483.getKey();
                    z = false;
                }
                this.f32202.add(new C8864(interfaceC19483.mo13943()));
            }
        }
        this.f32203 = key;
    }

    @Override // p067l.C12888, p067l.AbstractC10205
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4018(C5636 c5636) throws IOException {
        if (this.f32201) {
            c5636 = new C10010(c5636);
        }
        c5636.getClass();
        c5636.write(".packed-switch ", 0, 15);
        int i = this.f32203;
        C21605.m48807(c5636, i);
        c5636.m12536();
        c5636.write(10);
        boolean z = this.f36246.f7058.f75164;
        for (AbstractC22276 abstractC22276 : this.f32202) {
            if (abstractC22276 instanceof C24957) {
                ((C24957) abstractC22276).f79690.m47238(c5636);
            } else {
                abstractC22276.mo20468(c5636);
            }
            String str = String.format("  #%08x", Integer.valueOf(i));
            c5636.write(str, 0, str.length());
            if (z) {
                m29521(c5636, i);
            }
            c5636.write(10);
            i++;
        }
        c5636.m12532();
        c5636.write(".end packed-switch", 0, 18);
        return true;
    }
}
