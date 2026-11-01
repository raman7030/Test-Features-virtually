package p067l;

/* JADX INFO: renamed from: l.ᩳ֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: F8S4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19191 implements InterfaceC17178 {

    /* JADX INFO: renamed from: ֫ */
    public int f57354;

    /* JADX INFO: renamed from: ۖ */
    public int f57355;

    /* JADX INFO: renamed from: ۘ */
    public long f57356;

    /* JADX INFO: renamed from: ۜ */
    public boolean f57357;

    /* JADX INFO: renamed from: ۡ */
    public long f57358;

    /* JADX INFO: renamed from: ۢ */
    public final int f57359;

    /* JADX INFO: renamed from: ۧ */
    public final String f57360;

    /* JADX INFO: renamed from: ܳ */
    public final C19203 f57361;

    /* JADX INFO: renamed from: ܺ */
    public int f57362;

    /* JADX INFO: renamed from: ܽ */
    public C10307 f57363;

    /* JADX INFO: renamed from: ܿ */
    public final C17861 f57364;

    /* JADX INFO: renamed from: ᩳ */
    public String f57365;

    /* JADX INFO: renamed from: ᩷ */
    public InterfaceC20790 f57366;

    /* JADX INFO: renamed from: ᩻ */
    public final String f57367;

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3399(boolean z) {
    }

    public C19191(String str) {
        this(null, 0, str);
    }

    public C19191(String str, int i, String str2) {
        C17861 c17861 = new C17861(new byte[128], 128);
        this.f57364 = c17861;
        this.f57361 = new C19203(c17861.f53313);
        this.f57355 = 0;
        this.f57356 = -9223372036854775807L;
        this.f57367 = str;
        this.f57359 = i;
        this.f57360 = str2;
    }

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3395() {
        this.f57355 = 0;
        this.f57354 = 0;
        this.f57357 = false;
        this.f57356 = -9223372036854775807L;
    }

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3398(InterfaceC23116 interfaceC23116, C20672 c20672) {
        c20672.m46737();
        this.f57365 = c20672.m46738();
        this.f57366 = interfaceC23116.mo5732(c20672.m46739(), 1);
    }

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3396(int i, long j) {
        this.f57356 = j;
    }

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3397(C19203 c19203) {
        C23877.m52958(this.f57366);
        while (c19203.m43703() > 0) {
            int i = this.f57355;
            C19203 c19204 = this.f57361;
            if (i == 0) {
                while (c19203.m43703() > 0) {
                    if (!this.f57357) {
                        this.f57357 = c19203.m43702() == 11;
                    } else {
                        int iM43702 = c19203.m43702();
                        if (iM43702 == 119) {
                            this.f57357 = false;
                            this.f57355 = 1;
                            c19204.m43728()[0] = 11;
                            c19204.m43728()[1] = 119;
                            this.f57354 = 2;
                            break;
                        }
                        this.f57357 = iM43702 == 11;
                    }
                }
            } else if (i == 1) {
                byte[] bArrM43728 = c19204.m43728();
                int iMin = Math.min(c19203.m43703(), 128 - this.f57354);
                c19203.m43707(this.f57354, iMin, bArrM43728);
                int i2 = this.f57354 + iMin;
                this.f57354 = i2;
                if (i2 == 128) {
                    C17861 c17861 = this.f57364;
                    c17861.m40569(0);
                    C11993 c11993M18440 = C7969.m18440(c17861);
                    int i3 = c11993M18440.f33439;
                    int i4 = c11993M18440.f33441;
                    int i5 = c11993M18440.f33440;
                    String str = c11993M18440.f33444;
                    C10307 c10307 = this.f57363;
                    if (c10307 == null || i5 != c10307.f28539 || i4 != c10307.f28538 || !C12826.equals(str, c10307.f28528)) {
                        C3601 c3601 = new C3601();
                        c3601.m6701(this.f57365);
                        c3601.m6694(this.f57360);
                        c3601.m6697(str);
                        c3601.m6704(i5);
                        c3601.m6688(i4);
                        c3601.m6703(this.f57367);
                        c3601.m6686(this.f57359);
                        c3601.m6670(i3);
                        if ("audio/ac3".equals(str)) {
                            c3601.m6700(i3);
                        }
                        C10307 c10307M6672 = c3601.m6672();
                        this.f57363 = c10307M6672;
                        this.f57366.mo10503(c10307M6672);
                    }
                    this.f57362 = c11993M18440.f33442;
                    this.f57358 = (((long) c11993M18440.f33443) * 1000000) / ((long) this.f57363.f28538);
                    c19204.m43730(0);
                    this.f57366.mo10500(128, c19204);
                    this.f57355 = 2;
                }
            } else if (i == 2) {
                int iMin2 = Math.min(c19203.m43703(), this.f57362 - this.f57354);
                this.f57366.mo10500(iMin2, c19203);
                int i6 = this.f57354 + iMin2;
                this.f57354 = i6;
                if (i6 == this.f57362) {
                    C23877.m52960(this.f57356 != -9223372036854775807L);
                    this.f57366.mo10502(this.f57356, 1, this.f57362, 0, null);
                    this.f57356 += this.f57358;
                    this.f57355 = 0;
                }
            }
        }
    }
}
