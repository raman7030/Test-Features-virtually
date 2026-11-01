package p067l;

import java.util.List;

/* JADX INFO: renamed from: l.ۤܳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: R2RY */
/* JADX INFO: loaded from: classes3.dex */
public final class C12202 implements InterfaceC20568 {

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC20568 f34108;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C8178 f34109;

    public C12202(C8178 c8178, InterfaceC20568 interfaceC20568) {
        this.f34109 = c8178;
        this.f34108 = interfaceC20568;
    }

    @Override // p067l.InterfaceC20568
    /* JADX INFO: renamed from: ᩻ */
    public final int mo6075() {
        return this.f34108.mo6075();
    }

    @Override // p067l.InterfaceC20568
    /* JADX INFO: renamed from: ᩷ */
    public final Iterable mo6074() {
        return new C6426(this.f34108.mo6074(), this.f34109.f21588.m41475());
    }

    @Override // p067l.InterfaceC20568
    /* JADX INFO: renamed from: ۜ */
    public final List mo6068() {
        return new C17824(this.f34109.f21588.m41483(), this.f34108.mo6068());
    }

    @Override // p067l.InterfaceC20568
    /* JADX INFO: renamed from: ۢ */
    public final Iterable mo6069() {
        return new C6426(this.f34108.mo6069(), this.f34109.f21588.m41480());
    }
}
