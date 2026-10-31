package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۤ᩻ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5R1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10629 extends AbstractC7548 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC6604 f31932;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f31933;

    public C10629(ActivityC6604 activityC6604, boolean z) {
        this.f31932 = activityC6604;
        this.f31933 = z;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f31932, R.string.MT_Protector);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws IOException {
        C10130 c10130 = new C10130();
        ActivityC6604 activityC6604 = this.f31932;
        activityC6604.f20336.f75578.m23285();
        activityC6604.f20336.f75578.m23283(c10130, (C19277) null);
        AbstractC15440 abstractC15440 = activityC6604.f20336.f75575;
        abstractC15440.getClass();
        abstractC15440.m36497(new C16146(0, c10130));
        activityC6604.f20336.f75587 = false;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        if (this.f31933) {
            this.f31932.finish();
        } else {
            C21374.m48457(R.string.MT_Protector);
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f31932.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
