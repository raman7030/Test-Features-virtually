package l;

import android.os.Handler;

/* JADX INFO: renamed from: l.᩵ܺ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: S1KE */
/* JADX INFO: loaded from: classes4.dex */
public final class C19559 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Handler f63223 = new Handler();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public RunnableC18853 f63224;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C20765 f63225;

    public C19559(ServiceC8770 serviceC8770) {
        this.f63225 = new C20765(serviceC8770);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final void m44975(EnumC22901 enumC22901) {
        RunnableC18853 runnableC18853 = this.f63224;
        if (runnableC18853 != null) {
            runnableC18853.run();
        }
        RunnableC18853 runnableC18854 = new RunnableC18853(this.f63225, enumC22901);
        this.f63224 = runnableC18854;
        this.f63223.postAtFrontOfQueue(runnableC18854);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m44978() {
        m44975(EnumC22901.ON_CREATE);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m44977() {
        m44975(EnumC22901.ON_START);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m44979() {
        m44975(EnumC22901.ON_START);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m44980() {
        m44975(EnumC22901.ON_STOP);
        m44975(EnumC22901.ON_DESTROY);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20765 m44976() {
        return this.f63225;
    }
}
