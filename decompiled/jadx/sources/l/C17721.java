package l;

import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩳ֨ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5F4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17721 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList f54213 = new ArrayList();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static synchronized void m41507() {
        f54213 = m41501();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m41506(AbstractC15440 abstractC15440) {
        if (abstractC15440.mo35196()) {
            return abstractC15440 instanceof C6849;
        }
        return ((abstractC15440 instanceof C12993) || abstractC15440.mo36530()) ? false : true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41504(AbstractC15440 abstractC15440, EnumC16309 enumC16309) {
        C1493 c1493M5162 = C1493.m5162(abstractC15440, enumC16309);
        if (c1493M5162 == null) {
            return;
        }
        m41505(c1493M5162);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41503(String str, EnumC16309 enumC16309) {
        m41505(C1493.m5161(str, enumC16309));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized void m41505(C1493... c1493Arr) {
        C10666 c10666M41502;
        C10666 c10666M41503;
        String strM24406;
        C10666 c10666M41504;
        m41507();
        HashSet<C10666> hashSet = new HashSet(c1493Arr.length);
        HashSet hashSet2 = new HashSet(c1493Arr.length);
        for (C1493 c1493 : c1493Arr) {
            if (c1493 != null) {
                String strM46728 = c1493.f5334;
                EnumC16309 enumC16309 = c1493.f5335;
                if (enumC16309.f50180) {
                    try {
                        strM46728 = C20402.m46728(strM46728);
                    } catch (IOException unused) {
                    }
                }
                String strM50489 = C22518.m50489(strM46728);
                if (m41506(C16999.m39866(strM50489, new String[0])) && (c10666M41503 = m41502(strM50489)) != null && !c10666M41503.f32081) {
                    hashSet.add(c10666M41503);
                    if (enumC16309.f50181 && (strM24406 = C9523.m24406(strM50489)) != null && (c10666M41504 = m41502(strM24406)) != null && !c10666M41504.f32081 && !c10666M41504.equals(c10666M41503)) {
                        hashSet2.add(c10666M41504);
                    }
                }
            }
        }
        hashSet2.removeAll(hashSet);
        if (hashSet.isEmpty()) {
            return;
        }
        if (C9255.m23780()) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C9255.m23761((C10666) it.next());
            }
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C9255.m23761((C10666) it2.next());
            }
            m41507();
        }
        for (C10666 c10666 : hashSet) {
            if (!c10666.f32081 && (c10666M41502 = m41502(c10666.f32079)) != null && !c10666M41502.f32081) {
                throw new C1637(C4925.m14327(R.string.MT_Protector) + "\n" + c10666M41502.f32083);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m41501() {
        ArrayList arrayList = new ArrayList(f54213.size());
        for (String str : C9255.m23769().f36415) {
            String[] strArrSplit = str.split(" ", 4);
            if (strArrSplit.length == 4 && (strArrSplit[3].startsWith("ro") || strArrSplit[3].startsWith("rw"))) {
                C10666 c10666 = new C10666();
                c10666.f32082 = strArrSplit[0];
                c10666.f32083 = strArrSplit[1];
                c10666.f32080 = strArrSplit[2];
                c10666.f32081 = strArrSplit[3].startsWith("rw");
                String lowerCase = c10666.f32083.toLowerCase();
                c10666.f32079 = lowerCase;
                if (!lowerCase.endsWith("/")) {
                    c10666.f32079 = C9045.m23341(new StringBuilder(), c10666.f32079, "/");
                }
                arrayList.add(c10666);
            }
        }
        if (C9886.m24978()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C10666) it.next()).f32081 = true;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10666 m41502(String str) {
        String lowerCase = str.toLowerCase();
        if (!lowerCase.endsWith("/")) {
            lowerCase = lowerCase.concat("/");
        }
        for (C10666 c10666 : f54213) {
            if (lowerCase.startsWith(c10666.f32079)) {
                return c10666;
            }
        }
        return null;
    }
}
