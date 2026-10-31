package l;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.᩺ܿܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A6LD */
/* JADX INFO: loaded from: classes.dex */
public final class C23136 implements InterfaceC5012 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC19830 f74382;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ StringBuilder f74383;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f74384;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TreeMap f74385;

    @Override // l.InterfaceC5012
    /* JADX INFO: renamed from: ۧ */
    public final Set mo14504() {
        Object[] objArr = {C20660.class, C20315.class, C22431.class};
        HashSet hashSet = new HashSet(3);
        for (int i = 0; i < 3; i++) {
            Object obj = objArr[i];
            C11003.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(C5368.m15337(obj, "duplicate element: "));
            }
        }
        return C20195.unmodifiableSet(hashSet);
    }

    public C23136(String str, InterfaceC19830 interfaceC19830, TreeMap treeMap, StringBuilder sb) {
        this.f74384 = str;
        this.f74382 = interfaceC19830;
        this.f74385 = treeMap;
        this.f74383 = sb;
    }

    @Override // l.InterfaceC5012
    /* JADX INFO: renamed from: ֫ */
    public final void mo14503(AbstractC0197 abstractC0197) {
        String string;
        StringBuilder sb;
        TreeMap treeMap;
        boolean z = abstractC0197 instanceof C20315;
        int i = 0;
        InterfaceC19830 interfaceC19830 = this.f74382;
        if (z || (abstractC0197 instanceof C22431)) {
            boolean z2 = !z || ((C20315) abstractC0197).f65609;
            if (z) {
                string = ((C20315) abstractC0197).f65608;
            } else {
                string = ((C22431) abstractC0197).f72680.toString();
            }
            String str = z ? "span" : "div";
            HashMap map = new HashMap();
            map.put(this.f74384, z2 ? "math" : "inline-math");
            interfaceC19830.mo25075().m28119(str, interfaceC19830.mo25074(abstractC0197, str, map), false);
            interfaceC19830.mo25075().m28122(string);
            interfaceC19830.mo25075().m28121("/".concat(str));
            return;
        }
        interfaceC19830.mo25075().m28117();
        String strM47245 = ((C20660) abstractC0197).m47245();
        List listM1351 = abstractC0197.m1351();
        int length = 0;
        while (true) {
            int size = listM1351.size();
            sb = this.f74383;
            treeMap = this.f74385;
            if (i >= size || length >= strM47245.length()) {
                break;
            }
            treeMap.put(Integer.valueOf(sb.length() + length), Integer.valueOf(((C19954) listM1351.get(i)).m46028()));
            int iIndexOf = strM47245.indexOf(10, length);
            length = iIndexOf < 0 ? strM47245.length() : iIndexOf + 1;
            i++;
        }
        interfaceC19830.mo25075().m28120(strM47245);
        treeMap.put(Integer.valueOf(sb.length()), -1);
        interfaceC19830.mo25075().m28117();
    }
}
