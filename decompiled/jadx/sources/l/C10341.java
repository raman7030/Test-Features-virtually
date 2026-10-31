package l;

import android.view.MenuItem;
import android.view.Window;

/* JADX INFO: renamed from: l.ۤܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5FO */
/* JADX INFO: loaded from: classes3.dex */
public final class C10341 implements InterfaceC19994 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11752 f31141;

    @Override // l.InterfaceC19994
    public final boolean onMenuItemSelected(C3060 c3060, MenuItem menuItem) {
        return false;
    }

    public C10341(C11752 c11752) {
        this.f31141 = c11752;
    }

    @Override // l.InterfaceC19994
    public final void onMenuModeChange(C3060 c3060) {
        C11752 c11752 = this.f31141;
        Window.Callback callback = c11752.f35081;
        if (c11752.f35080.mo2190()) {
            callback.onPanelClosed(108, c3060);
        } else if (callback.onPreparePanel(0, null, c3060)) {
            callback.onMenuOpened(108, c3060);
        }
    }
}
