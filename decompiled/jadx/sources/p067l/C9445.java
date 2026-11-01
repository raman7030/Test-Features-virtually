package p067l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.۟ۨۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64YZ */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9445 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C18622 c18622 = (C18622) obj;
        C18622 c18623 = (C18622) obj2;
        C18344 c18344 = ((C16466) c18622.m42368()).f48359;
        C18344 c18345 = ((C16466) c18623.m42368()).f48359;
        if (c18344 == null || c18345 == null) {
            if (c18344 == null && c18345 == null) {
                return c18622.m42363().compareTo(c18623.m42363());
            }
            return c18344 != null ? -1 : 1;
        }
        int i = c18344.f54786;
        int i2 = c18345.f54786;
        if (i == 0) {
            i = Integer.MAX_VALUE;
        }
        if (i2 == 0) {
            i2 = Integer.MAX_VALUE;
        }
        return Integer.compare(i, i2);
    }
}
