package l;

import android.view.MenuItem;

/* JADX INFO: renamed from: l.ۜۛᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC6583 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f20292;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f20293;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f20294;

    public /* synthetic */ RunnableC6583(int i, Object obj, Object obj2) {
        this.f20293 = i;
        this.f20294 = obj;
        this.f20292 = obj2;
    }

    public /* synthetic */ RunnableC6583(MenuItem menuItem, C12392 c12392) {
        this.f20293 = 2;
        this.f20292 = menuItem;
        this.f20294 = c12392;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20293) {
            case 0:
                C12392.m30140((C12392) this.f20294, (InterfaceC7785) this.f20292);
                break;
            case 1:
                C0405.m1908((C0405) this.f20294, (C1111) this.f20292);
                break;
            case 2:
                ((MenuItem) this.f20292).setChecked(((C12392) this.f20294).m30388() != 0);
                break;
            default:
                DialogInterfaceC0206 dialogInterfaceC0206 = (DialogInterfaceC0206) this.f20294;
                Runnable runnable = (Runnable) this.f20292;
                if (dialogInterfaceC0206.m1442()) {
                    dialogInterfaceC0206.dismiss();
                    runnable.run();
                }
                break;
        }
    }
}
