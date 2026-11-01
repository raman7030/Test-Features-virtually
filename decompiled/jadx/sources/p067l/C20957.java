package p067l;

import android.os.Handler;

/* JADX INFO: renamed from: l.᩵ܺ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: S1KE */
/* JADX INFO: loaded from: classes4.dex */
public final class C20957 {

    /* JADX INFO: renamed from: ֫ */
    public final Handler f65842 = new Handler();

    /* JADX INFO: renamed from: ۧ */
    public RunnableC20286 f65843;

    /* JADX INFO: renamed from: ܽ */
    public final C22103 f65844;

    public C20957(ServiceC10703 serviceC10703) {
        this.f65844 = new C22103(serviceC10703);
    }

    /* JADX INFO: renamed from: ֫ */
    private final void m47270(EnumC24133 enumC24133) {
        RunnableC20286 runnableC20286 = this.f65843;
        if (runnableC20286 != null) {
            runnableC20286.run();
        }
        RunnableC20286 runnableC20287 = new RunnableC20286(this.f65844, enumC24133);
        this.f65843 = runnableC20287;
        this.f65842.postAtFrontOfQueue(runnableC20287);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m47273() {
        m47270(EnumC24133.ON_CREATE);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m47272() {
        m47270(EnumC24133.ON_START);
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m47274() {
        m47270(EnumC24133.ON_START);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m47275() {
        m47270(EnumC24133.ON_STOP);
        m47270(EnumC24133.ON_DESTROY);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C22103 m47271() {
        return this.f65844;
    }
}
