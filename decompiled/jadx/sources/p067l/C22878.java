package p067l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.᩸۫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: H20Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C22878 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f72014;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC23548 f72015;

    /* JADX INFO: renamed from: ܽ */
    public final C16841 f72016 = new C16841();

    /* JADX INFO: renamed from: ۧ */
    public final void m51096(Bundle bundle) {
        C13045.m29867(bundle, "outBundle");
        this.f72016.m38203(bundle);
    }

    public C22878(InterfaceC23548 interfaceC23548) {
        this.f72015 = interfaceC23548;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C16841 m51093() {
        return this.f72016;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m51095() {
        InterfaceC23548 interfaceC23548 = this.f72015;
        AbstractC9381 lifecycle = interfaceC23548.getLifecycle();
        if (lifecycle.mo21805() != EnumC15415.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.mo21806(new C7455(interfaceC23548));
        this.f72016.m38201(lifecycle);
        this.f72014 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51094(Bundle bundle) {
        if (!this.f72014) {
            m51095();
        }
        AbstractC9381 lifecycle = this.f72015.getLifecycle();
        if (lifecycle.mo21805().m35142(EnumC15415.STARTED)) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.mo21805()).toString());
        }
        this.f72016.m38199(bundle);
    }
}
