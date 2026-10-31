package l;

import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.ۨ᩺ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K8BJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C12015 extends AbstractC1661 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String f35968;

    public C12015(String str) {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f35968 = str;
        m5604();
    }

    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo1456(C2450 c2450) {
        C16560 c16560M7919 = c2450.m7919();
        return c2450.m7916(this.f35968) && c16560M7919.m39035("local") && !c16560M7919.m39038();
    }

    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ܽ */
    public final void mo1455(C2450 c2450) {
        C16560 c16560M7919 = c2450.m7919();
        c2450.m7907(this.f35968);
        c16560M7919.m38998("local");
        m5602(c2450, R.string.MT_Protector, AbstractC1661.m5600(c2450, R.string.MT_Protector));
    }

    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ܿ */
    public final void mo2321(C2450 c2450) {
        C16560 c16560M7919 = c2450.m7919();
        c16560M7919.m38998("local");
        AbstractC15440 abstractC15440M39866 = C16999.m39866(c16560M7919.m39058(), new String[0]);
        if (!abstractC15440M39866.mo23120() || abstractC15440M39866.mo27924()) {
            List listM7909 = c2450.m7909();
            int i = C15104.f46193;
            C0994 c0994 = new C0994(C6370.class);
            c0994.m3483(listM7909);
            c0994.m3484(c2450);
            c0994.m3481(c2450.m7922());
            c0994.m3474("targetPath", c16560M7919.m39058());
            c0994.m3469();
            return;
        }
        c2450.m7917().m10221(C4925.m14306(R.string.MT_Protector, c16560M7919.m39058()), false);
    }
}
