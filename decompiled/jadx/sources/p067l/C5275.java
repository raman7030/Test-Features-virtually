package p067l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.ۗۛ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: A1E3 */
/* JADX INFO: loaded from: classes2.dex */
public class C5275 {
    /* JADX INFO: renamed from: ֫ */
    public static int m11396(int i, int i2, int i3, String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        while (i2 < length && i2 != i) {
            C15693.m35745(sb, str.charAt(i2));
            i2++;
        }
        return sb.length() + i3;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m11400(int i, Runnable runnable) {
        if (i < 1) {
            i = 1;
        }
        LinkedList linkedList = new LinkedList();
        for (int i2 = 0; i2 < i; i2++) {
            Thread thread = new Thread(runnable);
            thread.start();
            linkedList.add(thread);
        }
        runnable.run();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            try {
                ((Thread) it.next()).join();
            } catch (InterruptedException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m11397(String str, String str2, C13929 c13929, boolean z, boolean z2, C23380 c23380) {
        return m11398(str, str2, c13929, z, z2, c23380, new ArrayList(1));
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m11398(String str, String str2, C13929 c13929, boolean z, boolean z2, C23380 c23380, ArrayList arrayList) {
        String strExpandReplacement;
        if (!arrayList.isEmpty()) {
            arrayList.clear();
        }
        c13929.m56473reset((CharSequence) str);
        if (z2) {
            if (c13929.matches()) {
                arrayList.add(c13929.toSnapshot());
            }
        } else {
            while (c13929.find()) {
                if (c13929.start() != c13929.end()) {
                    arrayList.add(c13929.toSnapshot());
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (c23380 != null) {
            c23380.m52023(arrayList.size());
        }
        StringBuilder sb = new StringBuilder(str.length());
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            C11918 c11918 = (C11918) it.next();
            int iStart = c11918.start();
            int iEnd = c11918.end();
            if (z) {
                try {
                    strExpandReplacement = c11918.expandReplacement(str2);
                } catch (Exception unused) {
                    strExpandReplacement = str2;
                }
                if (iStart > i) {
                    sb.append((CharSequence) str, i, iStart);
                }
                sb.append(strExpandReplacement);
            } else {
                if (iStart > i) {
                    sb.append((CharSequence) str, i, iStart);
                }
                sb.append(str2);
            }
            i = iEnd;
        }
        if (i < str.length()) {
            sb.append((CharSequence) str, i, str.length());
        }
        arrayList.clear();
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۧ */
    public static C13259 m11401(String str, boolean z, boolean z2) {
        if (!z) {
            str = C6112.m13905(str);
        }
        if (z2) {
            return C13259.m30303(8, str);
        }
        return C13259.m30303(74, str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C16673 m11399(String str, boolean z, boolean z2) {
        return new C16673(m11401(str, z, z2));
    }
}
