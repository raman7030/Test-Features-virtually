package p067l;

/* JADX INFO: renamed from: l.ۡۛ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: A6XJ */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC10641 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f29421;

    public /* synthetic */ RunnableC10641(int i) {
        this.f29421 = i;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f29421) {
            case 0:
                int i = ServiceC20700.f63919;
                try {
                    C21933.m49462();
                } catch (C11204 e) {
                    C21306.m48192("MT MCP radare2 prewarm failed", e);
                    return;
                }
                break;
            default:
                C6850.m15690();
                break;
        }
    }
}
