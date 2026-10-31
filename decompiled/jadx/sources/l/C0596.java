package l;

import com.alipay.sdk.m.y.l;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֡ᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 640U */
/* JADX INFO: loaded from: classes2.dex */
public final class C0596 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14258 f2321;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C2609 f2322;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C2609 f2323;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1302 f2324;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2562 f2325;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C2609 f2326;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Set f2327;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public LinkedHashSet f2328;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public HashMap f2329;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C5431 f2330;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C2609 f2331;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f2332;

    public C0596(C1302 c1302, int i, Set set, C5431 c5431) {
        this.f2324 = c1302;
        this.f2325 = new C2562(1);
        this.f2321 = new C14258(1);
        this.f2332 = i;
        if (i != 1) {
            C5431 c5432 = new C5431(c1302.f4637, null);
            this.f2330 = c5432;
            c1302.f4663.m13340(c5432);
        } else {
            C12171.m29637(c5431);
            this.f2330 = c5431;
        }
        this.f2323 = C2609.m8239();
        this.f2322 = C2609.m8239();
        this.f2326 = C2609.m8239();
        this.f2327 = set;
    }

    public C0596(C1302 c1302, C2609 c2609, C2609 c26010, Set set, C5431 c5431) {
        this(c1302, 1, set, c5431);
        this.f2331 = c2609;
        this.f2329 = new HashMap();
        this.f2323 = C1302.m4509(c1302, c2609).m8248(c26010.m8250());
        this.f2322 = C1302.m4495(c1302, c2609);
        C2609 c2609M8239 = C2609.m8239();
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            C1323 c1323 = (C1323) it.next();
            if (c1323.f4745.mo21322("module-info", EnumC16866.SOURCE) && c1323.f4738.m8249()) {
                for (AbstractC5144 abstractC5144 : c1323.f4738) {
                    if (!abstractC5144.m14709(EnumC18550.f57491)) {
                        if (!abstractC5144.m14709(EnumC18550.f57554)) {
                            break;
                        }
                        c2609M8239 = c2609M8239.m8246(c1323.f4739);
                        break;
                    }
                }
            }
        }
        this.f2326 = c2609M8239.m8250();
        m2461();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0596 m2457(LinkedHashSet linkedHashSet, LinkedHashMap linkedHashMap) {
        int i = this.f2332 + 1;
        Set set = this.f2327;
        C1302 c1302 = this.f2324;
        C0596 c0596 = new C0596(c1302, i, set, null);
        m2456();
        HashMap map = this.f2329;
        c0596.f2329 = map;
        C2609 c2609M13329 = c1302.f4663.m13329((Set) linkedHashSet, true);
        C2609 c2609 = this.f2331;
        c2609.getClass();
        C2609 c2609M8248 = c2609M13329.m8248(c2609);
        c0596.f2331 = c2609M8248;
        if (c0596.m2462()) {
            c1302.f4663.m13344(C2609.m8239());
            return c0596;
        }
        c1302.f4663.m13344(c2609M8248);
        c0596.f2331 = c2609M8248;
        c0596.m2455(map);
        C2609<C14163> c2609M2455 = c0596.m2455(linkedHashMap);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            ((Map) C13843.computeIfAbsent(c0596.f2329, (C0052) entry.getKey(), new C7320(1))).putAll((Map) entry.getValue());
        }
        c0596.f2324.f4663.m13338(c0596.f2331);
        if (c0596.m2462()) {
            return c0596;
        }
        C2609 c2609M4509 = C1302.m4509(c1302, c2609M13329);
        C2609 c2609M8239 = C2609.m8239();
        for (C14163 c14163 : c2609M2455) {
            if (!c14163.f42766.mo21322("package-info", EnumC16866.CLASS) || c14163.m16089().f24146 != c14163) {
                c2609M8239 = c2609M8239.m8246(c14163);
            }
        }
        C2609 c2609M8250 = c2609M8239.m8250();
        c2609M4509.getClass();
        c0596.f2323 = c2609M8250.m8248(c2609M4509);
        C2609 c2609M4495 = C1302.m4495(c1302, c2609M13329);
        C2609 c2609M82310 = C2609.m8239();
        for (C14163 c14164 : c2609M2455) {
            if (c14164.f42766.mo21322("package-info", EnumC16866.CLASS) && c14164.m16089().f24146 == c14164) {
                c2609M82310 = c2609M82310.m8246((C7814) c14164.f17561);
            }
        }
        C2609 c2609M8251 = c2609M82310.m8250();
        c2609M4495.getClass();
        c0596.f2322 = c2609M8251.m8248(c2609M4495);
        c0596.f2326 = C2609.m8239();
        c0596.m2461();
        return c0596;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2458() {
        m2456();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m2462() {
        C1302 c1302 = this.f2324;
        if (c1302.f4650.f53540 > 0) {
            return true;
        }
        for (C16719 c16719 : (C18837) this.f2330.m15516()) {
            int i = C21059.f67927[c16719.mo29297().ordinal()];
            if (i == 1) {
                if (c1302.f4656) {
                    return true;
                }
            } else if (i == 2 && (c1302.f4643 || !c16719.m39346(EnumC20043.RECOVERABLE))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m2461() {
        C9770 c9770 = new C9770(this.f2324.f4652);
        this.f2328 = new LinkedHashSet();
        Iterator it = this.f2323.iterator();
        while (it.hasNext()) {
            c9770.m24774((InterfaceC11970) it.next(), (Set) this.f2328);
        }
        Iterator it2 = this.f2322.iterator();
        while (it2.hasNext()) {
            c9770.m24774((InterfaceC11970) it2.next(), (Set) this.f2328);
        }
        Iterator it3 = this.f2326.iterator();
        while (it3.hasNext()) {
            c9770.m24774((InterfaceC11970) it3.next(), (Set) this.f2328);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C2609 m2455(HashMap map) {
        C14163 c14163M47260;
        C2609 c2609M8239 = C2609.m8239();
        for (Map.Entry entry : map.entrySet()) {
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                C1302 c1302 = this.f2324;
                C6136 c6136 = c1302.f4660;
                AbstractC10370 abstractC10370M30652 = c6136.f18880.m30652((String) entry2.getKey());
                InterfaceC18278 interfaceC18278 = (InterfaceC18278) entry2.getValue();
                EnumC16866 enumC16866Mo21321 = interfaceC18278.mo21321();
                EnumC16866 enumC16866 = EnumC16866.CLASS;
                if (enumC16866Mo21321 != enumC16866) {
                    throw new AssertionError(interfaceC18278);
                }
                if (interfaceC18278.mo21322("package-info", enumC16866)) {
                    C7814 c7814M47266 = c1302.f4661.m47266((C0052) entry.getKey(), abstractC10370M30652.m26172(0, abstractC10370M30652.m26170((byte) 46)));
                    if (c7814M47266.f24146 == null) {
                        c7814M47266.f24146 = c1302.f4661.m47261((C0052) entry.getKey(), C12780.m31093(abstractC10370M30652), c7814M47266);
                    }
                    c14163M47260 = c7814M47266.f24146;
                    c14163M47260.m33817();
                    if (c14163M47260.f42766 == null) {
                        c14163M47260.f42766 = interfaceC18278;
                    }
                    c14163M47260.f17564 = c1302.f4654;
                } else {
                    c14163M47260 = c1302.f4661.m47260((C0052) entry.getKey(), abstractC10370M30652);
                    c14163M47260.m33817();
                    c14163M47260.f42766 = interfaceC18278;
                    c14163M47260.f17564 = c1302.f4654;
                    AbstractC5698 abstractC5698 = c14163M47260.f17561;
                    if (abstractC5698.f17559 == EnumC1296.f4579) {
                        abstractC5698.mo16064().mo26382(c14163M47260);
                    }
                }
                c2609M8239 = c2609M8239.m8246(c14163M47260);
            }
        }
        return c2609M8239.m8250();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2460(boolean z, boolean z2) {
        C5431 c5431 = this.f2330;
        C2609 c2609 = this.f2323;
        C1302 c1302 = this.f2324;
        boolean z3 = c1302.f4644;
        C22364 c22364 = c1302.f4637;
        if (z3 || c1302.f4646) {
            C2609 c2609M8239 = z ? C2609.m8239() : c2609;
            Object obj = z ? Collections.EMPTY_SET : this.f2328;
            c22364.m50118("x.print.rounds", Integer.valueOf(this.f2332), "{" + c2609M8239.m8241(", ") + l.d, obj, Boolean.valueOf(z));
        }
        if (!c1302.f4662.m50708()) {
            c1302.f4662.m50709(new C20578(EnumC6466.ANNOTATION_PROCESSING_ROUND));
        }
        try {
            if (z) {
                c1302.f4667.getClass();
                C8358 c8358 = new C8358(true, z2, Collections.EMPTY_SET, c1302);
                C16118 c16118 = c1302.f4653;
                c16118.getClass();
                for (C19648 c19648 : c16118.f49661) {
                    if (c19648.f63396) {
                        C1302.m4499(c16118.f49660, c19648.f63397, c8358);
                    }
                }
            } else {
                C1302.m4498(c1302, this.f2328, c2609, this.f2322, this.f2326);
            }
            if (c1302.f4662.m50708()) {
                return;
            }
            c1302.f4662.m50707(new C20578(EnumC6466.ANNOTATION_PROCESSING_ROUND));
        } catch (Throwable th) {
            try {
                c5431.m15517(new C14258(1));
                c22364.m50112(c5431);
                c1302.f4663.m13340((C5431) null);
                throw th;
            } catch (Throwable th2) {
                if (!c1302.f4662.m50708()) {
                    c1302.f4662.m50707(new C20578(EnumC6466.ANNOTATION_PROCESSING_ROUND));
                }
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2459(boolean z) {
        Predicate predicate;
        if (z) {
            predicate = this.f2321;
        } else {
            predicate = this.f2325;
        }
        C5431 c5431 = this.f2330;
        c5431.m15517(predicate);
        C1302 c1302 = this.f2324;
        c1302.f4637.m50112(c5431);
        c1302.f4663.m13340((C5431) null);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m2456() {
        Set set;
        C1302 c1302 = this.f2324;
        Iterator it = c1302.f4649.m33129().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            set = this.f2327;
            if (!zHasNext) {
                break;
            } else {
                set.add(((C1755) it.next()).f6075);
            }
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            c1302.f4635.mo10758((C1323) it2.next());
        }
        c1302.f4666.m36115();
        c1302.f4649.m33128();
        c1302.f4667.m39560();
        c1302.f4650.f53540 = 0;
        c1302.f4663.m13348();
        c1302.f4658.m10061();
        c1302.f4642.m17499();
        c1302.f4665.m32415();
        c1302.f4652.m48324();
        C20661 c20661 = c1302.f4661;
        c20661.getClass();
        Iterator itM49777 = C22159.m49777(c20661.f66517.values(), new C11213(5));
        while (itM49777.hasNext()) {
            if (((C14163) itM49777.next()).f17559 == EnumC1296.f4581) {
                C20661 c20662 = c1302.f4661;
                c20662.getClass();
                Iterator itM49778 = C22159.m49777(c20662.f66517.values(), new C11213(5));
                while (itM49778.hasNext()) {
                    C14163 c14163 = (C14163) itM49778.next();
                    if (c14163.f42766 != null || c14163.f17559 == EnumC1296.f4581) {
                        EnumC1296 enumC1296 = c14163.f17559;
                        c14163.m33817();
                        if (enumC1296 == EnumC1296.f4581) {
                            c14163.f17560 = new C19955(c14163, c14163.f17560.mo4958(), null);
                        }
                        if (c14163.f17564.mo7078()) {
                            c14163.f17564 = c1302.f4654;
                        }
                    }
                }
                return;
            }
        }
    }
}
