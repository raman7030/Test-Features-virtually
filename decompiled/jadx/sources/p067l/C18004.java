package p067l;

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
public final class C18004 {
    /* JADX WARN: Code duplicated, block: B:40:0x00d6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public static List m40985(Resources resources, C15690 c15690) {
        int i;
        int i2;
        String upperCase;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        AbstractC6767 abstractC6767ListIterator = c15690.m35728().listIterator(0);
        int i4 = 0;
        while (abstractC6767ListIterator.hasNext()) {
            C24408 c24408 = (C24408) abstractC6767ListIterator.next();
            if (c24408.m53836() == 2) {
                for (int i5 = 0; i5 < c24408.f77291; i5++) {
                    C10307 c10307M53833 = c24408.m53833(i5);
                    if (c24408.m53835(i5, false) && (c10307M53833.f28522 & 16384) == 0) {
                        arrayList.add(new C3923(c24408, i5, c10307M53833, i4));
                        i4++;
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        C8150.sort(arrayList, new C15439());
        C22809 c22809 = new C22809(resources);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(c22809.m51010(((C3923) it.next()).m7742()));
        }
        HashMap mapM40984 = m40984(arrayList2);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int i6 = 0;
        while (true) {
            i = 1;
            if (i6 >= arrayList.size()) {
                break;
            }
            String strM53357 = (String) arrayList2.get(i6);
            C10307 c10307M7742 = ((C3923) arrayList.get(i6)).m7742();
            String str = c10307M7742.f28533;
            String strSubstring = c10307M7742.f28528;
            if (!TextUtils.isEmpty(str)) {
                upperCase = c10307M7742.f28533;
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
            if (((Integer) C15525.getOrDefault(mapM40984, strM53357.trim().toLowerCase(Locale.ROOT), 0)).intValue() > 1 && !TextUtils.isEmpty(upperCase)) {
                strM53357 = C24104.m53357(strM53357, " · ", upperCase);
            }
            arrayList3.add(strM53357);
            i6++;
        }
        HashMap mapM40985 = m40984(arrayList3);
        HashMap map = new HashMap();
        ArrayList arrayList4 = new ArrayList(arrayList.size());
        while (i3 < arrayList.size()) {
            C3923 c3923 = (C3923) arrayList.get(i3);
            String strM11876 = (String) arrayList3.get(i3);
            String lowerCase = strM11876.trim().toLowerCase(Locale.ROOT);
            if (((Integer) C15525.getOrDefault(mapM40985, lowerCase, 0)).intValue() > i) {
                int iIntValue = ((Integer) C15525.getOrDefault(map, lowerCase, 0)).intValue() + i;
                map.put(lowerCase, Integer.valueOf(iIntValue));
                StringBuilder sb = new StringBuilder();
                sb.append(strM11876);
                sb.append(" (");
                strM11876 = C5410.m11876(iIntValue, MotionUtils.EASING_TYPE_FORMAT_END, sb);
            }
            String str2 = strM11876;
            C24408 c24408M7744 = c3923.m7744();
            int iM7743 = c3923.m7743();
            C10307 c10307M7743 = c3923.m7742();
            C10307 c10307M7744 = c3923.m7742();
            int i7 = c10307M7744.f28547;
            int iMin = (i7 <= 0 || (i2 = c10307M7744.f28523) <= 0) ? -1 : Math.min(i7, i2);
            arrayList4.add(new C9405(c24408M7744, iM7743, c10307M7743, str2, iMin > 0 ? iMin + "P" : c22809.m51010(c10307M7744)));
            i3++;
            i = 1;
        }
        return C21562.unmodifiableList(arrayList4);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C13680 m40986(C13680 c13680, C9405 c9405) {
        return c13680.mo31081().mo19200(2, false).mo19199(2).mo19202(new C14350(c9405.m21898().m53834(), AbstractC16192.m36873of((Object) Integer.valueOf(c9405.m21901())))).mo19204();
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m40983(List list, C13680 c13680) {
        AbstractC21520 it = c13680.f38562.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                return 0;
            }
            C14350 c14350 = (C14350) it.next();
            C15020 c15020 = c14350.f41039;
            AbstractC16192 abstractC16192 = c14350.f41040;
            if (c15020.f42920 == 2 && abstractC16192.size() == 1) {
                int iIntValue = ((Integer) abstractC16192.get(0)).intValue();
                for (int i = 0; i < list.size(); i++) {
                    C9405 c9405 = (C9405) list.get(i);
                    if (c9405.m21901() == iIntValue && c9405.m21898().m53834().equals(c14350.f41039)) {
                        return i + 1;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static HashMap m40984(ArrayList arrayList) {
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String lowerCase = ((String) it.next()).trim().toLowerCase(Locale.ROOT);
            map.put(lowerCase, Integer.valueOf(((Integer) C15525.getOrDefault(map, lowerCase, 0)).intValue() + 1));
        }
        return map;
    }
}
