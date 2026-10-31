package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.ۗۛ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: A1E3 */
/* JADX INFO: loaded from: classes2.dex */
public class C3058 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m9354(int i, int i2, int i3, String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        while (i2 < length && i2 != i) {
            C14020.m33625(sb, str.charAt(i2));
            i2++;
        }
        return sb.length() + i3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m9358(int i, Runnable runnable) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m9355(String str, String str2, C12164 c12164, boolean z, boolean z2, C22108 c22108) {
        return m9356(str, str2, c12164, z, z2, c22108, new ArrayList(1));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m9356(String str, String str2, C12164 c12164, boolean z, boolean z2, C22108 c22108, ArrayList arrayList) {
        String strExpandReplacement;
        if (!arrayList.isEmpty()) {
            arrayList.clear();
        }
        c12164.m29615reset((CharSequence) str);
        if (z2) {
            if (c12164.matches()) {
                arrayList.add(c12164.toSnapshot());
            }
        } else {
            while (c12164.find()) {
                if (c12164.start() != c12164.end()) {
                    arrayList.add(c12164.toSnapshot());
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (c22108 != null) {
            c22108.m49685(arrayList.size());
        }
        StringBuilder sb = new StringBuilder(str.length());
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            C10048 c10048 = (C10048) it.next();
            int iStart = c10048.start();
            int iEnd = c10048.end();
            if (z) {
                try {
                    strExpandReplacement = c10048.expandReplacement(str2);
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

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C11459 m9359(String str, boolean z, boolean z2) {
        if (!z) {
            str = C3939.m11985(str);
        }
        if (z2) {
            return C11459.m28259(8, str);
        }
        return C11459.m28259(74, str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15051 m9357(String str, boolean z, boolean z2) {
        return new C15051(m9359(str, z, z2));
    }
}
