package l;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۗۤ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3182 extends AbstractC10065 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC17169 f10039;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AtomicInteger f10040 = new AtomicInteger();

    @Override // l.AbstractC10065
    /* JADX INFO: renamed from: ܽ */
    public final void mo3226(AbstractC3255 abstractC3255) {
    }

    @Override // l.AbstractC10065
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo3227() {
        return false;
    }

    public C3182(ActivityC17169 activityC17169) {
        this.f10039 = activityC17169;
    }

    @Override // l.AbstractC10065
    /* JADX INFO: renamed from: ۧ */
    public final int mo3224(AbstractC3255 abstractC3255) {
        ActivityC17169 activityC17169 = this.f10039;
        if (!activityC17169.f52599.m38954() || abstractC3255.getBindingAdapterPosition() == -1) {
            return 0;
        }
        return AbstractC10065.m25259(ActivityC17169.m40323(activityC17169, (AbstractC14346) activityC17169.f52616.get(abstractC3255.getBindingAdapterPosition())) ? 3 : 0, 0);
    }

    @Override // l.AbstractC10065
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo3223(C13132 c13132, AbstractC3255 abstractC3255, AbstractC3255 abstractC3256) {
        int bindingAdapterPosition = abstractC3255.getBindingAdapterPosition();
        int bindingAdapterPosition2 = abstractC3256.getBindingAdapterPosition();
        ActivityC17169 activityC17169 = this.f10039;
        if (!ActivityC17169.m40323(activityC17169, (AbstractC14346) activityC17169.f52616.get(bindingAdapterPosition2)) || ((AbstractC14346) activityC17169.f52616.get(bindingAdapterPosition)).m34230() != ((AbstractC14346) activityC17169.f52616.get(bindingAdapterPosition2)).m34230()) {
            return false;
        }
        C6055.m16890(bindingAdapterPosition, bindingAdapterPosition2, activityC17169.f52616);
        if (activityC17169.f52618 == bindingAdapterPosition) {
            activityC17169.f52618 = bindingAdapterPosition2;
        } else if (activityC17169.f52618 == bindingAdapterPosition2) {
            activityC17169.f52618 = bindingAdapterPosition;
        }
        activityC17169.f52613.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        activityC17169.m40296();
        final int iIncrementAndGet = this.f10040.incrementAndGet();
        C4925.m14316(new Runnable() { // from class: l.ۙۤ᩷
            @Override // java.lang.Runnable
            public final void run() {
                C3182 c3182 = this.f14652;
                if (iIncrementAndGet == c3182.f10040.get()) {
                    c3182.f10039.m40331();
                }
            }
        }, 300L);
        return true;
    }
}
