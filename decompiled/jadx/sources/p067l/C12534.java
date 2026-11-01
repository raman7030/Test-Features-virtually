package p067l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.SeekBar;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۧ֫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 99K3 */
/* JADX INFO: loaded from: classes3.dex */
public class C12534 extends View {

    /* JADX INFO: renamed from: ֫֫ */
    public int f35165;

    /* JADX INFO: renamed from: ۗ */
    public int f35166;

    /* JADX INFO: renamed from: ۙ */
    public Drawable f35167;

    /* JADX INFO: renamed from: ۛ */
    public float f35168;

    /* JADX INFO: renamed from: ۟ */
    public boolean f35169;

    /* JADX INFO: renamed from: ۤ */
    public float f35170;

    /* JADX INFO: renamed from: ۧ֫ */
    public float f35171;

    /* JADX INFO: renamed from: ۨ */
    public Rect f35172;

    /* JADX INFO: renamed from: ۫ */
    public float f35173;

    /* JADX INFO: renamed from: ۬ */
    public float f35174;

    /* JADX INFO: renamed from: ܰ */
    public int f35175;

    /* JADX INFO: renamed from: ܳ֫ */
    public boolean f35176;

    /* JADX INFO: renamed from: ܽ֫ */
    public SeekBar f35177;

    /* JADX INFO: renamed from: ܿ֫ */
    public SeekBar f35178;

    /* JADX INFO: renamed from: ᩳ֫ */
    public float f35179;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f35180;

    /* JADX INFO: renamed from: ᩸ */
    public int f35181;

    /* JADX INFO: renamed from: ᩹ */
    public C21397 f35182;

    /* JADX INFO: renamed from: ᩺ */
    public C3831 f35183;

    public C12534(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35171 = 0.0f;
        this.f35179 = 0.0f;
        this.f35182 = new C21397();
        this.f35183 = new C3831();
        this.f35172 = new Rect();
        m28858(context);
    }

