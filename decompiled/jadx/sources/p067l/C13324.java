package p067l;

import com.umeng.analytics.pro.C0655am;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: renamed from: l.ۨۜ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 6ASH */
/* JADX INFO: loaded from: classes3.dex */
public final class C13324 {

    /* JADX INFO: renamed from: ֫ */
    public final C7959 f37412;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC10185 f37413;

    public C13324(C7959 c7959, InterfaceC10185 interfaceC10185) {
        this.f37412 = c7959;
        this.f37413 = interfaceC10185;
    }

    public final String toString() {
        if (this.f37412.f20921 != null) {
            StringBuilder sb = new StringBuilder();
            ArrayList<C15334> arrayList = new ArrayList(this.f37412.f20920.keySet());
            Collections.sort(arrayList, new C11983());
            for (C15334 c15334 : arrayList) {
                C15334[] c15334Arr = c15334.f43766;
                int length = c15334Arr != null ? c15334Arr.length : 0;
                for (int i = 0; i < length; i++) {
                    C15334 c15335 = c15334.f43766[i];
                    if (c15335 != null && c15335.f43765 != Integer.MAX_VALUE) {
                        sb.append(m30413(c15334));
                        String strM38444 = ((C16889) this.f37413).m38444(i - 1);
                        sb.append("-");
                        sb.append(strM38444);
                        sb.append("->");
                        sb.append(m30413(c15335));
                        sb.append('\n');
                    }
                }
            }
            String string = sb.toString();
            if (string.length() != 0) {
                return string;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m30413(C15334 c15334) {
        int i = c15334.f43765;
        StringBuilder sb = new StringBuilder();
        sb.append(c15334.f43768 ? ":" : "");
        sb.append(C0655am.f2274aB);
        sb.append(i);
        sb.append(c15334.f43771 ? "^" : "");
        String string = sb.toString();
        if (!c15334.f43768) {
            return string;
        }
        if (c15334.f43769 != null) {
            StringBuilder sbM21133 = C9179.m21133(string, "=>");
            sbM21133.append(Arrays.toString(c15334.f43769));
            return sbM21133.toString();
        }
        StringBuilder sbM21134 = C9179.m21133(string, "=>");
        sbM21134.append(c15334.f43767);
        return sbM21134.toString();
    }
}
