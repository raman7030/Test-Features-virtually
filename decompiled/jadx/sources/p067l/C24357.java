package p067l;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.᩺ܿܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A6LD */
/* JADX INFO: loaded from: classes.dex */
public final class C24357 implements InterfaceC7131 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ InterfaceC21214 f77128;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ StringBuilder f77129;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ String f77130;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ TreeMap f77131;

    @Override // p067l.InterfaceC7131
    /* JADX INFO: renamed from: ۧ */
    public final Set mo16408() {
        Object[] objArr = {C22003.class, C21676.class, C23687.class};
        HashSet hashSet = new HashSet(3);
        for (int i = 0; i < 3; i++) {
            Object obj = objArr[i];
            C12826.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(C7470.m17246(obj, "duplicate element: "));
            }
        }
        return C21562.unmodifiableSet(hashSet);
    }

    public C24357(String str, InterfaceC21214 interfaceC21214, TreeMap treeMap, StringBuilder sb) {
        this.f77130 = str;
        this.f77128 = interfaceC21214;
        this.f77131 = treeMap;
        this.f77129 = sb;
    }

    @Override // p067l.InterfaceC7131
    /* JADX INFO: renamed from: ֫ */
    public final void mo16407(AbstractC2555 abstractC2555) {
        String string;
        StringBuilder sb;
        TreeMap treeMap;
        boolean z = abstractC2555 instanceof C21676;
        int i = 0;
        InterfaceC21214 interfaceC21214 = this.f77128;
        if (z || (abstractC2555 instanceof C23687)) {
            boolean z2 = !z || ((C21676) abstractC2555).f68284;
            if (z) {
                string = ((C21676) abstractC2555).f68283;
            } else {
                string = ((C23687) abstractC2555).f75407.toString();
            }
            String str = z ? "span" : "div";
            HashMap map = new HashMap();
            map.put(this.f77130, z2 ? "math" : "inline-math");
            interfaceC21214.mo27092().m30163(str, interfaceC21214.mo27091(abstractC2555, str, map), false);
            interfaceC21214.mo27092().m30166(string);
            interfaceC21214.mo27092().m30165("/".concat(str));
            return;
        }
        interfaceC21214.mo27092().m30161();
        String strM49572 = ((C22003) abstractC2555).m49572();
        List listM3764 = abstractC2555.m3764();
        int length = 0;
        while (true) {
            int size = listM3764.size();
            sb = this.f77129;
            treeMap = this.f77131;
            if (i >= size || length >= strM49572.length()) {
                break;
            }
            treeMap.put(Integer.valueOf(sb.length() + length), Integer.valueOf(((C21332) listM3764.get(i)).m48342()));
            int iIndexOf = strM49572.indexOf(10, length);
            length = iIndexOf < 0 ? strM49572.length() : iIndexOf + 1;
            i++;
        }
        interfaceC21214.mo27092().m30164(strM49572);
        treeMap.put(Integer.valueOf(sb.length()), -1);
        interfaceC21214.mo27092().m30161();
    }
}
