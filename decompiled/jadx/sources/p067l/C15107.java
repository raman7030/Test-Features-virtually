package p067l;

import bin.p000mt.plus.R;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.۬᩹ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1R8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15107 extends AbstractC0868 {

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ ActivityC12426 f43130;

    /* JADX INFO: renamed from: ܿ */
    public C10748 f43131;

    /* JADX INFO: renamed from: ᩳ */
    public AtomicInteger f43132;

    /* JADX INFO: renamed from: ᩻ */
    public C22682 f43133;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15107(ActivityC12426 activityC12426) {
        super(false);
        this.f43130 = activityC12426;
        this.f43131 = C10748.m24757();
        this.f43132 = new AtomicInteger();
    }

    @Override // p067l.AbstractC0868
    /* JADX INFO: renamed from: ۧ */
    public final void mo3603() {
        boolean z = ApplicationC21448.f67650.getBoolean("term_double_confirm_to_exit", true);
        ActivityC12426 activityC12426 = this.f43130;
        if (!z) {
            activityC12426.f34734.f41247.m43343();
            activityC12426.finish();
            return;
        }
        final int iIncrementAndGet = this.f43132.incrementAndGet();
        if (this.f43131.m24763()) {
            C22682 c22682 = this.f43133;
            if (c22682 != null) {
                c22682.m50802();
            }
            activityC12426.f34734.f41247.m43343();
            activityC12426.finish();
            return;
        }
        C7050.m16213(new Runnable() { // from class: l.ۗ᩹ۢ
            @Override // java.lang.Runnable
            public final void run() {
                C15107 c15107 = this.f14012;
                if (iIncrementAndGet == c15107.f43132.get()) {
                    c15107.f43133 = C22682.m50793(R.string.MT_Protector);
                }
            }
        }, 100L);
    }
}
