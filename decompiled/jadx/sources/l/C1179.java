package l;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.֨ܳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: F8QN */
/* JADX INFO: loaded from: classes2.dex */
public final class C1179 implements InterfaceExecutorC8235 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Executor f4233;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16701 f4234;

    public C1179(Executor executor, C16701 c16701) {
        this.f4233 = executor;
        this.f4234 = c16701;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f4233.execute(runnable);
    }

    @Override // l.InterfaceExecutorC8235
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo3989() {
        this.f4234.accept(this.f4233);
    }
}
