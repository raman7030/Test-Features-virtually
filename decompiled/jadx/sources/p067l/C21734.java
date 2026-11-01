package p067l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.᩶᩵ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7BH */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C21734 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        boolean zEquals;
        C9663 c9663 = (C9663) obj;
        C9663 c9664 = (C9663) obj2;
        if (c9663.f26619 != c9664.f26619) {
            return c9663.f26619 ? 1 : -1;
        }
        if (!c9663.f26619 || (zEquals = "keep_both".equals(c9663.f26624)) == "keep_both".equals(c9664.f26624)) {
            return c9663.f26622.compareTo(c9664.f26622);
        }
        return zEquals ? 1 : -1;
    }
}
