package p067l;

import bin.p000mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩳ֨ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5F4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19210 {

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList f57404 = new ArrayList();

    /* JADX INFO: renamed from: ۧ */
    public static synchronized void m43753() {
        f57404 = m43747();
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m43752(AbstractC17043 abstractC17043) {
        if (abstractC17043.mo37343()) {
            return abstractC17043 instanceof C8878;
        }
        return ((abstractC17043 instanceof C14717) || abstractC17043.mo38688()) ? false : true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m43750(AbstractC17043 abstractC17043, EnumC17868 enumC17868) {
        C3787 c3787M7404 = C3787.m7404(abstractC17043, enumC17868);
        if (c3787M7404 == null) {
            return;
        }
        m43751(c3787M7404);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m43749(String str, EnumC17868 enumC17868) {
        m43751(C3787.m7403(str, enumC17868));
    }

    /* JADX INFO: renamed from: ֫ */
    public static synchronized void m43751(C3787... c3787Arr) {
        C12505 c12505M43748;
        C12505 c12505M43749;
        String strM26416;
        C12505 c12505M437410;
        m43753();
        HashSet<C12505> hashSet = new HashSet(c3787Arr.length);
        HashSet hashSet2 = new HashSet(c3787Arr.length);
        for (C3787 c3787 : c3787Arr) {
            if (c3787 != null) {
                String strM49051 = c3787.f8107;
                EnumC17868 enumC17868 = c3787.f8108;
                if (enumC17868.f53347) {
                    try {
                        strM49051 = C21759.m49051(strM49051);
                    } catch (IOException unused) {
                    }
                }
                String strM52831 = C23770.m52831(strM49051);
                if (m43752(C18524.m42109(strM52831, new String[0])) && (c12505M43749 = m43748(strM52831)) != null && !c12505M43749.f35052) {
                    hashSet.add(c12505M43749);
                    if (enumC17868.f53348 && (strM26416 = C11419.m26416(strM52831)) != null && (c12505M437410 = m43748(strM26416)) != null && !c12505M437410.f35052 && !c12505M437410.equals(c12505M43749)) {
                        hashSet2.add(c12505M437410);
                    }
                }
            }
        }
        hashSet2.removeAll(hashSet);
        if (hashSet.isEmpty()) {
            return;
        }
        if (C11164.m25781()) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C11164.m25762((C12505) it.next());
            }
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C11164.m25762((C12505) it2.next());
            }
            m43753();
        }
        for (C12505 c12505 : hashSet) {
            if (!c12505.f35052 && (c12505M43748 = m43748(c12505.f35050)) != null && !c12505M43748.f35052) {
                throw new C3924(C7050.m16224(R.string.MT_Protector) + "\n" + c12505M43748.f35054);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m43747() {
        ArrayList arrayList = new ArrayList(f57404.size());
        for (String str : C11164.m25770().f39430) {
            String[] strArrSplit = str.split(" ", 4);
            if (strArrSplit.length == 4 && (strArrSplit[3].startsWith("ro") || strArrSplit[3].startsWith("rw"))) {
                C12505 c12505 = new C12505();
                c12505.f35053 = strArrSplit[0];
                c12505.f35054 = strArrSplit[1];
                c12505.f35051 = strArrSplit[2];
                c12505.f35052 = strArrSplit[3].startsWith("rw");
                String lowerCase = c12505.f35054.toLowerCase();
                c12505.f35050 = lowerCase;
                if (!lowerCase.endsWith("/")) {
                    c12505.f35050 = C10965.m25286(new StringBuilder(), c12505.f35050, "/");
                }
                arrayList.add(c12505);
            }
        }
        if (C11765.m26993()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C12505) it.next()).f35052 = true;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C12505 m43748(String str) {
        String lowerCase = str.toLowerCase();
        if (!lowerCase.endsWith("/")) {
            lowerCase = lowerCase.concat("/");
        }
        for (C12505 c12505 : f57404) {
            if (lowerCase.startsWith(c12505.f35050)) {
                return c12505;
            }
        }
        return null;
    }
}
