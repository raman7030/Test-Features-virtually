package p067l;

import android.animation.Animator;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۤܺۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34K8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12245 extends AbstractC5539 {

    /* JADX INFO: renamed from: ֫֫ */
    public C14256 f34212;

    /* JADX INFO: renamed from: ۟ */
    public C14256 f34213;

    /* JADX INFO: renamed from: ۧ֫ */
    public boolean f34214;

    /* JADX INFO: renamed from: ۨ */
    public float f34215;

    /* JADX INFO: renamed from: ܰ */
    public int f34216;

    /* JADX INFO: renamed from: ᩺ */
    public int f34217;

    /* JADX INFO: renamed from: ܿ֫ */
    public static final RectF f34209 = new RectF(-180.0f, -1.0f, 180.0f, 1.0f);

    /* JADX INFO: renamed from: ܳ֫ */
    public static final RectF f34207 = new RectF(-180.0f, -4.0f, 180.0f, 4.0f);

    /* JADX INFO: renamed from: ᩻֫ */
    public static final RectF f34211 = new RectF(-144.0f, -1.0f, 144.0f, 1.0f);

    /* JADX INFO: renamed from: ܽ֫ */
    public static final C14256 f34208 = new C14256(-522.6f);

    /* JADX INFO: renamed from: ᩳ֫ */
    public static final C14256 f34210 = new C14256(-197.6f);

    public C12245(AbstractActivityC5549 abstractActivityC5549) {
        this.f13348 = true;
        TypedArray typedArrayObtainStyledAttributes = abstractActivityC5549.obtainStyledAttributes(new int[]{R.attr.MT_Protector});
        try {
            int color = typedArrayObtainStyledAttributes.getColor(0, 0);
            typedArrayObtainStyledAttributes.recycle();
            setTint(color);
            this.f34214 = true;
            C14256 c14256 = new C14256(f34208);
            this.f34213 = c14256;
            C14256 c14257 = new C14256(f34210);
            this.f34212 = c14257;
            float f = abstractActivityC5549.getResources().getDisplayMetrics().density;
            this.f34216 = Math.round(4.0f * f);
            this.f34217 = Math.round(f * 16.0f);
            TypedArray typedArrayObtainStyledAttributes2 = abstractActivityC5549.obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
            try {
                float f2 = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
                typedArrayObtainStyledAttributes2.recycle();
                this.f34215 = f2;
                this.f13349 = new Animator[]{C23644.m52594(c14256), C23644.m52595(c14257)};
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes2.recycle();
                throw th;
            }
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28234(boolean z) {
        if (this.f13348 != z) {
            this.f13348 = z;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28232() {
        if (this.f34214) {
            this.f34214 = false;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f13348 ? this.f34217 : this.f34216;
    }

    @Override // p067l.AbstractC14926
    /* JADX INFO: renamed from: ֫ */
    public final void mo28233(Canvas canvas, Paint paint, int i, int i2) {
        boolean z = this.f13348;
        RectF rectF = f34209;
        if (z) {
            RectF rectF2 = f34207;
            canvas.scale(i / rectF2.width(), i2 / rectF2.height());
            canvas.translate(rectF2.width() / 2.0f, rectF2.height() / 2.0f);
        } else {
            canvas.scale(i / rectF.width(), i2 / rectF.height());
            canvas.translate(rectF.width() / 2.0f, rectF.height() / 2.0f);
        }
        if (this.f34214) {
            paint.setAlpha(Math.round(this.f17888 * this.f34215));
            canvas.drawRect(rectF, paint);
            paint.setAlpha(this.f17888);
        }
        int iSave = canvas.save();
        C14256 c14256 = this.f34212;
        canvas.translate(c14256.f40596, 0.0f);
        canvas.scale(c14256.f40595, 1.0f);
        RectF rectF3 = f34211;
        canvas.drawRect(rectF3, paint);
        canvas.restoreToCount(iSave);
        int iSave2 = canvas.save();
        C14256 c14257 = this.f34213;
        canvas.translate(c14257.f40596, 0.0f);
        canvas.scale(c14257.f40595, 1.0f);
        canvas.drawRect(rectF3, paint);
        canvas.restoreToCount(iSave2);
    }
}
