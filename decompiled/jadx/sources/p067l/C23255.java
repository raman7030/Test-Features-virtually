package p067l;

import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.᩹֫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18OR */
/* JADX INFO: loaded from: classes.dex */
public final class C23255 implements InterfaceC2878 {

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC2878 f73092;

    /* JADX INFO: renamed from: ᩹ */
    public final AbstractC16192 f73093;

    public C23255(InterfaceC2878 interfaceC2878, List list) {
        this.f73092 = interfaceC2878;
        this.f73093 = AbstractC16192.copyOf((Collection) list);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC16192 m51797() {
        return this.f73093;
    }

    @Override // p067l.InterfaceC2878
    /* JADX INFO: renamed from: ۜ */
    public final long mo4633() {
        return this.f73092.mo4633();
    }

    @Override // p067l.InterfaceC2878
    /* JADX INFO: renamed from: ۧ */
    public final long mo4634() {
        return this.f73092.mo4634();
    }

    @Override // p067l.InterfaceC2878
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4632(C13268 c13268) {
        return this.f73092.mo4632(c13268);
    }

    @Override // p067l.InterfaceC2878
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4631() {
        return this.f73092.mo4631();
    }

    @Override // p067l.InterfaceC2878
    /* JADX INFO: renamed from: ۧ */
    public final void mo4635(long j) {
        this.f73092.mo4635(j);
    }
}
