package p067l;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۗۤ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5393 extends AbstractC11934 {

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ ActivityC18686 f12843;

    /* JADX INFO: renamed from: ᩳ */
    public AtomicInteger f12844 = new AtomicInteger();

    @Override // p067l.AbstractC11934
    /* JADX INFO: renamed from: ܽ */
    public final void mo5540(AbstractC5462 abstractC5462) {
    }

    @Override // p067l.AbstractC11934
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo5541() {
        return false;
    }

    public C5393(ActivityC18686 activityC18686) {
        this.f12843 = activityC18686;
    }

    @Override // p067l.AbstractC11934
    /* JADX INFO: renamed from: ۧ */
    public final int mo5538(AbstractC5462 abstractC5462) {
        ActivityC18686 activityC18686 = this.f12843;
        if (!activityC18686.f55780.m41180() || abstractC5462.getBindingAdapterPosition() == -1) {
            return 0;
        }
        return AbstractC11934.m27276(ActivityC18686.m42568(activityC18686, (AbstractC16003) activityC18686.f55797.get(abstractC5462.getBindingAdapterPosition())) ? 3 : 0, 0);
    }

    @Override // p067l.AbstractC11934
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5537(C14849 c14849, AbstractC5462 abstractC5462, AbstractC5462 abstractC5463) {
        int bindingAdapterPosition = abstractC5462.getBindingAdapterPosition();
        int bindingAdapterPosition2 = abstractC5463.getBindingAdapterPosition();
        ActivityC18686 activityC18686 = this.f12843;
        if (!ActivityC18686.m42568(activityC18686, (AbstractC16003) activityC18686.f55797.get(bindingAdapterPosition2)) || ((AbstractC16003) activityC18686.f55797.get(bindingAdapterPosition)).m36363() != ((AbstractC16003) activityC18686.f55797.get(bindingAdapterPosition2)).m36363()) {
            return false;
        }
        C8123.m18819(bindingAdapterPosition, bindingAdapterPosition2, activityC18686.f55797);
        if (activityC18686.f55799 == bindingAdapterPosition) {
            activityC18686.f55799 = bindingAdapterPosition2;
        } else if (activityC18686.f55799 == bindingAdapterPosition2) {
            activityC18686.f55799 = bindingAdapterPosition;
        }
        activityC18686.f55794.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        activityC18686.m42541();
        final int iIncrementAndGet = this.f12844.incrementAndGet();
        C7050.m16213(new Runnable() { // from class: l.ۙۤ᩷
            @Override // java.lang.Runnable
            public final void run() {
                C5393 c5393 = this.f17480;
                if (iIncrementAndGet == c5393.f12844.get()) {
                    c5393.f12843.m42576();
                }
            }
        }, 300L);
        return true;
    }
}
