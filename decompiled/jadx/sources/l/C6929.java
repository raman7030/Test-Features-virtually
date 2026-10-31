package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۜᩳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8UT */
/* JADX INFO: loaded from: classes3.dex */
public final class C6929 implements InterfaceC17512 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f21391 = new ArrayList();

    /* JADX WARN: Code duplicated, block: B:13:0x0022  */
    @Override // l.InterfaceC17512
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo18737(C12866 c12866, long j) {
        boolean z;
        long j2 = c12866.f38639;
        C22632.m50631(j2 != -9223372036854775807L);
        if (j2 <= j) {
            long j3 = c12866.f38638;
            if (j3 == -9223372036854775807L || j < j3) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        ArrayList arrayList = this.f21391;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((C12866) arrayList.get(size)).f38639) {
                arrayList.add(size + 1, c12866);
                return z;
            }
            if (((C12866) arrayList.get(size)).f38639 <= j) {
                z = false;
            }
        }
        arrayList.add(0, c12866);
        return z;
    }

    @Override // l.InterfaceC17512
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 mo18736(long j) {
        int iM18735 = m18735(j);
        if (iM18735 == 0) {
            return AbstractC14545.of();
        }
        C12866 c12866 = (C12866) this.f21391.get(iM18735 - 1);
        long j2 = c12866.f38638;
        if (j2 == -9223372036854775807L || j < j2) {
            return c12866.f38636;
        }
        return AbstractC14545.of();
    }

    @Override // l.InterfaceC17512
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void mo18740(long j) {
        int iM18735 = m18735(j);
        if (iM18735 == 0) {
            return;
        }
        ArrayList arrayList = this.f21391;
        long j2 = ((C12866) arrayList.get(iM18735 - 1)).f38638;
        if (j2 == -9223372036854775807L || j2 >= j) {
            iM18735--;
        }
        arrayList.subList(0, iM18735).clear();
    }

    @Override // l.InterfaceC17512
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long mo18738(long j) {
        ArrayList arrayList = this.f21391;
        if (arrayList.isEmpty() || j < ((C12866) arrayList.get(0)).f38639) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j2 = ((C12866) arrayList.get(i)).f38639;
            if (j == j2) {
                return j2;
            }
            if (j < j2) {
                C12866 c12866 = (C12866) arrayList.get(i - 1);
                long j3 = c12866.f38638;
                return (j3 == -9223372036854775807L || j3 > j) ? c12866.f38639 : j3;
            }
        }
        C12866 c12867 = (C12866) C8882.m22955(arrayList);
        long j4 = c12867.f38638;
        return (j4 == -9223372036854775807L || j < j4) ? c12867.f38639 : j4;
    }

    @Override // l.InterfaceC17512
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long mo18739(long j) {
        ArrayList arrayList = this.f21391;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < ((C12866) arrayList.get(0)).f38639) {
            return ((C12866) arrayList.get(0)).f38639;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            C12866 c12866 = (C12866) arrayList.get(i);
            long j2 = c12866.f38639;
            long j3 = c12866.f38639;
            if (j < j2) {
                long j4 = ((C12866) arrayList.get(i - 1)).f38638;
                return (j4 == -9223372036854775807L || j4 <= j || j4 >= j3) ? j3 : j4;
            }
        }
        long j5 = ((C12866) C8882.m22955(arrayList)).f38638;
        if (j5 == -9223372036854775807L || j >= j5) {
            return Long.MIN_VALUE;
        }
        return j5;
    }

    @Override // l.InterfaceC17512
    public final void clear() {
        this.f21391.clear();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private int m18735(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f21391;
            if (i >= arrayList.size()) {
                return arrayList.size();
            }
            if (j < ((C12866) arrayList.get(i)).f38639) {
                return i;
            }
            i++;
        }
    }
}
