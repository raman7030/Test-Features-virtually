package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ۛۧۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 26KG */
/* JADX INFO: loaded from: classes2.dex */
public final class C6013 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f18456;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f18457;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4277 f18458;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final HashMap f18459 = new HashMap();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final HashMap f18460 = new HashMap();

    public C6013(InterfaceC4277 interfaceC4277) throws C3059 {
        this.f18458 = interfaceC4277;
        this.f18456 = interfaceC4277.mo12858();
        this.f18457 = interfaceC4277.mo12853().size() + 1;
        for (InterfaceC0748 interfaceC0748 : interfaceC4277.mo12850()) {
            if (this.f18460.put(Integer.valueOf(interfaceC0748.mo2870()), interfaceC0748) != null) {
                throw C7424.m19957("RESOURCE_TARGET_AMBIGUOUS", "Duplicate type IDs prevent adding resources safely.");
            }
            this.f18457 = Math.max(this.f18457, interfaceC0748.mo2870() + 1);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13773 m16825(int i) {
        InterfaceC0748 interfaceC0748;
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f18459;
        C13773 c13773 = (C13773) map.get(numValueOf);
        if (c13773 == null && (interfaceC0748 = (InterfaceC0748) this.f18460.get(Integer.valueOf(i))) != null) {
            c13773 = new C13773(interfaceC0748.mo2870(), interfaceC0748.getTypeName());
            c13773.f41076 = interfaceC0748;
            c13773.f41080 = interfaceC0748.mo2878();
            for (InterfaceC7099 interfaceC7099 : interfaceC0748.mo2872()) {
                c13773.f41080 = Math.max(c13773.f41080, interfaceC7099.mo2344() + 1);
                String strM8426 = C2692.m8426(interfaceC7099);
                for (InterfaceC21211 interfaceC21211 : interfaceC7099.mo18746()) {
                    int iMo47883 = interfaceC21211.mo47883();
                    String strMo29406 = interfaceC21211.mo29406();
                    String str = (String) c13773.f41075.put(Integer.valueOf(iMo47883), strMo29406);
                    if (str != null && !str.equals(strMo29406)) {
                        throw C7424.m19957("RESOURCE_TARGET_AMBIGUOUS", "Resource variants disagree about the entry name.");
                    }
                    c13773.f41081.put(strMo29406, Integer.valueOf(iMo47883));
                    if (!c13773.f41082.add(iMo47883 + "\n" + strM8426)) {
                        throw C7424.m19957("RESOURCE_TARGET_AMBIGUOUS", "Duplicate resource variants prevent adding resources safely.");
                    }
                }
            }
            map.put(Integer.valueOf(i), c13773);
        }
        return c13773;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13773 m16826(String str) {
        int iMo2870 = -1;
        for (InterfaceC0748 interfaceC0748 : this.f18460.values()) {
            if (C2692.m8425(interfaceC0748.getTypeName()).equals(str)) {
                if (iMo2870 != -1) {
                    throw C7424.m19957("RESOURCE_TARGET_AMBIGUOUS", "Multiple types have the requested resource type name.");
                }
                iMo2870 = interfaceC0748.mo2870();
            }
        }
        if (iMo2870 != -1) {
            return m16825(iMo2870);
        }
        HashMap map = this.f18459;
        for (C13773 c13773 : map.values()) {
            if (C2692.m8425(c13773.f41079).equals(str)) {
                return c13773;
            }
        }
        int i = this.f18457;
        if (i > 255) {
            throw C7424.m19957("RESOURCE_ID_EXHAUSTED", "No unused type ID remains in this package.");
        }
        this.f18457 = i + 1;
        C13773 c13774 = new C13773(i, str);
        map.put(Integer.valueOf(c13774.f41077), c13774);
        return c13774;
    }
}
