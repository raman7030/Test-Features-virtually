package l;

import android.view.MenuItem;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: l.ۚᩴᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 76RQ */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5544 implements InterfaceC7961, InterfaceC13072, InterfaceC8017, InterfaceC14930, InterfaceC2343, InterfaceC21013 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f17150;

    public /* synthetic */ C5544(Object obj) {
        this.f17150 = obj;
    }

    public /* synthetic */ C5544(InterfaceC10408 interfaceC10408, Type type) {
        this.f17150 = interfaceC10408;
    }

    @Override // l.InterfaceC14930
    public boolean onMenuItemClick(MenuItem menuItem) {
        C5435.m15526((C5435) this.f17150, menuItem);
        return true;
    }

    @Override // l.InterfaceC2343
    /* JADX INFO: renamed from: ֫ */
    public void mo6264(int i) {
        ((C19639) this.f17150).mo11538(i);
    }

    @Override // l.InterfaceC7961
    public void invoke(Object obj) {
        ((InterfaceC0612) obj).mo2507((C23896) this.f17150);
    }

    @Override // l.InterfaceC21013
    /* JADX INFO: renamed from: ۧ */
    public Object mo12796() {
        return ((InterfaceC10408) this.f17150).m26255();
    }

    @Override // l.InterfaceC8017
    /* JADX INFO: renamed from: ۧ */
    public void mo4663(Object obj, Throwable th) {
        ((C22477) this.f17150).m50428((Throwable) null);
    }
}
