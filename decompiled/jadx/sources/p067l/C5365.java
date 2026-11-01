package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗۢۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: T1PJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C5365 implements Comparable {

    /* JADX INFO: renamed from: ۙ */
    public final boolean f12649;

    /* JADX INFO: renamed from: ᩶ */
    public final String f12650;

    /* JADX INFO: renamed from: ᩸ */
    public final boolean f12651;

    /* JADX INFO: renamed from: ᩹ */
    public final int f12652;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return (!this.f12651 ? 1 : 0) - (!((C5365) obj).f12651 ? 1 : 0);
    }

    public C5365(String str, boolean z) {
        if (str.startsWith("!") || str.startsWith("！")) {
            str = str.substring(1);
            this.f12651 = true;
        } else {
            this.f12651 = false;
        }
        if (str.endsWith("**")) {
            this.f12652 = 2;
            this.f12650 = C17073.m38720(2, 0, str);
        } else if (str.endsWith("*")) {
            this.f12652 = 1;
            this.f12650 = C17073.m38720(1, 0, str);
        } else {
            this.f12652 = 0;
            this.f12650 = str;
        }
        this.f12649 = z;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0044 A[RETURN] */
    /* JADX INFO: renamed from: ֫ */
    public final boolean m11627(String str) {
        String str2 = this.f12650;
        int i = this.f12652;
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
            if (strSubstring.isEmpty() || (this.f12649 && strSubstring.charAt(0) == '$' && strSubstring.indexOf(46) == -1)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    public static InterfaceC1209 m11626(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : str.split("\n")) {
            if (!str2.isEmpty()) {
                C5365 c5365 = new C5365(str2, false);
                if (c5365.f12651) {
                    arrayList2.add(c5365);
                } else {
                    arrayList.add(c5365);
                }
            }
        }
        if (arrayList.isEmpty() && arrayList2.isEmpty()) {
            return new C21459(0);
        }
        return new C6706(arrayList2, arrayList);
    }
}
