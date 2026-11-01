package p067l;

import android.animation.ObjectAnimator;

/* JADX INFO: renamed from: l.᩶ᩴܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 715M */
/* JADX INFO: loaded from: classes5.dex */
public final class C21716 implements InterfaceC18755 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C7654 f68404;

    @Override // p067l.InterfaceC18755
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ void mo6353(String str) {
    }

    public C21716(C7654 c7654) {
        this.f68404 = c7654;
    }

    @Override // p067l.InterfaceC18755
    /* JADX INFO: renamed from: ֫ */
    public final void mo6351(String str) {
        C7654.m17683(this.f68404, str);
    }

    @Override // p067l.InterfaceC18755
    /* JADX INFO: renamed from: ֫ */
    public final void mo6352(EnumC16072 enumC16072) {
        boolean zM36583 = enumC16072.m36583();
        C7654 c7654 = this.f68404;
        if (zM36583 && c7654.f20066.m37268() == 1.0f) {
            C2959 c2959 = new C2959(c7654.f20060, c7654.f20078, c7654.f20074);
            c2959.setAlpha(0.0f);
            ObjectAnimator.ofFloat(c2959, "alpha", 0.0f, 1.0f).setDuration(200L).start();
        }
        c7654.m17688(enumC16072.m36584());
    }
}
