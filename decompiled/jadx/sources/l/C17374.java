package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܿ۬᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Z99C */
/* JADX INFO: loaded from: classes5.dex */
public class C17374 extends C17939 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f53189;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f53190;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Drawable f53191;

    public C17374(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C17374(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C19743.f63780);
        String string = typedArrayObtainStyledAttributes.getString(1);
        this.f53189 = string;
        this.f53190 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        int iM3228 = C0881.m3228(context, C18080.m42143(string).m39184());
        float f = getResources().getDisplayMetrics().density;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(iM3228);
        gradientDrawable.setStroke((int) (0.5f + f), isInEditMode() ? C21238.m48208(context) : C21943.m49431() ? -2140772762 : -2138535800);
        gradientDrawable.setCornerRadius(f * 20.0f);
        setImageDrawable(gradientDrawable);
        if (C7466.m20002(iM3228) > 220) {
            this.f53191 = C21311.m48345(context, R.drawable.MT_Protector);
        } else {
            this.f53191 = C21311.m48345(context, R.drawable.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40715(boolean z) {
        if (this.f53190 != z) {
            this.f53190 = z;
            invalidate();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m40716() {
        return this.f53189;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f53190) {
            int width = getWidth();
            int height = getHeight();
            int i = (height * 2) / 3;
            int i2 = (width - i) / 2;
            int i3 = (height - i) / 2;
            Drawable drawable = this.f53191;
            drawable.setBounds(i2, i3, i2 + i, i + i3);
            drawable.draw(canvas);
        }
    }
}
