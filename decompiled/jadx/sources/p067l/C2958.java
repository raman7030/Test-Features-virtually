package p067l;

import java.util.Map;

/* JADX INFO: renamed from: l.֡᩵ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98J9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2958 {
    /* JADX INFO: renamed from: ֫ */
    public static C7653 m4908(C7653 c7653, String[] strArr, Map map) {
        int i = 0;
        if (c7653 == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (C7653) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                C7653 c7654 = new C7653();
                int length = strArr.length;
                while (i < length) {
                    c7654.m17643((C7653) map.get(strArr[i]));
                    i++;
                }
                return c7654;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                c7653.m17643((C7653) map.get(strArr[0]));
                return c7653;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    c7653.m17643((C7653) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return c7653;
    }
}
