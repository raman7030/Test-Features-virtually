package l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.᩸۫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: H20Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C21580 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f69312;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22285 f69313;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C15228 f69314 = new C15228();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m48750(Bundle bundle) {
        C11233.m27805(bundle, "outBundle");
        this.f69314.m36042(bundle);
    }

    public C21580(InterfaceC22285 interfaceC22285) {
        this.f69313 = interfaceC22285;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15228 m48747() {
        return this.f69314;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m48749() {
        InterfaceC22285 interfaceC22285 = this.f69313;
        AbstractC7379 lifecycle = interfaceC22285.getLifecycle();
        if (lifecycle.mo19832() != EnumC13728.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.mo19833(new C5352(interfaceC22285));
        this.f69314.m36040(lifecycle);
        this.f69312 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48748(Bundle bundle) {
        if (!this.f69312) {
            m48749();
        }
        AbstractC7379 lifecycle = this.f69313.getLifecycle();
        if (lifecycle.mo19832().m33028(EnumC13728.STARTED)) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.mo19832()).toString());
        }
        this.f69314.m36038(bundle);
    }
}
