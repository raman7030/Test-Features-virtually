package l;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: l.֡ۧ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O607 */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnApplyWindowInsetsListenerC0364 implements View.OnApplyWindowInsetsListener {
    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        ((C13064) view).m31650(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
        return windowInsets.consumeSystemWindowInsets();
    }
}
