package p067l;

import android.view.MenuItem;

/* JADX INFO: renamed from: l.ۚۖ */
/* JADX INFO: compiled from: 95GJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C1093 implements InterfaceC1834 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C1898 f18722;

    @Override // p067l.InterfaceC1834
    public final void onMenuModeChange(C0994 c0994) {
    }

    public C1093(C1898 c1898) {
        this.f18722 = c1898;
    }

    @Override // p067l.InterfaceC1834
    public final boolean onMenuItemSelected(C0994 c0994, MenuItem menuItem) {
        InterfaceC1583 interfaceC1583 = this.f18722.f71326;
        if (interfaceC1583 != null) {
            return interfaceC1583.onMenuItemClick(menuItem);
        }
        return false;
    }
}
