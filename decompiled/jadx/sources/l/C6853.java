package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۜܶ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 09LR */
/* JADX INFO: loaded from: classes3.dex */
public final class C6853 extends AbstractC7548 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC16024 f21200;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f21201;

    public C6853(ActivityC16024 activityC16024, boolean z) {
        this.f21200 = activityC16024;
        this.f21201 = z;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20268(this.f21200, R.string.MT_Protector, 100);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws IOException {
        ActivityC16024 activityC16024 = this.f21200;
        C9285 c9285 = new C9285(activityC16024.f49439.m36506());
        activityC16024.f49434.m32875(c9285);
        activityC16024.f49441.m36497(new C23786(0, c9285));
        activityC16024.f49435 = false;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        C21374.m48457(R.string.MT_Protector);
        boolean z = this.f21201;
        ActivityC16024 activityC16024 = this.f21200;
        if (z) {
            activityC16024.finish();
        } else {
            activityC16024.f49434.m32876(false);
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f21200.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
