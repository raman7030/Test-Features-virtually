package p067l;

import android.view.MenuItem;

/* JADX INFO: renamed from: l.᩵ۚᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75NJ */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20677 implements InterfaceC16692, InterfaceC16176, InterfaceC2026 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Object f63869;

    public /* synthetic */ C20677(Object obj) {
        this.f63869 = obj;
    }

    @Override // p067l.InterfaceC2026
    public boolean onMenuItemClick(MenuItem menuItem) {
        ((ActivityC17874) this.f63869).m40662(menuItem);
        return true;
    }

    @Override // p067l.InterfaceC16692
    /* JADX INFO: renamed from: ֫ */
    public Object mo27141(Object obj, Throwable th) {
        return C13693.m31118((Throwable) this.f63869, th);
    }

    @Override // p067l.InterfaceC16176
    /* JADX INFO: renamed from: ֫ */
    public void mo9277(boolean z) {
        ((C11249) this.f63869).m26125(z);
    }
}
