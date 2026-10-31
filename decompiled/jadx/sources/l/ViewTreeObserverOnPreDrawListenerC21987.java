package l;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ListView;

/* JADX INFO: renamed from: l.᩹ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: A513 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC21987 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f70393;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ListView f70394;

    public ViewTreeObserverOnPreDrawListenerC21987(ListView listView, View view) {
        this.f70394 = listView;
        this.f70393 = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = this.f70393;
        ListView listView = this.f70394;
        if (!C19871.m45703(listView, view)) {
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
