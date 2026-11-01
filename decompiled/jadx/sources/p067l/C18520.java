package p067l;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* JADX INFO: renamed from: l.ܿ֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8LX */
/* JADX INFO: loaded from: classes4.dex */
public final class C18520 implements InterfaceC3669 {

    /* JADX INFO: renamed from: ֫ */
    public final C15837 f55307 = new C15837(null, 0, "audio/ac4");

    /* JADX INFO: renamed from: ۧ */
    public final C19203 f55308 = new C19203(16384);

    /* JADX INFO: renamed from: ܽ */
    public boolean f55309;

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7076() {
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC3669 mo7081() {
        return this;
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo7079(InterfaceC10375 interfaceC10375) throws EOFException, InterruptedIOException {
        C17750 c17750;
        int i;
        C19203 c19203 = new C19203(10);
        int i2 = 0;
        while (true) {
            c17750 = (C17750) interfaceC10375;
            c17750.mo24038(false, 0, 10, c19203.m43728());
            c19203.m43730(0);
            if (c19203.m43737() != 4801587) {
                break;
            }
            c19203.m43724(3);
            int iM43713 = c19203.m43713();
            i2 += iM43713 + 10;
            c17750.mo24037(iM43713, false);
        }
        c17750.mo24036();
        c17750.mo24037(i2, false);
        int i3 = i2;
        loop1: while (true) {
            int i4 = 0;
            while (true) {
                int i5 = 7;
                c17750.mo24038(false, 0, 7, c19203.m43728());
                c19203.m43730(0);
                int iM43710 = c19203.m43710();
                if (iM43710 == 44096 || iM43710 == 44097) {
                    i4++;
                    if (i4 >= 4) {
                        return true;
                    }
                    byte[] bArrM43728 = c19203.m43728();
                    if (bArrM43728.length < 7) {
                        i = -1;
                    } else {
                        int i6 = ((bArrM43728[2] & 255) << 8) | (bArrM43728[3] & 255);
                        if (i6 == 65535) {
                            i6 = ((bArrM43728[4] & 255) << 16) | ((bArrM43728[5] & 255) << 8) | (bArrM43728[6] & 255);
                        } else {
                            i5 = 4;
                        }
                        if (iM43710 == 44097) {
                            i5 += 2;
                        }
                        i = i6 + i5;
                    }
                    if (i == -1) {
                        break loop1;
                    }
                    c17750.mo24037(i - 7, false);
                }
            }
            c17750.mo24036();
            i3++;
            if (i3 - i2 >= 8192) {
                break;
            }
            c17750.mo24037(i3, false);
        }
        return false;
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ܳ */
    public final List mo7080() {
        return AbstractC16192.m36872of();
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7078(InterfaceC23116 interfaceC23116) {
        this.f55307.mo3398(interfaceC23116, new C20672(0, 1));
        interfaceC23116.mo5734();
        interfaceC23116.mo5733(new C22131(-9223372036854775807L));
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7077(long j, long j2) {
        this.f55309 = false;
        this.f55307.mo3395();
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final int mo7075(InterfaceC10375 interfaceC10375, C24812 c24812) {
        C19203 c19203 = this.f55308;
        int i = interfaceC10375.read(c19203.m43728(), 0, 16384);
        if (i == -1) {
            return -1;
        }
        c19203.m43730(0);
        c19203.m43732(i);
        boolean z = this.f55309;
        C15837 c15837 = this.f55307;
        if (!z) {
            c15837.mo3396(4, 0L);
            this.f55309 = true;
        }
        c15837.mo3397(c19203);
        return 0;
    }
}
