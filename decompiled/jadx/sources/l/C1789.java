package l;

import bin.mt.plus.R;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: l.֫ۧᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 150C */
/* JADX INFO: loaded from: classes2.dex */
public final class C1789 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m5956() {
        AbstractC15440 abstractC15440M36526 = C16293.m38327().m36526("dictionary");
        if (!abstractC15440M36526.mo23120() || !C23196.m51460()) {
            return Collections.EMPTY_LIST;
        }
        final String strM14327 = C4925.m14327(R.string.MT_Protector);
        List list = (List) C5378.stream(abstractC15440M36526.mo23549(true)).filter(new C13514(0)).map(new C10985(1)).sorted(new Comparator() { // from class: l.۟֫ᩳ
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                String strM45696 = ((C19866) obj).m45696();
                String strM45697 = ((C19866) obj2).m45696();
                String str = strM14327;
                if (strM45696.equalsIgnoreCase(str)) {
                    return -1;
                }
                if (strM45697.equalsIgnoreCase(str)) {
                    return 1;
                }
                return strM45696.compareToIgnoreCase(strM45697);
            }
        }).collect(C22976.toList());
        if (!list.isEmpty()) {
            return list;
        }
        AbstractC15440 abstractC15440M5957 = m5957(strM14327);
        if (abstractC15440M5957.mo23120() || abstractC15440M5957.mo23545()) {
            return Collections.singletonList(new C19866(strM14327));
        }
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m5957(String str) {
        return C16293.m38327().m36526("dictionary").m36526(str + ".mtd");
    }
}
