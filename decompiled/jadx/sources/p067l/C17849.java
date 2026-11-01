package p067l;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* JADX INFO: renamed from: l.ܽ֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98TO */
/* JADX INFO: loaded from: classes4.dex */
public final class C17849 implements InterfaceC3669 {

    /* JADX INFO: renamed from: ֫ */
    public final C19191 f53247 = new C19191("audio/ac3");

    /* JADX INFO: renamed from: ۧ */
    public final C19203 f53248 = new C19203(2786);

    /* JADX INFO: renamed from: ܽ */
    public boolean f53249;

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
        C19203 c19203 = new C19203(10);
        int i = 0;
        while (true) {
            c17750 = (C17750) interfaceC10375;
            c17750.mo24038(false, 0, 10, c19203.m43728());
            c19203.m43730(0);
            if (c19203.m43737() != 4801587) {
                break;
            }
            c19203.m43724(3);
            int iM43713 = c19203.m43713();
            i += iM43713 + 10;
            c17750.mo24037(iM43713, false);
        }
        c17750.mo24036();
        c17750.mo24037(i, false);
        int i2 = i;
        loop1: while (true) {
            int i3 = 0;
            while (true) {
                c17750.mo24038(false, 0, 6, c19203.m43728());
                c19203.m43730(0);
                if (c19203.m43710() != 2935) {
                    break;
                }
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                int iM18438 = C7969.m18438(c19203.m43728());
                if (iM18438 == -1) {
                    break loop1;
                }
                c17750.mo24037(iM18438 - 6, false);
            }
            c17750.mo24036();
            i2++;
            if (i2 - i >= 8192) {
                break;
            }
            c17750.mo24037(i2, false);
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
        this.f53247.mo3398(interfaceC23116, new C20672(0, 1));
        interfaceC23116.mo5734();
        interfaceC23116.mo5733(new C22131(-9223372036854775807L));
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7077(long j, long j2) {
        this.f53249 = false;
        this.f53247.mo3395();
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final int mo7075(InterfaceC10375 interfaceC10375, C24812 c24812) {
        C19203 c19203 = this.f53248;
        int i = interfaceC10375.read(c19203.m43728(), 0, 2786);
        if (i == -1) {
            return -1;
        }
        c19203.m43730(0);
        c19203.m43732(i);
        boolean z = this.f53249;
        C19191 c19191 = this.f53247;
        if (!z) {
            c19191.mo3396(4, 0L);
            this.f53249 = true;
        }
        c19191.mo3397(c19203);
        return 0;
    }
}
