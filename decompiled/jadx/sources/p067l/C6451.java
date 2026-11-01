package p067l;

import com.umeng.analytics.pro.C0684bo;

/* JADX INFO: renamed from: l.ۙ֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: G8K6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6451 implements InterfaceC17178 {

    /* JADX INFO: renamed from: ֫ */
    public final String f16664;

    /* JADX INFO: renamed from: ۖ */
    public int f16665 = 0;

    /* JADX INFO: renamed from: ۘ */
    public long f16666;

    /* JADX INFO: renamed from: ۜ */
    public final C19203 f16667;

    /* JADX INFO: renamed from: ۡ */
    public InterfaceC20790 f16668;

    /* JADX INFO: renamed from: ۢ */
    public boolean f16669;

    /* JADX INFO: renamed from: ۧ */
    public String f16670;

    /* JADX INFO: renamed from: ܳ */
    public boolean f16671;

    /* JADX INFO: renamed from: ܺ */
    public final int f16672;

    /* JADX INFO: renamed from: ܽ */
    public int f16673;

    /* JADX INFO: renamed from: ܿ */
    public int f16674;

    /* JADX INFO: renamed from: ᩳ */
    public long f16675;

    /* JADX INFO: renamed from: ᩷ */
    public final String f16676;

    /* JADX INFO: renamed from: ᩻ */
    public final C18777 f16677;

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3399(boolean z) {
    }

    public C6451(String str, int i, String str2) {
        C19203 c19203 = new C19203(4);
        this.f16667 = c19203;
        c19203.m43728()[0] = -1;
        this.f16677 = new C18777();
        this.f16666 = -9223372036854775807L;
        this.f16676 = str;
        this.f16672 = i;
        this.f16664 = str2;
    }

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3395() {
        this.f16665 = 0;
        this.f16673 = 0;
        this.f16669 = false;
        this.f16666 = -9223372036854775807L;
    }

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3398(InterfaceC23116 interfaceC23116, C20672 c20672) {
        c20672.m46737();
        this.f16670 = c20672.m46738();
        this.f16668 = interfaceC23116.mo5732(c20672.m46739(), 1);
    }

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3396(int i, long j) {
        this.f16666 = j;
    }

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3397(C19203 c19203) {
        C23877.m52958(this.f16668);
        while (c19203.m43703() > 0) {
            int i = this.f16665;
            C19203 c19204 = this.f16667;
            if (i == 0) {
                byte[] bArrM43728 = c19203.m43728();
                int iM43731 = c19203.m43731();
                int iM43729 = c19203.m43729();
                while (true) {
                    if (iM43731 < iM43729) {
                        byte b = bArrM43728[iM43731];
                        boolean z = (b & 255) == 255;
                        boolean z2 = this.f16669 && (b & C0684bo.f2506k) == 224;
                        this.f16669 = z;
                        if (z2) {
                            c19203.m43730(iM43731 + 1);
                            this.f16669 = false;
                            c19204.m43728()[1] = bArrM43728[iM43731];
                            this.f16673 = 2;
                            this.f16665 = 1;
                            break;
                        }
                        iM43731++;
                    } else {
                        c19203.m43730(iM43729);
                        break;
                    }
                }
            } else if (i == 1) {
                int iMin = Math.min(c19203.m43703(), 4 - this.f16673);
                c19203.m43707(this.f16673, iMin, c19204.m43728());
                int i2 = this.f16673 + iMin;
                this.f16673 = i2;
                if (i2 >= 4) {
                    c19204.m43730(0);
                    int iM43739 = c19204.m43739();
                    C18777 c18777 = this.f16677;
                    if (!c18777.m42806(iM43739)) {
                        this.f16673 = 0;
                        this.f16665 = 1;
                    } else {
                        this.f16674 = c18777.f56103;
                        if (!this.f16671) {
                            this.f16675 = (((long) c18777.f56102) * 1000000) / ((long) c18777.f56104);
                            C3601 c3601 = new C3601();
                            c3601.m6701(this.f16670);
                            c3601.m6694(this.f16664);
                            c3601.m6697(c18777.f56105);
                            c3601.m6683(4096);
                            c3601.m6704(c18777.f56101);
                            c3601.m6688(c18777.f56104);
                            c3601.m6703(this.f16676);
                            c3601.m6686(this.f16672);
                            this.f16668.mo10503(c3601.m6672());
                            this.f16671 = true;
                        }
                        c19204.m43730(0);
                        this.f16668.mo10500(4, c19204);
                        this.f16665 = 2;
                    }
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                int iMin2 = Math.min(c19203.m43703(), this.f16674 - this.f16673);
                this.f16668.mo10500(iMin2, c19203);
                int i3 = this.f16673 + iMin2;
                this.f16673 = i3;
                if (i3 >= this.f16674) {
                    C23877.m52960(this.f16666 != -9223372036854775807L);
                    this.f16668.mo10502(this.f16666, 1, this.f16674, 0, null);
                    this.f16666 += this.f16675;
                    this.f16673 = 0;
                    this.f16665 = 0;
                }
            }
        }
    }
}
