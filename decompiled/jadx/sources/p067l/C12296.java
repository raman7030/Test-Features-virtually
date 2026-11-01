package p067l;

import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p035m.C0168b;

/* JADX INFO: renamed from: l.ۤܿ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: OAIH */
/* JADX INFO: loaded from: classes3.dex */
public final class C12296 extends AbstractC3947 {
    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo3869(C4697 c4697) {
        C18107 c18107M9967 = c4697.m9967();
        return c4697.m9964(C0168b.f616k) && c18107M9967.m41261("local") && !c18107M9967.m41264();
    }

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܽ */
    public final void mo3868(C4697 c4697) {
        C18107 c18107M9967 = c4697.m9967();
        c4697.m9955(C0168b.f616k);
        c18107M9967.m41224("local");
        m7832(c4697, R.string.MT_Protector, AbstractC3947.m7830(c4697, R.string.MT_Protector));
    }

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܿ */
    public final void mo4692(C4697 c4697) {
        C18107 c18107M9967 = c4697.m9967();
        c4697.m9955(C0168b.f616k);
        c18107M9967.m41224("local");
        int i = C16723.f49313;
        C3313 c3313 = new C3313(C16988.class);
        c3313.m5786(c4697.m9957());
        c3313.m5787(c4697);
        c3313.m5784(c4697.m9970());
        c3313.m5777("ARG_MSG_FROM", c4697.m9960());
        c3313.m5777("ARG_MSG_TO", c18107M9967.m41216());
        c3313.m5777("targetPath", c18107M9967.m41284());
        c3313.m5778("moveMode", false);
        c3313.m5772();
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m28315(AbstractC5375 abstractC5375, C2780 c2780) {
        for (AbstractC3451 abstractC3451 : c2780.m4364()) {
            if (abstractC3451.m6129() && !m28315(abstractC5375, abstractC3451.mo4359())) {
                return false;
            }
        }
        try {
            String strM6151 = c2780.m6151();
            abstractC5375.mo11736(strM6151);
            if (abstractC5375.mo9708(strM6151, true).isEmpty()) {
                return abstractC5375.m11741(strM6151, true);
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
