package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۗ۠֡, reason: contains not printable characters */
/* JADX INFO: compiled from: E4JE */
/* JADX INFO: loaded from: classes2.dex */
public final class C3102 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m9464(C3438 c3438, String str, String str2, String str3) throws IOException {
        if (str != null) {
            c3438.write(34);
            C14020.m33624(c3438, str);
            c3438.write(34);
        } else {
            c3438.getClass();
            c3438.write("null", 0, 4);
        }
        c3438.write(58);
        if (str2 != null) {
            c3438.write(str2, 0, str2.length());
        } else {
            c3438.write("V", 0, 1);
        }
        if (str3 != null) {
            c3438.write(", ", 0, 2);
            c3438.write(34);
            C14020.m33624(c3438, str3);
            c3438.write(34);
        }
    }
}
