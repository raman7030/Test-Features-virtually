package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: l.۠᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 31IJ */
/* JADX INFO: loaded from: classes3.dex */
public class C8434 extends View {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f25831;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public View f25832;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f25833;

    public C8434(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25833 = -1;
        this.f25832 = null;
        this.f25831 = 4;
        m22114(attributeSet);
    }

    public C8434(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25833 = -1;
        this.f25832 = null;
        this.f25831 = 4;
        m22114(attributeSet);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m22114(AttributeSet attributeSet) {
        super.setVisibility(this.f25831);
        this.f25833 = -1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C21840.f69984);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f25833 = typedArrayObtainStyledAttributes.getResourceId(index, this.f25833);
                } else if (index == 1) {
                    this.f25831 = typedArrayObtainStyledAttributes.getInt(index, this.f25831);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final View m22115() {
        return this.f25832;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int iHeight = rect.height();
            int iWidth = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((iWidth / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((rect.height() / 2.0f) + (iHeight / 2.0f)) - rect.bottom, paint);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22116(C17606 c17606) {
        if (this.f25833 == -1 && !isInEditMode()) {
            setVisibility(this.f25831);
        }
        View viewFindViewById = c17606.findViewById(this.f25833);
        this.f25832 = viewFindViewById;
        if (viewFindViewById != null) {
            ((C16900) viewFindViewById.getLayoutParams()).f51916 = true;
            this.f25832.setVisibility(0);
            setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m22117() {
        if (this.f25832 == null) {
            return;
        }
        C16900 c16900 = (C16900) getLayoutParams();
        C16900 c16901 = (C16900) this.f25832.getLayoutParams();
        c16901.f51902.m35768(0);
        C15094 c15094 = c16900.f51902;
        EnumC8040 enumC8040 = c15094.f46124[0];
        EnumC8040 enumC8041 = EnumC8040.FIXED;
        if (enumC8040 != enumC8041) {
            c15094.m35770(c16901.f51902.m35753());
        }
        C15094 c15095 = c16900.f51902;
        if (c15095.f46124[1] != enumC8041) {
            c15095.m35733(c16901.f51902.m35732());
        }
        c16901.f51902.m35768(8);
    }
}
