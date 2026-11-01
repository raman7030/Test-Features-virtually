package p067l;

import bin.p000mt.plus.R;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: l.֫ۧᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 150C */
/* JADX INFO: loaded from: classes2.dex */
public final class C4069 {
    /* JADX INFO: renamed from: ֫ */
    public static List m8151() {
        AbstractC17043 abstractC17043M38684 = C17853.m40542().m38684("dictionary");
        if (!abstractC17043M38684.mo25094() || !C24414.m53856()) {
            return Collections.EMPTY_LIST;
        }
        final String strM16224 = C7050.m16224(R.string.MT_Protector);
        List list = (List) C7480.stream(abstractC17043M38684.mo25500(true)).filter(new C15212(0)).map(new C12809(1)).sorted(new Comparator() { // from class: l.۟֫ᩳ
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                String strM48007 = ((C21249) obj).m48007();
                String strM48008 = ((C21249) obj2).m48007();
                String str = strM16224;
                if (strM48007.equalsIgnoreCase(str)) {
                    return -1;
                }
                if (strM48008.equalsIgnoreCase(str)) {
                    return 1;
                }
                return strM48007.compareToIgnoreCase(strM48008);
            }
        }).collect(C24205.toList());
        if (!list.isEmpty()) {
            return list;
        }
        AbstractC17043 abstractC17043M8152 = m8152(strM16224);
        if (abstractC17043M8152.mo25094() || abstractC17043M8152.mo25496()) {
            return Collections.singletonList(new C21249(strM16224));
        }
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC17043 m8152(String str) {
        return C17853.m40542().m38684("dictionary").m38684(str + ".mtd");
    }
}
