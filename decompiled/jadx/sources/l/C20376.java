package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.᩶᩵ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7BH */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C20376 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        boolean zEquals;
        C7675 c7675 = (C7675) obj;
        C7675 c7676 = (C7675) obj2;
        if (c7675.f23706 != c7676.f23706) {
            return c7675.f23706 ? 1 : -1;
        }
        if (!c7675.f23706 || (zEquals = "keep_both".equals(c7675.f23711)) == "keep_both".equals(c7676.f23711)) {
            return c7675.f23709.compareTo(c7676.f23709);
        }
        return zEquals ? 1 : -1;
    }
}
