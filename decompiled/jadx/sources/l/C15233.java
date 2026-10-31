package l;

import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: renamed from: l.ܶ۫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28WH */
/* JADX INFO: loaded from: classes4.dex */
public final class C15233 implements InterfaceC18702 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7473 f46746;

    public C15233(C7473 c7473) {
        this.f46746 = c7473;
    }

    @Override // l.InterfaceC18702
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo21671() {
        C7473 c7473 = this.f46746;
        return !c7473.f23027 || c7473.f23032.m30401();
    }

    @Override // l.InterfaceC18702
    /* JADX INFO: renamed from: ֫ */
    public final void mo21666() {
        C7473 c7473 = this.f46746;
        if (c7473.f23027) {
            c7473.f23032.invalidate();
        }
    }

    @Override // l.InterfaceC18702
    /* JADX INFO: renamed from: ܽ */
    public final void mo21672() {
        C12412 c12412 = this.f46746.f23026;
        c12412.f37386 = false;
        c12412.f37390 = null;
        c12412.f37384 = null;
        c12412.f37383 = null;
        c12412.f37387 = null;
        c12412.f37382.clear();
    }

    @Override // l.InterfaceC18702
    /* JADX INFO: renamed from: ֫ */
    public final void mo21670(boolean z) {
        C7473 c7473 = this.f46746;
        C7473.m20029(c7473, c7473.f23026, z);
    }

    @Override // l.InterfaceC18702
    /* JADX INFO: renamed from: ֫ */
    public final void mo21669(C20736 c20736, int i, int i2, int i3, Canvas canvas, Paint paint, C22686 c22686) {
        C7473.m20033(this.f46746, false, c20736, i, i2, i3, canvas, paint, c22686);
    }

    @Override // l.InterfaceC18702
    /* JADX INFO: renamed from: ֫ */
    public final void mo21668(C20736 c20736, int i, int i2, float f, float f2, boolean z, Canvas canvas, C1539 c1539, InterfaceC10961 interfaceC10961, C22686 c22686) {
        C7473.m20032(this.f46746, false, c20736, i, i2, f, f2, z, canvas, (Paint) c1539, interfaceC10961, c22686);
    }

    @Override // l.InterfaceC18702
    /* JADX INFO: renamed from: ֫ */
    public final void mo21667(C20736 c20736, float f, float f2, float f3, float f4, Canvas canvas, C1539 c1539, C22686 c22686) {
        C7473.m20031(this.f46746, false, c20736, f, f2, f3, f4, canvas, c1539, c22686);
    }
}
