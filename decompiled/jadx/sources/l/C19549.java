package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩵ܶܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4646 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19549 extends AbstractC7548 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC8259 f63208;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f63209;

    public C19549(ActivityC8259 activityC8259, boolean z) {
        this.f63208 = activityC8259;
        this.f63209 = z;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f63208, R.string.MT_Protector);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws IOException {
        ActivityC8259 activityC8259 = this.f63208;
        byte[] bArrM35985 = activityC8259.f25415.f4340.m35985();
        AbstractC15440 abstractC15440 = activityC8259.f25415.f4347;
        abstractC15440.getClass();
        abstractC15440.m36497(new C2742(0, bArrM35985));
        activityC8259.f25415.f4341 = false;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        if (this.f63209) {
            this.f63208.finish();
        } else {
            C21374.m48457(R.string.MT_Protector);
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f63208.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
