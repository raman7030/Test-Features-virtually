package p067l;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۟ۢ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: G7LX */
/* JADX INFO: loaded from: classes3.dex */
public final class C9386 extends AbstractC4002 {
    @Override // p067l.AbstractC4002
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC9701 mo7981(C11674 c11674) {
        m21858((AbstractC3094) c11674);
        AbstractC14355 abstractC14355 = c11674.f32571;
        AbstractC6462 abstractC6462 = abstractC14355.f18925;
        C15065 c15065 = this.f8727;
        AbstractC9701 abstractC9701M34451 = c15065.m34451(abstractC6462, abstractC14355);
        if (abstractC9701M34451.mo19305() > 0) {
            c15065.m34468().m7062(((abstractC9701M34451.mo19305() - 1) * 3) + 90);
        }
        abstractC9701M34451.mo8027();
        m21859(c11674.f32571);
        for (AbstractC7257 abstractC7257 : AbstractC4002.m7978(c11674.f32570)) {
            c15065.m34451(abstractC7257.f18925, abstractC7257).mo8027();
            m21859(abstractC7257);
        }
        this.f8727.m34462((AbstractC7257) c11674, this.f8729.f69192, this.f8730.f21641, C4848.m10283(), false);
        return abstractC9701M34451;
    }

    @Override // p067l.AbstractC4002
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC9701 mo7980(C11003 c11003) {
        m21858((AbstractC3094) c11003);
        Iterator it = AbstractC4002.m7978((AbstractC7257) c11003).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            C15065 c15065 = this.f8727;
            if (zHasNext) {
                AbstractC7257 abstractC7257 = (AbstractC7257) it.next();
                c15065.m34451(abstractC7257.f18925, abstractC7257).mo8027();
                m21859(abstractC7257);
            } else {
                C22004 c22004 = this.f8729;
                this.f8727.m34462((AbstractC7257) c11003, c22004.f69192, this.f8730.f21641, C4848.m10283(), false);
                return c15065.m34467().m36601(c22004.f69215);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m21858(AbstractC3094 abstractC3094) {
        C15065 c15065 = this.f8727;
        C3666 c3666M34468 = c15065.m34468();
        C22004 c22004 = this.f8729;
        c3666M34468.m7043(187, c15065.m34445((InterfaceC5323) abstractC3094, c22004.f69192), (InterfaceC22798) c22004.f69192);
        c15065.m34468().m7062(89);
        this.f8727.m34462((AbstractC7257) abstractC3094, c22004.f69192, this.f8730.f21737, C4848.m10283(), false);
    }

    /* JADX INFO: renamed from: ۧ */
    private void m21859(AbstractC7257 abstractC7257) {
        AbstractC6462 abstractC6462Mo5302 = abstractC7257.f18925.mo5302();
        boolean zMo14805 = abstractC6462Mo5302.mo14805();
        C22004 c22004 = this.f8729;
        if (!zMo14805 && abstractC6462Mo5302.f16705 != c22004.f69215.f16705) {
            abstractC6462Mo5302 = c22004.f69208;
        }
        C1446.m31706(abstractC6462Mo5302.mo14779());
        HashMap map = this.f8731;
        AbstractC7783 abstractC7783M52640 = (AbstractC7783) map.get(abstractC6462Mo5302);
        C15065 c15065 = this.f8727;
        if (abstractC7783M52640 == null) {
            abstractC7783M52640 = this.f8732.m52640(abstractC7257, c15065.m34469(), c22004.f69192, this.f8730.f21703, C4848.m10276of((Object) abstractC6462Mo5302), (C4848) null);
            map.put(abstractC6462Mo5302, abstractC7783M52640);
        }
        C16091 c16091M34467 = c15065.m34467();
        c16091M34467.getClass();
        C3666 c3666 = c16091M34467.f47348;
        C8374 c8374 = c16091M34467.f47350;
        C3666.m7020(abstractC7783M52640.mo18010(c8374));
        C12497 c12497 = (C12497) abstractC7783M52640.m18015(c8374);
        int iM7020 = C3666.m7020(c12497.f35031);
        if ((abstractC7783M52640.f20407.mo18003() & 512) != 0) {
            c3666.m7045(abstractC7783M52640, c12497);
        } else {
            c3666.m7068(abstractC7783M52640, c12497);
        }
        AbstractC9701 abstractC9701 = c16091M34467.f47349[iM7020];
    }
}
