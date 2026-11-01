package p067l;

import android.content.pm.ApplicationInfo;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.۠ۢᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81Y6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10065 {

    /* JADX INFO: renamed from: ۡ۟ۨ, reason: not valid java name and contains not printable characters */
    private static final short[] f82077 = {1673, -8861, -8838, -8844, -8878, -8871, -8882, -8871, -8937, -8876, -8871, -8874, -8865, -8937, -8853, -8884, -8886, -8879, -8874, -8865, -8957, -8844, -8878, -8871, -8882, -8871, -8937, -8876, -8871, -8874, -8865, -8937, -8853, -8884, -8886, -8879, -8874, -8865, -8957, -8844, -8878, -8871, -8882, -8871, -8937, -8876, -8871, -8874, -8865, -8937, -8853, -8884, -8886, -8879, -8874, -8865, -8957, -8844, -8878, -8871, -8882, -8871, -8937, -8876, -8871, -8874, -8865, -8937, -8853, -8884, -8886, -8879, -8874, -8865, -8957, -8861, -8838, -8861, -8853, -8847, -8847, -8847, -8844, -8878, -8871, -8882, -8871, -8937, -8876, -8871, -8874, -8865, -8937, -8841, -8870, -8878, -8867, -8869, -8884, -8957, -8844, -8878, -8871, -8882, -8871, -8937, -8876, -8871, -8874, -8865, -8937, -8841, -8870, -8878, -8867, -8869, -8884, -8957, -8847, -8847, -8847, -8884, -8867, -8875, -8888, -8938, -8870, -8883, -8879, -8876, -8868, -8938, -8868, -8867, -8896, -8873, -8883, -8884, -8938, -8871, -8888, -8877, -8883, -8879, -8868};

    /* JADX WARN: Code duplicated, block: B:86:0x026f  */
    /* JADX WARN: Type inference failed for: r1v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX INFO: renamed from: ֫ */
    public static Set m23491(AbstractC17043 abstractC17043, C6692 c6692, boolean z, boolean z2, List list, InterfaceC1209 interfaceC1209, InterfaceC7383 interfaceC7383) {
        List arrayList;
        AbstractC24797[] abstractC24797Arr;
        int iM55631;
        boolean z3;
        short s = f82077[0];
        int i = s * 23708;
        int i2 = s + 5927;
        int i3 = (i2 * i2) - i >= 0 ? 56632 : 2179;
        C18762 c18762 = new C18762(abstractC17043, c6692, z, z2, interfaceC7383);
        ConcurrentMapC12768 concurrentMapC12768 = c18762.f56062;
        if (list == null || C0949.m56018(list)) {
            arrayList = list;
        } else {
            Iterator itM55925 = RunnableC0938.m55925(list);
            while (true) {
                if (C0866.m55647(itM55925)) {
                    InterfaceC7568 interfaceC7568 = (InterfaceC7568) C0955.m56035(itM55925);
                    if (C1046.m56300(C0866.m55650(interfaceC7568), 42) != -1 || C1046.m56300(interfaceC7568.mo5853(), 42) != -1) {
                        arrayList = new ArrayList();
                        Iterator itM55926 = RunnableC0938.m55925(list);
                        while (C0930.m55886(itM55926)) {
                            InterfaceC7568 interfaceC7569 = (InterfaceC7568) RunnableC0897.m55785(itM55926);
                            String strM55650 = C0866.m55650(interfaceC7569);
                            String strMo5853 = interfaceC7569.mo5853();
                            if (C1046.m56300(strM55650, 42) == -1 && C1046.m56300(strMo5853, 42) == -1) {
                                C1194.m56393(arrayList, interfaceC7569);
                            } else {
                                C13929 c13929M54476 = AbstractC24797.m54476(strM55650);
                                if (C1046.m56300(strMo5853, 42) == -1) {
                                    C2993 c2993 = (C2993) concurrentMapC12768.get(strMo5853);
                                    if (c2993 != null) {
                                        Iterator itM55615 = C0861.m55615(c2993.mo5035());
                                        while (C0866.m55647(itM55615)) {
                                            C3349 c3349 = (C3349) C0955.m56035(itM55615);
                                            if (AbstractC24797.m54477(interfaceC7569, c3349)) {
                                                c13929M54476.m56473reset((CharSequence) C0930.m55894(c3349));
                                                if (c13929M54476.matches()) {
                                                    System.out.println(c3349);
                                                    C0937.m55917(arrayList, c3349);
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    C13929 c13929M54477 = AbstractC24797.m54476(strMo5853);
                                    Iterator itM56593 = C1964.m56593(concurrentMapC12768.values());
                                    while (C0930.m55886(itM56593)) {
                                        C2993 c2994 = (C2993) RunnableC0897.m55785(itM56593);
                                        c13929M54477.m56473reset((CharSequence) C0917.m55840(c2994));
                                        if (c13929M54477.matches()) {
                                            Iterator itM55616 = C0861.m55615(c2994.mo5035());
                                            while (C0866.m55647(itM55616)) {
                                                C3349 c33410 = (C3349) C0955.m56035(itM55616);
                                                if (AbstractC24797.m54477(interfaceC7569, c33410)) {
                                                    c13929M54476.m56473reset((CharSequence) C0930.m55894(c33410));
                                                    if (c13929M54476.matches()) {
                                                        System.out.println(c33410);
                                                        C0937.m55917(arrayList, c33410);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    arrayList = list;
                }
            }
        }
        if (C0877.m55698(interfaceC7383)) {
            return C21562.unmodifiableSet(c18762.f56061);
        }
        synchronized (interfaceC7383) {
            interfaceC7383.mo5866();
        }
        ?? r1 = 0;
        int i4 = 0;
        while (true) {
            i4++;
            C3359 c3359 = new C3359(interfaceC7383);
            if (arrayList == null || C0949.m56018(arrayList)) {
                AbstractC24797[] abstractC24797Arr2 = new AbstractC24797[10];
                abstractC24797Arr2[r1] = new C17420(c18762, c3359, C1046.m56293(f82077, 1, 20, i3), true);
                abstractC24797Arr2[1] = new C20775(c18762, c3359, ViewOnClickListenerC0939.m55947(f82077, 21, 18, i3), true);
                abstractC24797Arr2[2] = new C2668(c18762, c3359, C0866.m55652(f82077, 39, 36, i3), true);
                abstractC24797Arr2[3] = new C10716(c18762, c3359, C1071.m56336(f82077, 75, 2, i3), true);
                abstractC24797Arr2[4] = new C4681(c18762, c3359, "", r1);
                abstractC24797Arr2[5] = new C20104(c18762, c3359, C1048.m56318(f82077, 77, 5, i3), r1);
                abstractC24797Arr2[6] = new C7363(c18762, c3359, C1036.m56252(f82077, 82, 36, i3), r1);
                abstractC24797Arr2[7] = new C11387(c18762, c3359);
                abstractC24797Arr2[8] = new C6022(c18762, c3359, C0854.m55597(f82077, 118, 3, i3), r1);
                abstractC24797Arr2[9] = new C3339(c18762, interfaceC7383);
                abstractC24797Arr = abstractC24797Arr2;
            } else {
                abstractC24797Arr = new AbstractC24797[C0947.m55989(arrayList) + 2];
                for (int i5 = 0; i5 < C0947.m55989(arrayList); i5++) {
                    abstractC24797Arr[i5] = new C8704(c18762, c3359, (InterfaceC7568) C1929.m56563(arrayList, i5));
                }
                abstractC24797Arr[C1048.m56303(arrayList)] = new C11387(c18762, c3359);
                abstractC24797Arr[C1048.m56303(arrayList) + 1] = new C3339(c18762, interfaceC7383);
            }
            if (i4 == 1) {
                try {
                    Field[] fields = C4654.class.getFields();
                    int length = fields.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= length) {
                            iM55631 = 0;
                            break;
                        }
                        Field field = fields[i6];
                        if (field.getType() == Integer.class) {
                            iM55631 = C0863.m55631((Integer) field.get(null));
                            break;
                        }
                        i6++;
                    }
                    ApplicationInfo applicationInfo = C0861.m55620().getApplicationInfo();
                    if (((iM55631 ^ C0863.m55631((Integer) AbstractC0942.m55962(applicationInfo).getField(C0927.m55863(f82077, 142, 3, i3)).get(applicationInfo))) ^ (-1913575638)) != 0) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                } catch (Throwable unused) {
                }
            } else {
                z3 = true;
            }
            c3359.m5867(abstractC24797Arr.length);
            boolean z4 = false;
            for (AbstractC24797 abstractC24797 : abstractC24797Arr) {
                if (C0949.m56007(interfaceC7383)) {
                    break;
                }
                abstractC24797.mo4127();
                if (z3 && abstractC24797.mo41146(interfaceC1209)) {
                    z4 = true;
                }
                c3359.m5869(100 / abstractC24797Arr.length);
            }
            if (!z4 || C0949.m56007(interfaceC7383)) {
                break;
            }
            r1 = 0;
        }
        if (!C0949.m56007(interfaceC7383) && !c18762.f56061.isEmpty()) {
            interfaceC7383.mo5864();
            int size = c18762.f56062.values().size();
            AbstractC17043 abstractC17043M56217 = C1024.m56217(abstractC17043, C0992.m56102(f82077, UMErrorCode.E_UM_BE_EMPTY_URL_PATH, 14, i3));
            try {
                C10844 c10844 = new C10844(C1024.m56217(abstractC17043, C0892.m55750(f82077, 135, 7, i3)));
                try {
                    Iterator itM56139 = C1012.m56139(c18762.f56065.entrySet());
                    int size2 = 0;
                    int i7 = -1;
                    while (C0866.m55647(itM56139)) {
                        Map.Entry entry = (Map.Entry) C0955.m56035(itM56139);
                        if (C0949.m56007(interfaceC7383)) {
                            break;
                        }
                        String str = (String) entry.getKey();
                        Set set = (Set) entry.getValue();
                        Iterator itM561310 = C1012.m56139(set);
                        while (true) {
                            if (!C0930.m55886(itM561310)) {
                                size2 += set.size();
                                break;
                            }
                            if (C1071.m56338(c18762.f56061, (String) C0955.m56035(itM561310))) {
                                C20765 c20765 = new C20765(c18762.f56066.f71653);
                                Iterator itM56561 = C1929.m56561(c18762.f56062.values());
                                while (C0930.m55886(itM56561)) {
                                    C2993 c2995 = (C2993) RunnableC0897.m55785(itM56561);
                                    if (C0949.m56007(interfaceC7383)) {
                                        break;
                                    }
                                    if (set.contains(C0917.m55840(c2995))) {
                                        size2++;
                                        int i8 = (size2 * 100) / size;
                                        if (i8 != i7) {
                                            interfaceC7383.mo5868(i8);
                                            i7 = i8;
                                        }
                                        c20765.m46900((InterfaceC10509) c2995);
                                    }
                                }
                                if (!C0877.m55698(interfaceC7383)) {
                                    AbstractC0942.m55966(abstractC17043M56217);
                                    c20765.m50871(abstractC17043M56217);
                                    C0863.m55641(c10844, str);
                                    abstractC17043M56217.m38653(c10844.m24981(), (InterfaceC3693) null);
                                    break;
                                }
                                break;
                            }
                        }
                    }
                    AbstractC0942.m55958(c10844);
                    RunnableC1014.m56173(abstractC17043M56217);
                } catch (Throwable th) {
                    try {
                        AbstractC0942.m55958(c10844);
                        throw th;
                    } catch (Throwable th2) {
                        C0949.m56011(th, th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                RunnableC1014.m56173(abstractC17043M56217);
                throw th3;
            }
        }
        return C21562.unmodifiableSet(c18762.f56061);
    }
}
