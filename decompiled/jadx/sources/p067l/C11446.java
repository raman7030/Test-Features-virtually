package p067l;

import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.ۢۧᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5CS */
/* JADX INFO: loaded from: classes3.dex */
public final class C11446 {
    /* JADX INFO: renamed from: ֫ */
    public static LinkedHashSet m26437(String str) {
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int length = str.length();
            int iM49985 = 0;
            while (iM49985 < length) {
                int iIndexOf = str.indexOf(37, iM49985);
                if (str.charAt(iM49985) != '%') {
                    iM49985 = iIndexOf == -1 ? length : iIndexOf;
                } else {
                    C22175 c22175 = new C22175(str, iM49985 + 1);
                    linkedHashSet.add(c22175.m49986());
                    iM49985 = c22175.m49985();
                }
            }
            return linkedHashSet;
        } catch (Exception unused) {
            return null;
        }
    }
}
