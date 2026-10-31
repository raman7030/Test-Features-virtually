package l;

import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۧ᩷᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: P7RC */
/* JADX INFO: loaded from: classes3.dex */
public final class C11255 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f33730;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final WeakReference f33731;

    public C11255(View view) {
        this.f33731 = new WeakReference(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        this.f33730 = layoutParams != null ? layoutParams.width : -2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27851() {
        ViewGroup.LayoutParams layoutParams;
        View view = (View) this.f33731.get();
        if (view == null || (layoutParams = view.getLayoutParams()) == null) {
            return;
        }
        layoutParams.width = this.f33730;
    }
}
