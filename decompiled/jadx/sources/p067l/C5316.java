package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۗ۠֡, reason: contains not printable characters */
/* JADX INFO: compiled from: E4JE */
/* JADX INFO: loaded from: classes2.dex */
public final class C5316 {
    /* JADX INFO: renamed from: ֫ */
    public static void m11507(C5636 c5636, String str, String str2, String str3) throws IOException {
        if (str != null) {
            c5636.write(34);
            C15693.m35744(c5636, str);
            c5636.write(34);
        } else {
            c5636.getClass();
            c5636.write("null", 0, 4);
        }
        c5636.write(58);
        if (str2 != null) {
            c5636.write(str2, 0, str2.length());
        } else {
            c5636.write("V", 0, 1);
        }
        if (str3 != null) {
            c5636.write(", ", 0, 2);
            c5636.write(34);
            C15693.m35744(c5636, str3);
            c5636.write(34);
        }
    }
}
