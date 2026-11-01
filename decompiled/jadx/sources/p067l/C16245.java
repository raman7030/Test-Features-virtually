package p067l;

import android.view.MenuItem;

/* JADX INFO: renamed from: l.ܳܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8B6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16245 implements InterfaceC16716, InterfaceC1583 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Object f47795;

    public /* synthetic */ C16245(Object obj) {
        this.f47795 = obj;
    }

    @Override // p067l.InterfaceC1583
    public boolean onMenuItemClick(MenuItem menuItem) {
        return ((ActivityC17586) this.f47795).onOptionsItemSelected(menuItem);
    }

    @Override // p067l.InterfaceC16716
    /* JADX INFO: renamed from: ֫ */
    public InterfaceC22753 mo8449() {
        return new C5106((C17984) this.f47795);
    }
}
