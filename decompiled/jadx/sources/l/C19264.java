package l;

import android.view.MenuItem;

/* JADX INFO: renamed from: l.᩵ۚᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75NJ */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19264 implements InterfaceC15071, InterfaceC14528, InterfaceC23872 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f60639;

    public /* synthetic */ C19264(Object obj) {
        this.f60639 = obj;
    }

    @Override // l.InterfaceC23872
    public boolean onMenuItemClick(MenuItem menuItem) {
        ((ActivityC16315) this.f60639).m38447(menuItem);
        return true;
    }

    @Override // l.InterfaceC15071
    /* JADX INFO: renamed from: ֫ */
    public Object mo25124(Object obj, Throwable th) {
        return C11915.m29066((Throwable) this.f60639, th);
    }

    @Override // l.InterfaceC14528
    /* JADX INFO: renamed from: ֫ */
    public void mo7198(boolean z) {
        ((C9344) this.f60639).m24116(z);
    }
}
