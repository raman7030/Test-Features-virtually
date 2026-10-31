package l;

import android.view.MenuItem;

/* JADX INFO: renamed from: l.ۚۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95GJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C5053 implements InterfaceC19994 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21282 f15886;

    @Override // l.InterfaceC19994
    public final void onMenuModeChange(C3060 c3060) {
    }

    public C5053(C21282 c21282) {
        this.f15886 = c21282;
    }

    @Override // l.InterfaceC19994
    public final boolean onMenuItemSelected(C3060 c3060, MenuItem menuItem) {
        InterfaceC14930 interfaceC14930 = this.f15886.f68634;
        if (interfaceC14930 != null) {
            return interfaceC14930.onMenuItemClick(menuItem);
        }
        return false;
    }
}
