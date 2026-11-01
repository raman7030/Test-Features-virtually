package p067l;

import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p035m.C0168b;

/* JADX INFO: renamed from: l.۫ܿ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 98AW */
/* JADX INFO: loaded from: classes4.dex */
public final class C14307 extends AbstractC3947 {
    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo3869(C4697 c4697) {
        return c4697.m9964(C0168b.f616k) && c4697.m9967().m41261("zip");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0041  */
    /* JADX WARN: Code duplicated, block: B:13:0x0047  */
    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܽ */
    public final void mo3868(C4697 c4697) {
        C18107 c18107M9967 = c4697.m9967();
        c4697.m9955(C0168b.f616k);
        c18107M9967.m41224("zip");
        C12574 c12574 = (C12574) c18107M9967.m41270();
        if (c12574.m28983()) {
            C22682.m50793(R.string.MT_Protector);
            return;
        }
        String strM28981 = c12574.m28981();
        AbstractC17043 abstractC17043M42109 = C18524.m42109(strM28981, new String[0]);
        if (abstractC17043M42109.mo29985()) {
            AbstractC17043 abstractC17043M38694 = abstractC17043M42109.m38694();
            C12826.requireNonNull(abstractC17043M38694);
            if (!abstractC17043M38694.mo29985()) {
                if (!C11164.m25781()) {
                    c4697.m9965().m12257(C7050.m16203(R.string.MT_Protector, strM28981), false);
                    return;
                }
            }
        } else if (!C11164.m25781()) {
            c4697.m9965().m12257(C7050.m16203(R.string.MT_Protector, strM28981), false);
            return;
        }
        String strM52306 = c12574.m28980() ? C23527.m52306(abstractC17043M42109) : null;
        new C23695(this, c4697.m9969(), strM28981, c12574.m28980(), strM52306, c12574, c4697, strM52306);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m32867(C14307 c14307, C4697 c4697, int i, int i2, C13457 c13457, boolean z) {
        C18107 c18107M9967 = c4697.m9967();
        c4697.m9955(C0168b.f616k);
        c18107M9967.m41224("zip");
        int i3 = C16723.f49313;
        C3313 c3313 = new C3313(C14977.class);
        c3313.m5786(c4697.m9957());
        c3313.m5787(c4697);
        c3313.m5784(c4697.m9970());
        c3313.m5779("ARG_STATELESS_VISITOR2", c4697.m9967().m41289().m35469());
        c3313.m5777("ARG_MSG_FROM", c4697.m9960());
        c3313.m5777("ARG_MSG_TO", C7050.m16224(R.string.MT_Protector).toLowerCase());
        c3313.m5777("targetPath", c18107M9967.m41284());
        c3313.m5773(i, "level");
        c3313.m5773(i2, "update");
        c3313.m5775(c4697.m9965(), c13457);
        c3313.m5778("keepApkSigBlock", z);
        c3313.m5772();
    }
}
