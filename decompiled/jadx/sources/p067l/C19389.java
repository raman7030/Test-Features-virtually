package p067l;

import bin.p000mt.plus.R;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩳ۟ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E2B3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19389 extends AbstractC3947 {
    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo3869(C4697 c4697) {
        C18107 c18107M9967 = c4697.m9967();
        return c4697.m9964("local") && c18107M9967.m41261("local") && !c18107M9967.m41264() && !c4697.m9962().equals(c18107M9967.m41217());
    }

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܽ */
    public final void mo3868(C4697 c4697) {
        C18107 c18107M9967 = c4697.m9967();
        c4697.m9955("local");
        c18107M9967.m41224("local");
        m7832(c4697, R.string.MT_Protector, AbstractC3947.m7830(c4697, R.string.MT_Protector));
    }

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܿ */
    public final void mo4692(C4697 c4697) {
        C18107 c18107M9967 = c4697.m9967();
        c18107M9967.m41224("local");
        int i = C16723.f49313;
        C3313 c3313 = new C3313(C18047.class);
        c3313.m5781(c4697.m9957());
        c3313.m5787(c4697);
        c3313.m5777("ARG_MSG_FROM", c4697.m9960());
        c3313.m5777("ARG_MSG_TO", c18107M9967.m41216());
        c3313.m5777("sourcePath", c4697.m9973());
        c3313.m5777("targetPath", c18107M9967.m41246());
        c3313.m5772();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m44136(AbstractC3451 abstractC3451) {
        if (abstractC3451.m6129()) {
            C2780 c2780Mo4359 = abstractC3451.mo4359();
            Iterator it = c2780Mo4359.m4364().iterator();
            while (it.hasNext()) {
                m44136((AbstractC3451) it.next());
            }
            AbstractC12351 abstractC12351Mo25509 = c2780Mo4359.m6131().mo25509();
            if (abstractC12351Mo25509.mo10729(EnumC15032.DELETE_EMPTY_DIRECTORY) == EnumC6986.UNSUPPORTED) {
                return;
            }
            try {
                abstractC12351Mo25509.mo10737();
            } catch (C23750 e) {
                if (e.m52799() != EnumC23080.DIRECTORY_NOT_EMPTY) {
                    EnumC23080 enumC23080 = EnumC23080.NOT_FOUND;
                }
            }
        }
    }
}
