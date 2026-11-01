package p067l;

import android.view.MenuItem;

/* JADX INFO: renamed from: l.ᩳۘᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: QB32 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19295 implements InterfaceC3326 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f57643;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f57644;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f57645;

    public /* synthetic */ C19295(int i, Object obj, Object obj2) {
        this.f57644 = i;
        this.f57645 = obj;
        this.f57643 = obj2;
    }

    @Override // p067l.InterfaceC3326
    /* JADX INFO: renamed from: ֫ */
    public final void mo4017(Object obj) {
        switch (this.f57644) {
            case 0:
                MenuItem menuItem = (MenuItem) this.f57645;
                MenuItem menuItem2 = (MenuItem) this.f57643;
                Boolean bool = (Boolean) obj;
                menuItem.setChecked(bool.booleanValue());
                menuItem2.setEnabled(!bool.booleanValue());
                break;
            default:
                AbstractC21614.m48818((AbstractC21614) this.f57645, (C4125) this.f57643);
                break;
        }
    }
}
