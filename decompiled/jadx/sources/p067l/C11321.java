package p067l;

import android.content.DialogInterface;
import android.content.Intent;

/* JADX INFO: renamed from: l.ۢۜۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98W2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11321 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ AbstractActivityC5549 f31521;

    /* JADX INFO: renamed from: ܳ */
    public byte[] f31522;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C10650 f31523;

    public C11321(C10650 c10650, AbstractActivityC5549 abstractActivityC5549) {
        this.f31523 = c10650;
        this.f31521 = abstractActivityC5549;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22242(this.f31521);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        this.f31522 = C15342.m34917(this.f31523.f29446);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        AbstractActivityC5549 abstractActivityC5549 = this.f31521;
        Intent intent = new Intent(abstractActivityC5549, (Class<?>) ActivityC22720.class);
        intent.putExtra("title", this.f31523.f29447);
        intent.putExtra("markdown", this.f31522);
        abstractActivityC5549.startActivity(intent);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f31521.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
