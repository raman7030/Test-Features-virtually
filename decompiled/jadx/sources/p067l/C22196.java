package p067l;

/* JADX INFO: renamed from: l.᩷ۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: LAYC */
/* JADX INFO: loaded from: classes5.dex */
public final class C22196 extends AbstractRunnableC16159 {

    /* JADX INFO: renamed from: ᩶ */
    public final Runnable f70202;

    public C22196(Runnable runnable, long j, InterfaceC24877 interfaceC24877) {
        super(j, interfaceC24877);
        this.f70202 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f70202.run();
        } finally {
            this.f47600.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f70202;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(C12846.m29416(runnable));
        sb.append(", ");
        sb.append(this.f47599);
        sb.append(", ");
        sb.append(this.f47600);
        sb.append(']');
        return sb.toString();
    }
}
