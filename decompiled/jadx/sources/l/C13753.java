package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ܰۤۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: H74F */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C13753 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i;
        int i2;
        int i3;
        int i4;
        C1636 c1636 = (C1636) obj;
        C1636 c1637 = (C1636) obj2;
        C8353 c8353M5512 = c1637.m5512();
        int i5 = c8353M5512.f25633;
        long j = -1;
        long j2 = (i5 <= 0 || (i4 = c8353M5512.f25609) <= 0) ? -1L : ((long) i5) * ((long) i4);
        C8353 c8353M5513 = c1636.m5512();
        int i6 = c8353M5513.f25633;
        if (i6 > 0 && (i3 = c8353M5513.f25609) > 0) {
            j = ((long) i6) * ((long) i3);
        }
        int iCompare = Long.compare(j2, j);
        if (iCompare != 0) {
            return iCompare;
        }
        C8353 c8353M5514 = c1637.m5512();
        int i7 = c8353M5514.f25633;
        int iMin = (i7 <= 0 || (i2 = c8353M5514.f25609) <= 0) ? -1 : Math.min(i7, i2);
        C8353 c8353M5515 = c1636.m5512();
        int i8 = c8353M5515.f25633;
        int iCompare2 = Integer.compare(iMin, (i8 <= 0 || (i = c8353M5515.f25609) <= 0) ? -1 : Math.min(i8, i));
        if (iCompare2 != 0) {
            return iCompare2;
        }
        int iCompare3 = Integer.compare(Math.max(-1, c1637.m5512().f25627), Math.max(-1, c1636.m5512().f25627));
        return iCompare3 != 0 ? iCompare3 : Integer.compare(c1636.m5515(), c1637.m5515());
    }
}
