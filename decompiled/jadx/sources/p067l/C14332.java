package p067l;

/* JADX INFO: renamed from: l.۫ᩴۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: K8D0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14332 extends AbstractC16363 {

    /* JADX INFO: renamed from: ֡ */
    public double f40986;

    /* JADX INFO: renamed from: ֨ */
    public C10309 f40987;

    /* JADX INFO: renamed from: ۖ */
    public C10309 f40988;

    /* JADX INFO: renamed from: ۘ */
    public double f40989;

    /* JADX INFO: renamed from: ۚ */
    public EnumC15002 f40990;

    /* JADX INFO: renamed from: ۜ */
    public C10309 f40991;

    /* JADX INFO: renamed from: ۡ */
    public C10309 f40992;

    /* JADX INFO: renamed from: ۢ */
    public double f40993;

    /* JADX INFO: renamed from: ܺ */
    public C10309 f40994;

    /* JADX INFO: renamed from: ᩴ */
    public double f40995;

    /* JADX INFO: renamed from: ᩵ */
    public C10309 f40996;

    /* JADX INFO: renamed from: ᩷ */
    public C10309 f40997;

    public C14332() {
        C2932 c2932 = new C2932();
        this.f48085 = c2932;
        m55058(c2932);
        C17013 c17013 = new C17013(0);
        this.f48086 = c17013;
        m55058(c17013);
        this.f40990 = EnumC15002.IDLE;
        this.f40986 = 1.0d;
        C10309 c10309 = new C10309(1, "Delay", 0.0d);
        this.f40994 = c10309;
        m55058(c10309);
        c10309.m23923(0.0d, 0.0d, 2.0d);
        C10309 c103010 = new C10309(1, "Attack", 0.1d);
        this.f40997 = c103010;
        m55058(c103010);
        c103010.m23923(0.01d, 0.1d, 8.0d);
        C10309 c103011 = new C10309(1, "Hold", 0.0d);
        this.f40988 = c103011;
        m55058(c103011);
        c103011.m23923(0.0d, 0.0d, 2.0d);
        C10309 c103012 = new C10309(1, "Decay", 0.2d);
        this.f40992 = c103012;
        m55058(c103012);
        c103012.m23923(0.01d, 0.2d, 8.0d);
        C10309 c103013 = new C10309(1, "Sustain", 0.5d);
        this.f40987 = c103013;
        m55058(c103013);
        c103013.m23923(0.0d, 0.5d, 1.0d);
        C10309 c103014 = new C10309(1, "Release", 0.3d);
        this.f40996 = c103014;
        m55058(c103014);
        c103014.m23923(0.01d, 0.3d, 8.0d);
        C10309 c103015 = new C10309(1, "Amplitude", 1.0d);
        this.f40991 = c103015;
        m55058(c103015);
    }

    @Override // p067l.AbstractC25081
    /* JADX INFO: renamed from: ۧ */
    public final void mo8717() {
        double[] dArrM40212 = this.f40987.m40212();
        double[] dArrM40213 = this.f40991.m40212();
        double[] dArrM40214 = this.f48086.m40212();
        int i = 0;
        while (i < 8) {
            C2932 c2932 = this.f48085;
            boolean zM4808 = c2932.m4808(i);
            switch (C5615.f13596[this.f40990.ordinal()]) {
                case 1:
                    while (true) {
                        if (i >= 8) {
                            continue;
                        }
                        dArrM40214[i] = this.f40995 * dArrM40213[i];
                        if (zM4808) {
                            m32932(i);
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
                        dArrM40214[i] = this.f40995 * dArrM40213[i];
                        if (c2932.m4804()) {
                            m32929(i);
                        }
                        double d = this.f40993 - 1.0d;
                        this.f40993 = d;
                        if (d <= 0.0d) {
                            m32928(i);
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
                        double d2 = this.f40995 + this.f40989;
                        this.f40995 = d2;
                        if (d2 >= 1.0d) {
                            this.f40995 = 1.0d;
                            dArrM40214[i] = 1.0d * dArrM40213[i];
                            m32931(i);
                        } else {
                            dArrM40214[i] = d2 * dArrM40213[i];
                            if (c2932.m4804()) {
                                m32929(i);
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
                        dArrM40214[i] = dArrM40213[i];
                        double d3 = this.f40993 - 1.0d;
                        this.f40993 = d3;
                        if (d3 <= 0.0d) {
                            m32930(i);
                        } else {
                            if (c2932.m4804()) {
                                m32929(i);
                            }
                            i++;
                        }
                        break;
                        break;
                    }
                    break;
                case 5:
                    while (i < 8) {
                        double d4 = this.f40995;
                        dArrM40214[i] = dArrM40213[i] * d4;
                        double d5 = d4 * this.f40986;
                        this.f40995 = d5;
                        if (zM4808) {
                            m32932(i);
                        }
                        double d6 = dArrM40212[i];
                        if (d5 < d6) {
                            this.f40995 = d6;
                            this.f40990 = EnumC15002.SUSTAINING;
                        } else if (d5 < 1.5848931924611107E-5d) {
                            c2932.m4805();
                        } else {
                            if (c2932.m4804()) {
                                m32929(i);
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
                        double d7 = dArrM40212[i];
                        this.f40995 = d7;
                        dArrM40214[i] = d7 * dArrM40213[i];
                        if (zM4808) {
                            m32932(i);
                        } else {
                            if (c2932.m4804()) {
                                m32929(i);
                            }
                            i++;
                        }
                        break;
                        break;
                    }
                    break;
                case 7:
                    while (i < 8) {
                        double d8 = this.f40995;
                        dArrM40214[i] = dArrM40213[i] * d8;
                        double d9 = d8 * this.f40986;
                        this.f40995 = d9;
                        if (zM4808) {
                            m32932(i);
                        } else if (d9 < 1.5848931924611107E-5d) {
                            c2932.m4805();
                        } else {
                            i++;
                        }
                        break;
                    }
                    break;
                default:
                    continue;
            }
            this.f40990 = EnumC15002.IDLE;
            this.f40995 = 0.0d;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m32932(int i) {
        double d = this.f40994.m40212()[i];
        if (d <= 0.0d) {
            m32928(i);
        } else {
            this.f40993 = (int) (d * ((double) this.f80012.m21263()));
            this.f40990 = EnumC15002.DELAYING;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m32928(int i) {
        double d = this.f40997.m40212()[i];
        if (d < 1.0E-5d) {
            this.f40995 = 1.0d;
            m32931(i);
        } else {
            this.f40989 = this.f80012.m21261() / d;
            this.f40990 = EnumC15002.ATTACKING;
        }
    }

    /* JADX INFO: renamed from: ܿ */
    private void m32931(int i) {
        double d = this.f40988.m40212()[i];
        if (d <= 0.0d) {
            m32930(i);
        } else {
            this.f40993 = (int) (d * ((double) this.f80012.m21263()));
            this.f40990 = EnumC15002.HOLDING;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private void m32930(int i) {
        double d = this.f40992.m40212()[i];
        if (d >= 1.0E-5d) {
            this.f40986 = this.f80012.m21252(d);
            this.f40990 = EnumC15002.DECAYING;
        } else {
            this.f40990 = EnumC15002.SUSTAINING;
        }
    }

    /* JADX INFO: renamed from: ܳ */
    private void m32929(int i) {
        double d = this.f40996.m40212()[i];
        if (d < 1.0E-5d) {
            d = 1.0E-5d;
        }
        this.f40986 = this.f80012.m21252(d);
        this.f40990 = EnumC15002.RELEASING;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32933(C6956 c6956, String str) {
        StringBuilder sbM17248 = C7470.m17248(str);
        C10309 c10309 = this.f40997;
        sbM17248.append(c10309.m51432());
        c6956.m55057(c10309, sbM17248.toString());
        StringBuilder sbM17249 = C7470.m17248(str);
        C10309 c103010 = this.f40992;
        sbM17249.append(c103010.m51432());
        c6956.m55057(c103010, sbM17249.toString());
        StringBuilder sbM172410 = C7470.m17248(str);
        C10309 c103011 = this.f40987;
        sbM172410.append(c103011.m51432());
        c6956.m55057(c103011, sbM172410.toString());
        StringBuilder sbM172411 = C7470.m17248(str);
        C10309 c103012 = this.f40996;
        sbM172411.append(c103012.m51432());
        c6956.m55057(c103012, sbM172411.toString());
    }
}
