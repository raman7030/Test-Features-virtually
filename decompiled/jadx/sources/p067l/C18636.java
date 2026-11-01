package p067l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ܿۙ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 2998 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18636 {

    /* JADX INFO: renamed from: ֫ */
    public static final Map f55635 = C21562.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: ֫ */
    public static BinderC19307 m42390(C13705 c13705) {
        c13705.getClass();
        String className = c13705.f38668.getClassName();
        Map map = f55635;
        BinderC19307 binderC19307 = (BinderC19307) map.get(className);
        if (binderC19307 != null) {
            return binderC19307;
        }
        BinderC19307 binderC19308 = new BinderC19307(c13705);
        map.put(className, binderC19308);
        return binderC19308;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m42391(BinderC19307 binderC19307) {
        ArrayList arrayList = new ArrayList();
        Map map = f55635;
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() == binderC19307) {
                arrayList.add((String) entry.getKey());
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            map.remove((String) it.next());
        }
    }
}
