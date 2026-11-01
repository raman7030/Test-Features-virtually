package p067l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ܰۤۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: H74F */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C15439 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i;
        int i2;
        int i3;
        int i4;
        C3923 c3923 = (C3923) obj;
        C3923 c3924 = (C3923) obj2;
        C10307 c10307M7742 = c3924.m7742();
        int i5 = c10307M7742.f28547;
        long j = -1;
        long j2 = (i5 <= 0 || (i4 = c10307M7742.f28523) <= 0) ? -1L : ((long) i5) * ((long) i4);
        C10307 c10307M7743 = c3923.m7742();
        int i6 = c10307M7743.f28547;
        if (i6 > 0 && (i3 = c10307M7743.f28523) > 0) {
            j = ((long) i6) * ((long) i3);
        }
        int iCompare = Long.compare(j2, j);
        if (iCompare != 0) {
            return iCompare;
        }
        C10307 c10307M7744 = c3924.m7742();
        int i7 = c10307M7744.f28547;
        int iMin = (i7 <= 0 || (i2 = c10307M7744.f28523) <= 0) ? -1 : Math.min(i7, i2);
        C10307 c10307M7745 = c3923.m7742();
        int i8 = c10307M7745.f28547;
        int iCompare2 = Integer.compare(iMin, (i8 <= 0 || (i = c10307M7745.f28523) <= 0) ? -1 : Math.min(i8, i));
        if (iCompare2 != 0) {
            return iCompare2;
        }
        int iCompare3 = Integer.compare(Math.max(-1, c3924.m7742().f28541), Math.max(-1, c3923.m7742().f28541));
        return iCompare3 != 0 ? iCompare3 : Integer.compare(c3923.m7745(), c3924.m7745());
    }
}
