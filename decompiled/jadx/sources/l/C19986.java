package l;

import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.᩶ۛܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05O1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19986 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m46071(Iterable iterable, Comparator comparator) {
        Comparator comparator2;
        comparator.getClass();
        iterable.getClass();
        if (!(iterable instanceof SortedSet)) {
            if (!(iterable instanceof InterfaceC22102)) {
                return false;
            }
            comparator2 = ((InterfaceC22102) iterable).comparator();
        } else {
            comparator2 = ((SortedSet) iterable).comparator();
            if (comparator2 == null) {
                comparator2 = C13053.f39070;
            }
        }
        return comparator.equals(comparator2);
    }
}
