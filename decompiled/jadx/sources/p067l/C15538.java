package p067l;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ܰܰۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1OQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C15538 implements InterfaceC24908 {
    @Override // p067l.InterfaceC24908
    /* JADX INFO: renamed from: ֫ */
    public final void mo7547(View view) {
    }

    @Override // p067l.InterfaceC24908
    /* JADX INFO: renamed from: ۧ */
    public final void mo7554(View view) {
        C16190 c16190 = (C16190) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) c16190).width != -1 || ((ViewGroup.MarginLayoutParams) c16190).height != -1) {
            throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
        }
    }
}
