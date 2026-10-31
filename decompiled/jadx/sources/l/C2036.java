package l;

/* JADX INFO: renamed from: l.֫᩵ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: W142 */
/* JADX INFO: loaded from: classes2.dex */
public class C2036 implements InterfaceC17066 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4300 f6788;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f6789;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC22560 f6790;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f6791;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2036 m6620(InterfaceC5627 interfaceC5627) {
        if (interfaceC5627 == null) {
            return null;
        }
        if (interfaceC5627 instanceof InterfaceC1393) {
            return new C2036((InterfaceC1393) interfaceC5627);
        }
        if (interfaceC5627 instanceof InterfaceC22560) {
            return new C2036((InterfaceC22560) interfaceC5627);
        }
        return new C2036(interfaceC5627);
    }

    public C2036(InterfaceC5627 interfaceC5627) {
        this.f6790 = new C23181(interfaceC5627);
        this.f6791 = false;
        this.f6788 = null;
    }

    public C2036(InterfaceC1393 interfaceC1393) {
        this.f6790 = new C14008(interfaceC1393);
        this.f6791 = false;
        this.f6788 = null;
    }

    public C2036(InterfaceC22560 interfaceC22560) {
        this.f6790 = interfaceC22560;
        this.f6791 = true;
        C4300 c4300Mo5680 = interfaceC22560.mo5680();
        if (c4300Mo5680 == null) {
            c4300Mo5680 = new C4300();
            c4300Mo5680.m12878();
            this.f6789 = true;
        }
        this.f6788 = c4300Mo5680;
    }

    @Override // l.InterfaceC17066
    /* JADX INFO: renamed from: ᩻ */
    public boolean mo1526() {
        return this.f6790.mo1526();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo6621(long j, long j2, long j3) {
        if (this.f6791) {
            C4300 c4300 = this.f6788;
            if (j > 0) {
                c4300.m12877(j);
            }
            this.f6790.mo5679(j, j2, j3, c4300.m12876());
            return;
        }
        this.f6790.mo5679(j, j2, j3, 0L);
    }

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public void mo6623() {
        this.f6790.mo1648();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void mo6622() {
        if (this.f6789) {
            this.f6788.m12879();
        }
    }
}
