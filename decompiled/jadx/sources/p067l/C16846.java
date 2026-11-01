package p067l;

import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: renamed from: l.ܶ۫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28WH */
/* JADX INFO: loaded from: classes4.dex */
public final class C16846 implements InterfaceC20143 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C9471 f49870;

    public C16846(C9471 c9471) {
        this.f49870 = c9471;
    }

    @Override // p067l.InterfaceC20143
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo23640() {
        C9471 c9471 = this.f49870;
        return !c9471.f25939 || c9471.f25944.m32465();
    }

    @Override // p067l.InterfaceC20143
    /* JADX INFO: renamed from: ֫ */
    public final void mo23635() {
        C9471 c9471 = this.f49870;
        if (c9471.f25939) {
            c9471.f25944.invalidate();
        }
    }

    @Override // p067l.InterfaceC20143
    /* JADX INFO: renamed from: ܽ */
    public final void mo23641() {
        C14165 c14165 = this.f49870.f25938;
        c14165.f40400 = false;
        c14165.f40404 = null;
        c14165.f40398 = null;
        c14165.f40397 = null;
        c14165.f40401 = null;
        c14165.f40396.clear();
    }

    @Override // p067l.InterfaceC20143
    /* JADX INFO: renamed from: ֫ */
    public final void mo23639(boolean z) {
        C9471 c9471 = this.f49870;
        C9471.m22004(c9471, c9471.f25938, z);
    }

    @Override // p067l.InterfaceC20143
    /* JADX INFO: renamed from: ֫ */
    public final void mo23638(C22076 c22076, int i, int i2, int i3, Canvas canvas, Paint paint, C23929 c23929) {
        C9471.m22008(this.f49870, false, c22076, i, i2, i3, canvas, paint, c23929);
    }

    @Override // p067l.InterfaceC20143
    /* JADX INFO: renamed from: ֫ */
    public final void mo23637(C22076 c22076, int i, int i2, float f, float f2, boolean z, Canvas canvas, C3831 c3831, InterfaceC12786 interfaceC12786, C23929 c23929) {
        C9471.m22007(this.f49870, false, c22076, i, i2, f, f2, z, canvas, (Paint) c3831, interfaceC12786, c23929);
    }

    @Override // p067l.InterfaceC20143
    /* JADX INFO: renamed from: ֫ */
    public final void mo23636(C22076 c22076, float f, float f2, float f3, float f4, Canvas canvas, C3831 c3831, C23929 c23929) {
        C9471.m22006(this.f49870, false, c22076, f, f2, f3, f4, canvas, c3831, c23929);
    }
}
