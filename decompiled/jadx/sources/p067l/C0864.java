package p067l;

import android.view.WindowInsets;

/* JADX INFO: renamed from: l.֡ܰ */
/* JADX INFO: compiled from: M4Z7 */
/* JADX INFO: loaded from: classes3.dex */
public class C0864 extends C1809 {

    /* JADX INFO: renamed from: ۘ */
    public C1388 f4709;

    /* JADX INFO: renamed from: ᩴ */
    public C1388 f4710;

    /* JADX INFO: renamed from: ᩵ */
    public C1388 f4711;

    @Override // p067l.C1774, p067l.C0899
    /* JADX INFO: renamed from: ֫ */
    public void mo4374(C1388 c1388) {
    }

    public C0864(C1914 c1914, WindowInsets windowInsets) {
        super(c1914, windowInsets);
        this.f4710 = null;
        this.f4709 = null;
        this.f4711 = null;
    }

    @Override // p067l.C0899
    /* JADX INFO: renamed from: ᩻ */
    public C1388 mo4377() {
        if (this.f4710 == null) {
            this.f4710 = C1388.m29404(this.f15416.getSystemGestureInsets());
        }
        return this.f4710;
    }

    @Override // p067l.C0899
    /* JADX INFO: renamed from: ܿ */
    public C1388 mo4375() {
        if (this.f4709 == null) {
            this.f4709 = C1388.m29404(this.f15416.getMandatorySystemGestureInsets());
        }
        return this.f4709;
    }

    @Override // p067l.C0899
    /* JADX INFO: renamed from: ᩷ */
    public C1388 mo4376() {
        if (this.f4711 == null) {
            this.f4711 = C1388.m29404(this.f15416.getTappableElementInsets());
        }
        return this.f4711;
    }

    @Override // p067l.C1039, p067l.C0899
    /* JADX INFO: renamed from: ֫ */
    public C1914 mo4373(int i, int i2, int i3, int i4) {
        return C1914.m51162(null, this.f15416.inset(i, i2, i3, i4));
    }
}
