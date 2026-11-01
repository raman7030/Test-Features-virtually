package p067l;

import android.os.Build;
import android.view.View;
import android.widget.AutoCompleteTextView;

/* JADX INFO: renamed from: l.ۡۘ */
/* JADX INFO: compiled from: N5JQ */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC1270 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C1935 f29255;

    public ViewOnClickListenerC1270(C1935 c1935) {
        this.f29255 = c1935;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1585 c1585;
        C1935 c1935 = this.f29255;
        if (view == c1935.f73309) {
            c1935.m51907();
            return;
        }
        if (view == c1935.f73333) {
            c1935.m51908();
            return;
        }
        if (view == c1935.f73319) {
            c1935.m51905();
            return;
        }
        if (view != c1935.f73312 && view == (c1585 = c1935.f73328)) {
            if (Build.VERSION.SDK_INT >= 29) {
                C1795.m46567(c1585);
                return;
            }
            C0850 c0850 = C1935.f73308;
            c0850.m3664(c1585);
            c0850.m3662((AutoCompleteTextView) c1585);
        }
    }
}
