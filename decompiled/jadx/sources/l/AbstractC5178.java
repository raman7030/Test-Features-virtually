package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۚۜ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: HAT6 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5178 {
    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo1496(AbstractC18809 abstractC18809, C19515 c19515);

    /* JADX INFO: renamed from: ۧ */
    public AbstractC5178 mo11420(AbstractC18809 abstractC18809, C19515 c19515) {
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC5178 m14833(AbstractC5178 abstractC5178, AbstractC5178 abstractC5179) {
        C2356 c2356;
        if (abstractC5178 == null || abstractC5178 == (c2356 = C2356.f7548)) {
            return abstractC5179;
        }
        if (abstractC5179 == null || abstractC5179 == c2356) {
            return abstractC5178;
        }
        C15760 c15760 = new C15760(abstractC5178, abstractC5179);
        AbstractC5178[] abstractC5178Arr = c15760.f48597;
        return abstractC5178Arr.length == 1 ? abstractC5178Arr[0] : c15760;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m14832(HashSet hashSet) {
        Iterator it = hashSet.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            AbstractC5178 abstractC5178 = (AbstractC5178) it.next();
            if (abstractC5178 instanceof C19290) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((C19290) abstractC5178);
                it.remove();
            }
        }
        return arrayList == null ? Collections.EMPTY_LIST : arrayList;
    }
}
