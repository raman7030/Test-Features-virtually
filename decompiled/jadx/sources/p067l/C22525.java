package p067l;

import android.content.Context;

/* JADX INFO: renamed from: l.᩷᩻ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8Q4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C22525 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f71021;

    /* JADX INFO: renamed from: ۧ */
    public InterfaceC17980 f71022 = InterfaceC17980.f53699;

    /* JADX INFO: renamed from: ܳ */
    public InterfaceC15829 f71023;

    /* JADX INFO: renamed from: ܽ */
    public final Context f71024;

    /* JADX INFO: renamed from: ܿ */
    public final C7101 f71025;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f71026;

    public C22525(Context context, C7101 c7101) {
        this.f71024 = context.getApplicationContext();
        this.f71025 = c7101;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m50485() {
        this.f71026 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50484(InterfaceC17980 interfaceC17980) {
        this.f71022 = interfaceC17980;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C3748 m50483() {
        C23877.m52960(!this.f71021);
        if (this.f71023 == null) {
            this.f71023 = new C3077();
        }
        C3748 c3748 = new C3748(this);
        this.f71021 = true;
        return c3748;
    }
}
