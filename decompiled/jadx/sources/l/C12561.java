package l;

import bin.mt.plus.R;
import com.alipay.sdk.m.m.b;

/* JADX INFO: renamed from: l.۫ܿ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 98AW */
/* JADX INFO: loaded from: classes4.dex */
public final class C12561 extends AbstractC1661 {
    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo1456(C2450 c2450) {
        return c2450.m7916(b.k) && c2450.m7919().m39035("zip");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0041  */
    /* JADX WARN: Code duplicated, block: B:13:0x0047  */
    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ܽ */
    public final void mo1455(C2450 c2450) {
        C16560 c16560M7919 = c2450.m7919();
        c2450.m7907(b.k);
        c16560M7919.m38998("zip");
        C10738 c10738 = (C10738) c16560M7919.m39044();
        if (c10738.m26939()) {
            C21374.m48457(R.string.MT_Protector);
            return;
        }
        String strM26937 = c10738.m26937();
        AbstractC15440 abstractC15440M39866 = C16999.m39866(strM26937, new String[0]);
        if (abstractC15440M39866.mo27924()) {
            AbstractC15440 abstractC15440M36536 = abstractC15440M39866.m36536();
            C11003.requireNonNull(abstractC15440M36536);
            if (!abstractC15440M36536.mo27924()) {
                if (!C9255.m23780()) {
                    c2450.m7917().m10221(C4925.m14306(R.string.MT_Protector, strM26937), false);
                    return;
                }
            }
        } else if (!C9255.m23780()) {
            c2450.m7917().m10221(C4925.m14306(R.string.MT_Protector, strM26937), false);
            return;
        }
        String strM49978 = c10738.m26936() ? C22263.m49978(abstractC15440M39866) : null;
        new C22439(this, c2450.m7921(), strM26937, c10738.m26936(), strM49978, c10738, c2450, strM49978);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m30792(C12561 c12561, C2450 c2450, int i, int i2, C11667 c11667, boolean z) {
        C16560 c16560M7919 = c2450.m7919();
        c2450.m7907(b.k);
        c16560M7919.m38998("zip");
        int i3 = C15104.f46193;
        C0994 c0994 = new C0994(C13266.class);
        c0994.m3483(c2450.m7909());
        c0994.m3484(c2450);
        c0994.m3481(c2450.m7922());
        c0994.m3476("ARG_STATELESS_VISITOR2", c2450.m7919().m39063().m33350());
        c0994.m3474("ARG_MSG_FROM", c2450.m7912());
        c0994.m3474("ARG_MSG_TO", C4925.m14327(R.string.MT_Protector).toLowerCase());
        c0994.m3474("targetPath", c16560M7919.m39058());
        c0994.m3470(i, "level");
        c0994.m3470(i2, "update");
        c0994.m3472(c2450.m7917(), c11667);
        c0994.m3475("keepApkSigBlock", z);
        c0994.m3469();
    }
}
