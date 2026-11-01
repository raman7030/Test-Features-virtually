package p067l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܿ۬᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Z99C */
/* JADX INFO: loaded from: classes5.dex */
public class C18881 extends C1732 {

    /* JADX INFO: renamed from: ᩶ */
    public String f56375;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f56376;

    /* JADX INFO: renamed from: ᩹ */
    public Drawable f56377;

    public C18881(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C18881(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C21133.f66415);
        String string = typedArrayObtainStyledAttributes.getString(1);
        this.f56375 = string;
        this.f56376 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        int iM5542 = C0886.m5542(context, C19552.m44402(string).m41419());
        float f = getResources().getDisplayMetrics().density;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(iM5542);
        gradientDrawable.setStroke((int) (0.5f + f), isInEditMode() ? C22553.m50539(context) : C23223.m51768() ? -2140772762 : -2138535800);
        gradientDrawable.setCornerRadius(f * 20.0f);
        setImageDrawable(gradientDrawable);
        if (C9464.m21977(iM5542) > 220) {
            this.f56377 = C22622.m50680(context, R.drawable.MT_Protector);
        } else {
            this.f56377 = C22622.m50680(context, R.drawable.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42967(boolean z) {
        if (this.f56376 != z) {
            this.f56376 = z;
            invalidate();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m42968() {
        return this.f56375;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f56376) {
            int width = getWidth();
            int height = getHeight();
            int i = (height * 2) / 3;
            int i2 = (width - i) / 2;
            int i3 = (height - i) / 2;
            Drawable drawable = this.f56377;
            drawable.setBounds(i2, i3, i2 + i, i + i3);
            drawable.draw(canvas);
        }
    }
}
