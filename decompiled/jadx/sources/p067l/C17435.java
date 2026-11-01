package p067l;

import java.util.List;

/* JADX INFO: renamed from: l.ܺۢۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8IG */
/* JADX INFO: loaded from: classes4.dex */
public final class C17435 implements InterfaceC3669 {

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC23116 f52111;

    /* JADX INFO: renamed from: ۧ */
    public final int f52112;

    /* JADX INFO: renamed from: ܳ */
    public int f52113;

    /* JADX INFO: renamed from: ܽ */
    public final int f52114;

    /* JADX INFO: renamed from: ܿ */
    public int f52115;

    /* JADX INFO: renamed from: ᩳ */
    public final String f52116;

    /* JADX INFO: renamed from: ᩻ */
    public InterfaceC20790 f52117;

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7076() {
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC3669 mo7081() {
        return this;
    }

    public C17435(int i, int i2, String str) {
        this.f52112 = i;
        this.f52114 = i2;
        this.f52116 = str;
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo7079(InterfaceC10375 interfaceC10375) {
        int i = this.f52114;
        int i2 = this.f52112;
        C23877.m52960((i2 == -1 || i == -1) ? false : true);
        C19203 c19203 = new C19203(i);
        ((C17750) interfaceC10375).mo24038(false, 0, i, c19203.m43728());
        return c19203.m43710() == i2;
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ܳ */
    public final List mo7080() {
        return AbstractC16192.m36872of();
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7078(InterfaceC23116 interfaceC23116) {
        this.f52111 = interfaceC23116;
        InterfaceC20790 interfaceC20790Mo5732 = interfaceC23116.mo5732(1024, 4);
        this.f52117 = interfaceC20790Mo5732;
        C3601 c3601 = new C3601();
        String str = this.f52116;
        c3601.m6694(str);
        c3601.m6697(str);
        interfaceC20790Mo5732.mo10503(c3601.m6672());
        this.f52111.mo5734();
        this.f52111.mo5733(new C4696());
        this.f52113 = 1;
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final int mo7075(InterfaceC10375 interfaceC10375, C24812 c24812) {
        int i = this.f52113;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        InterfaceC20790 interfaceC20790 = this.f52117;
        interfaceC20790.getClass();
        int iMo10498 = interfaceC20790.mo10498((InterfaceC11649) interfaceC10375, 1024, true);
        if (iMo10498 == -1) {
            this.f52113 = 2;
            this.f52117.mo10502(0L, 1, this.f52115, 0, null);
            this.f52115 = 0;
            return 0;
        }
        this.f52115 += iMo10498;
        return 0;
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7077(long j, long j2) {
        if (j == 0 || this.f52113 == 1) {
            this.f52113 = 1;
            this.f52115 = 0;
        }
    }
}
