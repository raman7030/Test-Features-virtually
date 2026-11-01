package p067l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ۙ᩸ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: D77D */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C7045 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C15581 c15581 = (C15581) obj;
        C15581 c15582 = (C15581) obj2;
        int iCompare = Long.compare(c15582.f44510, c15581.f44510);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Integer.compare(c15581.f44511, c15582.f44511);
        if (iCompare2 != 0) {
            return iCompare2;
        }
        int iCompare3 = Integer.compare(c15581.f44513, c15582.f44513);
        return iCompare3 != 0 ? iCompare3 : Integer.compare(c15581.f44512, c15582.f44512);
    }
}
