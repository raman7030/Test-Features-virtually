package p067l;

import java.util.ArrayList;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.֡᩷ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3003 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f5351;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f5352;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f5353;

    public /* synthetic */ RunnableC3003(int i, Object obj, Object obj2) {
        this.f5352 = i;
        this.f5353 = obj;
        this.f5351 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5352) {
            case 0:
                C11084 c11084 = (C11084) this.f5353;
                C14146 c14146 = (C14146) this.f5351;
                if (c11084.m25532()) {
                    c14146.m32520(false);
                }
                break;
            case 1:
                C6911.m15830((C6911) this.f5353, (LinkedList) this.f5351);
                break;
            default:
                C8953.m20681((C8953) this.f5353, (ArrayList) this.f5351);
                break;
        }
    }
}
