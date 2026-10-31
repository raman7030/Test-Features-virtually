package l;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ۙܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: J5NH */
/* JADX INFO: loaded from: classes3.dex */
public final class C4738 extends C0734 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f15025;

    public C4738(Drawable drawable) {
        super(drawable);
        this.f15025 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13852(boolean z) {
        this.f15025 = z;
    }

    @Override // l.C0734, android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (this.f15025) {
            return super.setState(iArr);
        }
        return false;
    }

    @Override // l.C0734, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f15025) {
            super.draw(canvas);
        }
    }

    @Override // l.C0734, android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        if (this.f15025) {
            super.setHotspot(f, f2);
        }
    }

    @Override // l.C0734, android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.f15025) {
            super.setHotspotBounds(i, i2, i3, i4);
        }
    }

    @Override // l.C0734, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        if (this.f15025) {
            return super.setVisible(z, z2);
        }
        return false;
    }
}
