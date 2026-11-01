package p067l;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۢۙۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1UG */
/* JADX INFO: loaded from: classes3.dex */
public final class C11262 extends AbstractC5050 implements InterfaceC4790 {

    /* JADX INFO: renamed from: ۧ */
    public final C19308 f31361;

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC3214 f31362;

    public C11262(AbstractC3214 abstractC3214, C19308 c19308) {
        super(2);
        this.f31362 = abstractC3214;
        this.f31361 = c19308;
    }

    @Override // p067l.AbstractC5050
    /* JADX INFO: renamed from: ֫ */
    public final void mo10775(AbstractC13904 abstractC13904) {
        String strMo5553;
        String strM14973 = abstractC13904.m14973();
        if (C24158.m53423(strM14973)) {
            return;
        }
        C19308 c19308 = this.f31361;
        AbstractC17966 abstractC17966 = C12603.f35393;
        Map map = (Map) c19308.get(abstractC17966);
        if (map == null) {
            map = new HashMap();
            c19308.put(abstractC17966, map);
        }
        if (m26179(abstractC13904) == null) {
            AbstractC3214 abstractC3214 = this.f31362;
            abstractC3214.mo5554();
            do {
                strMo5553 = abstractC3214.mo5553();
            } while (map.containsKey(strMo5553));
            map.put(strMo5553, strM14973);
            C17295.m39206(abstractC13904).mo14967(strMo5553);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m26179(AbstractC13904 abstractC13904) {
        return (String) C17295.m39206(abstractC13904).mo14965();
    }
}
