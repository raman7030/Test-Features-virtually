package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗۛۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: G5Y2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3050 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m9341(Object obj, ArrayList arrayList) {
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (!arrayList.contains(obj)) {
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static ArrayList m9342(Object obj, ArrayList arrayList) {
        if (arrayList != null) {
            arrayList.remove(obj);
            if (arrayList.isEmpty()) {
                return null;
            }
        }
        return arrayList;
    }
}
