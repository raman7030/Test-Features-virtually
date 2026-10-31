package l;

/* JADX INFO: renamed from: l.۫ᩴۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: K8D0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12588 extends AbstractC14725 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public double f37958;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C8355 f37959;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C8355 f37960;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public double f37961;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public EnumC13293 f37962;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C8355 f37963;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C8355 f37964;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public double f37965;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C8355 f37966;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public double f37967;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C8355 f37968;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C8355 f37969;

    public C12588() {
        C0593 c0593 = new C0593();
        this.f44972 = c0593;
        m52649(c0593);
        C15409 c15409 = new C15409(0);
        this.f44973 = c15409;
        m52649(c15409);
        this.f37962 = EnumC13293.IDLE;
        this.f37958 = 1.0d;
        C8355 c8355 = new C8355(1, "Delay", 0.0d);
        this.f37966 = c8355;
        m52649(c8355);
        c8355.m21953(0.0d, 0.0d, 2.0d);
        C8355 c8356 = new C8355(1, "Attack", 0.1d);
        this.f37969 = c8356;
        m52649(c8356);
        c8356.m21953(0.01d, 0.1d, 8.0d);
        C8355 c8357 = new C8355(1, "Hold", 0.0d);
        this.f37960 = c8357;
        m52649(c8357);
        c8357.m21953(0.0d, 0.0d, 2.0d);
        C8355 c8358 = new C8355(1, "Decay", 0.2d);
        this.f37964 = c8358;
        m52649(c8358);
        c8358.m21953(0.01d, 0.2d, 8.0d);
        C8355 c8359 = new C8355(1, "Sustain", 0.5d);
        this.f37959 = c8359;
        m52649(c8359);
        c8359.m21953(0.0d, 0.5d, 1.0d);
        C8355 c83510 = new C8355(1, "Release", 0.3d);
        this.f37968 = c83510;
        m52649(c83510);
        c83510.m21953(0.01d, 0.3d, 8.0d);
        C8355 c83511 = new C8355(1, "Amplitude", 1.0d);
        this.f37963 = c83511;
        m52649(c83511);
    }

    @Override // l.AbstractC23898
    /* JADX INFO: renamed from: ۧ */
    public final void mo6591() {
        double[] dArrM38021 = this.f37959.m38021();
        double[] dArrM38022 = this.f37963.m38021();
        double[] dArrM38023 = this.f44973.m38021();
        int i = 0;
        while (i < 8) {
            C0593 c0593 = this.f44972;
            boolean zM2453 = c0593.m2453(i);
            switch (C3416.f10790[this.f37962.ordinal()]) {
                case 1:
                    while (true) {
                        if (i >= 8) {
                            continue;
                        }
                        dArrM38023[i] = this.f37967 * dArrM38022[i];
                        if (zM2453) {
                            m30855(i);
                        }
                        i++;
                        break;
                        break;
                    }
                    break;
                case 2:
                    while (true) {
                        if (i >= 8) {
                            continue;
                        }
                        dArrM38023[i] = this.f37967 * dArrM38022[i];
                        if (c0593.m2449()) {
                            m30852(i);
                        }
                        double d = this.f37965 - 1.0d;
                        this.f37965 = d;
                        if (d <= 0.0d) {
                            m30851(i);
                        }
                        i++;
                        break;
                        break;
                        break;
                    }
                    break;
                case 3:
                    while (true) {
                        if (i >= 8) {
                            continue;
                        }
                        double d2 = this.f37967 + this.f37961;
                        this.f37967 = d2;
                        if (d2 >= 1.0d) {
                            this.f37967 = 1.0d;
                            dArrM38023[i] = 1.0d * dArrM38022[i];
                            m30854(i);
                        } else {
                            dArrM38023[i] = d2 * dArrM38022[i];
                            if (c0593.m2449()) {
                                m30852(i);
                            }
                            i++;
                        }
                        break;
                        break;
                    }
                    break;
                case 4:
                    while (true) {
                        if (i >= 8) {
                            continue;
                        }
                        dArrM38023[i] = dArrM38022[i];
                        double d3 = this.f37965 - 1.0d;
                        this.f37965 = d3;
                        if (d3 <= 0.0d) {
                            m30853(i);
                        } else {
                            if (c0593.m2449()) {
                                m30852(i);
                            }
                            i++;
                        }
                        break;
                        break;
                    }
                    break;
                case 5:
                    while (i < 8) {
                        double d4 = this.f37967;
                        dArrM38023[i] = dArrM38022[i] * d4;
                        double d5 = d4 * this.f37958;
                        this.f37967 = d5;
                        if (zM2453) {
                            m30855(i);
                        }
                        double d6 = dArrM38021[i];
                        if (d5 < d6) {
                            this.f37967 = d6;
                            this.f37962 = EnumC13293.SUSTAINING;
                        } else if (d5 < 1.5848931924611107E-5d) {
                            c0593.m2450();
                        } else {
                            if (c0593.m2449()) {
                                m30852(i);
                            }
                            i++;
                        }
                        break;
                        break;
                    }
                    break;
                case 6:
                    while (true) {
                        if (i >= 8) {
                            continue;
                        }
                        double d7 = dArrM38021[i];
                        this.f37967 = d7;
                        dArrM38023[i] = d7 * dArrM38022[i];
                        if (zM2453) {
                            m30855(i);
                        } else {
                            if (c0593.m2449()) {
                                m30852(i);
                            }
                            i++;
                        }
                        break;
                        break;
                    }
                    break;
                case 7:
                    while (i < 8) {
                        double d8 = this.f37967;
                        dArrM38023[i] = dArrM38022[i] * d8;
                        double d9 = d8 * this.f37958;
                        this.f37967 = d9;
                        if (zM2453) {
                            m30855(i);
                        } else if (d9 < 1.5848931924611107E-5d) {
                            c0593.m2450();
                        } else {
                            i++;
                        }
                        break;
                    }
                    break;
                default:
                    continue;
            }
            this.f37962 = EnumC13293.IDLE;
            this.f37967 = 0.0d;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m30855(int i) {
        double d = this.f37966.m38021()[i];
        if (d <= 0.0d) {
            m30851(i);
        } else {
            this.f37965 = (int) (d * ((double) this.f77261.m19315()));
            this.f37962 = EnumC13293.DELAYING;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m30851(int i) {
        double d = this.f37969.m38021()[i];
        if (d < 1.0E-5d) {
            this.f37967 = 1.0d;
            m30854(i);
        } else {
            this.f37961 = this.f77261.m19313() / d;
            this.f37962 = EnumC13293.ATTACKING;
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m30854(int i) {
        double d = this.f37960.m38021()[i];
        if (d <= 0.0d) {
            m30853(i);
        } else {
            this.f37965 = (int) (d * ((double) this.f77261.m19315()));
            this.f37962 = EnumC13293.HOLDING;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m30853(int i) {
        double d = this.f37964.m38021()[i];
        if (d >= 1.0E-5d) {
            this.f37958 = this.f77261.m19304(d);
            this.f37962 = EnumC13293.DECAYING;
        } else {
            this.f37962 = EnumC13293.SUSTAINING;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m30852(int i) {
        double d = this.f37968.m38021()[i];
        if (d < 1.0E-5d) {
            d = 1.0E-5d;
        }
        this.f37958 = this.f77261.m19304(d);
        this.f37962 = EnumC13293.RELEASING;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30856(C4827 c4827, String str) {
        StringBuilder sbM15339 = C5368.m15339(str);
        C8355 c8355 = this.f37969;
        sbM15339.append(c8355.m49083());
        c4827.m52648(c8355, sbM15339.toString());
        StringBuilder sbM153310 = C5368.m15339(str);
        C8355 c8356 = this.f37964;
        sbM153310.append(c8356.m49083());
        c4827.m52648(c8356, sbM153310.toString());
        StringBuilder sbM153311 = C5368.m15339(str);
        C8355 c8357 = this.f37959;
        sbM153311.append(c8357.m49083());
        c4827.m52648(c8357, sbM153311.toString());
        StringBuilder sbM153312 = C5368.m15339(str);
        C8355 c8358 = this.f37968;
        sbM153312.append(c8358.m49083());
        c4827.m52648(c8358, sbM153312.toString());
    }
}
