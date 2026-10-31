package l;

import android.view.MenuItem;

/* JADX INFO: renamed from: l.᩸ۜۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1JS */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21415 implements InterfaceC7961, InterfaceC2077, InterfaceC14930, InterfaceC20106, InterfaceC21013 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f68969;

    public /* synthetic */ C21415(Object obj) {
        this.f68969 = obj;
    }

    @Override // l.InterfaceC14930
    public boolean onMenuItemClick(MenuItem menuItem) {
        C7864.m21070((C7864) this.f68969, menuItem);
        return true;
    }

    @Override // l.InterfaceC2077
    public void writeByte(int i) {
        ((InterfaceC4485) this.f68969).writeByte(i);
    }

    @Override // l.InterfaceC20106
    /* JADX INFO: renamed from: ֫ */
    public void mo13218(Object obj) {
        ((C14772) this.f68969).m35126((C11825) obj, false);
    }

    @Override // l.InterfaceC7961
    public void invoke(Object obj) {
        ((InterfaceC0612) obj).mo2497((C4288) this.f68969);
    }

    @Override // l.InterfaceC21013
    /* JADX INFO: renamed from: ۧ */
    public Object mo12796() {
        throw new C13934((String) this.f68969);
    }
}
