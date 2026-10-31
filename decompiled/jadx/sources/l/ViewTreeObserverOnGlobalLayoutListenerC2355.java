package l;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۖۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: E50U */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC2355 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnKeyListenerC5177 f7547;

    public ViewTreeObserverOnGlobalLayoutListenerC2355(ViewOnKeyListenerC5177 viewOnKeyListenerC5177) {
        this.f7547 = viewOnKeyListenerC5177;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewOnKeyListenerC5177 viewOnKeyListenerC5177 = this.f7547;
        ArrayList arrayList = viewOnKeyListenerC5177.f16188;
        if (!viewOnKeyListenerC5177.isShowing() || arrayList.size() <= 0 || ((C0237) arrayList.get(0)).f1510.m23839()) {
            return;
        }
        View view = viewOnKeyListenerC5177.f16204;
        if (view == null || !view.isShown()) {
            viewOnKeyListenerC5177.dismiss();
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C0237) it.next()).f1510.show();
        }
    }
}
