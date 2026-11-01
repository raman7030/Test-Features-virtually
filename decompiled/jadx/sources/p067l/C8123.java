package p067l;

import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۛ۫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: HB5A */
/* JADX INFO: loaded from: classes2.dex */
public final class C8123 {
    /* JADX INFO: renamed from: ֫ */
    public static void m18819(int i, int i2, List list) {
        if (i <= i2) {
            Collections.rotate(list.subList(i, i2 + 1), -1);
        } else {
            Collections.rotate(list.subList(i2, i + 1), 1);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m18820(List list, Predicate predicate) {
        C7480.removeIf(list, predicate);
    }
}
