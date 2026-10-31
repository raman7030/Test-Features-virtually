package l;

/* JADX INFO: renamed from: l.ۡۛ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: A6XJ */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC8704 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f26496;

    public /* synthetic */ RunnableC8704(int i) {
        this.f26496 = i;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f26496) {
            case 0:
                int i = ServiceC19288.f60689;
                try {
                    C20586.m47136();
                } catch (C9297 e) {
                    C19926.m45879("MT MCP radare2 prewarm failed", e);
                    return;
                }
                break;
            default:
                C4715.m13814();
                break;
        }
    }
}
