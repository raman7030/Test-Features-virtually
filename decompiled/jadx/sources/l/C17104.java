package l;

import android.view.MenuItem;

/* JADX INFO: renamed from: l.ܿۘᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: QB32 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C17104 implements InterfaceC1008 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f52431;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f52432;

    public /* synthetic */ C17104(int i, Object obj) {
        this.f52431 = i;
        this.f52432 = obj;
    }

    @Override // l.InterfaceC1008
    /* JADX INFO: renamed from: ֫ */
    public final void mo1617(Object obj) {
        switch (this.f52431) {
            case 0:
                Boolean bool = (Boolean) obj;
                for (MenuItem menuItem : (MenuItem[]) this.f52432) {
                    menuItem.setVisible(!bool.booleanValue());
                }
                break;
            default:
                C5561.m15796((C5561) this.f52432);
                break;
        }
    }
}
