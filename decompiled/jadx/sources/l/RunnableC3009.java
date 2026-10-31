package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗۙۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: B66A */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC3009 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1556 f9475;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4420 f9476;

    public RunnableC3009(C1556 c1556, C4420 c4420, int i) {
        this.f9475 = c1556;
        this.f9476 = c4420;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4420 c4420 = this.f9476;
        AbstractC3255 abstractC3255 = c4420.f73498;
        C1556 c1556 = this.f9475;
        C13132 c13132 = c1556.f5475;
        if (c13132 == null || !c13132.isAttachedToWindow() || c4420.f73504 || abstractC3255.getAbsoluteAdapterPosition() == -1) {
            return;
        }
        AbstractC22723 itemAnimator = c1556.f5475.getItemAnimator();
        if (itemAnimator == null || !itemAnimator.m50785((C4234) null)) {
            ArrayList arrayList = c1556.f5497;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C22764) arrayList.get(i)).f73500) {
                }
            }
            c1556.f5493.mo3226(abstractC3255);
            return;
        }
        c1556.f5475.post(this);
    }
}
