package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.InputFilter;
import android.text.method.DateKeyListener;
import android.text.method.DateTimeKeyListener;
import android.text.method.DialerKeyListener;
import android.text.method.DigitsKeyListener;
import android.text.method.NumberKeyListener;
import android.text.method.TimeKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: l.ۤۤᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R98O */
/* JADX INFO: loaded from: classes4.dex */
public class C10235 extends C12392 {

    /* JADX INFO: renamed from: ۠ܿ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f30845 = 0;

    /* JADX INFO: renamed from: ֡ܿ, reason: not valid java name and contains not printable characters */
    public boolean f30846;

    /* JADX INFO: renamed from: ֨ܿ, reason: not valid java name and contains not printable characters */
    public boolean f30847;

    /* JADX INFO: renamed from: ۖܿ, reason: not valid java name and contains not printable characters */
    public final Rect f30848;

    /* JADX INFO: renamed from: ۘܿ, reason: not valid java name and contains not printable characters */
    public int f30849;

    /* JADX INFO: renamed from: ۚܿ, reason: not valid java name and contains not printable characters */
    public final ViewTreeObserver.OnPreDrawListener f30850;

    /* JADX INFO: renamed from: ۜܿ, reason: not valid java name and contains not printable characters */
    public InputFilter[] f30851;

    /* JADX INFO: renamed from: ۡܿ, reason: not valid java name and contains not printable characters */
    public NumberKeyListener f30852;

    /* JADX INFO: renamed from: ۢܿ, reason: not valid java name and contains not printable characters */
    public int f30853;

    /* JADX INFO: renamed from: ܺܿ, reason: not valid java name and contains not printable characters */
    public int f30854;

    /* JADX INFO: renamed from: ᩴܿ, reason: not valid java name and contains not printable characters */
    public int f30855;

    /* JADX INFO: renamed from: ᩵ܿ, reason: not valid java name and contains not printable characters */
    public final Rect f30856;

