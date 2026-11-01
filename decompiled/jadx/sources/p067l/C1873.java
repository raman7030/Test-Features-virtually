package p067l;

import android.view.MenuItem;

/* JADX INFO: renamed from: l.᩷ۢ */
/* JADX INFO: compiled from: M5Y2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1873 implements InterfaceC1834 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C1278 f69991;

    public C1873(C1278 c1278) {
        this.f69991 = c1278;
    }

    @Override // p067l.InterfaceC1834
    public final boolean onMenuItemSelected(C0994 c0994, MenuItem menuItem) {
        boolean zOnMenuItemClick;
        InterfaceC1313 interfaceC1313 = this.f69991.f29689;
        if (interfaceC1313 != null) {
            C1326 c1326 = ((C1515) interfaceC1313).f43543;
            if (c1326.mMenuHostHelper.m31766(menuItem)) {
                zOnMenuItemClick = true;
            } else {
                InterfaceC2026 interfaceC2026 = c1326.mOnMenuItemClickListener;
                zOnMenuItemClick = interfaceC2026 != null ? interfaceC2026.onMenuItemClick(menuItem) : false;
            }
            if (zOnMenuItemClick) {
                return true;
            }
        }
        return false;
    }

    @Override // p067l.InterfaceC1834
    public final void onMenuModeChange(C0994 c0994) {
        InterfaceC1834 interfaceC1834 = this.f69991.f29692;
        if (interfaceC1834 != null) {
            interfaceC1834.onMenuModeChange(c0994);
        }
    }
}
