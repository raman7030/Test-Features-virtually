package p067l;

import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p035m.C0168b;

/* JADX INFO: renamed from: l.ۙܳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: O8BF */
/* JADX INFO: loaded from: classes3.dex */
public final class C6851 extends AbstractC3947 {
    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo3869(C4697 c4697) {
        C18107 c18107M9967 = c4697.m9967();
        if (c4697.m9964(C0168b.f616k) && c18107M9967.m41261(C0168b.f616k) && !c18107M9967.m41264()) {
            return (((AbstractC5375) c4697.m9970().mo8217()).f12758.f14161 == ((AbstractC5375) c18107M9967.m41289()).f12758.f14161 && c4697.m9974().equals(c4697.m9967().m41284())) ? false : true;
        }
        return false;
    }

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܽ */
    public final void mo3868(C4697 c4697) {
        C18107 c18107M9967 = c4697.m9967();
        c4697.m9955(C0168b.f616k);
        c18107M9967.m41224(C0168b.f616k);
        m7832(c4697, R.string.MT_Protector, AbstractC3947.m7830(c4697, R.string.MT_Protector));
        DialogInterfaceOnClickListenerC12648.m29081(R.string.MT_Protector, c4697.m9965(), "network_transfer_warn");
    }

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܿ */
    public final void mo4692(C4697 c4697) {
        C18107 c18107M9967 = c4697.m9967();
        c4697.m9955(C0168b.f616k);
        c18107M9967.m41224(C0168b.f616k);
        int i = C16723.f49313;
        C3313 c3313 = new C3313(C21604.class);
        c3313.m5786(c4697.m9957());
        c3313.m5787(c4697);
        c3313.m5784(c4697.m9970());
        c3313.m5779("ARG_STATELESS_VISITOR2", c4697.m9967().m41289().m35469());
        c3313.m5777("ARG_MSG_FROM", c4697.m9960());
        c3313.m5777("ARG_MSG_TO", c18107M9967.m41216());
        c3313.m5777("targetPath", c18107M9967.m41284());
        c3313.m5778("streamMode", true);
        c3313.m5772();
    }
}
