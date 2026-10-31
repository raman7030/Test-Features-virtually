package l;

import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.᩹֫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18OR */
/* JADX INFO: loaded from: classes.dex */
public final class C21977 implements InterfaceC0536 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC0536 f70381;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 f70382;

    public C21977(InterfaceC0536 interfaceC0536, List list) {
        this.f70381 = interfaceC0536;
        this.f70382 = AbstractC14545.copyOf((Collection) list);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 m49460() {
        return this.f70382;
    }

    @Override // l.InterfaceC0536
    /* JADX INFO: renamed from: ۜ */
    public final long mo2266() {
        return this.f70381.mo2266();
    }

    @Override // l.InterfaceC0536
    /* JADX INFO: renamed from: ۧ */
    public final long mo2267() {
        return this.f70381.mo2267();
    }

    @Override // l.InterfaceC0536
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2265(C11469 c11469) {
        return this.f70381.mo2265(c11469);
    }

    @Override // l.InterfaceC0536
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2264() {
        return this.f70381.mo2264();
    }

    @Override // l.InterfaceC0536
    /* JADX INFO: renamed from: ۧ */
    public final void mo2268(long j) {
        this.f70381.mo2268(j);
    }
}
