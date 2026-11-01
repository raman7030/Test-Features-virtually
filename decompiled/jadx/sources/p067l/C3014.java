package p067l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import bin.p000mt.plus.R;
import java.util.Random;

/* JADX INFO: renamed from: l.֡᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z7NG */
/* JADX INFO: loaded from: classes2.dex */
public final class C3014 extends LayerDrawable {

    /* JADX INFO: renamed from: ۗ */
    public final Drawable f5382;

    /* JADX INFO: renamed from: ۙ */
    public final Path f5383;

    /* JADX INFO: renamed from: ۬ */
    public final Paint f5384;

    /* JADX INFO: renamed from: ᩶ */
    public final float f5385;

    /* JADX INFO: renamed from: ᩸ */
    public final BitmapDrawable f5386;

    /* JADX INFO: renamed from: ᩹ */
    public final BitmapDrawable f5387;

    /* JADX INFO: renamed from: ֫ */
    public static C3014 m5093(long j) {
        Random random = new Random(j);
        Drawable drawableM16202 = C7050.m16202(R.drawable.MT_Protector);
        C21121 c21121 = new C21121(random);
        return new C3014(drawableM16202.mutate(), new BitmapDrawable(C7050.m16235(), c21121.m47746()), new BitmapDrawable(C7050.m16235(), c21121.m47745()), random.nextInt(360));
    }

    public C3014(Drawable drawable, BitmapDrawable bitmapDrawable, BitmapDrawable bitmapDrawable2, float f) {
        super(new Drawable[]{drawable, bitmapDrawable});
        this.f5382 = drawable;
        this.f5387 = bitmapDrawable;
        this.f5386 = bitmapDrawable2;
        this.f5385 = f;
        Paint paint = new Paint();
        this.f5384 = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.OVERLAY));
        this.f5383 = new Path();
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect dirtyBounds = getDirtyBounds();
        m5095(canvas, dirtyBounds.width(), dirtyBounds.height(), 0.0f, false, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5095(Canvas canvas, int i, int i2, float f, boolean z, boolean z2) {
        float f2;
        int i3;
        if (z) {
            float fMin = Math.min(i, i2) / 2.0f;
            Path path = this.f5383;
            path.reset();
            path.addCircle(i / 2.0f, i2 / 2.0f, fMin, Path.Direction.CW);
            int iSave = canvas.save();
            canvas.clipPath(path);
            f2 = f + this.f5385;
            i3 = iSave;
        } else {
            f2 = f;
            i3 = 0;
        }
        BitmapDrawable bitmapDrawable = this.f5387;
        BitmapDrawable bitmapDrawable2 = this.f5386;
        if (f2 != 0.0f) {
            int iSave2 = canvas.save();
            canvas.rotate(f2, i / 2.0f, i2 / 2.0f);
            m5094(canvas, z2 ? bitmapDrawable2 : bitmapDrawable, i, i2, i, i2, false);
            canvas.restoreToCount(iSave2);
        } else {
            m5094(canvas, z2 ? bitmapDrawable2 : bitmapDrawable, i, i2, i, i2, false);
        }
        this.f5382.setTint(z2 ? -11184811 : -15658735);
        m5094(canvas, this.f5382, (i * 2) / 5, (i2 * 2) / 5, i, i2, true);
        if (z) {
            canvas.restoreToCount(i3);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m5094(Canvas canvas, Drawable drawable, int i, int i2, int i3, int i4, boolean z) {
        int i5 = (i3 - i) / 2;
        int i6 = (i4 - i2) / 2;
        int i7 = i + i5;
        int i8 = i2 + i6;
        if (z) {
            int iSaveLayer = canvas.saveLayer(i5, i6, i7, i8, this.f5384);
            drawable.setBounds(i5, i6, i7, i8);
            drawable.draw(canvas);
            canvas.restoreToCount(iSaveLayer);
            return;
        }
        drawable.setBounds(i5, i6, i7, i8);
        drawable.draw(canvas);
    }
}
