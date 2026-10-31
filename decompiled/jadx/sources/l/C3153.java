package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗۢۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: T1PJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3153 implements Comparable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f9846;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f9847;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f9848;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f9849;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return (!this.f9848 ? 1 : 0) - (!((C3153) obj).f9848 ? 1 : 0);
    }

    public C3153(String str, boolean z) {
        if (str.startsWith("!") || str.startsWith("！")) {
            str = str.substring(1);
            this.f9848 = true;
        } else {
            this.f9848 = false;
        }
        if (str.endsWith("**")) {
            this.f9849 = 2;
            this.f9847 = C15472.m36561(2, 0, str);
        } else if (str.endsWith("*")) {
            this.f9849 = 1;
            this.f9847 = C15472.m36561(1, 0, str);
        } else {
            this.f9849 = 0;
            this.f9847 = str;
        }
        this.f9846 = z;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0044 A[RETURN] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m9583(String str) {
        String str2 = this.f9847;
        int i = this.f9849;
        if (i != 0) {
            if (i == 1) {
                if (str.startsWith(str2) && str.indexOf(46, str2.length()) == -1) {
                    return true;
                }
                return false;
            }
            return str.startsWith(str2);
        }
        if (str.startsWith(str2)) {
            String strSubstring = str.substring(str2.length());
            if (strSubstring.isEmpty() || (this.f9846 && strSubstring.charAt(0) == '$' && strSubstring.indexOf(46) == -1)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static InterfaceC7397 m9582(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : str.split("\n")) {
            if (!str2.isEmpty()) {
                C3153 c3153 = new C3153(str2, false);
                if (c3153.f9848) {
                    arrayList2.add(c3153);
                } else {
                    arrayList.add(c3153);
                }
            }
        }
        if (arrayList.isEmpty() && arrayList2.isEmpty()) {
            return new C20087(0);
        }
        return new C4564(arrayList2, arrayList);
    }
}
