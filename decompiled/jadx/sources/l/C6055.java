package l;

import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۛ۫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: HB5A */
/* JADX INFO: loaded from: classes2.dex */
public final class C6055 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16890(int i, int i2, List list) {
        if (i <= i2) {
            Collections.rotate(list.subList(i, i2 + 1), -1);
        } else {
            Collections.rotate(list.subList(i2, i + 1), 1);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16891(List list, Predicate predicate) {
        C5378.removeIf(list, predicate);
    }
}
