package p067l;

/* JADX INFO: renamed from: l.᩷ܶ */
/* JADX INFO: compiled from: 31AV */
/* JADX INFO: loaded from: classes5.dex */
public final class C1881 extends AbstractC1251 {
    @Override // p067l.AbstractC1251
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo8445() {
        return false;
    }

    @Override // p067l.AbstractC1251
    /* JADX INFO: renamed from: ܽ */
    public final void mo8446() {
        this.f28292.m43019();
    }

    /* JADX INFO: renamed from: ֫ */
    private void m50091(C1706 c1706) {
        C1706 c1707 = this.f28292;
        c1707.f56457.add(c1706);
        c1706.f56463.add(c1707);
    }

    @Override // p067l.AbstractC1251, p067l.InterfaceC1391
    /* JADX INFO: renamed from: ֫ */
    public final void mo8443(InterfaceC1391 interfaceC1391) {
        C1706 c1706 = this.f28292;
        if (c1706.f56458 && !c1706.f56464) {
            C1706 c1707 = (C1706) c1706.f56463.get(0);
            c1706.mo37000((int) ((((C0996) this.f28286).m11499() * c1707.f56459) + 0.5f));
        }
    }

    @Override // p067l.AbstractC1251
    /* JADX INFO: renamed from: ֫ */
    public final void mo8442() {
        C0996 c0996 = (C0996) this.f28286;
        int iM11497 = c0996.m11497();
        int iM11504 = c0996.m11504();
        int iM11506 = c0996.m11506();
        C1706 c1706 = this.f28292;
        if (iM11506 == 1) {
            if (iM11497 != -1) {
                c1706.f56463.add(this.f28286.f49252.f49276.f28292);
                this.f28286.f49252.f49276.f28292.f56457.add(c1706);
                c1706.f56460 = iM11497;
            } else if (iM11504 != -1) {
                c1706.f56463.add(this.f28286.f49252.f49276.f28289);
                this.f28286.f49252.f49276.f28289.f56457.add(c1706);
                c1706.f56460 = -iM11504;
            } else {
                c1706.f56453 = true;
                c1706.f56463.add(this.f28286.f49252.f49276.f28289);
                this.f28286.f49252.f49276.f28289.f56457.add(c1706);
            }
            m50091(this.f28286.f49276.f28292);
            m50091(this.f28286.f49276.f28289);
            return;
        }
        if (iM11497 != -1) {
            c1706.f56463.add(this.f28286.f49252.f49260.f28292);
            this.f28286.f49252.f49260.f28292.f56457.add(c1706);
            c1706.f56460 = iM11497;
        } else if (iM11504 != -1) {
            c1706.f56463.add(this.f28286.f49252.f49260.f28289);
            this.f28286.f49252.f49260.f28289.f56457.add(c1706);
            c1706.f56460 = -iM11504;
        } else {
            c1706.f56453 = true;
            c1706.f56463.add(this.f28286.f49252.f49260.f28289);
            this.f28286.f49252.f49260.f28289.f56457.add(c1706);
        }
        m50091(this.f28286.f49260.f28292);
        m50091(this.f28286.f49260.f28289);
    }

    @Override // p067l.AbstractC1251
    /* JADX INFO: renamed from: ۧ */
    public final void mo8444() {
        int iM11506 = ((C0996) this.f28286).m11506();
        C1706 c1706 = this.f28292;
        if (iM11506 == 1) {
            this.f28286.m37864(c1706.f56459);
        } else {
            this.f28286.m37889(c1706.f56459);
        }
    }
}
