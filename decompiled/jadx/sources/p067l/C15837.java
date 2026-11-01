package p067l;

/* JADX INFO: renamed from: l.ܳ֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88JO */
/* JADX INFO: loaded from: classes4.dex */
public final class C15837 implements InterfaceC17178 {

    /* JADX INFO: renamed from: ֫ */
    public int f45870;

    /* JADX INFO: renamed from: ۖ */
    public int f45871;

    /* JADX INFO: renamed from: ۘ */
    public int f45872;

    /* JADX INFO: renamed from: ۜ */
    public final String f45873;

    /* JADX INFO: renamed from: ۡ */
    public final int f45874;

    /* JADX INFO: renamed from: ۢ */
    public InterfaceC20790 f45875;

    /* JADX INFO: renamed from: ۧ */
    public final String f45876;

    /* JADX INFO: renamed from: ܳ */
    public final C17861 f45877;

    /* JADX INFO: renamed from: ܺ */
    public long f45878;

    /* JADX INFO: renamed from: ܽ */
    public C10307 f45879;

    /* JADX INFO: renamed from: ܿ */
    public boolean f45880;

    /* JADX INFO: renamed from: ᩳ */
    public String f45881;

    /* JADX INFO: renamed from: ᩴ */
    public long f45882;

    /* JADX INFO: renamed from: ᩷ */
    public boolean f45883;

    /* JADX INFO: renamed from: ᩻ */
    public final C19203 f45884;

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3399(boolean z) {
    }

    public C15837(String str, int i, String str2) {
        C17861 c17861 = new C17861(new byte[16], 16);
        this.f45877 = c17861;
        this.f45884 = new C19203(c17861.f53313);
        this.f45872 = 0;
        this.f45870 = 0;
        this.f45883 = false;
        this.f45880 = false;
        this.f45882 = -9223372036854775807L;
        this.f45873 = str;
        this.f45874 = i;
        this.f45876 = str2;
    }

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3395() {
        this.f45872 = 0;
        this.f45870 = 0;
        this.f45883 = false;
        this.f45880 = false;
        this.f45882 = -9223372036854775807L;
    }

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3398(InterfaceC23116 interfaceC23116, C20672 c20672) {
        c20672.m46737();
        this.f45881 = c20672.m46738();
        this.f45875 = interfaceC23116.mo5732(c20672.m46739(), 1);
    }

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3396(int i, long j) {
        this.f45882 = j;
    }

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3397(C19203 c19203) {
        C23877.m52958(this.f45875);
        while (c19203.m43703() > 0) {
            int i = this.f45872;
            C19203 c19204 = this.f45884;
            if (i == 0) {
                while (c19203.m43703() > 0) {
                    if (!this.f45883) {
                        this.f45883 = c19203.m43702() == 172;
                    } else {
                        int iM43702 = c19203.m43702();
                        this.f45883 = iM43702 == 172;
                        if (iM43702 == 64 || iM43702 == 65) {
                            this.f45880 = iM43702 == 65;
                            this.f45872 = 1;
                            c19204.m43728()[0] = -84;
                            c19204.m43728()[1] = (byte) (this.f45880 ? 65 : 64);
                            this.f45870 = 2;
                            break;
                        }
                    }
                }
            } else if (i == 1) {
                byte[] bArrM43728 = c19204.m43728();
                int iMin = Math.min(c19203.m43703(), 16 - this.f45870);
                c19203.m43707(this.f45870, iMin, bArrM43728);
                int i2 = this.f45870 + iMin;
                this.f45870 = i2;
                if (i2 == 16) {
                    C17861 c17861 = this.f45877;
                    c17861.m40569(0);
                    C24062 c24062M34921 = C15344.m34921(c17861);
                    int i3 = c24062M34921.f76429;
                    C10307 c10307 = this.f45879;
                    if (c10307 == null || 2 != c10307.f28539 || i3 != c10307.f28538 || !"audio/ac4".equals(c10307.f28528)) {
                        C3601 c3601 = new C3601();
                        c3601.m6701(this.f45881);
                        c3601.m6694(this.f45876);
                        c3601.m6697("audio/ac4");
                        c3601.m6704(2);
                        c3601.m6688(i3);
                        c3601.m6703(this.f45873);
                        c3601.m6686(this.f45874);
                        C10307 c10307M6672 = c3601.m6672();
                        this.f45879 = c10307M6672;
                        this.f45875.mo10503(c10307M6672);
                    }
                    this.f45871 = c24062M34921.f76427;
                    this.f45878 = (((long) c24062M34921.f76428) * 1000000) / ((long) this.f45879.f28538);
                    c19204.m43730(0);
                    this.f45875.mo10500(16, c19204);
                    this.f45872 = 2;
                }
            } else if (i == 2) {
                int iMin2 = Math.min(c19203.m43703(), this.f45871 - this.f45870);
                this.f45875.mo10500(iMin2, c19203);
                int i4 = this.f45870 + iMin2;
                this.f45870 = i4;
                if (i4 == this.f45871) {
                    C23877.m52960(this.f45882 != -9223372036854775807L);
                    this.f45875.mo10502(this.f45882, 1, this.f45871, 0, null);
                    this.f45882 += this.f45878;
                    this.f45872 = 0;
                }
            }
        }
    }
}
