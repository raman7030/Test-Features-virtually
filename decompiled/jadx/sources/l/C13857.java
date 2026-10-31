package l;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ܰܰۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1OQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C13857 implements InterfaceC23716 {
    @Override // l.InterfaceC23716
    /* JADX INFO: renamed from: ֫ */
    public final void mo5318(View view) {
    }

    @Override // l.InterfaceC23716
    /* JADX INFO: renamed from: ۧ */
    public final void mo5325(View view) {
        C14543 c14543 = (C14543) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) c14543).width != -1 || ((ViewGroup.MarginLayoutParams) c14543).height != -1) {
            throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
        }
    }
}
