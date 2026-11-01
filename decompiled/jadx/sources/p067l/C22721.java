package p067l;

import android.view.MenuItem;

/* JADX INFO: renamed from: l.᩸ۜۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1JS */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C22721 implements InterfaceC9934, InterfaceC4343, InterfaceC1583, InterfaceC21477, InterfaceC22339 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Object f71667;

    public /* synthetic */ C22721(Object obj) {
        this.f71667 = obj;
    }

    @Override // p067l.InterfaceC1583
    public boolean onMenuItemClick(MenuItem menuItem) {
        C9842.m23035((C9842) this.f71667, menuItem);
        return true;
    }

    @Override // p067l.InterfaceC4343
    public void writeByte(int i) {
        ((InterfaceC6631) this.f71667).writeByte(i);
    }

    @Override // p067l.InterfaceC21477
    /* JADX INFO: renamed from: ֫ */
    public void mo15100(Object obj) {
        ((C16408) this.f71667).m37273((C13607) obj, false);
    }

    @Override // p067l.InterfaceC9934
    public void invoke(Object obj) {
        ((InterfaceC2950) obj).mo4853((C6443) this.f71667);
    }

    @Override // p067l.InterfaceC22339
    /* JADX INFO: renamed from: ۧ */
    public Object mo14676() {
        throw new C15611((String) this.f71667);
    }
}
