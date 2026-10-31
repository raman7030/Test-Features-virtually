package l;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۡ᩻ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X202 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9214 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final HashMap f27904 = new HashMap();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m23656(String str, String str2, InterfaceC9920 interfaceC9920) {
        HashMap map = f27904;
        Map map2 = (Map) map.get(str);
        if (map2 == null) {
            map2 = new HashMap();
            map.put(str, map2);
        }
        map2.put(str2, interfaceC9920);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC1661 m23655(C2450 c2450) {
        InterfaceC9920 interfaceC9920;
        AbstractC16891 abstractC16891M7922 = c2450.m7922();
        AbstractC16891 abstractC16891M39044 = c2450.m7919().m39044();
        Map map = (Map) f27904.get(abstractC16891M7922.mo6007());
        if (map != null && (interfaceC9920 = (InterfaceC9920) map.get(abstractC16891M39044.mo6007())) != null) {
            return interfaceC9920.create();
        }
        return C22081.m49676();
    }
}
