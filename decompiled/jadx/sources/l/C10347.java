package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۤܳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: R2RY */
/* JADX INFO: loaded from: classes3.dex */
public final class C10347 implements InterfaceC19150 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC19150 f31146;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6113 f31147;

    public C10347(C6113 c6113, InterfaceC19150 interfaceC19150) {
        this.f31147 = c6113;
        this.f31146 = interfaceC19150;
    }

    @Override // l.InterfaceC19150
    /* JADX INFO: renamed from: ᩻ */
    public final int mo3818() {
        return this.f31146.mo3818();
    }

    @Override // l.InterfaceC19150
    /* JADX INFO: renamed from: ᩷ */
    public final Iterable mo3817() {
        return new C4269(this.f31146.mo3817(), this.f31147.f18733.m39239());
    }

    @Override // l.InterfaceC19150
    /* JADX INFO: renamed from: ۜ */
    public final List mo3811() {
        return new C16262(this.f31147.f18733.m39247(), this.f31146.mo3811());
    }

    @Override // l.InterfaceC19150
    /* JADX INFO: renamed from: ۢ */
    public final Iterable mo3812() {
        return new C4269(this.f31146.mo3812(), this.f31147.f18733.m39244());
    }
}
