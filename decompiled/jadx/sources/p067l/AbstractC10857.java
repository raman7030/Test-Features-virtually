package p067l;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۡܳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10857 {
    /* JADX INFO: renamed from: ֫ */
    public boolean mo25019() {
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m25017(StringBuilder sb, String str, List list, String str2) {
        sb.append(str);
        Iterator it = list.iterator();
        String str3 = "";
        while (it.hasNext()) {
            AbstractC10857 abstractC10857 = (AbstractC10857) it.next();
            sb.append(str3);
            sb.append(abstractC10857);
            str3 = ", ";
        }
        sb.append(str2);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m25018(StringBuilder sb, String str, List list, String str2) {
        if (list == null || list.size() <= 0) {
            return;
        }
        m25017(sb, str, list, str2);
    }
}
