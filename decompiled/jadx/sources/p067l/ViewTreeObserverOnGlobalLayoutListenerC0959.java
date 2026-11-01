package p067l;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۖۜ */
/* JADX INFO: compiled from: E50U */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0959 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ ViewOnKeyListenerC1099 f10338;

    public ViewTreeObserverOnGlobalLayoutListenerC0959(ViewOnKeyListenerC1099 viewOnKeyListenerC1099) {
        this.f10338 = viewOnKeyListenerC1099;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewOnKeyListenerC1099 viewOnKeyListenerC1099 = this.f10338;
        ArrayList arrayList = viewOnKeyListenerC1099.f19029;
        if (!viewOnKeyListenerC1099.isShowing() || arrayList.size() <= 0 || ((C0854) arrayList.get(0)).f4288.m25848()) {
            return;
        }
        View view = viewOnKeyListenerC1099.f19045;
        if (view == null || !view.isShown()) {
            viewOnKeyListenerC1099.dismiss();
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C0854) it.next()).f4288.show();
        }
    }
}
