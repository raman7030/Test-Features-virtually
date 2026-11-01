package p067l;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.۬ۚᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75NJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C14640 extends AbstractC11934 {

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ ActivityC17874 f41785;

    /* JADX INFO: renamed from: ᩳ */
    public AtomicInteger f41786 = new AtomicInteger();

    @Override // p067l.AbstractC11934
    /* JADX INFO: renamed from: ܽ */
    public final void mo5540(AbstractC5462 abstractC5462) {
    }

    @Override // p067l.AbstractC11934
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo5541() {
        return false;
    }

    public C14640(ActivityC17874 activityC17874) {
        this.f41785 = activityC17874;
    }

    @Override // p067l.AbstractC11934
    /* JADX INFO: renamed from: ۧ */
    public final int mo5538(AbstractC5462 abstractC5462) {
        if (!this.f41785.f53411.m41180() || abstractC5462.getBindingAdapterPosition() == -1) {
            return 0;
        }
        return AbstractC11934.m27276(3, 0);
    }

    @Override // p067l.AbstractC11934
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5537(C14849 c14849, AbstractC5462 abstractC5462, AbstractC5462 abstractC5463) {
        int bindingAdapterPosition = abstractC5462.getBindingAdapterPosition();
        int bindingAdapterPosition2 = abstractC5463.getBindingAdapterPosition();
        ActivityC17874 activityC17874 = this.f41785;
        if (((C23631) activityC17874.f53408.get(bindingAdapterPosition)).m7642() != ((C23631) activityC17874.f53408.get(bindingAdapterPosition2)).m7642()) {
            return false;
        }
        C8123.m18819(bindingAdapterPosition, bindingAdapterPosition2, activityC17874.f53408);
        if (activityC17874.f53413 == bindingAdapterPosition) {
            activityC17874.f53413 = bindingAdapterPosition2;
        } else if (activityC17874.f53413 == bindingAdapterPosition2) {
            activityC17874.f53413 = bindingAdapterPosition;
        }
        activityC17874.m40656();
        activityC17874.f53414.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        activityC17874.m40638();
        final int iIncrementAndGet = this.f41786.incrementAndGet();
        C7050.m16213(new Runnable() { // from class: l.ۗۚᩳ
            @Override // java.lang.Runnable
            public final void run() {
                C14640 c14640 = this.f12368;
                if (iIncrementAndGet == c14640.f41786.get()) {
                    c14640.f41785.m40647();
                }
            }
        }, 300L);
        return true;
    }
}
