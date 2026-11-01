package p067l;

import android.view.MenuItem;

/* JADX INFO: renamed from: l.ܿۘᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: QB32 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18624 implements InterfaceC3326 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f55613;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f55614;

    public /* synthetic */ C18624(int i, Object obj) {
        this.f55613 = i;
        this.f55614 = obj;
    }

    @Override // p067l.InterfaceC3326
    /* JADX INFO: renamed from: ֫ */
    public final void mo4017(Object obj) {
        switch (this.f55613) {
            case 0:
                Boolean bool = (Boolean) obj;
                for (MenuItem menuItem : (MenuItem[]) this.f55614) {
                    menuItem.setVisible(!bool.booleanValue());
                }
                break;
            default:
                C7654.m17711((C7654) this.f55614);
                break;
        }
    }
}
