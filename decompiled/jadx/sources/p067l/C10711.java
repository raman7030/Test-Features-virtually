package p067l;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* JADX INFO: renamed from: l.ۡۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8PP */
/* JADX INFO: loaded from: classes3.dex */
public final class C10711 implements InterfaceC3669 {

    /* JADX INFO: renamed from: ۧ */
    public final C19203 f29676 = new C19203(4);

    /* JADX INFO: renamed from: ֫ */
    public final C17435 f29675 = new C17435(-1, -1, "image/heif");

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
        C17750 c17750 = (C17750) interfaceC10375;
        c17750.mo24037(4, false);
        C19203 c19203 = this.f29676;
        c19203.m43727(4);
        c17750.mo24038(false, 0, 4, c19203.m43728());
        if (c19203.m43725() == 1718909296) {
            c19203.m43727(4);
            c17750.mo24038(false, 0, 4, c19203.m43728());
            if (c19203.m43725() == 1751476579) {
                return true;
            }
        }
        return false;
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7078(InterfaceC23116 interfaceC23116) {
        this.f29675.mo7078(interfaceC23116);
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final int mo7075(InterfaceC10375 interfaceC10375, C24812 c24812) {
        return this.f29675.mo7075(interfaceC10375, c24812);
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7077(long j, long j2) {
        this.f29675.mo7077(j, j2);
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ܳ */
    public final List mo7080() {
        return AbstractC16192.m36872of();
    }
}
