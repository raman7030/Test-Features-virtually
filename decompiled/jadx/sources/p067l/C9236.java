package p067l;

/* JADX INFO: renamed from: l.۟ۘܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAPN */
/* JADX INFO: loaded from: classes3.dex */
public final class C9236 implements InterfaceC15012 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C4284 f25007;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C3613 f25008;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C3613 f25009;

    public C9236(C4284 c4284, C3613 c3613, C3613 c3614) {
        this.f25007 = c4284;
        this.f25008 = c3613;
        this.f25009 = c3614;
    }

    @Override // p067l.InterfaceC15012
    public final void beforeStart() {
        this.f25007.f9511.beforeStart();
    }

    @Override // p067l.InterfaceC15012
    public final void onStart() {
        this.f25007.f9511.onStart();
    }

    @Override // p067l.InterfaceC15012
    /* JADX INFO: renamed from: ֫ */
    public final String mo21278(String str) {
        return this.f25007.f9513.m44138(str, this.f25008.f7482.f19989, this.f25009.f7482.f19989);
    }

    @Override // p067l.InterfaceC15012
    public final void onFinish() {
        this.f25007.f9511.onFinish();
    }

    @Override // p067l.InterfaceC15012
    public final void afterFinish() {
        this.f25007.f9511.afterFinish();
    }

    @Override // p067l.InterfaceC15012
    public final boolean onError(Exception exc) {
        return this.f25007.f9511.onError(exc);
    }

    @Override // p067l.InterfaceC15012
    public final String getId() {
        StringBuilder sb = new StringBuilder();
        C4284 c4284 = this.f25007;
        sb.append(c4284.f9511.getClass());
        sb.append(":");
        sb.append(c4284.f9511.hashCode());
        sb.append(":");
        sb.append(this.f25008.f7482.f19989);
        sb.append(":");
        sb.append(this.f25009.f7482.f19989);
        return sb.toString();
    }
}
