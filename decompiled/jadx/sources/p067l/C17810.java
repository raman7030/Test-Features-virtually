package p067l;

import bin.p000mt.plus.R;
import java.util.Collections;

/* JADX INFO: renamed from: l.ܺ᩺ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I254 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17810 extends AbstractC3947 {
    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo3869(C4697 c4697) {
        C18107 c18107M9967 = c4697.m9967();
        if (!c18107M9967.m41264() && c4697.m9964("local") && c18107M9967.m41261("local")) {
            return !c4697.m9962().equals(c18107M9967.m41217()) || c4697.m9966() == 1;
        }
        return false;
    }

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܽ */
    public final void mo3868(final C4697 c4697) {
        C18107 c18107M9967 = c4697.m9967();
        c4697.m9955("local");
        c18107M9967.m41224("local");
        if (!c4697.m9971() && c4697.m9962().equals(c18107M9967.m41217())) {
            c4697.m9955("local");
            final InterfaceC19370 interfaceC19370M9961 = c4697.m9961();
            C21165.m47772(c4697.m9965(), interfaceC19370M9961, c4697.m9974(), new InterfaceC20494() { // from class: l.ۖ᩺ܳ
                @Override // p067l.InterfaceC20494
                /* JADX INFO: renamed from: ֫ */
                public final void mo5165(String str) {
                    int i = C16723.f49313;
                    C3313 c3313 = new C3313(C11106.class);
                    InterfaceC19370 interfaceC19370 = interfaceC19370M9961;
                    c3313.m5786(Collections.singletonList(interfaceC19370));
                    C4697 c4698 = c4697;
                    c3313.m5787(c4698);
                    c3313.m5777("ARG_MSG_FROM", interfaceC19370.getName());
                    if (interfaceC19370.isDirectory()) {
                        c3313.m5777("ARG_MSG_TO", str);
                    }
                    c3313.m5777("targetPath", c4698.m9974());
                    c3313.m5777("replacedName", str);
                    c3313.m5772();
                }
            });
            return;
        }
        m7832(c4697, R.string.MT_Protector, AbstractC3947.m7830(c4697, R.string.MT_Protector));
    }

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܿ */
    public final void mo4692(C4697 c4697) {
        C18107 c18107M9967 = c4697.m9967();
        c18107M9967.m41224("local");
        int i = C16723.f49313;
        C3313 c3313 = new C3313(C11106.class);
        c3313.m5786(c4697.m9957());
        c3313.m5787(c4697);
        c3313.m5777("ARG_MSG_FROM", c4697.m9960());
        c3313.m5777("ARG_MSG_TO", c18107M9967.m41216());
        c3313.m5777("targetPath", c18107M9967.m41284());
        c3313.m5772();
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m40426(String... strArr) {
        for (String str : strArr) {
            if (C21129.m47753(str) != null) {
                return true;
            }
        }
        return false;
    }
}
