package p067l;

import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.᩶ۛܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05O1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21363 {
    /* JADX INFO: renamed from: ֫ */
    public static boolean m48385(Iterable iterable, Comparator comparator) {
        Comparator comparator2;
        comparator.getClass();
        iterable.getClass();
        if (!(iterable instanceof SortedSet)) {
            if (!(iterable instanceof InterfaceC23374)) {
                return false;
            }
            comparator2 = ((InterfaceC23374) iterable).comparator();
        } else {
            comparator2 = ((SortedSet) iterable).comparator();
            if (comparator2 == null) {
                comparator2 = C14774.f42115;
            }
        }
        return comparator.equals(comparator2);
    }
}
