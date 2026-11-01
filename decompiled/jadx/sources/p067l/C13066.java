package p067l;

import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۧ᩷᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: P7RC */
/* JADX INFO: loaded from: classes3.dex */
public final class C13066 {

    /* JADX INFO: renamed from: ֫ */
    public final int f36730;

    /* JADX INFO: renamed from: ۧ */
    public final WeakReference f36731;

    public C13066(View view) {
        this.f36731 = new WeakReference(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        this.f36730 = layoutParams != null ? layoutParams.width : -2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29912() {
        ViewGroup.LayoutParams layoutParams;
        View view = (View) this.f36731.get();
        if (view == null || (layoutParams = view.getLayoutParams()) == null) {
            return;
        }
        layoutParams.width = this.f36730;
    }
}
