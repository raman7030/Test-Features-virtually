package l;

import android.view.MenuItem;

/* JADX INFO: renamed from: l.ܳܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8B6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14601 implements InterfaceC15097, InterfaceC14930 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f44688;

    public /* synthetic */ C14601(Object obj) {
        this.f44688 = obj;
    }

    @Override // l.InterfaceC14930
    public boolean onMenuItemClick(MenuItem menuItem) {
        return ((ActivityC16012) this.f44688).onOptionsItemSelected(menuItem);
    }

    @Override // l.InterfaceC15097
    /* JADX INFO: renamed from: ֫ */
    public InterfaceC21449 mo6247() {
        return new C2881((C16431) this.f44688);
    }
}
