package p067l;

import android.graphics.Canvas;

/* JADX INFO: renamed from: l.֫ܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J5IM */
/* JADX INFO: loaded from: classes2.dex */
public final class C4145 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f9154;

    /* JADX INFO: renamed from: ۧ */
    public int f9155;

    /* JADX INFO: renamed from: ܽ */
    public int f9156;

    /* JADX INFO: renamed from: ֫ */
    public final void m8398(Canvas canvas, int i, int i2, int i3, float f, boolean z, C3831 c3831, InterfaceC12786 interfaceC12786, C23929 c23929) {
        if (this.f9154) {
            int i4 = this.f9156;
            int i5 = this.f9155;
            if ((i > i4 || i2 < i4) && ((i > i5 || i2 < i5) && (i <= i4 || i2 >= i5))) {
                return;
            }
            int iMax = Math.max(i, i4);
            int iMin = Math.min(i2, i5);
            C21484 c21484 = (C21484) interfaceC12786;
            float fM48686 = c21484.m48686(i, 0.0f, iMax);
            float fM48687 = c21484.m48686(i, 0.0f, iMin);
            if (i2 < i5 && (!z || i2 == i3)) {
                fM48687 += c23929.f76006;
            }
            float f2 = fM48687;
            float fM26507 = c23929.m26507();
            float fM26513 = (0.08f * fM26507) + c23929.m26513() + f;
            c3831.setColor(c23929.m26504() & (-1426063361));
            c3831.setStrokeWidth(fM26507 * 0.04f);
            canvas.drawLine(fM48686, fM26513, f2, fM26513, c3831);
            c3831.setStrokeWidth(0.0f);
        }
    }
}
