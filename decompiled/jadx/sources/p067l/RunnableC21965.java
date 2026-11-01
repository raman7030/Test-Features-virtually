package p067l;

/* JADX INFO: renamed from: l.᩷ۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC21965 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C2517 f69021;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C3188 f69022;

    public RunnableC21965(C2517 c2517, C3188 c3188) {
        this.f69021 = c2517;
        this.f69022 = c3188;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C11868 c11868 = (C11868) this.f69021.f4113.f48755.remove(this.f69022.f6126.getBinder());
        if (c11868 != null) {
            ((C3188) c11868.f33073).f6126.getBinder().unlinkToDeath(c11868, 0);
        }
    }
}
