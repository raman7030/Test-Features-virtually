package p067l;

import android.content.DialogInterface;
import android.content.Intent;

/* JADX INFO: renamed from: l.ܿܶ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 09LR */
/* JADX INFO: loaded from: classes5.dex */
public final class C18940 extends AbstractC9542 {

    /* JADX INFO: renamed from: ܳ */
    public Intent f56478;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ ActivityC17598 f56479;

    public C18940(ActivityC17598 activityC17598) {
        this.f56479 = activityC17598;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22248(this.f56479, 100);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        ActivityC17598 activityC17598 = this.f56479;
        C11193 c11193 = new C11193(activityC17598.f52603.m38664());
        activityC17598.f52598.m34990(c11193);
        AbstractC17043 abstractC17043M38685 = C17853.f53280.m38685();
        abstractC17043M38685.m38660(c11193.m25832());
        Intent intent = new Intent(activityC17598, (Class<?>) ActivityC6200.class);
        this.f56478 = intent;
        intent.putExtra("title", activityC17598.f52595);
        this.f56478.setData(abstractC17043M38685.m38680());
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        this.f56479.startActivity(this.f56478);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f56479.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
