package l;

import android.content.DialogInterface;
import android.content.Intent;

/* JADX INFO: renamed from: l.ۢۜۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98W2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9420 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f28574;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public byte[] f28575;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8714 f28576;

    public C9420(C8714 c8714, AbstractActivityC3346 abstractActivityC3346) {
        this.f28576 = c8714;
        this.f28574 = abstractActivityC3346;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20266(this.f28574);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        this.f28575 = C13651.m32802(this.f28576.f26521);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        AbstractActivityC3346 abstractActivityC3346 = this.f28574;
        Intent intent = new Intent(abstractActivityC3346, (Class<?>) ActivityC21414.class);
        intent.putExtra("title", this.f28576.f26522);
        intent.putExtra("markdown", this.f28575);
        abstractActivityC3346.startActivity(intent);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f28574.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
