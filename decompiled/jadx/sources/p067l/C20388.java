package p067l;

/* JADX INFO: renamed from: l.ᩴ᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 48CR */
/* JADX INFO: loaded from: classes4.dex */
public final class C20388 {

    /* JADX INFO: renamed from: ۖ */
    public C24390 f63027;

    /* JADX INFO: renamed from: ۘ */
    public C12321 f63028;

    /* JADX INFO: renamed from: ۜ */
    public C13662 f63029;

    /* JADX INFO: renamed from: ۡ */
    public C13662 f63030;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ C2952 f63031;

    /* JADX INFO: renamed from: ۧ */
    public int f63032;

    /* JADX INFO: renamed from: ܳ */
    public C9638 f63033;

    /* JADX INFO: renamed from: ܽ */
    public C21059 f63035;

    /* JADX INFO: renamed from: ܿ */
    public C15672 f63036;

    /* JADX INFO: renamed from: ᩳ */
    public C4294 f63037;

    /* JADX INFO: renamed from: ᩷ */
    public boolean f63038;

    /* JADX INFO: renamed from: ᩻ */
    public int f63039;

    /* JADX INFO: renamed from: ֫ */
    public double f63026 = 0.16666666666666666d;

    /* JADX INFO: renamed from: ܺ */
    public InterfaceC21729 f63034 = new C6306(this);

    public C20388(C2952 c2952, int i) {
        this.f63031 = c2952;
        this.f63032 = i;
        if (i == 9) {
            this.f63038 = true;
            this.f63039 = 128;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46037(C21059 c21059) {
        this.f63035 = c21059;
        C2952 c2952 = this.f63031;
        InterfaceC6544 interfaceC6544 = c2952.f5144;
        C9638 c9638 = new C9638();
        this.f63033 = c9638;
        ((C9226) interfaceC6544).m21255(c9638);
        InterfaceC6544 interfaceC6545 = c2952.f5144;
        C4294 c4294 = new C4294();
        C10309 c10309 = new C10309("Frequency");
        c4294.f9544 = c10309;
        c4294.m55058(c10309);
        c10309.m23923(40.0d, 440.0d, 8000.0d);
        C10309 c103010 = new C10309(1, "Amplitude", 1.0d);
        c4294.f9542 = c103010;
        c4294.m55058(c103010);
        C23720 c23720 = new C23720("Phase");
        c4294.f9543 = c23720;
        c4294.m55058(c23720);
        C17013 c17013 = new C17013(0);
        c4294.f9541 = c17013;
        c4294.m55058(c17013);
        this.f63037 = c4294;
        ((C9226) interfaceC6545).m21255(c4294);
        InterfaceC6544 interfaceC6546 = c2952.f5144;
        C13662 c13662 = new C13662();
        this.f63030 = c13662;
        ((C9226) interfaceC6546).m21255(c13662);
        this.f63030.f38437.m23922(0.02d);
        InterfaceC6544 interfaceC6547 = c2952.f5144;
        C13662 c13663 = new C13662();
        this.f63029 = c13663;
        ((C9226) interfaceC6547).m21255(c13663);
        this.f63029.f38437.m23922(0.02d);
        InterfaceC6544 interfaceC6548 = c2952.f5144;
        C12321 c12321 = new C12321();
        this.f63028 = c12321;
        ((C9226) interfaceC6548).m21255(c12321);
        this.f63028.f56832.m23922(1.0d);
        this.f63028.f34396.m23922(0.02d);
        InterfaceC6544 interfaceC6549 = c2952.f5144;
        C24390 c24390 = new C24390();
        this.f63027 = c24390;
        ((C9226) interfaceC6549).m21255(c24390);
        InterfaceC6544 interfaceC65410 = c2952.f5144;
        C15672 c15672 = new C15672();
        C10309 c103011 = new C10309("Input");
        c15672.f44809 = c103011;
        c15672.m55058(c103011);
        C10309 c103012 = new C10309("Pan");
        c15672.f44808 = c103012;
        c15672.m55058(c103012);
        c103012.m23923(-1.0d, 0.0d, 1.0d);
        C17013 c17014 = new C17013("Output");
        c15672.f44810 = c17014;
        c15672.m55058(c17014);
        this.f63036 = c15672;
        ((C9226) interfaceC65410).m21255(c15672);
        this.f63033.f26535.m23930();
        this.f63037.f9541.m38618(0, this.f63033.f26535, 0);
        this.f63037.f9542.m23922(0.0d);
        this.f63037.f9544.m23922(5.0d);
        this.f63028.f56833.m38618(0, this.f63027.f59985, 0);
        this.f63027.f59983.m38618(0, this.f63036.f44809, 0);
        this.f63036.f44810.m38618(0, c2952.f5143.f54880, 0);
        this.f63036.f44810.m38618(1, c2952.f5143.f54881, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public static void m46033(C20388 c20388, InterfaceC22400 interfaceC22400) {
        AbstractC25081 abstractC25081 = (AbstractC25081) interfaceC22400;
        C10309 c10309 = (C10309) abstractC25081.mo15937("FreqScaler");
        if (c10309 != null) {
            c10309.m40213();
            c20388.f63033.f26536.m38618(0, c10309, 0);
        }
        C10309 c103010 = (C10309) abstractC25081.mo15937("Timbre");
        if (c103010 != null) {
            c103010.m40213();
            c20388.f63030.f56833.m38618(0, c103010, 0);
            c20388.f63030.f56832.m23926(c103010);
        }
        C10309 c103011 = (C10309) abstractC25081.mo15937("Pressure");
        if (c103011 != null) {
            c103011.m40213();
            c20388.f63029.f56833.m38618(0, c103011, 0);
            c20388.f63029.f56832.m23926(c103011);
        }
        interfaceC22400.mo8718().m40213();
        interfaceC22400.mo8718().m38618(0, c20388.f63027.f59984, 0);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m46039(int i) {
        if (this.f63038) {
            return;
        }
        int iM52781 = i % this.f63035.f66142.m52781();
        String str = this.f63035.f66142.m52782()[iM52781];
        this.f63039 = iM52781;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46035(int i) {
        C22559 c22559M21253 = ((C9226) this.f63031.f5144).m21253();
        C23070 c23070 = this.f63035.f66141;
        int i2 = (this.f63032 << 8) + i;
        ((C9226) c23070.m51461()).m21254(c22559M21253, new C10329(c23070, i2));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46036(int i, double d) {
        C22559 c22559M21253 = ((C9226) this.f63031.f5144).m21253();
        double dM5318 = C3111.m5318(i);
        C23070 c23070 = this.f63035.f66141;
        ((C9226) c23070.m51461()).m21254(c22559M21253, new C3623(c23070, (this.f63032 << 8) + i, this.f63034, dM5318, d));
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m46041(double d) {
        this.f63033.f26535.m23922(this.f63026 * d);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46034(double d) {
        this.f63026 = d / 12.0d;
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m46040(double d) {
        this.f63037.f9542.m23922(d);
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m46044(double d) {
        this.f63028.f56832.m23922(Math.pow(63095.73444801944d, d) * 1.5848931924611107E-5d);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m46038(double d) {
        this.f63036.f44808.m23922(d);
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m46042(double d) {
        double dM23931 = this.f63030.f56832.m23931();
        this.f63030.f56832.m23922(((this.f63030.f56832.m23929() - dM23931) * d) + dM23931);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m46043(double d) {
        double dM23931 = this.f63029.f56832.m23931();
        this.f63029.f56832.m23922(Math.pow(this.f63029.f56832.m23929() / dM23931, d) * dM23931);
    }
}
