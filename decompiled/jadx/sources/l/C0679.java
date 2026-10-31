package l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import bin.mt.plus.R;
import java.util.Random;

/* JADX INFO: renamed from: l.֡᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z7NG */
/* JADX INFO: loaded from: classes2.dex */
public final class C0679 extends LayerDrawable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final Drawable f2609;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Path f2610;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Paint f2611;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final float f2612;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final BitmapDrawable f2613;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final BitmapDrawable f2614;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C0679 m2754(long j) {
        Random random = new Random(j);
        Drawable drawableM14305 = C4925.m14305(R.drawable.MT_Protector);
        C19731 c19731 = new C19731(random);
        return new C0679(drawableM14305.mutate(), new BitmapDrawable(C4925.m14338(), c19731.m45442()), new BitmapDrawable(C4925.m14338(), c19731.m45441()), random.nextInt(360));
    }

    public C0679(Drawable drawable, BitmapDrawable bitmapDrawable, BitmapDrawable bitmapDrawable2, float f) {
        super(new Drawable[]{drawable, bitmapDrawable});
        this.f2609 = drawable;
        this.f2614 = bitmapDrawable;
        this.f2613 = bitmapDrawable2;
        this.f2612 = f;
        Paint paint = new Paint();
        this.f2611 = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.OVERLAY));
        this.f2610 = new Path();
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect dirtyBounds = getDirtyBounds();
        m2756(canvas, dirtyBounds.width(), dirtyBounds.height(), 0.0f, false, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2756(Canvas canvas, int i, int i2, float f, boolean z, boolean z2) {
        float f2;
        int i3;
        if (z) {
            float fMin = Math.min(i, i2) / 2.0f;
            Path path = this.f2610;
            path.reset();
            path.addCircle(i / 2.0f, i2 / 2.0f, fMin, Path.Direction.CW);
            int iSave = canvas.save();
            canvas.clipPath(path);
            f2 = f + this.f2612;
            i3 = iSave;
        } else {
            f2 = f;
            i3 = 0;
        }
        BitmapDrawable bitmapDrawable = this.f2614;
        BitmapDrawable bitmapDrawable2 = this.f2613;
        if (f2 != 0.0f) {
            int iSave2 = canvas.save();
            canvas.rotate(f2, i / 2.0f, i2 / 2.0f);
            m2755(canvas, z2 ? bitmapDrawable2 : bitmapDrawable, i, i2, i, i2, false);
            canvas.restoreToCount(iSave2);
        } else {
            m2755(canvas, z2 ? bitmapDrawable2 : bitmapDrawable, i, i2, i, i2, false);
        }
        this.f2609.setTint(z2 ? -11184811 : -15658735);
        m2755(canvas, this.f2609, (i * 2) / 5, (i2 * 2) / 5, i, i2, true);
        if (z) {
            canvas.restoreToCount(i3);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m2755(Canvas canvas, Drawable drawable, int i, int i2, int i3, int i4, boolean z) {
        int i5 = (i3 - i) / 2;
        int i6 = (i4 - i2) / 2;
        int i7 = i + i5;
        int i8 = i2 + i6;
        if (z) {
            int iSaveLayer = canvas.saveLayer(i5, i6, i7, i8, this.f2611);
            drawable.setBounds(i5, i6, i7, i8);
            drawable.draw(canvas);
            canvas.restoreToCount(iSaveLayer);
            return;
        }
        drawable.setBounds(i5, i6, i7, i8);
        drawable.draw(canvas);
    }
}
