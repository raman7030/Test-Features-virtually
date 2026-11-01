package p067l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۘ۫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC6123 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f15387;

    public /* synthetic */ RunnableC6123(int i) {
        this.f15387 = i;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [l.ᩳۛ᩻] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15387) {
            case 0:
                C18805.m42863();
                break;
            default:
                int i = ServiceC20700.f63919;
                try {
                    final C4606 c4606 = new C4606(0);
                    int i2 = C16004.f46352;
                    C21180.m47818((C19358) new Supplier() { // from class: l.ᩳۛ᩻
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return C16004.m36375(c4606);
                        }
                    });
                } catch (Exception e) {
                    C21306.m48192("MT MCP workspace cleanup failed", e);
                }
                break;
        }
    }
}
