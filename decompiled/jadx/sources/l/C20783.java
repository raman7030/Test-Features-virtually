package l;

import android.view.MenuItem;

/* JADX INFO: renamed from: l.᩷ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5Y2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20783 implements InterfaceC19994 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8788 f67308;

    public C20783(C8788 c8788) {
        this.f67308 = c8788;
    }

    @Override // l.InterfaceC19994
    public final boolean onMenuItemSelected(C3060 c3060, MenuItem menuItem) {
        boolean zOnMenuItemClick;
        InterfaceC9494 interfaceC9494 = this.f67308.f26764;
        if (interfaceC9494 != null) {
            C9762 c9762 = ((C13560) interfaceC9494).f40465;
            if (c9762.mMenuHostHelper.m29704(menuItem)) {
                zOnMenuItemClick = true;
            } else {
                InterfaceC23872 interfaceC23872 = c9762.mOnMenuItemClickListener;
                zOnMenuItemClick = interfaceC23872 != null ? interfaceC23872.onMenuItemClick(menuItem) : false;
            }
            if (zOnMenuItemClick) {
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC19994
    public final void onMenuModeChange(C3060 c3060) {
        InterfaceC19994 interfaceC19994 = this.f67308.f26767;
        if (interfaceC19994 != null) {
            interfaceC19994.onMenuModeChange(c3060);
        }
    }
}
