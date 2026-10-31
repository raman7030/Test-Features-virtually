package l;

import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: l.ۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: H56R */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC9056 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C23521 f27467;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2706 f27468;

    public ViewOnClickListenerC9056(C2706 c2706) {
        this.f27468 = c2706;
        this.f27467 = new C23521(c2706.f8452.getContext(), c2706.f8458);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C2706 c2706 = this.f27468;
        Window.Callback callback = c2706.f8462;
        if (callback == null || !c2706.f8463) {
            return;
        }
        callback.onMenuItemSelected(0, this.f27467);
    }
}
