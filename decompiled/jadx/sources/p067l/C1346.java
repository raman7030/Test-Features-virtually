package p067l;

/* JADX INFO: renamed from: l.ۤ۠ */
/* JADX INFO: compiled from: X1BE */
/* JADX INFO: loaded from: classes4.dex */
public class C1346 extends C1486 {

    /* JADX INFO: renamed from: ۜۧ */
    public int f33505 = 0;

    /* JADX INFO: renamed from: ܿۧ */
    public int f33511 = 0;

    /* JADX INFO: renamed from: ᩻ۧ */
    public int f33514 = 0;

    /* JADX INFO: renamed from: ܳۧ */
    public int f33509 = 0;

    /* JADX INFO: renamed from: ᩷ۧ */
    public int f33513 = 0;

    /* JADX INFO: renamed from: ۢۧ */
    public int f33507 = 0;

    /* JADX INFO: renamed from: ᩳۧ */
    public boolean f33512 = false;

    /* JADX INFO: renamed from: ۧۧ */
    public int f33508 = 0;

    /* JADX INFO: renamed from: ֫ۧ */
    public int f33504 = 0;

    /* JADX INFO: renamed from: ۟֫ */
    public C1976 f33506 = new C1976();

    /* JADX INFO: renamed from: ܽۧ */
    public InterfaceC1521 f33510 = null;

    /* JADX INFO: renamed from: ֫ */
    public void mo27520(int i, int i2, int i3, int i4) {
    }

    /* JADX INFO: renamed from: ֨ */
    public final void m27519(int i) {
        this.f33505 = i;
        this.f33511 = i;
        this.f33514 = i;
        this.f33509 = i;
    }

    /* JADX INFO: renamed from: ᩶ */
    public final void m27534(int i) {
        this.f33514 = i;
        this.f33513 = i;
        this.f33507 = i;
    }

    /* JADX INFO: renamed from: ܶ */
    public final void m27530(int i) {
        this.f33509 = i;
    }

    /* JADX INFO: renamed from: ᩸ */
    public final void m27536(int i) {
        this.f33513 = i;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m27529(boolean z) {
        int i = this.f33514;
        if (i > 0 || this.f33509 > 0) {
            if (z) {
                this.f33513 = this.f33509;
                this.f33507 = i;
            } else {
                this.f33513 = i;
                this.f33507 = this.f33509;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public final void m27524(int i) {
        this.f33505 = i;
    }

    /* JADX INFO: renamed from: ᩹ */
    public final void m27537(int i) {
        this.f33507 = i;
    }

    /* JADX INFO: renamed from: ۠ */
    public final void m27526(int i) {
        this.f33511 = i;
    }

    /* JADX INFO: renamed from: ۖ֫ */
    public final int m27522() {
        return this.f33505;
    }

    /* JADX INFO: renamed from: ۢ֫ */
    public final int m27528() {
        return this.f33511;
    }

    /* JADX INFO: renamed from: ۡ֫ */
    public final int m27527() {
        return this.f33513;
    }

    /* JADX INFO: renamed from: ܺ֫ */
    public final int m27531() {
        return this.f33507;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m27532(boolean z) {
        this.f33512 = z;
    }

    /* JADX INFO: renamed from: ۘ֫ */
    public final boolean m27523() {
        return this.f33512;
    }

    @Override // p067l.C1486
    /* JADX INFO: renamed from: ᩻֫ */
    public final void mo27538() {
        for (int i = 0; i < this.f41927; i++) {
            C1591 c1591 = this.f41928[i];
            if (c1591 != null) {
                c1591.m37924();
            }
        }
    }

    /* JADX INFO: renamed from: ᩷֫ */
    public final int m27535() {
        return this.f33508;
    }

    /* JADX INFO: renamed from: ۜ֫ */
    public final int m27525() {
        return this.f33504;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m27533(int i, int i2) {
        this.f33508 = i;
        this.f33504 = i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m27521(C1591 c1591, EnumC1241 enumC1241, int i, EnumC1241 enumC1242, int i2) {
        InterfaceC1521 interfaceC1521;
        C1591 c1592;
        while (true) {
            interfaceC1521 = this.f33510;
            if (interfaceC1521 != null || (c1592 = this.f49252) == null) {
                break;
            } else {
                this.f33510 = ((C1906) c1592).f71743;
            }
        }
        C1976 c1976 = this.f33506;
        c1976.f76476 = enumC1241;
        c1976.f76484 = enumC1242;
        c1976.f76479 = i;
        c1976.f76478 = i2;
        interfaceC1521.mo35045(c1591, c1976);
        c1591.m37928(c1976.f76477);
        c1591.m37891(c1976.f76480);
        c1591.m37879(c1976.f76482);
        c1591.m37910(c1976.f76483);
    }
}
