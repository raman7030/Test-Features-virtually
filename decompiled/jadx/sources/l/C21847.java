package l;

import android.graphics.Bitmap;
import android.view.MenuItem;
import bin.mt.plugin.api.ui.dialog.LoadingDialog;
import bin.mt.plugin.api.util.Consumer;

/* JADX INFO: renamed from: l.᩸᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8UQ */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C21847 implements InterfaceC20976, InterfaceC4644, InterfaceC14930, InterfaceC7875, Consumer, InterfaceC2343 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f70004;

    public /* synthetic */ C21847(Object obj) {
        this.f70004 = obj;
    }

    @Override // bin.mt.plugin.api.util.Consumer
    /* JADX INFO: renamed from: accept */
    public void mo12762accept(Object obj) {
        ((LoadingDialog) this.f70004).lambda$new$1((CharSequence) obj);
    }

    @Override // l.InterfaceC14930
    public boolean onMenuItemClick(MenuItem menuItem) {
        C1793.m5967((C1793) this.f70004, menuItem);
        return true;
    }

    @Override // l.InterfaceC2343
    /* JADX INFO: renamed from: ֫ */
    public void mo6264(int i) {
        ((InterfaceC21403) this.f70004).mo22515(i);
    }

    @Override // l.InterfaceC20976
    /* JADX INFO: renamed from: ֫ */
    public void mo8983(C9687 c9687) {
        ((C9340) this.f70004).f28338.m39055();
    }

    @Override // l.InterfaceC4644
    /* JADX INFO: renamed from: ֫ */
    public Bitmap mo5660() {
        return C17447.m40782((C7364) this.f70004);
    }

    @Override // l.InterfaceC7875
    /* JADX INFO: renamed from: ֫ */
    public void mo6265(C21282 c21282) {
        C21282[] c21282Arr = (C21282[]) this.f70004;
        if (c21282Arr[0] == c21282) {
            c21282Arr[0] = null;
        }
    }
}
