package p067l;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.᩺ۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: JBHC */
/* JADX INFO: loaded from: classes.dex */
public final class C24064 {

    /* JADX INFO: renamed from: ֫ */
    public final HashMap f76431 = new HashMap(50);

    /* JADX INFO: renamed from: ֫ */
    public final void m53328(AbstractC7971 abstractC7971) {
        for (AbstractC4619 abstractC4619 : abstractC7971.mo8960()) {
            String strMo4819 = abstractC4619.mo5191().mo4819();
            HashMap map = this.f76431;
            C13336 c13336 = (C13336) map.get(strMo4819);
            if (c13336 == null) {
                map.put(strMo4819, new C13336(abstractC4619, strMo4819));
            } else {
                c13336.m30462(abstractC4619);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53329(C19705 c19705) {
        HashMap map = this.f76431;
        if (map.size() == 0) {
            return;
        }
        c19705.m44760(0, "\nstatistics:\n");
        TreeMap treeMap = new TreeMap();
        for (C13336 c13336 : map.values()) {
            treeMap.put(c13336.f37456, c13336);
        }
        Iterator it = treeMap.values().iterator();
        while (it.hasNext()) {
            ((C13336) it.next()).m30463(c19705);
        }
    }
}
