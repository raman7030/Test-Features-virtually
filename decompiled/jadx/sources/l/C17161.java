package l;

import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ܿۛۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: A65W */
/* JADX INFO: loaded from: classes5.dex */
public final class C17161 extends C18032 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f52569 = false;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ViewGroup f52570;

    public C17161(ViewGroup viewGroup) {
        this.f52570 = viewGroup;
    }

    @Override // l.C18032, l.InterfaceC5872
    public final void onTransitionCancel(AbstractC16620 abstractC16620) {
        C1098.m3770(this.f52570, false);
        this.f52569 = true;
    }

    @Override // l.C18032, l.InterfaceC5872
    public final void onTransitionEnd(AbstractC16620 abstractC16620) {
        if (!this.f52569) {
            C1098.m3770(this.f52570, false);
        }
        abstractC16620.removeListener(this);
    }

    @Override // l.C18032, l.InterfaceC5872
    public final void onTransitionPause(AbstractC16620 abstractC16620) {
        C1098.m3770(this.f52570, false);
    }

    @Override // l.C18032, l.InterfaceC5872
    public final void onTransitionResume(AbstractC16620 abstractC16620) {
        C1098.m3770(this.f52570, true);
    }
}
