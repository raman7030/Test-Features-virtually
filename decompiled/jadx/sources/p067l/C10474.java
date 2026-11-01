package p067l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۡ֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: F8HT */
/* JADX INFO: loaded from: classes3.dex */
public final class C10474 implements InterfaceC17178 {

    /* JADX INFO: renamed from: ֫ */
    public int f28971;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC20790[] f28972;

    /* JADX INFO: renamed from: ܳ */
    public boolean f28973;

    /* JADX INFO: renamed from: ܽ */
    public int f28974;

    /* JADX INFO: renamed from: ܿ */
    public final List f28975;

    /* JADX INFO: renamed from: ᩳ */
    public long f28976 = -9223372036854775807L;

    public C10474(List list) {
        this.f28975 = list;
        this.f28972 = new InterfaceC20790[list.size()];
    }

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3395() {
        this.f28973 = false;
        this.f28976 = -9223372036854775807L;
    }

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3398(InterfaceC23116 interfaceC23116, C20672 c20672) {
        int i = 0;
        while (true) {
            InterfaceC20790[] interfaceC20790Arr = this.f28972;
            if (i >= interfaceC20790Arr.length) {
                return;
            }
            C4578 c4578 = (C4578) this.f28975.get(i);
            c20672.m46737();
            InterfaceC20790 interfaceC20790Mo5732 = interfaceC23116.mo5732(c20672.m46739(), 3);
            C3601 c3601 = new C3601();
            c3601.m6701(c20672.m46738());
            c3601.m6694("video/mp2t");
            c3601.m6697("application/dvbsubs");
            c3601.m6678(Collections.singletonList(c4578.f10250));
            c3601.m6703(c4578.f10251);
            interfaceC20790Mo5732.mo10503(c3601.m6672());
            interfaceC20790Arr[i] = interfaceC20790Mo5732;
            i++;
        }
    }

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3396(int i, long j) {
        if ((i & 4) == 0) {
            return;
        }
        this.f28973 = true;
        this.f28976 = j;
        this.f28974 = 0;
        this.f28971 = 2;
    }

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3399(boolean z) {
        if (this.f28973) {
            C23877.m52960(this.f28976 != -9223372036854775807L);
            for (InterfaceC20790 interfaceC20790 : this.f28972) {
                interfaceC20790.mo10502(this.f28976, 1, this.f28974, 0, null);
            }
            this.f28973 = false;
        }
    }

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3397(C19203 c19203) {
        boolean z;
        boolean z2;
        if (this.f28973) {
            if (this.f28971 == 2) {
                if (c19203.m43703() == 0) {
                    z2 = false;
                } else {
                    if (c19203.m43702() != 32) {
                        this.f28973 = false;
                    }
                    this.f28971--;
                    z2 = this.f28973;
                }
                if (!z2) {
                    return;
                }
            }
            if (this.f28971 == 1) {
                if (c19203.m43703() == 0) {
                    z = false;
                } else {
                    if (c19203.m43702() != 0) {
                        this.f28973 = false;
                    }
                    this.f28971--;
                    z = this.f28973;
                }
                if (!z) {
                    return;
                }
            }
            int iM43731 = c19203.m43731();
            int iM43703 = c19203.m43703();
            for (InterfaceC20790 interfaceC20790 : this.f28972) {
                c19203.m43730(iM43731);
                interfaceC20790.mo10500(iM43703, c19203);
            }
            this.f28974 += iM43703;
        }
    }
}
