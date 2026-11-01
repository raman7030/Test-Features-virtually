package p067l;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.᩻ۙۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1VH */
/* JADX INFO: loaded from: classes.dex */
public final class C24672 extends AbstractC5050 implements InterfaceC4790 {

    /* JADX INFO: renamed from: ۧ */
    public final C19308 f78049;

    public C24672(C19308 c19308) {
        super(2);
        this.f78049 = c19308;
    }

    @Override // p067l.AbstractC5050
    /* JADX INFO: renamed from: ֫ */
    public final void mo10775(AbstractC13904 abstractC13904) {
        String strM26179;
        String strM14973 = abstractC13904.m14973();
        if (C24158.m53423(strM14973) || (strM26179 = C11262.m26179(abstractC13904)) == null) {
            return;
        }
        C19308 c19308 = this.f78049;
        AbstractC17966 abstractC17966 = C12603.f35393;
        Map map = (Map) c19308.get(abstractC17966);
        if (map == null) {
            map = new HashMap();
            c19308.put(abstractC17966, map);
        }
        String str = (String) map.get(strM26179);
        if (str == null || (C17295.m39206(abstractC13904) instanceof C21991) || strM14973.compareTo(str) < 0) {
            map.put(strM26179, strM14973);
        }
    }
}
