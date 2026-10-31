package l;

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
public final class C8098 {

    /* JADX INFO: renamed from: ۡ۟ۨ, reason: not valid java name and contains not printable characters */
    private static final short[] f24969 = {1673, -8861, -8838, -8844, -8878, -8871, -8882, -8871, -8937, -8876, -8871, -8874, -8865, -8937, -8853, -8884, -8886, -8879, -8874, -8865, -8957, -8844, -8878, -8871, -8882, -8871, -8937, -8876, -8871, -8874, -8865, -8937, -8853, -8884, -8886, -8879, -8874, -8865, -8957, -8844, -8878, -8871, -8882, -8871, -8937, -8876, -8871, -8874, -8865, -8937, -8853, -8884, -8886, -8879, -8874, -8865, -8957, -8844, -8878, -8871, -8882, -8871, -8937, -8876, -8871, -8874, -8865, -8937, -8853, -8884, -8886, -8879, -8874, -8865, -8957, -8861, -8838, -8861, -8853, -8847, -8847, -8847, -8844, -8878, -8871, -8882, -8871, -8937, -8876, -8871, -8874, -8865, -8937, -8841, -8870, -8878, -8867, -8869, -8884, -8957, -8844, -8878, -8871, -8882, -8871, -8937, -8876, -8871, -8874, -8865, -8937, -8841, -8870, -8878, -8867, -8869, -8884, -8957, -8847, -8847, -8847, -8884, -8867, -8875, -8888, -8938, -8870, -8883, -8879, -8876, -8868, -8938, -8868, -8867, -8896, -8873, -8883, -8884, -8938, -8871, -8888, -8877, -8883, -8879, -8868};

