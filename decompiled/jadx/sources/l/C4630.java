package l;

import android.graphics.Point;

/* JADX INFO: renamed from: l.ۙۨܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAKQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C4630 implements InterfaceC5269 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ServiceC3219 f14703;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Point f14704;

    public C4630(ServiceC3219 serviceC3219, Point point) {
        this.f14703 = serviceC3219;
        this.f14704 = point;
    }

    @Override // l.InterfaceC5269
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo13578() {
        ServiceC3219 serviceC3219 = this.f14703;
        int i = serviceC3219.f10130;
        Point point = this.f14704;
        point.x = i;
        point.y = serviceC3219.f10140;
    }
}
