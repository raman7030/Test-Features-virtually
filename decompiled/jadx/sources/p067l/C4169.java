package p067l;

import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p035m.C0168b;

/* JADX INFO: renamed from: l.֫ܳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: G7TD */
/* JADX INFO: loaded from: classes2.dex */
public final class C4169 extends AbstractC3947 {

    /* JADX INFO: renamed from: ۗ */
    public final String f9186;

    public C4169(String str) {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f9186 = str;
        m7834();
    }

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo3869(C4697 c4697) {
        C18107 c18107M9967 = c4697.m9967();
        if (!c4697.m9964(this.f9186) || !c18107M9967.m41261(C0168b.f616k) || c18107M9967.m41264()) {
            return false;
        }
        AbstractC18422 abstractC18422M9970 = c4697.m9970();
        if (abstractC18422M9970 instanceof C7367) {
            C7367 c7367 = (C7367) abstractC18422M9970;
            C7367 c7368 = (C7367) c18107M9967.m41270();
            if (c7367.m17071() == c7368.m17071()) {
                return !c7367.m41982().equals(c7368.m41982());
            }
        }
        return true;
    }

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܽ */
    public final void mo3868(C4697 c4697) {
        C18107 c18107M9967 = c4697.m9967();
        String str = this.f9186;
        c4697.m9955(str);
        c18107M9967.m41224(C0168b.f616k);
        if (str.equals(C0168b.f616k)) {
            if (((AbstractC5375) c4697.m9970().mo8217()).f12758.f14161 != ((AbstractC5375) c4697.m9967().m41270().mo8217()).f12758.f14161) {
                DialogInterfaceOnClickListenerC12648.m29081(R.string.MT_Protector, c4697.m9965(), "network_transfer_warn");
            }
        }
        m7832(c4697, R.string.MT_Protector, AbstractC3947.m7830(c4697, R.string.MT_Protector));
    }

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܿ */
    public final void mo4692(C4697 c4697) {
        C18107 c18107M9967 = c4697.m9967();
        c4697.m9955(this.f9186);
        c18107M9967.m41224(C0168b.f616k);
        AbstractC15599 abstractC15599Mo8217 = c4697.m9970().mo8217();
        AbstractC5375 abstractC5375 = (AbstractC5375) c4697.m9967().m41270().mo8217();
        String strTrim = abstractC5375.f12758.mo8544().trim();
        int i = C16723.f49313;
        C3313 c3313 = new C3313(C9613.class);
        c3313.m5786(c4697.m9957());
        c3313.m5787(c4697);
        c3313.m5779("ARG_STATELESS_VISITOR", abstractC15599Mo8217.m35469());
        c3313.m5779("ARG_STATELESS_VISITOR2", abstractC5375.m35469());
        c3313.m5777("ARG_MSG_FROM", c4697.m9960());
        c3313.m5777("ARG_MSG_TO", c18107M9967.m41216());
        c3313.m5777("targetPath", c18107M9967.m41284());
        c3313.m5777("descPath", strTrim);
        c3313.m5772();
    }
}