    /* JADX WARN: Code duplicated, block: B:86:0x026f  */
    /* JADX WARN: Type inference failed for: r1v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Set m21523(AbstractC15440 abstractC15440, C4549 c4549, boolean z, boolean z2, List list, InterfaceC7397 interfaceC7397, InterfaceC5276 interfaceC5276) {
        List arrayList;
        AbstractC23599[] abstractC23599Arr;
        int iM1951;
        boolean z3;
        short s = f24969[0];
        int i = s * 23708;
        int i2 = s + 5927;
        int i3 = (i2 * i2) - i >= 0 ? 56632 : 2179;
        C17249 c17249 = new C17249(abstractC15440, c4549, z, z2, interfaceC5276);
        ConcurrentMapC10942 concurrentMapC10942 = c17249.f52880;
        if (list == null || C2167.m7161(list)) {
            arrayList = list;
        } else {
            Iterator itM6374 = RunnableC1937.m6374(list);
            while (true) {
                if (C0483.m2123(itM6374)) {
                    InterfaceC5471 interfaceC5471 = (InterfaceC5471) C2272.m7513(itM6374);
                    if (C4117.m12362(C0483.m2126(interfaceC5471), 42) != -1 || C4117.m12362(interfaceC5471.mo3566(), 42) != -1) {
                        arrayList = new ArrayList();
                        Iterator itM6375 = RunnableC1937.m6374(list);
                        while (C1773.m5910(itM6375)) {
                            InterfaceC5471 interfaceC5472 = (InterfaceC5471) RunnableC1108.m3791(itM6375);
                            String strM2126 = C0483.m2126(interfaceC5472);
                            String strMo3566 = interfaceC5472.mo3566();
                            if (C4117.m12362(strM2126, 42) == -1 && C4117.m12362(strMo3566, 42) == -1) {
                                C7106.m19117(arrayList, interfaceC5472);
                            } else {
                                C12164 c12164M52073 = AbstractC23599.m52073(strM2126);
                                if (C4117.m12362(strMo3566, 42) == -1) {
                                    C0657 c0657 = (C0657) concurrentMapC10942.get(strMo3566);
                                    if (c0657 != null) {
                                        Iterator itM1837 = C0382.m1837(c0657.mo2696());
                                        while (C0483.m2123(itM1837)) {
                                            C1032 c1032 = (C1032) C2272.m7513(itM1837);
                                            if (AbstractC23599.m52074(interfaceC5472, c1032)) {
                                                c12164M52073.m29615reset((CharSequence) C1773.m5918(c1032));
                                                if (c12164M52073.matches()) {
                                                    System.out.println(c1032);
                                                    C1916.m6307(arrayList, c1032);
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    C12164 c12164M52074 = AbstractC23599.m52073(strMo3566);
                                    Iterator itM50611 = C22628.m50611(concurrentMapC10942.values());
                                    while (C1773.m5910(itM50611)) {
                                        C0657 c0658 = (C0657) RunnableC1108.m3791(itM50611);
                                        c12164M52074.m29615reset((CharSequence) C1504.m5165(c0658));
                                        if (c12164M52074.matches()) {
                                            Iterator itM1838 = C0382.m1837(c0658.mo2696());
                                            while (C0483.m2123(itM1838)) {
                                                C1032 c1033 = (C1032) C2272.m7513(itM1838);
                                                if (AbstractC23599.m52074(interfaceC5472, c1033)) {
                                                    c12164M52073.m29615reset((CharSequence) C1773.m5918(c1033));
                                                    if (c12164M52073.matches()) {
                                                        System.out.println(c1033);
                                                        C1916.m6307(arrayList, c1033);
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
        if (C0714.m2807(interfaceC5276)) {
            return C20195.unmodifiableSet(c17249.f52879);
        }
        synchronized (interfaceC5276) {
            interfaceC5276.mo3579();
        }
        ?? r1 = 0;
        int i4 = 0;
        while (true) {
            i4++;
            C1042 c1042 = new C1042(interfaceC5276);
            if (arrayList == null || C2167.m7161(arrayList)) {
                AbstractC23599[] abstractC23599Arr2 = new AbstractC23599[10];
                abstractC23599Arr2[r1] = new C15837(c17249, c1042, C4117.m12355(f24969, 1, 20, i3), true);
                abstractC23599Arr2[1] = new C19367(c17249, c1042, ViewOnClickListenerC1958.m6435(f24969, 21, 18, i3), true);
                abstractC23599Arr2[2] = new C0315(c17249, c1042, C0483.m2128(f24969, 39, 36, i3), true);
                abstractC23599Arr2[3] = new C8783(c17249, c1042, C4616.m13542(f24969, 75, 2, i3), true);
                abstractC23599Arr2[4] = new C2433(c17249, c1042, "", r1);
                abstractC23599Arr2[5] = new C18661(c17249, c1042, C4159.m12578(f24969, 77, 5, i3), r1);
                abstractC23599Arr2[6] = new C5255(c17249, c1042, C3911.m11919(f24969, 82, 36, i3), r1);
                abstractC23599Arr2[7] = new C9489(c17249, c1042);
                abstractC23599Arr2[8] = new C3844(c17249, c1042, C0237.m1483(f24969, 118, 3, i3), r1);
                abstractC23599Arr2[9] = new C1021(c17249, interfaceC5276);
                abstractC23599Arr = abstractC23599Arr2;
            } else {
                abstractC23599Arr = new AbstractC23599[C2126.m7032(arrayList) + 2];
                for (int i5 = 0; i5 < C2126.m7032(arrayList); i5++) {
                    abstractC23599Arr[i5] = new C6666(c17249, c1042, (InterfaceC5471) C21923.m49339(arrayList, i5));
                }
                abstractC23599Arr[C4159.m12563(arrayList)] = new C9489(c17249, c1042);
                abstractC23599Arr[C4159.m12563(arrayList) + 1] = new C1021(c17249, interfaceC5276);
            }
            if (i4 == 1) {
                try {
                    Field[] fields = C2405.class.getFields();
                    int length = fields.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= length) {
                            iM1951 = 0;
                            break;
                        }
                        Field field = fields[i6];
                        if (field.getType() == Integer.class) {
                            iM1951 = C0422.m1951((Integer) field.get(null));
                            break;
                        }
                        i6++;
                    }
                    ApplicationInfo applicationInfo = C0382.m1842().getApplicationInfo();
                    if (((iM1951 ^ C0422.m1951((Integer) AbstractC2021.m6565(applicationInfo).getField(C1711.m5726(f24969, 142, 3, i3)).get(applicationInfo))) ^ (-1913575638)) != 0) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                } catch (Throwable unused) {
                }
            } else {
                z3 = true;
            }
            c1042.m3580(abstractC23599Arr.length);
            boolean z4 = false;
            for (AbstractC23599 abstractC23599 : abstractC23599Arr) {
                if (C2167.m7150(interfaceC5276)) {
                    break;
                }
                abstractC23599.mo1729();
                if (z3 && abstractC23599.mo38920(interfaceC7397)) {
                    z4 = true;
                }
                c1042.m3582(100 / abstractC23599Arr.length);
            }
            if (!z4 || C2167.m7150(interfaceC5276)) {
                break;
            }
            r1 = 0;
        }
        if (!C2167.m7150(interfaceC5276) && !c17249.f52879.isEmpty()) {
            interfaceC5276.mo3577();
            int size = c17249.f52880.values().size();
            AbstractC15440 abstractC15440M11176 = C3663.m11176(abstractC15440, C3019.m9250(f24969, UMErrorCode.E_UM_BE_EMPTY_URL_PATH, 14, i3));
            try {
                C8918 c8918 = new C8918(C3663.m11176(abstractC15440, C1005.m3502(f24969, 135, 7, i3)));
                try {
                    Iterator itM10483 = C3432.m10483(c17249.f52883.entrySet());
                    int size2 = 0;
                    int i7 = -1;
                    while (C0483.m2123(itM10483)) {
                        Map.Entry entry = (Map.Entry) C2272.m7513(itM10483);
                        if (C2167.m7150(interfaceC5276)) {
                            break;
                        }
                        String str = (String) entry.getKey();
                        Set set = (Set) entry.getValue();
                        Iterator itM10484 = C3432.m10483(set);
                        while (true) {
                            if (!C1773.m5910(itM10484)) {
                                size2 += set.size();
                                break;
                            }
                            if (C4616.m13546(c17249.f52879, (String) C2272.m7513(itM10484))) {
                                C19357 c19357 = new C19357(c17249.f52884.f68955);
                                Iterator itM49337 = C21923.m49337(c17249.f52880.values());
                                while (C1773.m5910(itM49337)) {
                                    C0657 c0659 = (C0657) RunnableC1108.m3791(itM49337);
                                    if (C2167.m7150(interfaceC5276)) {
                                        break;
                                    }
                                    if (set.contains(C1504.m5165(c0659))) {
                                        size2++;
                                        int i8 = (size2 * 100) / size;
                                        if (i8 != i7) {
                                            interfaceC5276.mo3581(i8);
                                            i7 = i8;
                                        }
                                        c19357.m44606((InterfaceC8566) c0659);
                                    }
                                }
                                if (!C0714.m2807(interfaceC5276)) {
                                    AbstractC2021.m6569(abstractC15440M11176);
                                    c19357.m48535(abstractC15440M11176);
                                    C0422.m1961(c8918, str);
                                    abstractC15440M11176.m36495(c8918.m23007(), (InterfaceC1393) null);
                                    break;
                                }
                                break;
                            }
                        }
                    }
                    AbstractC2021.m6561(c8918);
                    RunnableC3474.m10626(abstractC15440M11176);
                } catch (Throwable th) {
                    try {
                        AbstractC2021.m6561(c8918);
                        throw th;
                    } catch (Throwable th2) {
                        C2167.m7154(th, th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                RunnableC3474.m10626(abstractC15440M11176);
                throw th3;
            }
        }
        return C20195.unmodifiableSet(c17249.f52879);
    }
}
