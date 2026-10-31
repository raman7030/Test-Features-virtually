package l;

import android.view.MenuItem;

/* JADX INFO: renamed from: l.֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: V659 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2000 implements InterfaceC19994 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9762 f6692;

    public C2000(C9762 c9762) {
        this.f6692 = c9762;
    }

    @Override // l.InterfaceC19994
    public final boolean onMenuItemSelected(C3060 c3060, MenuItem menuItem) {
        InterfaceC19994 interfaceC19994 = this.f6692.mMenuBuilderCallback;
        return interfaceC19994 != null && interfaceC19994.onMenuItemSelected(c3060, menuItem);
    }

    @Override // l.InterfaceC19994
    public final void onMenuModeChange(C3060 c3060) {
        C9762 c9762 = this.f6692;
        if (!c9762.mMenuView.m22686()) {
            c9762.mMenuHostHelper.m29705(c3060);
        }
        InterfaceC19994 interfaceC19994 = c9762.mMenuBuilderCallback;
        if (interfaceC19994 != null) {
            interfaceC19994.onMenuModeChange(c3060);
        }
    }
}
