package p067l;

import android.view.View;
import android.widget.EditText;

/* JADX INFO: renamed from: l.ۢۗܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 192I */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC11228 implements View.OnFocusChangeListener {
    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (z && (view instanceof EditText)) {
            C7050.m16212(new RunnableC9966(2, (EditText) view));
        }
    }
}
