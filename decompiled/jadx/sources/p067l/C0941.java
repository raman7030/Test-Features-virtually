package p067l;

import android.view.MenuItem;

/* JADX INFO: renamed from: l.֫ᩴ */
/* JADX INFO: compiled from: V659 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0941 implements InterfaceC1834 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C1326 f9479;

    public C0941(C1326 c1326) {
        this.f9479 = c1326;
    }

    @Override // p067l.InterfaceC1834
    public final boolean onMenuItemSelected(C0994 c0994, MenuItem menuItem) {
        InterfaceC1834 interfaceC1834 = this.f9479.mMenuBuilderCallback;
        return interfaceC1834 != null && interfaceC1834.onMenuItemSelected(c0994, menuItem);
    }

    @Override // p067l.InterfaceC1834
    public final void onMenuModeChange(C0994 c0994) {
        C1326 c1326 = this.f9479;
        if (!c1326.mMenuView.m24656()) {
            c1326.mMenuHostHelper.m31767(c0994);
        }
        InterfaceC1834 interfaceC1834 = c1326.mMenuBuilderCallback;
        if (interfaceC1834 != null) {
            interfaceC1834.onMenuModeChange(c0994);
        }
    }
}
