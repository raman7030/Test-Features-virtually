package p067l;

/* JADX INFO: renamed from: l.ۘܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 09ZB */
/* JADX INFO: loaded from: classes3.dex */
public final class C6219 extends AbstractC10913 {

    /* JADX INFO: renamed from: ۛ */
    public int f15682;

    /* JADX INFO: renamed from: ۤ */
    public C3536 f15683;

    /* JADX INFO: renamed from: ۨ */
    public int f15684;

    /* JADX INFO: renamed from: ۫ */
    public String f15685;

    /* JADX INFO: renamed from: ܰ */
    public C12254 f15686;

    /* JADX INFO: renamed from: ᩺ */
    public int f15687;

    @Override // p067l.AbstractC10913
    /* JADX INFO: renamed from: ֫ */
    public final int mo14092() {
        return 21;
    }

    public C6219(String str) {
        C3536 c3536 = new C3536();
        C12254 c12254 = new C12254();
        c12254.f34260 = 0;
        this.f15685 = str;
        this.f15682 = 200;
        this.f15684 = 65535;
        this.f15683 = c3536;
        this.f15686 = c12254;
        c3536.f7167 = 200;
        c3536.f7166 = new C7560();
        this.f30252 = 0;
        this.f30255 = 3;
    }

    @Override // p067l.AbstractC10913
    /* JADX INFO: renamed from: ܳ */
    public final void mo14093(C14935 c14935) {
        C12254 c12254 = this.f15686;
        c14935.m34159(this.f15685);
        c14935.m34167(this.f15682);
        c14935.m34167(this.f15684);
        c14935.m34158(this.f15683);
        C3536 c3536 = this.f15683;
        if (c3536 != null) {
            c3536.mo4602(c14935);
        }
        c14935.m34158(c12254);
        if (c12254 != null) {
            c14935.m34167(c12254.f34260);
        }
    }

    @Override // p067l.AbstractC10913
    /* JADX INFO: renamed from: ᩳ */
    public final void mo14094(C14935 c14935) {
        if (c14935.m34156() != 0) {
            if (this.f15683 == null) {
                this.f15683 = new C3536();
            }
            this.f15683.mo4601(c14935);
        }
        if (c14935.m34156() != 0) {
            C12254 c12254 = this.f15686;
            c12254.getClass();
            c12254.f34260 = c14935.m34156();
        }
        this.f15687 = c14935.m34156();
    }
}
