package p067l;

import android.view.MenuItem;
import android.view.Window;

/* JADX INFO: renamed from: l.ۤܳ */
/* JADX INFO: compiled from: A5FO */
/* JADX INFO: loaded from: classes3.dex */
public final class C1355 implements InterfaceC1834 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C1425 f34103;

    @Override // p067l.InterfaceC1834
    public final boolean onMenuItemSelected(C0994 c0994, MenuItem menuItem) {
        return false;
    }

    public C1355(C1425 c1425) {
        this.f34103 = c1425;
    }

    @Override // p067l.InterfaceC1834
    public final void onMenuModeChange(C0994 c0994) {
        C1425 c1425 = this.f34103;
        Window.Callback callback = c1425.f38080;
        if (c1425.f38079.mo4557()) {
            callback.onPanelClosed(108, c0994);
        } else if (callback.onPreparePanel(0, null, c0994)) {
            callback.onMenuOpened(108, c0994);
        }
    }
}