    /* JADX INFO: renamed from: ᩷ܿ, reason: not valid java name and contains not printable characters */
    public int f30857;

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        return true;
    }

    @Override // l.C12392
    /* JADX INFO: renamed from: ۘܽ, reason: not valid java name and contains not printable characters */
    public final boolean mo25902() {
        return false;
    }

    @Override // l.C12392
    /* JADX INFO: renamed from: ܶۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo25916() {
        return false;
    }

    @Override // l.C12392
    /* JADX INFO: renamed from: ᩸ܽ, reason: not valid java name and contains not printable characters */
    public final boolean mo25925() {
        return true;
    }

    public C10235(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30854 = -1;
        this.f30848 = new Rect();
        this.f30856 = new Rect();
        this.f30850 = new ViewTreeObserver.OnPreDrawListener() { // from class: l.۬ۤᩳ
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                C10235.m25891(this.f39075);
                return true;
            }
        };
        this.f30853 = 524289;
        this.f30857 = -1;
        this.f30852 = null;
        this.f30851 = C10567.f31701;
        m25890(attributeSet);
    }

    public C10235(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30854 = -1;
        this.f30848 = new Rect();
        this.f30856 = new Rect();
        this.f30850 = new ViewTreeObserver.OnPreDrawListener() { // from class: l.۬ۤᩳ
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                C10235.m25891(this.f39075);
                return true;
            }
        };
        this.f30853 = 524289;
        this.f30857 = -1;
        this.f30852 = null;
        this.f30851 = C10567.f31701;
        m25890(attributeSet);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("parent", super.onSaveInstanceState());
        C10130 c10130 = new C10130();
        m30331(c10130, false);
        bundle.putByteArray("mt.memory.editor", c10130.m25427());
        return bundle;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            if (C5213.m14989(bundle, "mt.memory.editor")) {
                super.onRestoreInstanceState(bundle.getParcelable("parent"));
                byte[] bArrM14990 = C5213.m14990(bundle, "mt.memory.editor");
                if (bArrM14990 != null) {
                    mo25896(C12951.m31485(bArrM14990));
                    return;
                }
                return;
            }
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // l.C12392
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo25896(C12951 c12951) {
        super.mo25896(c12951);
        m25897(this.f30851);
    }

    @Override // l.C12392
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void mo25918() {
        super.mo25918();
        C22686 c22686 = this.f37245;
        c22686.f73275 = 0;
        c22686.f73268 = 0;
        if (!isInEditMode() && C21943.m49431()) {
            c22686.f73295 = -1433892728;
        }
        int i = c22686.f73287;
        c22686.f73287 = (i & 16777215) | (((int) (Color.alpha(i) * 0.5f)) << 24);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0065  */
    /* JADX WARN: Code duplicated, block: B:8:0x004c  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m25890(AttributeSet attributeSet) {
        boolean z;
        boolean z2;
        String string;
        m30494();
        setSaveEnabled(true);
        m30461();
        m30487(false);
        C22686 c22686 = this.f37245;
        c22686.f73263 = false;
        c22686.f73275 = 0;
        c22686.f73268 = 0;
        c22686.f73277 = 0;
        c22686.f73259 = 0;
        c22686.f73227 = false;
        c22686.f73265 = false;
        c22686.f73249 = false;
        c22686.f73226 = false;
        c22686.f73251 = c22686.f73298;
        c22686.f73273 = 0;
        c22686.f73289 /= 2.0f;
        c22686.f73240 = true;
        c22686.f73284 = false;
        c22686.f73256 = false;
        c22686.f73255 = true;
        if (isInEditMode()) {
            z = true;
        } else {
            int i = SharedPreferencesOnSharedPreferenceChangeListenerC21897.f70101;
            if (C4925.f15523.getBoolean("edit_show_ascii_control", false)) {
                z = true;
            } else {
                z = false;
            }
        }
        c22686.m24494(z);
        if (isInEditMode()) {
            z2 = true;
        } else {
            int i2 = SharedPreferencesOnSharedPreferenceChangeListenerC21897.f70101;
            if (C4925.f15523.getBoolean("edit_show_unicode_special", true)) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        c22686.m24497(z2);
        if (!isInEditMode() && C21943.m49431()) {
            c22686.f73295 = -1433892728;
        }
        int i3 = c22686.f73287;
        c22686.f73287 = (i3 & 16777215) | (((int) (Color.alpha(i3) * 0.5f)) << 24);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C19743.f63778);
        int i4 = typedArrayObtainStyledAttributes.getInt(4, -1);
        int i5 = typedArrayObtainStyledAttributes.getInt(3, -1);
        int i6 = typedArrayObtainStyledAttributes.getInt(5, -1);
        int i7 = i4 == -1 ? i5 : i4;
        int i8 = i6 == -1 ? i4 : i6;
        if (i7 == -1) {
            i7 = Integer.MAX_VALUE;
        }
        if (i8 == -1) {
            i8 = 0;
        }
        this.f30849 = i7;
        this.f30855 = i8;
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            m25894(typedArrayObtainStyledAttributes.getBoolean(6, true));
        } else {
            m25894(i4 <= 1 && i6 <= 1 && i5 <= 1);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(8, false)) {
            m30512(1);
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(0, -1.0f);
        if (dimension > 0.0f) {
            m30424(dimension);
        } else {
            m30475(18.0f);
        }
        m30477(typedArrayObtainStyledAttributes.getString(2));
        super.mo25910((CharSequence) typedArrayObtainStyledAttributes.getString(1));
        if (!isInEditMode() && (string = typedArrayObtainStyledAttributes.getString(9)) != null && !string.isEmpty()) {
            m30317(string, true);
        }
        m25913(typedArrayObtainStyledAttributes.getInt(10, 0));
        int i9 = typedArrayObtainStyledAttributes.getInt(7, -1);
        if (i9 != -1) {
            m25926(i9);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (isInEditMode()) {
            return;
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC21897.m49283();
    }

    @Override // l.C12392, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m30453();
        m30442();
    }

    @Override // l.C12392
    /* JADX INFO: renamed from: ۛܽ, reason: not valid java name and contains not printable characters */
    public final boolean mo25904() {
        return m30526() > 1000;
    }

    @Override // l.C12392, android.view.View
    public final void onDraw(Canvas canvas) {
        m25892(isAttachedToWindow() && mo25904());
        super.onDraw(canvas);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25891(C10235 c10235) {
        Rect rect = c10235.f30848;
        Rect rect2 = c10235.f30856;
        if (!c10235.mo25904()) {
            c10235.m25892(false);
            return;
        }
        if (!c10235.isShown() || !c10235.getLocalVisibleRect(rect2)) {
            rect2.setEmpty();
        }
        if (rect.equals(rect2)) {
            return;
        }
        rect.set(rect2);
        if (rect2.isEmpty()) {
            return;
        }
        c10235.invalidate();
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    private void m25892(boolean z) {
        if (this.f30847 == z) {
            return;
        }
        this.f30847 = z;
        this.f30848.setEmpty();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f30850;
        if (z) {
            viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
        } else {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
        }
    }

    @Override // l.C12392, android.view.View
    public final void onDetachedFromWindow() {
        m25892(false);
        super.onDetachedFromWindow();
    }

    /* JADX INFO: renamed from: ۡᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m25907() {
        Drawable background = getBackground();
        return (background instanceof C12351) && ((C12351) background).f37005 == 1;
    }

    /* JADX INFO: renamed from: ܺᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m25917() {
        Drawable background = getBackground();
        return (background instanceof C12351) && ((C12351) background).f37005 == 0;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m25913(int i) {
        Drawable background = getBackground();
        if ((background instanceof C12351) && ((C12351) background).f37005 == i) {
            return;
        }
        super.setBackground(new C12351(getContext(), i));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Drawable m25889(Context context, int i) {
        return new C12351(context, i);
    }

    /* JADX INFO: renamed from: ᩻ᩳ, reason: not valid java name and contains not printable characters */
    public final void m25927() {
        this.f37245.f73236 = false;
        this.f37315.m52261();
        invalidate();
    }

    /* JADX INFO: renamed from: ۜᩳ, reason: not valid java name and contains not printable characters */
    public final void m25905() {
        this.f37245.f73236 = true;
        this.f37315.m52261();
        invalidate();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), i);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            this.f30854 = -1;
        } else {
            if (mode != Integer.MIN_VALUE) {
                size = Integer.MAX_VALUE;
            }
            int iM30413 = this.f30855;
            if (iM30413 != this.f30849) {
                this.f37258.mo9783((defaultSize - getPaddingLeft()) - getPaddingRight());
                iM30413 = m30413();
                this.f30854 = iM30413;
                int i3 = this.f30849;
                if (iM30413 > i3 || iM30413 < (i3 = this.f30855)) {
                    iM30413 = i3;
                }
            } else {
                this.f30854 = -1;
            }
            if (iM30413 <= 0) {
                iM30413 = 1;
            }
            int iM24484 = ((int) ((this.f37245.m24484() * iM30413) + getPaddingTop() + getPaddingBottom())) + 1;
            if (iM24484 <= size) {
                size = iM24484;
            }
        }
        setMeasuredDimension(defaultSize, size);
    }

    @Override // l.C12392
    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void mo25908(int i) {
        int i2;
        int i3;
        if (getLayoutParams().height != -2 || (i2 = this.f30855) == (i3 = this.f30849)) {
            return;
        }
        int i4 = this.f30854;
        if (i4 != -1) {
            if (i4 <= i2 && i <= i2) {
                return;
            }
            if (i3 > 0 && i4 >= i3 && i >= i3) {
                return;
            }
        }
        requestLayout();
    }

    public C10235(Context context) {
        super(context, null);
        this.f30854 = -1;
        this.f30848 = new Rect();
        this.f30856 = new Rect();
        this.f30850 = new ViewTreeObserver.OnPreDrawListener() { // from class: l.۬ۤᩳ
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                C10235.m25891(this.f39075);
                return true;
            }
        };
        this.f30853 = 524289;
        this.f30857 = -1;
        this.f30852 = null;
        this.f30851 = C10567.f31701;
        m25890((AttributeSet) null);
    }

    @Override // l.C12392
    /* JADX INFO: renamed from: ۡܽ, reason: not valid java name and contains not printable characters */
    public final void mo25906() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null || layoutParams.height != -2) {
            return;
        }
        requestLayout();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m25926(int i) {
        NumberKeyListener dialerKeyListener;
        if (this.f30853 != i) {
            this.f30853 = i;
            boolean z = !((131087 & i) == 131073);
            if (this.f30846 != z) {
                this.f30846 = z;
                m30363();
            }
            int i2 = i & 15;
            if (i2 == 2) {
                dialerKeyListener = DigitsKeyListener.getInstance((i & 4096) != 0, (i & 8192) != 0);
            } else if (i2 == 4) {
                int i3 = i & 4080;
                if (i3 == 16) {
                    dialerKeyListener = DateKeyListener.getInstance();
                } else if (i3 == 32) {
                    dialerKeyListener = TimeKeyListener.getInstance();
                } else {
                    dialerKeyListener = DateTimeKeyListener.getInstance();
                }
            } else {
                dialerKeyListener = i2 == 3 ? DialerKeyListener.getInstance() : null;
            }
            if (this.f30852 != dialerKeyListener) {
                this.f30852 = dialerKeyListener;
                m25897(this.f30851);
            }
            if (isAttachedToWindow() && hasFocus()) {
                m30380();
            }
        }
    }

    @Override // l.C12392
    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public final int mo25893() {
        return this.f30853;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m25924(int i) {
        if (i != -1) {
            i |= 33554432;
        }
        this.f30857 = i;
        if (isAttachedToWindow() && hasFocus()) {
            m30380();
        }
    }

    @Override // l.C12392
    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public final int mo25920() {
        int i = this.f30857;
        if (i != -1) {
            return i;
        }
        if (this.f30846) {
            return focusSearch(130) != null ? 33554437 : 33554438;
        }
        return 33554433;
    }

    @Override // l.C12392
    /* JADX INFO: renamed from: ֫ܽ, reason: not valid java name and contains not printable characters */
    public final boolean mo25898() {
        return this.f30846;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m25894(boolean z) {
        if (this.f30846 != z) {
            this.f30846 = z;
            m30363();
            int i = this.f30853;
            if ((i & 15) == 1) {
                if (z) {
                    this.f30853 = (-131073) & i;
                } else {
                    this.f30853 = 131072 | i;
                }
            }
            if (isAttachedToWindow() && hasFocus()) {
                m30380();
            }
        }
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final void m25921(int i) {
        this.f30855 = i;
        this.f30849 = i;
        if (isAttachedToWindow()) {
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ۢᩳ, reason: not valid java name and contains not printable characters */
    public final int m25909() {
        return this.f30855;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final void m25901(int i) {
        this.f30855 = i;
        if (i > this.f30849) {
            this.f30849 = i;
        }
        if (isAttachedToWindow()) {
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ᩷ᩳ, reason: not valid java name and contains not printable characters */
    public final int m25923() {
        return this.f30849;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25903(int i) {
        this.f30849 = i;
        if (i < this.f30855) {
            this.f30855 = i;
        }
        if (isAttachedToWindow()) {
            requestLayout();
        }
    }

    @Override // l.C12392
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo25910(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        InterfaceC7785 interfaceC7785M30436 = m30436();
        interfaceC7785M30436.replace(0, interfaceC7785M30436.length(), charSequence);
        mo25919(0);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m25912(int i) {
        this.f37245.m50688(Integer.valueOf(i));
        invalidate();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m25911(Integer num) {
        this.f37245.m50688(num);
        invalidate();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m25915(int i) {
        this.f37245.m50685(Integer.valueOf(i));
        invalidate();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25895(Integer num) {
        this.f37245.m50685(num);
        invalidate();
    }

    @Override // l.C12392
    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final int mo25899() {
        Drawable background = getBackground();
        if (background instanceof C12351) {
            return ((C12351) background).f37015;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25897(InputFilter[] inputFilterArr) {
        if (inputFilterArr == null) {
            throw new IllegalArgumentException();
        }
        this.f30851 = inputFilterArr;
        NumberKeyListener numberKeyListener = this.f30852;
        if (numberKeyListener == null) {
            m30436().setFilters(inputFilterArr);
            return;
        }
        InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
        inputFilterArr2[0] = numberKeyListener;
        System.arraycopy(inputFilterArr, 0, inputFilterArr2, 1, inputFilterArr.length);
        m30436().setFilters(inputFilterArr2);
    }

    /* JADX INFO: renamed from: ۖᩳ, reason: not valid java name and contains not printable characters */
    public final void m25900() {
        mo25922(0, m30526());
    }

    @Override // l.C12392
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void mo25919(int i) {
        super.mo25919(i);
        m30349(i, false);
    }

    @Override // l.C12392
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo25922(int i, int i2) {
        super.mo25922(i, i2);
        m30430(false);
    }

    @Override // l.C12392
    /* JADX INFO: renamed from: ۬ۧ, reason: not valid java name and contains not printable characters */
    public boolean mo25914() {
        return SharedPreferencesOnSharedPreferenceChangeListenerC21897.m49284();
    }

    @Override // android.view.View
    public final int getBaseline() {
        return getPaddingTop() + ((int) this.f37245.m24501());
    }
}
