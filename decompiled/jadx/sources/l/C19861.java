package l;

import java.util.List;

/* JADX INFO: renamed from: l.᩶֫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18OR */
/* JADX INFO: loaded from: classes5.dex */
public final class C19861 implements InterfaceC0536 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f64140;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 f64141;

    public C19861(List list, List list2) {
        int i = AbstractC14545.f44556;
        C1846 c1846 = new C1846();
        C22632.m50631(list.size() == list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            c1846.m16264(new C21977((InterfaceC0536) list.get(i2), (List) list2.get(i2)));
        }
        this.f64141 = c1846.m6131();
        this.f64140 = -9223372036854775807L;
    }

    @Override // l.InterfaceC0536
    /* JADX INFO: renamed from: ۜ */
    public final long mo2266() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            AbstractC14545 abstractC14545 = this.f64141;
            if (i >= abstractC14545.size()) {
                break;
            }
            C21977 c21977 = (C21977) abstractC14545.get(i);
            long jMo2266 = c21977.mo2266();
            if ((c21977.m49460().contains(1) || c21977.m49460().contains(2) || c21977.m49460().contains(4)) && jMo2266 != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jMo2266);
            }
            if (jMo2266 != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jMo2266);
            }
            i++;
        }
        if (jMin != C13132.FOREVER_NS) {
            this.f64140 = jMin;
            return jMin;
        }
        if (jMin2 == C13132.FOREVER_NS) {
            return Long.MIN_VALUE;
        }
        long j = this.f64140;
        return j != -9223372036854775807L ? j : jMin2;
    }

    @Override // l.InterfaceC0536
    /* JADX INFO: renamed from: ۧ */
    public final long mo2267() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            AbstractC14545 abstractC14545 = this.f64141;
            if (i >= abstractC14545.size()) {
                break;
            }
            long jMo2267 = ((C21977) abstractC14545.get(i)).mo2267();
            if (jMo2267 != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jMo2267);
            }
            i++;
        }
        if (jMin == C13132.FOREVER_NS) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // l.InterfaceC0536
    /* JADX INFO: renamed from: ۧ */
    public final void mo2268(long j) {
        int i = 0;
        while (true) {
            AbstractC14545 abstractC14545 = this.f64141;
            if (i >= abstractC14545.size()) {
                return;
            }
            ((C21977) abstractC14545.get(i)).mo2268(j);
            i++;
        }
    }

    @Override // l.InterfaceC0536
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2265(C11469 c11469) {
        boolean zMo2265;
        boolean z = false;
        do {
            long jMo2267 = mo2267();
            if (jMo2267 == Long.MIN_VALUE) {
                return z;
            }
            int i = 0;
            zMo2265 = false;
            while (true) {
                AbstractC14545 abstractC14545 = this.f64141;
                if (i >= abstractC14545.size()) {
                    break;
                }
                long jMo2268 = ((C21977) abstractC14545.get(i)).mo2267();
                boolean z2 = jMo2268 != Long.MIN_VALUE && jMo2268 <= c11469.f34255;
                if (jMo2268 == jMo2267 || z2) {
                    zMo2265 |= ((C21977) abstractC14545.get(i)).mo2265(c11469);
                }
                i++;
            }
            z |= zMo2265;
        } while (zMo2265);
        return z;
    }

    @Override // l.InterfaceC0536
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2264() {
        int i = 0;
        while (true) {
            AbstractC14545 abstractC14545 = this.f64141;
            if (i >= abstractC14545.size()) {
                return false;
            }
            if (((C21977) abstractC14545.get(i)).mo2264()) {
                return true;
            }
            i++;
        }
    }
}
