package p067l;

import android.graphics.Bitmap;
import android.view.MenuItem;
import bin.p000mt.plugin.api.p002ui.dialog.LoadingDialog;
import bin.p000mt.plugin.api.util.Consumer;

/* JADX INFO: renamed from: l.᩸᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8UQ */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23132 implements InterfaceC22304, InterfaceC6782, InterfaceC1583, InterfaceC1233, Consumer, InterfaceC4595 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Object f72713;

    public /* synthetic */ C23132(Object obj) {
        this.f72713 = obj;
    }

    @Override // bin.p000mt.plugin.api.util.Consumer
    /* JADX INFO: renamed from: accept */
    public void mo56319accept(Object obj) {
        ((LoadingDialog) this.f72713).lambda$new$1((CharSequence) obj);
    }

    @Override // p067l.InterfaceC1583
    public boolean onMenuItemClick(MenuItem menuItem) {
        C4073.m8164((C4073) this.f72713, menuItem);
        return true;
    }

    @Override // p067l.InterfaceC4595
    /* JADX INFO: renamed from: ֫ */
    public void mo8466(int i) {
        ((InterfaceC22710) this.f72713).mo24484(i);
    }

    @Override // p067l.InterfaceC22304
    /* JADX INFO: renamed from: ֫ */
    public void mo11051(C11575 c11575) {
        ((C11245) this.f72713).f31287.m41281();
    }

    @Override // p067l.InterfaceC6782
    /* JADX INFO: renamed from: ֫ */
    public Bitmap mo7890() {
        return C18950.m43040((C9367) this.f72713);
    }

    @Override // p067l.InterfaceC1233
    /* JADX INFO: renamed from: ֫ */
    public void mo8467(C1898 c1898) {
        C1898[] c1898Arr = (C1898[]) this.f72713;
        if (c1898Arr[0] == c1898) {
            c1898Arr[0] = null;
        }
    }
}
