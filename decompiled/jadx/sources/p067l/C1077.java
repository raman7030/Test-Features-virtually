package p067l;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ۙܺ */
/* JADX INFO: compiled from: J5NH */
/* JADX INFO: loaded from: classes3.dex */
public final class C1077 extends C0878 {

    /* JADX INFO: renamed from: ᩸ */
    public boolean f17856;

    public C1077(Drawable drawable) {
        super(drawable);
        this.f17856 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15732(boolean z) {
        this.f17856 = z;
    }

    @Override // p067l.C0878, android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (this.f17856) {
            return super.setState(iArr);
        }
        return false;
    }

    @Override // p067l.C0878, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f17856) {
            super.draw(canvas);
        }
    }

    @Override // p067l.C0878, android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        if (this.f17856) {
            super.setHotspot(f, f2);
        }
    }

    @Override // p067l.C0878, android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.f17856) {
            super.setHotspotBounds(i, i2, i3, i4);
        }
    }

    @Override // p067l.C0878, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        if (this.f17856) {
            return super.setVisible(z, z2);
        }
        return false;
    }
}
