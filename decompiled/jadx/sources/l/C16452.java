package l;

import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: l.ܽۛۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: H74F */
/* JADX INFO: loaded from: classes4.dex */
public final class C16452 {
    /* JADX WARN: Code duplicated, block: B:40:0x00d6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m38760(Resources resources, C14017 c14017) {
        int i;
        int i2;
        String upperCase;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        AbstractC4628 abstractC4628ListIterator = c14017.m33608().listIterator(0);
        int i4 = 0;
        while (abstractC4628ListIterator.hasNext()) {
            C23190 c23190 = (C23190) abstractC4628ListIterator.next();
            if (c23190.m51440() == 2) {
                for (int i5 = 0; i5 < c23190.f74548; i5++) {
                    C8353 c8353M51437 = c23190.m51437(i5);
                    if (c23190.m51439(i5, false) && (c8353M51437.f25608 & 16384) == 0) {
                        arrayList.add(new C1636(c23190, i5, c8353M51437, i4));
                        i4++;
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        C6083.sort(arrayList, new C13753());
        C21507 c21507 = new C21507(resources);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(c21507.m48673(((C1636) it.next()).m5512()));
        }
        HashMap mapM38759 = m38759(arrayList2);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int i6 = 0;
        while (true) {
            i = 1;
            if (i6 >= arrayList.size()) {
                break;
            }
            String strM50967 = (String) arrayList2.get(i6);
            C8353 c8353M5512 = ((C1636) arrayList.get(i6)).m5512();
            String str = c8353M5512.f25619;
            String strSubstring = c8353M5512.f25614;
            if (!TextUtils.isEmpty(str)) {
                upperCase = c8353M5512.f25619;
            } else if (TextUtils.isEmpty(strSubstring)) {
                upperCase = null;
            } else {
                int iLastIndexOf = strSubstring.lastIndexOf(47);
                if (iLastIndexOf >= 0) {
                    strSubstring = strSubstring.substring(iLastIndexOf + 1);
                }
                if (TextUtils.isEmpty(strSubstring)) {
                    upperCase = null;
                } else {
                    upperCase = strSubstring.toUpperCase(Locale.ROOT);
                }
            }
            if (((Integer) C13843.getOrDefault(mapM38759, strM50967.trim().toLowerCase(Locale.ROOT), 0)).intValue() > 1 && !TextUtils.isEmpty(upperCase)) {
                strM50967 = C22870.m50967(strM50967, " · ", upperCase);
            }
            arrayList3.add(strM50967);
            i6++;
        }
        HashMap mapM387510 = m38759(arrayList3);
        HashMap map = new HashMap();
        ArrayList arrayList4 = new ArrayList(arrayList.size());
        while (i3 < arrayList.size()) {
            C1636 c1636 = (C1636) arrayList.get(i3);
            String strM9831 = (String) arrayList3.get(i3);
            String lowerCase = strM9831.trim().toLowerCase(Locale.ROOT);
            if (((Integer) C13843.getOrDefault(mapM387510, lowerCase, 0)).intValue() > i) {
                int iIntValue = ((Integer) C13843.getOrDefault(map, lowerCase, 0)).intValue() + i;
                map.put(lowerCase, Integer.valueOf(iIntValue));
                StringBuilder sb = new StringBuilder();
                sb.append(strM9831);
                sb.append(" (");
                strM9831 = C3200.m9831(iIntValue, MotionUtils.EASING_TYPE_FORMAT_END, sb);
            }
            String str2 = strM9831;
            C23190 c23190M5514 = c1636.m5514();
            int iM5513 = c1636.m5513();
            C8353 c8353M5513 = c1636.m5512();
            C8353 c8353M5514 = c1636.m5512();
            int i7 = c8353M5514.f25633;
            int iMin = (i7 <= 0 || (i2 = c8353M5514.f25609) <= 0) ? -1 : Math.min(i7, i2);
            arrayList4.add(new C7404(c23190M5514, iM5513, c8353M5513, str2, iMin > 0 ? iMin + "P" : c21507.m48673(c8353M5514)));
            i3++;
            i = 1;
        }
        return C20195.unmodifiableList(arrayList4);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11902 m38761(C11902 c11902, C7404 c7404) {
        return c11902.mo29029().mo17262(2, false).mo17261(2).mo17264(new C12607(c7404.m19924().m51438(), AbstractC14545.of((Object) Integer.valueOf(c7404.m19927())))).mo17266();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m38758(List list, C11902 c11902) {
        AbstractC20151 it = c11902.f35552.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                return 0;
            }
            C12607 c12607 = (C12607) it.next();
            C13312 c13312 = c12607.f38012;
            AbstractC14545 abstractC14545 = c12607.f38013;
            if (c13312.f39853 == 2 && abstractC14545.size() == 1) {
                int iIntValue = ((Integer) abstractC14545.get(0)).intValue();
                for (int i = 0; i < list.size(); i++) {
                    C7404 c7404 = (C7404) list.get(i);
                    if (c7404.m19927() == iIntValue && c7404.m19924().m51438().equals(c12607.f38012)) {
                        return i + 1;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static HashMap m38759(ArrayList arrayList) {
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String lowerCase = ((String) it.next()).trim().toLowerCase(Locale.ROOT);
            map.put(lowerCase, Integer.valueOf(((Integer) C13843.getOrDefault(map, lowerCase, 0)).intValue() + 1));
        }
        return map;
    }
}
