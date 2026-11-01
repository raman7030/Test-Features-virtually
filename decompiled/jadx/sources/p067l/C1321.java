package p067l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۢܶ */
/* JADX INFO: compiled from: 31AT */
/* JADX INFO: loaded from: classes4.dex */
public final class C1321 extends AbstractC1251 {
    @Override // p067l.AbstractC1251
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo8445() {
        return false;
    }

    @Override // p067l.AbstractC1251
    /* JADX INFO: renamed from: ܽ */
    public final void mo8446() {
        this.f28285 = null;
        this.f28292.m43019();
    }

    /* JADX INFO: renamed from: ֫ */
    private void m26609(C1706 c1706) {
        C1706 c1707 = this.f28292;
        c1707.f56457.add(c1706);
        c1706.f56463.add(c1707);
    }

    @Override // p067l.AbstractC1251
    /* JADX INFO: renamed from: ֫ */
    public final void mo8442() {
        C1591 c1591 = this.f28286;
        if (c1591 instanceof C0961) {
            C1706 c1706 = this.f28292;
            c1706.f56453 = true;
            ArrayList arrayList = c1706.f56463;
            C0961 c0961 = (C0961) c1591;
            int iM9829 = c0961.m9829();
            boolean zM9833 = c0961.m9833();
            int i = 0;
            if (iM9829 == 0) {
                c1706.f56456 = EnumC1741.LEFT;
                while (i < c0961.f41927) {
                    C1591 c1592 = c0961.f41928[i];
                    if (zM9833 || c1592.m37893() != 8) {
                        C1706 c1707 = c1592.f49276.f28292;
                        c1707.f56457.add(c1706);
                        arrayList.add(c1707);
                    }
                    i++;
                }
                m26609(this.f28286.f49276.f28292);
                m26609(this.f28286.f49276.f28289);
                return;
            }
            if (iM9829 == 1) {
                c1706.f56456 = EnumC1741.RIGHT;
                while (i < c0961.f41927) {
                    C1591 c1593 = c0961.f41928[i];
                    if (zM9833 || c1593.m37893() != 8) {
                        C1706 c1708 = c1593.f49276.f28289;
                        c1708.f56457.add(c1706);
                        arrayList.add(c1708);
                    }
                    i++;
                }
                m26609(this.f28286.f49276.f28292);
                m26609(this.f28286.f49276.f28289);
                return;
            }
            if (iM9829 == 2) {
                c1706.f56456 = EnumC1741.TOP;
                while (i < c0961.f41927) {
                    C1591 c1594 = c0961.f41928[i];
                    if (zM9833 || c1594.m37893() != 8) {
                        C1706 c1709 = c1594.f49260.f28292;
                        c1709.f56457.add(c1706);
                        arrayList.add(c1709);
                    }
                    i++;
                }
                m26609(this.f28286.f49260.f28292);
                m26609(this.f28286.f49260.f28289);
                return;
            }
            if (iM9829 != 3) {
                return;
            }
            c1706.f56456 = EnumC1741.BOTTOM;
            while (i < c0961.f41927) {
                C1591 c1595 = c0961.f41928[i];
                if (zM9833 || c1595.m37893() != 8) {
                    C1706 c17010 = c1595.f49260.f28289;
                    c17010.f56457.add(c1706);
                    arrayList.add(c17010);
                }
                i++;
            }
            m26609(this.f28286.f49260.f28292);
            m26609(this.f28286.f49260.f28289);
        }
    }

    @Override // p067l.AbstractC1251, p067l.InterfaceC1391
    /* JADX INFO: renamed from: ֫ */
    public final void mo8443(InterfaceC1391 interfaceC1391) {
        C0961 c0961 = (C0961) this.f28286;
        int iM9829 = c0961.m9829();
        C1706 c1706 = this.f28292;
        Iterator it = c1706.f56463.iterator();
        int i = 0;
        int i2 = -1;
        while (it.hasNext()) {
            int i3 = ((C1706) it.next()).f56459;
            if (i2 == -1 || i3 < i2) {
                i2 = i3;
            }
            if (i < i3) {
                i = i3;
            }
        }
        if (iM9829 == 0 || iM9829 == 2) {
            c1706.mo37000(c0961.m9828() + i2);
        } else {
            c1706.mo37000(c0961.m9828() + i);
        }
    }

    @Override // p067l.AbstractC1251
    /* JADX INFO: renamed from: ۧ */
    public final void mo8444() {
        C1591 c1591 = this.f28286;
        if (c1591 instanceof C0961) {
            int iM9829 = ((C0961) c1591).m9829();
            C1706 c1706 = this.f28292;
            if (iM9829 == 0 || iM9829 == 1) {
                this.f28286.m37864(c1706.f56459);
            } else {
                this.f28286.m37889(c1706.f56459);
            }
        }
    }
}
