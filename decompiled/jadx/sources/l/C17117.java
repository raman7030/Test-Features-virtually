package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ܿۙ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 2998 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17117 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Map f52453 = C20195.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static BinderC17823 m40145(C11928 c11928) {
        c11928.getClass();
        String className = c11928.f35659.getClassName();
        Map map = f52453;
        BinderC17823 binderC17823 = (BinderC17823) map.get(className);
        if (binderC17823 != null) {
            return binderC17823;
        }
        BinderC17823 binderC17824 = new BinderC17823(c11928);
        map.put(className, binderC17824);
        return binderC17824;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40146(BinderC17823 binderC17823) {
        ArrayList arrayList = new ArrayList();
        Map map = f52453;
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() == binderC17823) {
                arrayList.add((String) entry.getKey());
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            map.remove((String) it.next());
        }
    }
}
