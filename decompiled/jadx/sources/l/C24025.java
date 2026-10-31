package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.᩻᩻ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: H78K */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24025 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C17667 c17667 = (C17667) obj;
        C17667 c17668 = (C17667) obj2;
        int iCompareTo = c17667.f54033.compareTo(c17668.f54033);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = c17667.f54034.compareTo(c17668.f54034);
        return iCompareTo2 != 0 ? iCompareTo2 : Integer.compare(c17667.f54032, c17668.f54032);
    }
}
