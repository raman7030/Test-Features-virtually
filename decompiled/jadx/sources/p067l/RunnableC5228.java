package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗۙۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: B66A */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC5228 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C3847 f12273;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C6569 f12274;

    public RunnableC5228(C3847 c3847, C6569 c6569, int i) {
        this.f12273 = c3847;
        this.f12274 = c6569;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C6569 c6569 = this.f12274;
        AbstractC5462 abstractC5462 = c6569.f76224;
        C3847 c3847 = this.f12273;
        C14849 c14849 = c3847.f8256;
        if (c14849 == null || !c14849.isAttachedToWindow() || c6569.f76230 || abstractC5462.getAbsoluteAdapterPosition() == -1) {
            return;
        }
        AbstractC23964 itemAnimator = c3847.f8256.getItemAnimator();
        if (itemAnimator == null || !itemAnimator.m53111((C6393) null)) {
            ArrayList arrayList = c3847.f8278;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C24003) arrayList.get(i)).f76226) {
                }
            }
            c3847.f8274.mo5540(abstractC5462);
            return;
        }
        c3847.f8256.post(this);
    }
}
