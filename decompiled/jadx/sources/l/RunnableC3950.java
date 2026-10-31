package l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۘ۫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3950 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f12579;

    public /* synthetic */ RunnableC3950(int i) {
        this.f12579 = i;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [l.ᩳۛ᩻] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12579) {
            case 0:
                C17294.m40612();
                break;
            default:
                int i = ServiceC19288.f60689;
                try {
                    final C2354 c2354 = new C2354(0);
                    int i2 = C14347.f43261;
                    C19793.m45507((C17876) new Supplier() { // from class: l.ᩳۛ᩻
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return C14347.m34242(c2354);
                        }
                    });
                } catch (Exception e) {
                    C19926.m45879("MT MCP workspace cleanup failed", e);
                }
                break;
        }
    }
}
