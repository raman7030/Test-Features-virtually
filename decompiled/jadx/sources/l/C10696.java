package l;

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
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۧ֫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 99K3 */
/* JADX INFO: loaded from: classes3.dex */
public class C10696 extends View {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public int f32190;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f32191;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Drawable f32192;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public float f32193;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f32194;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public float f32195;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public float f32196;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Rect f32197;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public float f32198;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public float f32199;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f32200;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public boolean f32201;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public SeekBar f32202;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public SeekBar f32203;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public float f32204;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f32205;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f32206;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C20022 f32207;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C1539 f32208;

    public C10696(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32196 = 0.0f;
        this.f32204 = 0.0f;
        this.f32207 = new C20022();
        this.f32208 = new C1539();
        this.f32197 = new Rect();
        m26818(context);
    }

    public C10696(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32196 = 0.0f;
        this.f32204 = 0.0f;
        this.f32207 = new C20022();
        this.f32208 = new C1539();
        this.f32197 = new Rect();
        m26818(context);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m26818(Context context) {
        this.f32190 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f32191 = (int) ((context.getResources().getDisplayMetrics().density * 8.0f) + 0.5f);
        Paint.Style style = Paint.Style.FILL;
        C1539 c1539 = this.f32208;
        c1539.setStyle(style);
        c1539.setAntiAlias(false);
        c1539.setFilterBitmap(false);
        if (isInEditMode()) {
            m26821(context.getResources().getDrawable(R.drawable.MT_Protector));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26822(SeekBar seekBar, SeekBar seekBar2) {
        this.f32202 = seekBar;
        this.f32203 = seekBar2;
        seekBar.setOnSeekBarChangeListener(new C7321(this));
        seekBar2.setOnSeekBarChangeListener(new C1523(this));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26821(Drawable drawable) {
        this.f32192 = drawable;
        drawable.getPadding(this.f32197);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int width = getWidth();
        int height = getHeight();
        int i = width / 2;
        int i2 = height / 2;
        int i3 = this.f32206;
        C1539 c1539 = this.f32208;
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
            int i5 = this.f32191;
            int i6 = width / i5;
            int i7 = height / i5;
            int[] iArr = this.f32207.f64842;
            Canvas canvas3 = canvas;
            int i8 = 0;
            while (i8 <= i6) {
                int i9 = 0;
                while (i9 <= i7) {
                    c1539.setColor(iArr[(i8 + i9) % i4]);
                    int i10 = i8 * i5;
                    int i11 = i9 * i5;
                    canvas.drawRect(i10, i11, i10 + i5, i11 + i5, c1539);
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
        Drawable drawable = this.f32192;
        if (drawable == null) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        float fMin = Math.min(Math.min(1.0f, width / intrinsicWidth), Math.min(1.0f, height / intrinsicHeight));
        int i12 = (int) (intrinsicWidth * fMin);
        int i13 = (int) (intrinsicHeight * fMin);
        int i14 = (int) (((width - i12) * this.f32196) + i12);
        int i15 = (int) (((height - i13) * this.f32204) + i13);
        int i16 = i - (i14 / 2);
        int i17 = i2 - (i15 / 2);
        int i18 = i14 + i16;
        int i19 = i15 + i17;
        drawable.setBounds(i16, i17, i18, i19);
        drawable.draw(canvas2);
        if (this.f32205) {
            c1539.setColor(-1333755649);
            Rect rect = this.f32197;
            canvas2.drawRect(i16 + (rect.left * fMin), i17 + (rect.top * fMin), i18 - (rect.right * fMin), i19 - (rect.bottom * fMin), c1539);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26820(float f) {
        this.f32196 = f;
        invalidate();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m26824(float f) {
        this.f32204 = f;
        invalidate();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26823(boolean z) {
        this.f32205 = z;
        invalidate();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26819() {
        this.f32206 = (this.f32206 + 1) % 4;
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
            this.f32200 = 0;
            this.f32201 = false;
            return true;
        }
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        this.f32200++;
                        if (!this.f32201) {
                            this.f32199 = Math.abs(motionEvent.getX(0) - motionEvent.getX(1));
                            this.f32195 = Math.abs(motionEvent.getY(0) - motionEvent.getY(1));
                            this.f32198 = this.f32196;
                            this.f32193 = this.f32204;
                            this.f32201 = true;
                            this.f32194 = false;
                            return true;
                        }
                    } else if (actionMasked == 6) {
                        this.f32200--;
                        return true;
                    }
                }
            } else if (this.f32200 == 1 && this.f32201) {
                float fAbs = Math.abs(motionEvent.getX(0) - motionEvent.getX(1));
                float fAbs2 = Math.abs(motionEvent.getY(0) - motionEvent.getY(1));
                if (this.f32194) {
                    width = (int) ((((fAbs - this.f32199) / getWidth()) + this.f32198) * 100.0f);
                    height = (int) ((((fAbs2 - this.f32195) / getHeight()) + this.f32193) * 100.0f);
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
                    this.f32196 = width / 100.0f;
                    this.f32204 = i / 100.0f;
                    seekBar = this.f32202;
                    if (seekBar != null) {
                        seekBar.setProgress(width);
                    }
                    seekBar2 = this.f32203;
                    if (seekBar2 != null) {
                        seekBar2.setProgress(i);
                    }
                    invalidate();
                } else if (Math.abs(fAbs - this.f32199) > this.f32190 || Math.abs(fAbs2 - this.f32195) > this.f32190) {
                    this.f32194 = true;
                    width = (int) ((((fAbs - this.f32199) / getWidth()) + this.f32198) * 100.0f);
                    height = (int) ((((fAbs2 - this.f32195) / getHeight()) + this.f32193) * 100.0f);
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
                    this.f32196 = width / 100.0f;
                    this.f32204 = i / 100.0f;
                    seekBar = this.f32202;
                    if (seekBar != null) {
                        seekBar.setProgress(width);
                    }
                    seekBar2 = this.f32203;
                    if (seekBar2 != null) {
                        seekBar2.setProgress(i);
                    }
                    invalidate();
                }
            }
            return true;
        }
        this.f32201 = false;
        return true;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", super.onSaveInstanceState());
        bundle.putFloat("xScale", this.f32196);
        bundle.putFloat("yScale", this.f32204);
        bundle.putBoolean("drawContentRegion", this.f32205);
        bundle.putInt("backgroundMode", this.f32206);
        return bundle;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getBundle("super"));
            this.f32196 = bundle.getFloat("xScale");
            this.f32204 = bundle.getFloat("yScale");
            this.f32205 = bundle.getBoolean("drawContentRegion");
            this.f32206 = bundle.getInt("backgroundMode");
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }
}
