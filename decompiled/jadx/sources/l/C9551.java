package l;

import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.ۢۧᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5CS */
/* JADX INFO: loaded from: classes3.dex */
public final class C9551 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static LinkedHashSet m24426(String str) {
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int length = str.length();
            int iM47657 = 0;
            while (iM47657 < length) {
                int iIndexOf = str.indexOf(37, iM47657);
                if (str.charAt(iM47657) != '%') {
                    iM47657 = iIndexOf == -1 ? length : iIndexOf;
                } else {
                    C20840 c20840 = new C20840(str, iM47657 + 1);
                    linkedHashSet.add(c20840.m47658());
                    iM47657 = c20840.m47657();
                }
            }
            return linkedHashSet;
        } catch (Exception unused) {
            return null;
        }
    }
}
