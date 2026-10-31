package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩻ᩳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8HS */
/* JADX INFO: loaded from: classes.dex */
public final class C23862 implements InterfaceC17512 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final AbstractC10232 f77185 = AbstractC10232.m25861().m25866(new C13540()).m25865(AbstractC10232.m25861().mo22482().m25866(new C4248(5)));

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f77186 = new ArrayList();

    @Override // l.InterfaceC17512
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo18737(C12866 c12866, long j) {
        long j2 = c12866.f38639;
        C22632.m50631(j2 != -9223372036854775807L);
        C22632.m50631(c12866.f38637 != -9223372036854775807L);
        boolean z = j2 <= j && j < c12866.f38638;
        ArrayList arrayList = this.f77186;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((C12866) arrayList.get(size)).f38639) {
                arrayList.add(size + 1, c12866);
                return z;
            }
        }
        arrayList.add(0, c12866);
        return z;
    }

    @Override // l.InterfaceC17512
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC14545 mo18736(long j) {
        ArrayList arrayList = this.f77186;
        if (!arrayList.isEmpty()) {
            if (j >= ((C12866) arrayList.get(0)).f38639) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    C12866 c12866 = (C12866) arrayList.get(i);
                    if (j >= c12866.f38639 && j < c12866.f38638) {
                        arrayList2.add(c12866);
                    }
                    if (j < c12866.f38639) {
                        break;
                    }
                }
                AbstractC14545 abstractC14545M34731 = AbstractC14545.m34731(f77185, arrayList2);
                C1846 c1846 = new C1846();
                for (int i2 = 0; i2 < abstractC14545M34731.size(); i2++) {
                    c1846.m16263((List) ((C12866) abstractC14545M34731.get(i2)).f38636);
                }
                return c1846.m6131();
            }
        }
        return AbstractC14545.of();
    }

    @Override // l.InterfaceC17512
    /* JADX INFO: renamed from: ᩳ */
    public final void mo18740(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f77186;
            if (i >= arrayList.size()) {
                return;
            }
            long j2 = ((C12866) arrayList.get(i)).f38639;
            if (j > j2 && j > ((C12866) arrayList.get(i)).f38638) {
                arrayList.remove(i);
                i--;
            } else if (j < j2) {
                return;
            }
            i++;
        }
    }

    @Override // l.InterfaceC17512
    /* JADX INFO: renamed from: ۧ */
    public final long mo18738(long j) {
        ArrayList arrayList = this.f77186;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j < ((C12866) arrayList.get(0)).f38639) {
            return -9223372036854775807L;
        }
        long jMax = ((C12866) arrayList.get(0)).f38639;
        for (int i = 0; i < arrayList.size(); i++) {
            long j2 = ((C12866) arrayList.get(i)).f38639;
            long j3 = ((C12866) arrayList.get(i)).f38638;
            if (j3 <= j) {
                jMax = Math.max(jMax, j3);
            } else {
                if (j2 > j) {
                    break;
                }
                jMax = Math.max(jMax, j2);
            }
        }
        return jMax;
    }

    @Override // l.InterfaceC17512
    /* JADX INFO: renamed from: ܽ */
    public final long mo18739(long j) {
        int i = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.f77186;
            if (i >= arrayList.size()) {
                break;
            }
            long j2 = ((C12866) arrayList.get(i)).f38639;
            long j3 = ((C12866) arrayList.get(i)).f38638;
            if (j < j2) {
                if (jMin != -9223372036854775807L) {
                    jMin = Math.min(jMin, j2);
                    break;
                }
                jMin = j2;
                break;
            }
            if (j < j3) {
                jMin = jMin == -9223372036854775807L ? j3 : Math.min(jMin, j3);
            }
            i++;
        }
        if (jMin != -9223372036854775807L) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    @Override // l.InterfaceC17512
    public final void clear() {
        this.f77186.clear();
    }
}
