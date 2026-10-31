package l;

/* JADX INFO: renamed from: l.᩷ۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: LAYC */
/* JADX INFO: loaded from: classes5.dex */
public final class C20862 extends AbstractRunnableC14510 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Runnable f67516;

    public C20862(Runnable runnable, long j, InterfaceC23683 interfaceC23683) {
        super(j, interfaceC23683);
        this.f67516 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f67516.run();
        } finally {
            this.f44494.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f67516;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(C11024.m27354(runnable));
        sb.append(", ");
        sb.append(this.f44493);
        sb.append(", ");
        sb.append(this.f44494);
        sb.append(']');
        return sb.toString();
    }
}
