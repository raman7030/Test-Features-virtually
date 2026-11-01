package p067l;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۡ᩻ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X202 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11126 {

    /* JADX INFO: renamed from: ֫ */
    public static final HashMap f30850 = new HashMap();

    /* JADX INFO: renamed from: ֫ */
    public static void m25655(String str, String str2, InterfaceC11797 interfaceC11797) {
        HashMap map = f30850;
        Map map2 = (Map) map.get(str);
        if (map2 == null) {
            map2 = new HashMap();
            map.put(str, map2);
        }
        map2.put(str2, interfaceC11797);
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC3947 m25654(C4697 c4697) {
        InterfaceC11797 interfaceC11797;
        AbstractC18422 abstractC18422M9970 = c4697.m9970();
        AbstractC18422 abstractC18422M41270 = c4697.m9967().m41270();
        Map map = (Map) f30850.get(abstractC18422M9970.mo8204());
        if (map != null && (interfaceC11797 = (InterfaceC11797) map.get(abstractC18422M41270.mo8204())) != null) {
            return interfaceC11797.create();
        }
        return C23354.m52014();
    }
}
