package p067l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: l.ۙ᩻ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4W0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7104 {
    /* JADX INFO: renamed from: ֫ */
    public static C23198[] m16372(C23198[] c23198Arr) {
        if (c23198Arr != null && c23198Arr.length > 1) {
            int i = 0;
            while (i < c23198Arr.length) {
                int i2 = i + 1;
                for (int i3 = i2; i3 < c23198Arr.length; i3++) {
                    if (m16371(c23198Arr[i], c23198Arr[i3])) {
                        ArrayList arrayList = new ArrayList(Arrays.asList(c23198Arr));
                        while (true) {
                            int i4 = 0;
                            while (i4 < arrayList.size()) {
                                int i5 = i4 + 1;
                                int i6 = i5;
                                while (true) {
                                    if (i6 < arrayList.size()) {
                                        C23198 c23198 = (C23198) arrayList.get(i4);
                                        C23198 c23199 = (C23198) arrayList.get(i6);
                                        boolean zM16371 = m16371(c23198, c23199);
                                        String str = c23198.f72883;
                                        int i7 = c23198.f72881;
                                        String str2 = c23199.f72883;
                                        int i8 = c23199.f72881;
                                        if (zM16371) {
                                            int i9 = c23198.f72882;
                                            int i10 = c23199.f72882;
                                            if (i9 < i10) {
                                                arrayList.set(i6, new C23198(str2, i10, i7));
                                                arrayList.add(i6 + 1, new C23198(str2, i7, i8));
                                            } else {
                                                arrayList.set(i4, new C23198(str, i9, i8));
                                                arrayList.add(i5, new C23198(str, i8, i7));
                                            }
                                        } else {
                                            i6++;
                                        }
                                    } else {
                                        i4 = i5;
                                    }
                                }
                            }
                            return (C23198[]) arrayList.toArray(new C23198[0]);
                        }
                    }
                }
                i = i2;
            }
        }
        return c23198Arr;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m16371(C23198 c23198, C23198 c23199) {
        int i = c23198.f72882;
        int i2 = c23198.f72881;
        int i3 = c23199.f72882;
        int i4 = c23199.f72881;
        if (i >= i3 || i3 >= i2 || i2 >= i4) {
            return i3 < i && i < i4 && i4 < i2;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C23198[] m16373(C23198[] c23198Arr) {
        if (c23198Arr == null || c23198Arr.length <= 1) {
            return c23198Arr;
        }
        HashMap map = new HashMap();
        for (C23198 c23198 : c23198Arr) {
            ((List) C15525.computeIfAbsent(map, c23198.f72883, new C23868(0))).add(c23198);
        }
        ArrayList arrayList = new ArrayList();
        for (String str : map.keySet()) {
            List list = (List) map.get(str);
            C12826.requireNonNull(list);
            List list2 = list;
            C8150.sort(list2, C10162.comparingInt(new C21857()));
            int i = ((C23198) list2.get(0)).f72882;
            int iMax = ((C23198) list2.get(0)).f72881;
            for (int i2 = 1; i2 < list2.size(); i2++) {
                C23198 c23199 = (C23198) list2.get(i2);
                int i3 = c23199.f72882;
                int i4 = c23199.f72881;
                if (i3 <= iMax) {
                    iMax = Math.max(iMax, i4);
                } else {
                    arrayList.add(new C23198(str, i, iMax));
                    i = c23199.f72882;
                    iMax = i4;
                }
            }
            arrayList.add(new C23198(str, i, iMax));
        }
        return (C23198[]) arrayList.toArray(new C23198[0]);
    }
}
