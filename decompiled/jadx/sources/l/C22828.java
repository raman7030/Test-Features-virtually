package l;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.᩺ۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: JBHC */
/* JADX INFO: loaded from: classes.dex */
public final class C22828 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f73699 = new HashMap(50);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50938(AbstractC5895 abstractC5895) {
        for (AbstractC2368 abstractC2368 : abstractC5895.mo6834()) {
            String strMo2463 = abstractC2368.mo2862().mo2463();
            HashMap map = this.f73699;
            C11540 c11540 = (C11540) map.get(strMo2463);
            if (c11540 == null) {
                map.put(strMo2463, new C11540(abstractC2368, strMo2463));
            } else {
                c11540.m28416(abstractC2368);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50939(C18241 c18241) {
        HashMap map = this.f73699;
        if (map.size() == 0) {
            return;
        }
        c18241.m42501(0, "\nstatistics:\n");
        TreeMap treeMap = new TreeMap();
        for (C11540 c11540 : map.values()) {
            treeMap.put(c11540.f34459, c11540);
        }
        Iterator it = treeMap.values().iterator();
        while (it.hasNext()) {
            ((C11540) it.next()).m28417(c18241);
        }
    }
}