    public C12534(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f35171 = 0.0f;
        this.f35179 = 0.0f;
        this.f35182 = new C21397();
        this.f35183 = new C3831();
        this.f35172 = new Rect();
        m28858(context);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m28858(Context context) {
        this.f35165 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f35166 = (int) ((context.getResources().getDisplayMetrics().density * 8.0f) + 0.5f);
        Paint.Style style = Paint.Style.FILL;
        C3831 c3831 = this.f35183;
        c3831.setStyle(style);
        c3831.setAntiAlias(false);
        c3831.setFilterBitmap(false);
        if (isInEditMode()) {
            m28861(context.getResources().getDrawable(R.drawable.MT_Protector));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28862(SeekBar seekBar, SeekBar seekBar2) {
        this.f35177 = seekBar;
        this.f35178 = seekBar2;
        seekBar.setOnSeekBarChangeListener(new C9326(this));
        seekBar2.setOnSeekBarChangeListener(new C3816(this));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28861(Drawable drawable) {
        this.f35167 = drawable;
        drawable.getPadding(this.f35172);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int width = getWidth();
        int height = getHeight();
        int i = width / 2;
        int i2 = height / 2;
        int i3 = this.f35181;
        C3831 c3831 = this.f35183;
        int i4 = 2;
        if (i3 != 0) {
            if (i3 == 1) {
                canvas.drawColor(-16777216);
            } else if (i3 == 2) {
                canvas.drawColor(-1);
            } else if (i3 == 3) {
                canvas.drawColor(-7829368);
            }
            canvas2 = canvas;
        } else {
            int i5 = this.f35166;
            int i6 = width / i5;
            int i7 = height / i5;
            int[] iArr = this.f35182.f67484;
            Canvas canvas3 = canvas;
            int i8 = 0;
            while (i8 <= i6) {
                int i9 = 0;
                while (i9 <= i7) {
                    c3831.setColor(iArr[(i8 + i9) % i4]);
                    int i10 = i8 * i5;
                    int i11 = i9 * i5;
                    canvas.drawRect(i10, i11, i10 + i5, i11 + i5, c3831);
                    i9++;
                    i4 = 2;
                    canvas3 = canvas;
                    i8 = i8;
                    iArr = iArr;
                }
                i8++;
                i4 = 2;
            }
            canvas2 = canvas3;
        }
        Drawable drawable = this.f35167;
        if (drawable == null) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        float fMin = Math.min(Math.min(1.0f, width / intrinsicWidth), Math.min(1.0f, height / intrinsicHeight));
        int i12 = (int) (intrinsicWidth * fMin);
        int i13 = (int) (intrinsicHeight * fMin);
        int i14 = (int) (((width - i12) * this.f35171) + i12);
        int i15 = (int) (((height - i13) * this.f35179) + i13);
        int i16 = i - (i14 / 2);
        int i17 = i2 - (i15 / 2);
        int i18 = i14 + i16;
        int i19 = i15 + i17;
        drawable.setBounds(i16, i17, i18, i19);
        drawable.draw(canvas2);
        if (this.f35180) {
            c3831.setColor(-1333755649);
            Rect rect = this.f35172;
            canvas2.drawRect(i16 + (rect.left * fMin), i17 + (rect.top * fMin), i18 - (rect.right * fMin), i19 - (rect.bottom * fMin), c3831);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28860(float f) {
        this.f35171 = f;
        invalidate();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m28864(float f) {
        this.f35179 = f;
        invalidate();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28863(boolean z) {
        this.f35180 = z;
        invalidate();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28859() {
        this.f35181 = (this.f35181 + 1) % 4;
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00de  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int width;
        int height;
        SeekBar seekBar;
        SeekBar seekBar2;
        int actionMasked = motionEvent.getActionMasked();
        int i = 0;
        if (actionMasked == 0) {
            this.f35175 = 0;
            this.f35176 = false;
            return true;
        }
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        this.f35175++;
                        if (!this.f35176) {
                            this.f35174 = Math.abs(motionEvent.getX(0) - motionEvent.getX(1));
                            this.f35170 = Math.abs(motionEvent.getY(0) - motionEvent.getY(1));
                            this.f35173 = this.f35171;
                            this.f35168 = this.f35179;
                            this.f35176 = true;
                            this.f35169 = false;
                            return true;
                        }
                    } else if (actionMasked == 6) {
                        this.f35175--;
                        return true;
                    }
                }
            } else if (this.f35175 == 1 && this.f35176) {
                float fAbs = Math.abs(motionEvent.getX(0) - motionEvent.getX(1));
                float fAbs2 = Math.abs(motionEvent.getY(0) - motionEvent.getY(1));
                if (this.f35169) {
                    width = (int) ((((fAbs - this.f35174) / getWidth()) + this.f35173) * 100.0f);
                    height = (int) ((((fAbs2 - this.f35170) / getHeight()) + this.f35168) * 100.0f);
                    if (width > 100) {
                        width = 100;
                    } else if (width < 0) {
                        width = 0;
                    }
                    if (height > 100) {
                        i = 100;
                    } else if (height >= 0) {
                        i = height;
                    }
                    this.f35171 = width / 100.0f;
                    this.f35179 = i / 100.0f;
                    seekBar = this.f35177;
                    if (seekBar != null) {
                        seekBar.setProgress(width);
                    }
                    seekBar2 = this.f35178;
                    if (seekBar2 != null) {
                        seekBar2.setProgress(i);
                    }
                    invalidate();
                } else if (Math.abs(fAbs - this.f35174) > this.f35165 || Math.abs(fAbs2 - this.f35170) > this.f35165) {
                    this.f35169 = true;
                    width = (int) ((((fAbs - this.f35174) / getWidth()) + this.f35173) * 100.0f);
                    height = (int) ((((fAbs2 - this.f35170) / getHeight()) + this.f35168) * 100.0f);
                    if (width > 100) {
                        width = 100;
                    } else if (width < 0) {
                        width = 0;
                    }
                    if (height > 100) {
                        i = 100;
                    } else if (height >= 0) {
                        i = height;
                    }
                    this.f35171 = width / 100.0f;
                    this.f35179 = i / 100.0f;
                    seekBar = this.f35177;
                    if (seekBar != null) {
                        seekBar.setProgress(width);
                    }
                    seekBar2 = this.f35178;
                    if (seekBar2 != null) {
                        seekBar2.setProgress(i);
                    }
                    invalidate();
                }
            }
            return true;
        }
        this.f35176 = false;
        return true;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", super.onSaveInstanceState());
        bundle.putFloat("xScale", this.f35171);
        bundle.putFloat("yScale", this.f35179);
        bundle.putBoolean("drawContentRegion", this.f35180);
        bundle.putInt("backgroundMode", this.f35181);
        return bundle;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getBundle("super"));
            this.f35171 = bundle.getFloat("xScale");
            this.f35179 = bundle.getFloat("yScale");
            this.f35180 = bundle.getBoolean("drawContentRegion");
            this.f35181 = bundle.getInt("backgroundMode");
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }
}
