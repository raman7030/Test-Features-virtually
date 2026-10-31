package l;

import bin.mt.plus.R;
import com.alipay.sdk.m.m.b;

/* JADX INFO: renamed from: l.ۨܿ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: B7T9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11856 extends AbstractC1661 {
    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo1456(C2450 c2450) {
        C16560 c16560M7919 = c2450.m7919();
        return c2450.m7916(b.k) && c16560M7919.m39035("local") && !c16560M7919.m39038();
    }

    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ܽ */
    public final void mo1455(C2450 c2450) {
        C16560 c16560M7919 = c2450.m7919();
        c2450.m7907(b.k);
        c16560M7919.m38998("local");
        m5602(c2450, R.string.MT_Protector, AbstractC1661.m5600(c2450, R.string.MT_Protector));
    }

    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ܿ */
    public final void mo2321(C2450 c2450) {
        C16560 c16560M7919 = c2450.m7919();
        c2450.m7907(b.k);
        c16560M7919.m38998("local");
        int i = C15104.f46193;
        C0994 c0994 = new C0994(C15382.class);
        c0994.m3483(c2450.m7909());
        c0994.m3484(c2450);
        c0994.m3481(c2450.m7922());
        c0994.m3474("ARG_MSG_FROM", c2450.m7912());
        c0994.m3474("ARG_MSG_TO", c16560M7919.m38990());
        c0994.m3474("targetPath", c16560M7919.m39058());
        c0994.m3475("moveMode", true);
        c0994.m3469();
    }
}
