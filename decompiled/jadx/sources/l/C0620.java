package l;

import java.util.Map;

/* JADX INFO: renamed from: l.֡᩵ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98J9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0620 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5560 m2552(C5560 c5560, String[] strArr, Map map) {
        int i = 0;
        if (c5560 == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (C5560) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                C5560 c5561 = new C5560();
                int length = strArr.length;
                while (i < length) {
                    c5561.m15728((C5560) map.get(strArr[i]));
                    i++;
                }
                return c5561;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                c5560.m15728((C5560) map.get(strArr[0]));
                return c5560;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    c5560.m15728((C5560) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return c5560;
    }
}
