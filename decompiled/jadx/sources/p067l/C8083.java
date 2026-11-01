package p067l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ۛۧۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 26KG */
/* JADX INFO: loaded from: classes2.dex */
public final class C8083 {

    /* JADX INFO: renamed from: ֫ */
    public final int f21311;

    /* JADX INFO: renamed from: ۧ */
    public int f21312;

    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC6434 f21313;

    /* JADX INFO: renamed from: ܿ */
    public final HashMap f21314 = new HashMap();

    /* JADX INFO: renamed from: ᩳ */
    public final HashMap f21315 = new HashMap();

    public C8083(InterfaceC6434 interfaceC6434) throws C5276 {
        this.f21313 = interfaceC6434;
        this.f21311 = interfaceC6434.mo14722();
        this.f21312 = interfaceC6434.mo14717().size() + 1;
        for (InterfaceC3080 interfaceC3080 : interfaceC6434.mo14714()) {
            if (this.f21315.put(Integer.valueOf(interfaceC3080.mo5199()), interfaceC3080) != null) {
                throw C9424.m21931("RESOURCE_TARGET_AMBIGUOUS", "Duplicate type IDs prevent adding resources safely.");
            }
            this.f21312 = Math.max(this.f21312, interfaceC3080.mo5199() + 1);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C15458 m18752(int i) {
        InterfaceC3080 interfaceC3080;
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f21314;
        C15458 c15458 = (C15458) map.get(numValueOf);
        if (c15458 == null && (interfaceC3080 = (InterfaceC3080) this.f21315.get(Integer.valueOf(i))) != null) {
            c15458 = new C15458(interfaceC3080.mo5199(), interfaceC3080.getTypeName());
            c15458.f44153 = interfaceC3080;
            c15458.f44157 = interfaceC3080.mo5207();
            for (InterfaceC9116 interfaceC9116 : interfaceC3080.mo5201()) {
                c15458.f44157 = Math.max(c15458.f44157, interfaceC9116.mo4715() + 1);
                String strM10472 = C4927.m10472(interfaceC9116);
                for (InterfaceC22528 interfaceC22528 : interfaceC9116.mo20696()) {
                    int iMo50213 = interfaceC22528.mo50213();
                    String strMo31468 = interfaceC22528.mo31468();
                    String str = (String) c15458.f44152.put(Integer.valueOf(iMo50213), strMo31468);
                    if (str != null && !str.equals(strMo31468)) {
                        throw C9424.m21931("RESOURCE_TARGET_AMBIGUOUS", "Resource variants disagree about the entry name.");
                    }
                    c15458.f44158.put(strMo31468, Integer.valueOf(iMo50213));
                    if (!c15458.f44159.add(iMo50213 + "\n" + strM10472)) {
                        throw C9424.m21931("RESOURCE_TARGET_AMBIGUOUS", "Duplicate resource variants prevent adding resources safely.");
                    }
                }
            }
            map.put(Integer.valueOf(i), c15458);
        }
        return c15458;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C15458 m18753(String str) {
        int iMo5199 = -1;
        for (InterfaceC3080 interfaceC3080 : this.f21315.values()) {
            if (C4927.m10471(interfaceC3080.getTypeName()).equals(str)) {
                if (iMo5199 != -1) {
                    throw C9424.m21931("RESOURCE_TARGET_AMBIGUOUS", "Multiple types have the requested resource type name.");
                }
                iMo5199 = interfaceC3080.mo5199();
            }
        }
        if (iMo5199 != -1) {
            return m18752(iMo5199);
        }
        HashMap map = this.f21314;
        for (C15458 c15458 : map.values()) {
            if (C4927.m10471(c15458.f44156).equals(str)) {
                return c15458;
            }
        }
        int i = this.f21312;
        if (i > 255) {
            throw C9424.m21931("RESOURCE_ID_EXHAUSTED", "No unused type ID remains in this package.");
        }
        this.f21312 = i + 1;
        C15458 c15459 = new C15458(i, str);
        map.put(Integer.valueOf(c15459.f44154), c15459);
        return c15459;
    }
}
