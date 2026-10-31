package l;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۡܳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8932 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean mo23045() {
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m23043(StringBuilder sb, String str, List list, String str2) {
        sb.append(str);
        Iterator it = list.iterator();
        String str3 = "";
        while (it.hasNext()) {
            AbstractC8932 abstractC8932 = (AbstractC8932) it.next();
            sb.append(str3);
            sb.append(abstractC8932);
            str3 = ", ";
        }
        sb.append(str2);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m23044(StringBuilder sb, String str, List list, String str2) {
        if (list == null || list.size() <= 0) {
            return;
        }
        m23043(sb, str, list, str2);
    }
}
