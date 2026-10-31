package l;

import android.graphics.Canvas;

/* JADX INFO: renamed from: l.֫ܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J5IM */
/* JADX INFO: loaded from: classes2.dex */
public final class C1869 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f6373;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f6374;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f6375;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6196(Canvas canvas, int i, int i2, int i3, float f, boolean z, C1539 c1539, InterfaceC10961 interfaceC10961, C22686 c22686) {
        if (this.f6373) {
            int i4 = this.f6375;
            int i5 = this.f6374;
            if ((i > i4 || i2 < i4) && ((i > i5 || i2 < i5) && (i <= i4 || i2 >= i5))) {
                return;
            }
            int iMax = Math.max(i, i4);
            int iMin = Math.min(i2, i5);
            C20113 c20113 = (C20113) interfaceC10961;
            float fM46370 = c20113.m46370(i, 0.0f, iMax);
            float fM46371 = c20113.m46370(i, 0.0f, iMin);
            if (i2 < i5 && (!z || i2 == i3)) {
                fM46371 += c22686.f73281;
            }
            float f2 = fM46371;
            float fM24495 = c22686.m24495();
            float fM24501 = (0.08f * fM24495) + c22686.m24501() + f;
            c1539.setColor(c22686.m24492() & (-1426063361));
            c1539.setStrokeWidth(fM24495 * 0.04f);
            canvas.drawLine(fM46370, fM24501, f2, fM24501, c1539);
            c1539.setStrokeWidth(0.0f);
        }
    }
}
