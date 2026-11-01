package p067l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۚۜ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: HAT6 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7289 {
    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo3894(AbstractC20244 abstractC20244, C20915 c20915);

    /* JADX INFO: renamed from: ۧ */
    public AbstractC7289 mo13356(AbstractC20244 abstractC20244, C20915 c20915) {
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC7289 m16743(AbstractC7289 abstractC7289, AbstractC7289 abstractC72810) {
        C4607 c4607;
        if (abstractC7289 == null || abstractC7289 == (c4607 = C4607.f10339)) {
            return abstractC72810;
        }
        if (abstractC72810 == null || abstractC72810 == c4607) {
            return abstractC7289;
        }
        C17346 c17346 = new C17346(abstractC7289, abstractC72810);
        AbstractC7289[] abstractC7289Arr = c17346.f51736;
        return abstractC7289Arr.length == 1 ? abstractC7289Arr[0] : c17346;
    }

    /* JADX INFO: renamed from: ֫ */
    public static List m16742(HashSet hashSet) {
        Iterator it = hashSet.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            AbstractC7289 abstractC7289 = (AbstractC7289) it.next();
            if (abstractC7289 instanceof C20701) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((C20701) abstractC7289);
                it.remove();
            }
        }
        return arrayList == null ? Collections.EMPTY_LIST : arrayList;
    }
}
