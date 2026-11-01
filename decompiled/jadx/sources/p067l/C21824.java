package p067l;

import bin.p000mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.᩶᩹᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: P1ZZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C21824 extends AbstractC3947 {
    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo3869(C4697 c4697) {
        C18107 c18107M9967 = c4697.m9967();
        if (!c4697.m9964("zip") || !c18107M9967.m41261("zip")) {
            return false;
        }
        C12574 c12574 = (C12574) c4697.m9970();
        C12574 c12575 = (C12574) c18107M9967.m41270();
        if (c12574.m28981().equals(c12575.m28981())) {
            return !c12574.m41982().equals(c12575.m41982());
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003f  */
    /* JADX WARN: Code duplicated, block: B:13:0x0045  */
    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܽ */
    public final void mo3868(C4697 c4697) {
        C18107 c18107M9967 = c4697.m9967();
        c4697.m9955("zip");
        c18107M9967.m41224("zip");
        C12574 c12574 = (C12574) c18107M9967.m41270();
        String strM28981 = c12574.m28981();
        AbstractC17043 abstractC17043M42109 = C18524.m42109(strM28981, new String[0]);
        if (c12574.m28983()) {
            C22682.m50793(R.string.MT_Protector);
            return;
        }
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
        new C10424(this, c4697.m9969(), strM28981, c12574.m28980(), strM52306, c12574, c4697, strM52306).m11537();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m49186(C21824 c21824, C4697 c4697, int i, C13457 c13457, boolean z) {
        C18107 c18107M9967 = c4697.m9967();
        C12574 c12574 = (C12574) c4697.m9970();
        C12574 c12575 = (C12574) c18107M9967.m41270();
        List listM9957 = c4697.m9957();
        int i2 = C16723.f49313;
        C3313 c3313 = new C3313(C23835.class);
        c3313.m5777("srcZipPath", c12574.m28981());
        c3313.m5777("tarZipPath", c12575.m28981());
        c3313.m5777("targetPath", c12575.m41982().substring(1));
        c3313.m5773(i, "update");
        c3313.m5786(listM9957);
        c3313.m5787(c4697);
        c3313.m5775(c4697.m9965(), c13457);
        c3313.m5778("keepApkSigBlock", z);
        c3313.m5772();
    }
}
