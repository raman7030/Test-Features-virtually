package p067l;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.֨ܳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: F8QN */
/* JADX INFO: loaded from: classes2.dex */
public final class C3489 implements InterfaceExecutorC10195 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Executor f7002;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C18241 f7003;

    public C3489(Executor executor, C18241 c18241) {
        this.f7002 = executor;
        this.f7003 = c18241;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f7002.execute(runnable);
    }

    @Override // p067l.InterfaceExecutorC10195
    /* JADX INFO: renamed from: ֫ */
    public final void mo6231() {
        this.f7003.accept(this.f7002);
    }
}
