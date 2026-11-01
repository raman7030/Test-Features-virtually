package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۜᩳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8UT */
/* JADX INFO: loaded from: classes3.dex */
public final class C8954 implements InterfaceC19012 {

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f24272 = new ArrayList();

    /* JADX WARN: Code duplicated, block: B:13:0x0022  */
    @Override // p067l.InterfaceC19012
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo20687(C14596 c14596, long j) {
        boolean z;
        long j2 = c14596.f41683;
        C23877.m52957(j2 != -9223372036854775807L);
        if (j2 <= j) {
            long j3 = c14596.f41682;
            if (j3 == -9223372036854775807L || j < j3) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        ArrayList arrayList = this.f24272;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((C14596) arrayList.get(size)).f41683) {
                arrayList.add(size + 1, c14596);
                return z;
            }
            if (((C14596) arrayList.get(size)).f41683 <= j) {
                z = false;
            }
        }
        arrayList.add(0, c14596);
        return z;
    }

    @Override // p067l.InterfaceC19012
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC16192 mo20686(long j) {
        int iM20685 = m20685(j);
        if (iM20685 == 0) {
            return AbstractC16192.m36872of();
        }
        C14596 c14596 = (C14596) this.f24272.get(iM20685 - 1);
        long j2 = c14596.f41682;
        if (j2 == -9223372036854775807L || j < j2) {
            return c14596.f41680;
        }
        return AbstractC16192.m36872of();
    }

    @Override // p067l.InterfaceC19012
    /* JADX INFO: renamed from: ᩳ */
    public final void mo20690(long j) {
        int iM20685 = m20685(j);
        if (iM20685 == 0) {
            return;
        }
        ArrayList arrayList = this.f24272;
        long j2 = ((C14596) arrayList.get(iM20685 - 1)).f41682;
        if (j2 == -9223372036854775807L || j2 >= j) {
            iM20685--;
        }
        arrayList.subList(0, iM20685).clear();
    }

    @Override // p067l.InterfaceC19012
    /* JADX INFO: renamed from: ۧ */
    public final long mo20688(long j) {
        ArrayList arrayList = this.f24272;
        if (arrayList.isEmpty() || j < ((C14596) arrayList.get(0)).f41683) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j2 = ((C14596) arrayList.get(i)).f41683;
            if (j == j2) {
                return j2;
            }
            if (j < j2) {
                C14596 c14596 = (C14596) arrayList.get(i - 1);
                long j3 = c14596.f41682;
                return (j3 == -9223372036854775807L || j3 > j) ? c14596.f41683 : j3;
            }
        }
        C14596 c14597 = (C14596) C10810.m24926(arrayList);
        long j4 = c14597.f41682;
        return (j4 == -9223372036854775807L || j < j4) ? c14597.f41683 : j4;
    }

    @Override // p067l.InterfaceC19012
    /* JADX INFO: renamed from: ܽ */
    public final long mo20689(long j) {
        ArrayList arrayList = this.f24272;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < ((C14596) arrayList.get(0)).f41683) {
            return ((C14596) arrayList.get(0)).f41683;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            C14596 c14596 = (C14596) arrayList.get(i);
            long j2 = c14596.f41683;
            long j3 = c14596.f41683;
            if (j < j2) {
                long j4 = ((C14596) arrayList.get(i - 1)).f41682;
                return (j4 == -9223372036854775807L || j4 <= j || j4 >= j3) ? j3 : j4;
            }
        }
        long j5 = ((C14596) C10810.m24926(arrayList)).f41682;
        if (j5 == -9223372036854775807L || j >= j5) {
            return Long.MIN_VALUE;
        }
        return j5;
    }

    @Override // p067l.InterfaceC19012
    public final void clear() {
        this.f24272.clear();
    }

    /* JADX INFO: renamed from: ܿ */
    private int m20685(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f24272;
            if (i >= arrayList.size()) {
                return arrayList.size();
            }
            if (j < ((C14596) arrayList.get(i)).f41683) {
                return i;
            }
            i++;
        }
    }
}
