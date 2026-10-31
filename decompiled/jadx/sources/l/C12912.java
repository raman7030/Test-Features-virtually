package l;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.۬ۚᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75NJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C12912 extends AbstractC10065 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC16315 f38743;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AtomicInteger f38744 = new AtomicInteger();

    @Override // l.AbstractC10065
    /* JADX INFO: renamed from: ܽ */
    public final void mo3226(AbstractC3255 abstractC3255) {
    }

    @Override // l.AbstractC10065
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo3227() {
        return false;
    }

    public C12912(ActivityC16315 activityC16315) {
        this.f38743 = activityC16315;
    }

    @Override // l.AbstractC10065
    /* JADX INFO: renamed from: ۧ */
    public final int mo3224(AbstractC3255 abstractC3255) {
        if (!this.f38743.f50244.m38954() || abstractC3255.getBindingAdapterPosition() == -1) {
            return 0;
        }
        return AbstractC10065.m25259(3, 0);
    }

    @Override // l.AbstractC10065
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo3223(C13132 c13132, AbstractC3255 abstractC3255, AbstractC3255 abstractC3256) {
        int bindingAdapterPosition = abstractC3255.getBindingAdapterPosition();
        int bindingAdapterPosition2 = abstractC3256.getBindingAdapterPosition();
        ActivityC16315 activityC16315 = this.f38743;
        if (((C22372) activityC16315.f50241.get(bindingAdapterPosition)).m5413() != ((C22372) activityC16315.f50241.get(bindingAdapterPosition2)).m5413()) {
            return false;
        }
        C6055.m16890(bindingAdapterPosition, bindingAdapterPosition2, activityC16315.f50241);
        if (activityC16315.f50246 == bindingAdapterPosition) {
            activityC16315.f50246 = bindingAdapterPosition2;
        } else if (activityC16315.f50246 == bindingAdapterPosition2) {
            activityC16315.f50246 = bindingAdapterPosition;
        }
        activityC16315.m38441();
        activityC16315.f50247.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        activityC16315.m38423();
        final int iIncrementAndGet = this.f38744.incrementAndGet();
        C4925.m14316(new Runnable() { // from class: l.ۗۚᩳ
            @Override // java.lang.Runnable
            public final void run() {
                C12912 c12912 = this.f9566;
                if (iIncrementAndGet == c12912.f38744.get()) {
                    c12912.f38743.m38432();
                }
            }
        }, 300L);
        return true;
    }
}
