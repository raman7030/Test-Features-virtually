package p067l;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ListView;

/* JADX INFO: renamed from: l.᩹ۖ */
/* JADX INFO: compiled from: A513 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC1933 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ View f73108;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ ListView f73109;

    public ViewTreeObserverOnPreDrawListenerC1933(ListView listView, View view) {
        this.f73109 = listView;
        this.f73108 = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = this.f73108;
        ListView listView = this.f73109;
        if (!C1828.m48014(listView, view)) {
            return true;
        }
        ViewTreeObserver viewTreeObserver = listView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeOnPreDrawListener(this);
        return true;
    }
}
