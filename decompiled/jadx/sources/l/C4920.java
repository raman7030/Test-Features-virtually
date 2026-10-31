package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ۙ᩸ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: D77D */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4920 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C13902 c13902 = (C13902) obj;
        C13902 c13903 = (C13902) obj2;
        int iCompare = Long.compare(c13903.f41429, c13902.f41429);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Integer.compare(c13902.f41430, c13903.f41430);
        if (iCompare2 != 0) {
            return iCompare2;
        }
        int iCompare3 = Integer.compare(c13902.f41432, c13903.f41432);
        return iCompare3 != 0 ? iCompare3 : Integer.compare(c13902.f41431, c13903.f41431);
    }
}
