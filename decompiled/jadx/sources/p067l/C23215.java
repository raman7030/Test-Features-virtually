package p067l;

/* JADX INFO: renamed from: l.᩹֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8HW */
/* JADX INFO: loaded from: classes.dex */
public final class C23215 implements InterfaceC17178 {

    /* JADX INFO: renamed from: ۧ */
    public InterfaceC20790 f72953;

    /* JADX INFO: renamed from: ܳ */
    public boolean f72954;

    /* JADX INFO: renamed from: ܽ */
    public int f72955;

    /* JADX INFO: renamed from: ᩳ */
    public int f72957;

    /* JADX INFO: renamed from: ֫ */
    public final C19203 f72952 = new C19203(10);

    /* JADX INFO: renamed from: ܿ */
    public long f72956 = -9223372036854775807L;

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3395() {
        this.f72954 = false;
        this.f72956 = -9223372036854775807L;
    }

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3398(InterfaceC23116 interfaceC23116, C20672 c20672) {
        c20672.m46737();
        InterfaceC20790 interfaceC20790Mo5732 = interfaceC23116.mo5732(c20672.m46739(), 5);
        this.f72953 = interfaceC20790Mo5732;
        C3601 c3601 = new C3601();
        c3601.m6701(c20672.m46738());
        c3601.m6694("video/mp2t");
        c3601.m6697("application/id3");
        interfaceC20790Mo5732.mo10503(c3601.m6672());
    }

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3396(int i, long j) {
        if ((i & 4) == 0) {
            return;
        }
        this.f72954 = true;
        this.f72956 = j;
        this.f72957 = 0;
        this.f72955 = 0;
    }

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3397(C19203 c19203) {
        C23877.m52958(this.f72953);
        if (this.f72954) {
            int iM43703 = c19203.m43703();
            int i = this.f72955;
            if (i < 10) {
                int iMin = Math.min(iM43703, 10 - i);
                byte[] bArrM43728 = c19203.m43728();
                int iM43731 = c19203.m43731();
                C19203 c19204 = this.f72952;
                System.arraycopy(bArrM43728, iM43731, c19204.m43728(), this.f72955, iMin);
                if (this.f72955 + iMin == 10) {
                    c19204.m43730(0);
                    if (73 != c19204.m43702() || 68 != c19204.m43702() || 51 != c19204.m43702()) {
                        C21334.m48351("Discarding invalid ID3 tag");
                        this.f72954 = false;
                        return;
                    } else {
                        c19204.m43724(3);
                        this.f72957 = c19204.m43713() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iM43703, this.f72957 - this.f72955);
            this.f72953.mo10500(iMin2, c19203);
            this.f72955 += iMin2;
        }
    }

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3399(boolean z) {
        int i;
        C23877.m52958(this.f72953);
        if (this.f72954 && (i = this.f72957) != 0 && this.f72955 == i) {
            C23877.m52960(this.f72956 != -9223372036854775807L);
            this.f72953.mo10502(this.f72956, 1, this.f72957, 0, null);
            this.f72954 = false;
        }
    }
}
