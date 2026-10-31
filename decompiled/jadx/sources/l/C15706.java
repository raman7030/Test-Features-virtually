package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ܺۙۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21V7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15706 extends AbstractC2821 implements InterfaceC8898, InterfaceC2548 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f48458;

    public C15706() {
        super(2);
        this.f48458 = new HashMap();
    }

    @Override // l.AbstractC2821
    /* JADX INFO: renamed from: ۧ */
    public final void mo8718(C2966 c2966) {
        c2966.m45788(true, true, true, false, new C23714(new C15952(0, 10, this)));
        this.f48458.clear();
    }

    @Override // l.AbstractC2821
    /* JADX INFO: renamed from: ֫ */
    public final void mo8714(AbstractC12138 abstractC12138) {
        String strM13109 = abstractC12138.m13109();
        AbstractC16412 abstractC16412M13108 = abstractC12138.m13108();
        if (C22927.m51032(strM13109)) {
            return;
        }
        C5124 c5124 = new C5124(strM13109, abstractC16412M13108, true);
        HashMap map = this.f48458;
        AbstractC4377 abstractC4377 = (AbstractC4377) map.get(c5124);
        if (abstractC4377 == null) {
            map.put(c5124, m37038((AbstractC4377) abstractC12138));
            return;
        }
        Object objM37038 = m37038((AbstractC4377) abstractC12138);
        AbstractC4377 abstractC4377M37038 = m37038(abstractC4377);
        if (objM37038.equals(abstractC4377M37038)) {
            return;
        }
        abstractC4377M37038.mo13103(objM37038);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC4377 m37038(AbstractC4377 abstractC4377) {
        while (abstractC4377.mo13101() != null && (abstractC4377.mo13101() instanceof AbstractC4377)) {
            abstractC4377 = (AbstractC4377) abstractC4377.mo13101();
        }
        return abstractC4377;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static InterfaceC18776 m37039(AbstractC12138 abstractC12138) {
        InterfaceC18776 interfaceC18776 = abstractC12138;
        while (interfaceC18776.mo13101() != null && (interfaceC18776.mo13101() instanceof InterfaceC18776)) {
            interfaceC18776 = (InterfaceC18776) interfaceC18776.mo13101();
        }
        return interfaceC18776;
    }
}
