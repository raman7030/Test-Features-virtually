package p067l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.᩻᩻ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: H78K */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C25202 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C19160 c19160 = (C19160) obj;
        C19160 c19161 = (C19160) obj2;
        int iCompareTo = c19160.f57226.compareTo(c19161.f57226);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = c19160.f57227.compareTo(c19161.f57227);
        return iCompareTo2 != 0 ? iCompareTo2 : Integer.compare(c19160.f57225, c19161.f57225);
    }
}
