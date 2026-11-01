package p067l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩻ᩳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8HS */
/* JADX INFO: loaded from: classes.dex */
public final class C25047 implements InterfaceC19012 {

    /* JADX INFO: renamed from: ۧ */
    public static final AbstractC12093 f79935 = AbstractC12093.m27883().m27888(new C1514()).m27887(AbstractC12093.m27883().mo24451().m27888(new C6406(5)));

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f79936 = new ArrayList();

    @Override // p067l.InterfaceC19012
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo20687(C14596 c14596, long j) {
        long j2 = c14596.f41683;
        C23877.m52957(j2 != -9223372036854775807L);
        C23877.m52957(c14596.f41681 != -9223372036854775807L);
        boolean z = j2 <= j && j < c14596.f41682;
        ArrayList arrayList = this.f79936;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((C14596) arrayList.get(size)).f41683) {
                arrayList.add(size + 1, c14596);
                return z;
            }
        }
        arrayList.add(0, c14596);
        return z;
    }

    @Override // p067l.InterfaceC19012
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC16192 mo20686(long j) {
        ArrayList arrayList = this.f79936;
        if (!arrayList.isEmpty()) {
            if (j >= ((C14596) arrayList.get(0)).f41683) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    C14596 c14596 = (C14596) arrayList.get(i);
                    if (j >= c14596.f41683 && j < c14596.f41682) {
                        arrayList2.add(c14596);
                    }
                    if (j < c14596.f41683) {
                        break;
                    }
                }
                AbstractC16192 abstractC16192M36880 = AbstractC16192.m36880(f79935, arrayList2);
                C4123 c4123 = new C4123();
                for (int i2 = 0; i2 < abstractC16192M36880.size(); i2++) {
                    c4123.m18183((List) ((C14596) abstractC16192M36880.get(i2)).f41680);
                }
                return c4123.m8329();
            }
        }
        return AbstractC16192.m36872of();
    }

    @Override // p067l.InterfaceC19012
    /* JADX INFO: renamed from: ᩳ */
    public final void mo20690(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f79936;
            if (i >= arrayList.size()) {
                return;
            }
            long j2 = ((C14596) arrayList.get(i)).f41683;
            if (j > j2 && j > ((C14596) arrayList.get(i)).f41682) {
                arrayList.remove(i);
                i--;
            } else if (j < j2) {
                return;
            }
            i++;
        }
    }

    @Override // p067l.InterfaceC19012
    /* JADX INFO: renamed from: ۧ */
    public final long mo20688(long j) {
        ArrayList arrayList = this.f79936;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j < ((C14596) arrayList.get(0)).f41683) {
            return -9223372036854775807L;
        }
        long jMax = ((C14596) arrayList.get(0)).f41683;
        for (int i = 0; i < arrayList.size(); i++) {
            long j2 = ((C14596) arrayList.get(i)).f41683;
            long j3 = ((C14596) arrayList.get(i)).f41682;
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

    @Override // p067l.InterfaceC19012
    /* JADX INFO: renamed from: ܽ */
    public final long mo20689(long j) {
        int i = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.f79936;
            if (i >= arrayList.size()) {
                break;
            }
            long j2 = ((C14596) arrayList.get(i)).f41683;
            long j3 = ((C14596) arrayList.get(i)).f41682;
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

    @Override // p067l.InterfaceC19012
    public final void clear() {
        this.f79936.clear();
    }
}
