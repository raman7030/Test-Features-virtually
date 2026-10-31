package l;

import bin.mt.plus.R;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.۬᩹ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1R8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13403 extends AbstractC0525 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC10582 f40060;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C8817 f40061;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AtomicInteger f40062;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C21374 f40063;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13403(ActivityC10582 activityC10582) {
        super(false);
        this.f40060 = activityC10582;
        this.f40061 = C8817.m22787();
        this.f40062 = new AtomicInteger();
    }

    @Override // l.AbstractC0525
    /* JADX INFO: renamed from: ۧ */
    public final void mo1201() {
        boolean z = ApplicationC20075.f65010.getBoolean("term_double_confirm_to_exit", true);
        ActivityC10582 activityC10582 = this.f40060;
        if (!z) {
            activityC10582.f31764.f38219.m41097();
            activityC10582.finish();
            return;
        }
        final int iIncrementAndGet = this.f40062.incrementAndGet();
        if (this.f40061.m22793()) {
            C21374 c21374 = this.f40063;
            if (c21374 != null) {
                c21374.m48466();
            }
            activityC10582.f31764.f38219.m41097();
            activityC10582.finish();
            return;
        }
        C4925.m14316(new Runnable() { // from class: l.ۗ᩹ۢ
            @Override // java.lang.Runnable
            public final void run() {
                C13403 c13403 = this.f11206;
                if (iIncrementAndGet == c13403.f40062.get()) {
                    c13403.f40063 = C21374.m48457(R.string.MT_Protector);
                }
            }
        }, 100L);
    }
}
