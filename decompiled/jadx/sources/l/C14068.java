package l;

import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ܰ᩷ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 123V */
/* JADX INFO: loaded from: classes4.dex */
public final class C14068 extends AbstractC14019 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7719 f42495;

    public C14068(C7719 c7719) {
        this.f42495 = c7719;
    }

    @Override // l.AbstractC14019, l.InterfaceC11904
    public final void onAnimationEnd() {
        C7719 c7719 = this.f42495;
        ViewGroup viewGroup = c7719.f23858;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
            c7719.f23858 = null;
        }
        c7719.f23859 = null;
    }
}
