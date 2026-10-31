package l;

import bin.mt.plus.R;
import com.alipay.sdk.m.m.b;

/* JADX INFO: renamed from: l.֫ܳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: G7TD */
/* JADX INFO: loaded from: classes2.dex */
public final class C1894 extends AbstractC1661 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String f6405;

    public C1894(String str) {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f6405 = str;
        m5604();
    }

    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo1456(C2450 c2450) {
        C16560 c16560M7919 = c2450.m7919();
        if (!c2450.m7916(this.f6405) || !c16560M7919.m39035(b.k) || c16560M7919.m39038()) {
            return false;
        }
        AbstractC16891 abstractC16891M7922 = c2450.m7922();
        if (abstractC16891M7922 instanceof C5259) {
            C5259 c5259 = (C5259) abstractC16891M7922;
            C5259 c52510 = (C5259) c16560M7919.m39044();
            if (c5259.m15168() == c52510.m15168()) {
                return !c5259.m39741().equals(c52510.m39741());
            }
        }
        return true;
    }

    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ܽ */
    public final void mo1455(C2450 c2450) {
        C16560 c16560M7919 = c2450.m7919();
        String str = this.f6405;
        c2450.m7907(str);
        c16560M7919.m38998(b.k);
        if (str.equals(b.k)) {
            if (((AbstractC3163) c2450.m7922().mo6020()).f9955.f11356 != ((AbstractC3163) c2450.m7919().m39044().mo6020()).f9955.f11356) {
                DialogInterfaceOnClickListenerC10816.m27036(R.string.MT_Protector, c2450.m7917(), "network_transfer_warn");
            }
        }
        m5602(c2450, R.string.MT_Protector, AbstractC1661.m5600(c2450, R.string.MT_Protector));
    }

    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ܿ */
    public final void mo2321(C2450 c2450) {
        C16560 c16560M7919 = c2450.m7919();
        c2450.m7907(this.f6405);
        c16560M7919.m38998(b.k);
        AbstractC13921 abstractC13921Mo6020 = c2450.m7922().mo6020();
        AbstractC3163 abstractC3163 = (AbstractC3163) c2450.m7919().m39044().mo6020();
        String strTrim = abstractC3163.f9955.mo6371().trim();
        int i = C15104.f46193;
        C0994 c0994 = new C0994(C7622.class);
        c0994.m3483(c2450.m7909());
        c0994.m3484(c2450);
        c0994.m3476("ARG_STATELESS_VISITOR", abstractC13921Mo6020.m33350());
        c0994.m3476("ARG_STATELESS_VISITOR2", abstractC3163.m33350());
        c0994.m3474("ARG_MSG_FROM", c2450.m7912());
        c0994.m3474("ARG_MSG_TO", c16560M7919.m38990());
        c0994.m3474("targetPath", c16560M7919.m39058());
        c0994.m3474("descPath", strTrim);
        c0994.m3469();
    }
}
