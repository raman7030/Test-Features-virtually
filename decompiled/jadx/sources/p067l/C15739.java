package p067l;

import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ܰ᩷ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 123V */
/* JADX INFO: loaded from: classes4.dex */
public final class C15739 extends AbstractC15692 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C9705 f45581;

    public C15739(C9705 c9705) {
        this.f45581 = c9705;
    }

    @Override // p067l.AbstractC15692, p067l.InterfaceC13682
    public final void onAnimationEnd() {
        C9705 c9705 = this.f45581;
        ViewGroup viewGroup = c9705.f26771;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
            c9705.f26771 = null;
        }
        c9705.f26772 = null;
    }
}
