package l;

import android.os.Build;
import android.view.View;
import android.widget.AutoCompleteTextView;

/* JADX INFO: renamed from: l.ۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5JQ */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC8622 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22028 f26337;

    public ViewOnClickListenerC8622(C22028 c22028) {
        this.f26337 = c22028;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C14971 c14971;
        C22028 c22028 = this.f26337;
        if (view == c22028.f70592) {
            c22028.m49571();
            return;
        }
        if (view == c22028.f70616) {
            c22028.m49572();
            return;
        }
        if (view == c22028.f70602) {
            c22028.m49569();
            return;
        }
        if (view != c22028.f70595 && view == (c14971 = c22028.f70611)) {
            if (Build.VERSION.SDK_INT >= 29) {
                C19206.m44272(c14971);
                return;
            }
            C0154 c0154 = C22028.f70591;
            c0154.m1256(c14971);
            c0154.m1254((AutoCompleteTextView) c14971);
        }
    }
}
