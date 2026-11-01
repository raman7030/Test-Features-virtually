package p067l;

import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: l.ۡᩴ */
/* JADX INFO: compiled from: H56R */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC1291 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final C2009 f30405;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C0976 f30406;

    public ViewOnClickListenerC1291(C0976 c0976) {
        this.f30406 = c0976;
        this.f30405 = new C2009(c0976.f11248.getContext(), c0976.f11254);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0976 c0976 = this.f30406;
        Window.Callback callback = c0976.f11258;
        if (callback == null || !c0976.f11259) {
            return;
        }
        callback.onMenuItemSelected(0, this.f30405);
    }
}
