package p067l;

import android.graphics.Point;

/* JADX INFO: renamed from: l.ۙۨܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAKQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C6769 implements InterfaceC7376 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ServiceC5428 f17531;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ Point f17532;

    public C6769(ServiceC5428 serviceC5428, Point point) {
        this.f17531 = serviceC5428;
        this.f17532 = point;
    }

    @Override // p067l.InterfaceC7376
    /* JADX INFO: renamed from: ֫ */
    public final void mo15453() {
        ServiceC5428 serviceC5428 = this.f17531;
        int i = serviceC5428.f12936;
        Point point = this.f17532;
        point.x = i;
        point.y = serviceC5428.f12946;
    }
}
