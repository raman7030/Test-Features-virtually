package p067l;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ᩴ᩹ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC20477 implements Runnable {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ Object f63245;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f63246;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f63247;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f63248;

    public /* synthetic */ RunnableC20477(Object obj, Object obj2, Object obj3, int i) {
        this.f63247 = i;
        this.f63248 = obj;
        this.f63246 = obj2;
        this.f63245 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C13068 c13068;
        switch (this.f63247) {
            case 0:
                ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) this.f63248;
                Pattern pattern = (Pattern) this.f63246;
                C2981 c2981 = (C2981) this.f63245;
                while (!concurrentLinkedQueue.isEmpty() && (c13068 = (C13068) concurrentLinkedQueue.poll()) != null) {
                    C9534 c9534M29924 = c13068.m29924();
                    if (c9534M29924 != null) {
                        C15568[] c15568ArrM22225 = c9534M29924.m22225();
                        int length = c15568ArrM22225.length;
                        int i = 0;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                C15568[] c15568ArrM22230 = c9534M29924.m22230();
                                int length2 = c15568ArrM22230.length;
                                while (true) {
                                    if (i >= length2) {
                                        continue;
                                    } else if (!C7676.m17778(c15568ArrM22230[i], pattern)) {
                                        i++;
                                    }
                                }
                            } else if (!C7676.m17778(c15568ArrM22225[i2], pattern)) {
                                i2++;
                            }
                            synchronized (c2981) {
                                c2981.f5264.add(c13068);
                                break;
                            }
                        }
                    }
                }
                return;
            case 1:
                C23631.m52528((C23631) this.f63248, (C14146) this.f63245, (Runnable) this.f63246);
                return;
            default:
                C4654.m9862((String) this.f63248, (ViewOnClickListenerC7928) this.f63246, (C15026) this.f63245);
                return;
        }
    }
}
