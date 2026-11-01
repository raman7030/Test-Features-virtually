package p067l;

import android.view.MenuItem;

/* JADX INFO: renamed from: l.ۜۛᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC8625 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f23169;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f23170;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f23171;

    public /* synthetic */ RunnableC8625(int i, Object obj, Object obj2) {
        this.f23170 = i;
        this.f23171 = obj;
        this.f23169 = obj2;
    }

    public /* synthetic */ RunnableC8625(MenuItem menuItem, C14146 c14146) {
        this.f23170 = 2;
        this.f23169 = menuItem;
        this.f23171 = c14146;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23170) {
            case 0:
                C14146.m32204((C14146) this.f23171, (InterfaceC9768) this.f23169);
                break;
            case 1:
                C2753.m4300((C2753) this.f23171, (C3424) this.f23169);
                break;
            case 2:
                ((MenuItem) this.f23169).setChecked(((C14146) this.f23171).m32452() != 0);
                break;
            default:
                DialogInterfaceC2564 dialogInterfaceC2564 = (DialogInterfaceC2564) this.f23171;
                Runnable runnable = (Runnable) this.f23169;
                if (dialogInterfaceC2564.m3855()) {
                    dialogInterfaceC2564.dismiss();
                    runnable.run();
                }
                break;
        }
    }
}
