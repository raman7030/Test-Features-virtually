package l;

/* JADX INFO: renamed from: l.ܳ֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88JO */
/* JADX INFO: loaded from: classes4.dex */
public final class C14172 implements InterfaceC15583 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f42783;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f42784;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f42785;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String f42786;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f42787;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public InterfaceC19383 f42788;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f42789;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C16302 f42790;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f42791;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C8353 f42792;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f42793;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f42794;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f42795;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f42796;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C17714 f42797;

    @Override // l.InterfaceC15583
    /* JADX INFO: renamed from: ֫ */
    public final void mo1004(boolean z) {
    }

    public C14172(String str, int i, String str2) {
        C16302 c16302 = new C16302(new byte[16], 16);
        this.f42790 = c16302;
        this.f42797 = new C17714(c16302.f50146);
        this.f42785 = 0;
        this.f42783 = 0;
        this.f42796 = false;
        this.f42793 = false;
        this.f42795 = -9223372036854775807L;
        this.f42786 = str;
        this.f42787 = i;
        this.f42789 = str2;
    }

    @Override // l.InterfaceC15583
    /* JADX INFO: renamed from: ֫ */
    public final void mo1000() {
        this.f42785 = 0;
        this.f42783 = 0;
        this.f42796 = false;
        this.f42793 = false;
        this.f42795 = -9223372036854775807L;
    }

    @Override // l.InterfaceC15583
    /* JADX INFO: renamed from: ֫ */
    public final void mo1003(InterfaceC21830 interfaceC21830, C19259 c19259) {
        c19259.m44443();
        this.f42794 = c19259.m44444();
        this.f42788 = interfaceC21830.mo3429(c19259.m44445(), 1);
    }

    @Override // l.InterfaceC15583
    /* JADX INFO: renamed from: ֫ */
    public final void mo1001(int i, long j) {
        this.f42795 = j;
    }

    @Override // l.InterfaceC15583
    /* JADX INFO: renamed from: ֫ */
    public final void mo1002(C17714 c17714) {
        C22632.m50632(this.f42788);
        while (c17714.m41457() > 0) {
            int i = this.f42785;
            C17714 c17715 = this.f42797;
            if (i == 0) {
                while (c17714.m41457() > 0) {
                    if (!this.f42796) {
                        this.f42796 = c17714.m41456() == 172;
                    } else {
                        int iM41456 = c17714.m41456();
                        this.f42796 = iM41456 == 172;
                        if (iM41456 == 64 || iM41456 == 65) {
                            this.f42793 = iM41456 == 65;
                            this.f42785 = 1;
                            c17715.m41482()[0] = -84;
                            c17715.m41482()[1] = (byte) (this.f42793 ? 65 : 64);
                            this.f42783 = 2;
                            break;
                        }
                    }
                }
            } else if (i == 1) {
                byte[] bArrM41482 = c17715.m41482();
                int iMin = Math.min(c17714.m41457(), 16 - this.f42783);
                c17714.m41461(this.f42783, iMin, bArrM41482);
                int i2 = this.f42783 + iMin;
                this.f42783 = i2;
                if (i2 == 16) {
                    C16302 c16302 = this.f42790;
                    c16302.m38354(0);
                    C22826 c22826M32806 = C13653.m32806(c16302);
                    int i3 = c22826M32806.f73697;
                    C8353 c8353 = this.f42792;
                    if (c8353 == null || 2 != c8353.f25625 || i3 != c8353.f25624 || !"audio/ac4".equals(c8353.f25614)) {
                        C1297 c1297 = new C1297();
                        c1297.m4469(this.f42794);
                        c1297.m4462(this.f42789);
                        c1297.m4465("audio/ac4");
                        c1297.m4472(2);
                        c1297.m4456(i3);
                        c1297.m4471(this.f42786);
                        c1297.m4454(this.f42787);
                        C8353 c8353M4440 = c1297.m4440();
                        this.f42792 = c8353M4440;
                        this.f42788.mo8456(c8353M4440);
                    }
                    this.f42784 = c22826M32806.f73695;
                    this.f42791 = (((long) c22826M32806.f73696) * 1000000) / ((long) this.f42792.f25624);
                    c17715.m41484(0);
                    this.f42788.mo8453(16, c17715);
                    this.f42785 = 2;
                }
            } else if (i == 2) {
                int iMin2 = Math.min(c17714.m41457(), this.f42784 - this.f42783);
                this.f42788.mo8453(iMin2, c17714);
                int i4 = this.f42783 + iMin2;
                this.f42783 = i4;
                if (i4 == this.f42784) {
                    C22632.m50634(this.f42795 != -9223372036854775807L);
                    this.f42788.mo8455(this.f42795, 1, this.f42784, 0, null);
                    this.f42795 += this.f42791;
                    this.f42785 = 0;
                }
            }
        }
    }
}
