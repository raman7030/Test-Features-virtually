package l;

import com.umeng.analytics.pro.am;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: renamed from: l.ۨۜ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 6ASH */
/* JADX INFO: loaded from: classes3.dex */
public final class C11528 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C5883 f34415;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8225 f34416;

    public C11528(C5883 c5883, InterfaceC8225 interfaceC8225) {
        this.f34415 = c5883;
        this.f34416 = interfaceC8225;
    }

    public final String toString() {
        if (this.f34415.f18066 != null) {
            StringBuilder sb = new StringBuilder();
            ArrayList<C13643> arrayList = new ArrayList(this.f34415.f18065.keySet());
            Collections.sort(arrayList, new C10117());
            for (C13643 c13643 : arrayList) {
                C13643[] c13643Arr = c13643.f40685;
                int length = c13643Arr != null ? c13643Arr.length : 0;
                for (int i = 0; i < length; i++) {
                    C13643 c13644 = c13643.f40685[i];
                    if (c13644 != null && c13644.f40684 != Integer.MAX_VALUE) {
                        sb.append(m28367(c13643));
                        String strM36283 = ((C15279) this.f34416).m36283(i - 1);
                        sb.append("-");
                        sb.append(strM36283);
                        sb.append("->");
                        sb.append(m28367(c13644));
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m28367(C13643 c13643) {
        int i = c13643.f40684;
        StringBuilder sb = new StringBuilder();
        sb.append(c13643.f40687 ? ":" : "");
        sb.append(am.aB);
        sb.append(i);
        sb.append(c13643.f40690 ? "^" : "");
        String string = sb.toString();
        if (!c13643.f40687) {
            return string;
        }
        if (c13643.f40688 != null) {
            StringBuilder sbM19190 = C7166.m19190(string, "=>");
            sbM19190.append(Arrays.toString(c13643.f40688));
            return sbM19190.toString();
        }
        StringBuilder sbM19191 = C7166.m19190(string, "=>");
        sbM19191.append(c13643.f40686);
        return sbM19191.toString();
    }
}
