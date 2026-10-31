package l;

import java.util.ArrayList;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.֡᩷ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC0667 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f2578;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f2579;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f2580;

    public /* synthetic */ RunnableC0667(int i, Object obj, Object obj2) {
        this.f2579 = i;
        this.f2580 = obj;
        this.f2578 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2579) {
            case 0:
                C9170 c9170 = (C9170) this.f2580;
                C12392 c12392 = (C12392) this.f2578;
                if (c9170.m23581()) {
                    c12392.m30456(false);
                }
                break;
            case 1:
                C4779.m13950((C4779) this.f2580, (LinkedList) this.f2578);
                break;
            default:
                C6928.m18731((C6928) this.f2580, (ArrayList) this.f2578);
                break;
        }
    }
}
