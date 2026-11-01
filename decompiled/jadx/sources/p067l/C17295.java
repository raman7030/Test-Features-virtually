package p067l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ܺۙۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21V7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17295 extends AbstractC5050 implements InterfaceC10825, InterfaceC4790 {

    /* JADX INFO: renamed from: ۧ */
    public final HashMap f51596;

    public C17295() {
        super(2);
        this.f51596 = new HashMap();
    }

    @Override // p067l.AbstractC5050
    /* JADX INFO: renamed from: ۧ */
    public final void mo10779(C5187 c5187) {
        c5187.m48100(true, true, true, false, new C24906(new C17529(0, 10, this)));
        this.f51596.clear();
    }

    @Override // p067l.AbstractC5050
    /* JADX INFO: renamed from: ֫ */
    public final void mo10775(AbstractC13904 abstractC13904) {
        String strM14973 = abstractC13904.m14973();
        AbstractC17966 abstractC17966M14972 = abstractC13904.m14972();
        if (C24158.m53423(strM14973)) {
            return;
        }
        C7238 c7238 = new C7238(strM14973, abstractC17966M14972, true);
        HashMap map = this.f51596;
        AbstractC6528 abstractC6528 = (AbstractC6528) map.get(c7238);
        if (abstractC6528 == null) {
            map.put(c7238, m39205((AbstractC6528) abstractC13904));
            return;
        }
        Object objM39205 = m39205((AbstractC6528) abstractC13904);
        AbstractC6528 abstractC6528M39205 = m39205(abstractC6528);
        if (objM39205.equals(abstractC6528M39205)) {
            return;
        }
        abstractC6528M39205.mo14967(objM39205);
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC6528 m39205(AbstractC6528 abstractC6528) {
        while (abstractC6528.mo14965() != null && (abstractC6528.mo14965() instanceof AbstractC6528)) {
            abstractC6528 = (AbstractC6528) abstractC6528.mo14965();
        }
        return abstractC6528;
    }

    /* JADX INFO: renamed from: ۧ */
    public static InterfaceC20213 m39206(AbstractC13904 abstractC13904) {
        InterfaceC20213 interfaceC20213 = abstractC13904;
        while (interfaceC20213.mo14965() != null && (interfaceC20213.mo14965() instanceof InterfaceC20213)) {
            interfaceC20213 = (InterfaceC20213) interfaceC20213.mo14965();
        }
        return interfaceC20213;
    }
}
