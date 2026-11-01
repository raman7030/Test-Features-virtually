package p067l;

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
public class C12096 extends C14146 {

    /* JADX INFO: renamed from: ۠ܿ */
    public static final /* synthetic */ int f33805 = 0;

    /* JADX INFO: renamed from: ֡ܿ */
    public boolean f33806;

    /* JADX INFO: renamed from: ֨ܿ */
    public boolean f33807;

    /* JADX INFO: renamed from: ۖܿ */
    public final Rect f33808;

    /* JADX INFO: renamed from: ۘܿ */
    public int f33809;

    /* JADX INFO: renamed from: ۚܿ */
    public final ViewTreeObserver.OnPreDrawListener f33810;

    /* JADX INFO: renamed from: ۜܿ */
    public InputFilter[] f33811;

    /* JADX INFO: renamed from: ۡܿ */
    public NumberKeyListener f33812;

    /* JADX INFO: renamed from: ۢܿ */
    public int f33813;

    /* JADX INFO: renamed from: ܺܿ */
    public int f33814;

    /* JADX INFO: renamed from: ᩴܿ */
    public int f33815;

    /* JADX INFO: renamed from: ᩵ܿ */
    public final Rect f33816;

    /* JADX INFO: renamed from: ᩷ܿ */
    public int f33817;

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        return true;
    }

    @Override // p067l.C14146
    /* JADX INFO: renamed from: ۘܽ */
    public final boolean mo27924() {
        return false;
    }

    @Override // p067l.C14146
    /* JADX INFO: renamed from: ܶۧ */
    public final boolean mo27938() {
        return false;
    }

    @Override // p067l.C14146
    /* JADX INFO: renamed from: ᩸ܽ */
    public final boolean mo27947() {
        return true;
    }

    public C12096(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33814 = -1;
        this.f33808 = new Rect();
        this.f33816 = new Rect();
        this.f33810 = new ViewTreeObserver.OnPreDrawListener() { // from class: l.۬ۤᩳ
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                C12096.m27913(this.f42119);
                return true;
            }
        };
        this.f33813 = 524289;
        this.f33817 = -1;
        this.f33812 = null;
        this.f33811 = C12412.f34665;
        m27912(attributeSet);
    }

    public C12096(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33814 = -1;
        this.f33808 = new Rect();
        this.f33816 = new Rect();
        this.f33810 = new ViewTreeObserver.OnPreDrawListener() { // from class: l.۬ۤᩳ
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                C12096.m27913(this.f42119);
                return true;
            }
        };
        this.f33813 = 524289;
        this.f33817 = -1;
        this.f33812 = null;
        this.f33811 = C12412.f34665;
        m27912(attributeSet);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("parent", super.onSaveInstanceState());
        C11996 c11996 = new C11996();
        m32395(c11996, false);
        bundle.putByteArray("mt.memory.editor", c11996.m27447());
        return bundle;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            if (C7323.m16899(bundle, "mt.memory.editor")) {
                super.onRestoreInstanceState(bundle.getParcelable("parent"));
                byte[] bArrM16900 = C7323.m16900(bundle, "mt.memory.editor");
                if (bArrM16900 != null) {
                    mo27918(C14677.m33572(bArrM16900));
                    return;
                }
                return;
            }
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // p067l.C14146
    /* JADX INFO: renamed from: ֫ */
    public final void mo27918(C14677 c14677) {
        super.mo27918(c14677);
        m27919(this.f33811);
    }

    @Override // p067l.C14146
    /* JADX INFO: renamed from: ܽ */
    public void mo27940() {
        super.mo27940();
        C23929 c23929 = this.f40262;
        c23929.f76000 = 0;
        c23929.f75993 = 0;
        if (!isInEditMode() && C23223.m51768()) {
            c23929.f76020 = -1433892728;
        }
        int i = c23929.f76012;
        c23929.f76012 = (i & 16777215) | (((int) (Color.alpha(i) * 0.5f)) << 24);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0065  */
    /* JADX WARN: Code duplicated, block: B:8:0x004c  */
    /* JADX INFO: renamed from: ֫ */
    private void m27912(AttributeSet attributeSet) {
        boolean z;
        boolean z2;
        String string;
        m32558();
        setSaveEnabled(true);
        m32525();
        m32551(false);
        C23929 c23929 = this.f40262;
        c23929.f75988 = false;
        c23929.f76000 = 0;
        c23929.f75993 = 0;
        c23929.f76002 = 0;
        c23929.f75984 = 0;
        c23929.f75952 = false;
        c23929.f75990 = false;
        c23929.f75974 = false;
        c23929.f75951 = false;
        c23929.f75976 = c23929.f76023;
        c23929.f75998 = 0;
        c23929.f76014 /= 2.0f;
        c23929.f75965 = true;
        c23929.f76009 = false;
        c23929.f75981 = false;
        c23929.f75980 = true;
        if (isInEditMode()) {
            z = true;
        } else {
            int i = SharedPreferencesOnSharedPreferenceChangeListenerC23180.f72813;
            if (C7050.f18355.getBoolean("edit_show_ascii_control", false)) {
                z = true;
            } else {
                z = false;
            }
        }
        c23929.m26506(z);
        if (isInEditMode()) {
            z2 = true;
        } else {
            int i2 = SharedPreferencesOnSharedPreferenceChangeListenerC23180.f72813;
            if (C7050.f18355.getBoolean("edit_show_unicode_special", true)) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        c23929.m26509(z2);
        if (!isInEditMode() && C23223.m51768()) {
            c23929.f76020 = -1433892728;
        }
        int i3 = c23929.f76012;
        c23929.f76012 = (i3 & 16777215) | (((int) (Color.alpha(i3) * 0.5f)) << 24);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C21133.f66414);
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
        this.f33809 = i7;
        this.f33815 = i8;
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            m27916(typedArrayObtainStyledAttributes.getBoolean(6, true));
        } else {
            m27916(i4 <= 1 && i6 <= 1 && i5 <= 1);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(8, false)) {
            m32576(1);
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(0, -1.0f);
        if (dimension > 0.0f) {
            m32488(dimension);
        } else {
            m32539(18.0f);
        }
        m32541(typedArrayObtainStyledAttributes.getString(2));
        super.mo27932((CharSequence) typedArrayObtainStyledAttributes.getString(1));
        if (!isInEditMode() && (string = typedArrayObtainStyledAttributes.getString(9)) != null && !string.isEmpty()) {
            m32381(string, true);
        }
        m27935(typedArrayObtainStyledAttributes.getInt(10, 0));
        int i9 = typedArrayObtainStyledAttributes.getInt(7, -1);
        if (i9 != -1) {
            m27948(i9);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (isInEditMode()) {
            return;
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC23180.m51636();
    }

    @Override // p067l.C14146, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m32517();
        m32506();
    }

    @Override // p067l.C14146
    /* JADX INFO: renamed from: ۛܽ */
    public final boolean mo27926() {
        return m32590() > 1000;
    }

    @Override // p067l.C14146, android.view.View
    public final void onDraw(Canvas canvas) {
        m27914(isAttachedToWindow() && mo27926());
        super.onDraw(canvas);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m27913(C12096 c12096) {
        Rect rect = c12096.f33808;
        Rect rect2 = c12096.f33816;
        if (!c12096.mo27926()) {
            c12096.m27914(false);
            return;
        }
        if (!c12096.isShown() || !c12096.getLocalVisibleRect(rect2)) {
            rect2.setEmpty();
        }
        if (rect.equals(rect2)) {
            return;
        }
        rect.set(rect2);
        if (rect2.isEmpty()) {
            return;
        }
        c12096.invalidate();
    }

    /* JADX INFO: renamed from: ۠ */
    private void m27914(boolean z) {
        if (this.f33807 == z) {
            return;
        }
        this.f33807 = z;
        this.f33808.setEmpty();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f33810;
        if (z) {
            viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
        } else {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
        }
    }

    @Override // p067l.C14146, android.view.View
    public final void onDetachedFromWindow() {
        m27914(false);
        super.onDetachedFromWindow();
    }

    /* JADX INFO: renamed from: ۡᩳ */
    public final boolean m27929() {
        Drawable background = getBackground();
        return (background instanceof C14107) && ((C14107) background).f40017 == 1;
    }

    /* JADX INFO: renamed from: ܺᩳ */
    public final boolean m27939() {
        Drawable background = getBackground();
        return (background instanceof C14107) && ((C14107) background).f40017 == 0;
    }

    /* JADX INFO: renamed from: ۬ */
    public final void m27935(int i) {
        Drawable background = getBackground();
        if ((background instanceof C14107) && ((C14107) background).f40017 == i) {
            return;
        }
        super.setBackground(new C14107(getContext(), i));
    }

    /* JADX INFO: renamed from: ֫ */
    public static Drawable m27911(Context context, int i) {
        return new C14107(context, i);
    }

    /* JADX INFO: renamed from: ᩻ᩳ */
    public final void m27949() {
        this.f40262.f75961 = false;
        this.f40332.m54665();
        invalidate();
    }

    /* JADX INFO: renamed from: ۜᩳ */
    public final void m27927() {
        this.f40262.f75961 = true;
        this.f40332.m54665();
        invalidate();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), i);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            this.f33814 = -1;
        } else {
            if (mode != Integer.MIN_VALUE) {
                size = Integer.MAX_VALUE;
            }
            int iM32477 = this.f33815;
            if (iM32477 != this.f33809) {
                this.f40275.mo11827((defaultSize - getPaddingLeft()) - getPaddingRight());
                iM32477 = m32477();
                this.f33814 = iM32477;
                int i3 = this.f33809;
                if (iM32477 > i3 || iM32477 < (i3 = this.f33815)) {
                    iM32477 = i3;
                }
            } else {
                this.f33814 = -1;
            }
            if (iM32477 <= 0) {
                iM32477 = 1;
            }
            int iM26496 = ((int) ((this.f40262.m26496() * iM32477) + getPaddingTop() + getPaddingBottom())) + 1;
            if (iM26496 <= size) {
                size = iM26496;
            }
        }
        setMeasuredDimension(defaultSize, size);
    }

    @Override // p067l.C14146
    /* JADX INFO: renamed from: ۢ */
    public final void mo27930(int i) {
        int i2;
        int i3;
        if (getLayoutParams().height != -2 || (i2 = this.f33815) == (i3 = this.f33809)) {
            return;
        }
        int i4 = this.f33814;
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

    public C12096(Context context) {
        super(context, null);
        this.f33814 = -1;
        this.f33808 = new Rect();
        this.f33816 = new Rect();
        this.f33810 = new ViewTreeObserver.OnPreDrawListener() { // from class: l.۬ۤᩳ
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                C12096.m27913(this.f42119);
                return true;
            }
        };
        this.f33813 = 524289;
        this.f33817 = -1;
        this.f33812 = null;
        this.f33811 = C12412.f34665;
        m27912((AttributeSet) null);
    }

    @Override // p067l.C14146
    /* JADX INFO: renamed from: ۡܽ */
    public final void mo27928() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null || layoutParams.height != -2) {
            return;
        }
        requestLayout();
    }

    /* JADX INFO: renamed from: ᩹ */
    public final void m27948(int i) {
        NumberKeyListener dialerKeyListener;
        if (this.f33813 != i) {
            this.f33813 = i;
            boolean z = !((131087 & i) == 131073);
            if (this.f33806 != z) {
                this.f33806 = z;
                m32427();
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
            if (this.f33812 != dialerKeyListener) {
                this.f33812 = dialerKeyListener;
                m27919(this.f33811);
            }
            if (isAttachedToWindow() && hasFocus()) {
                m32444();
            }
        }
    }

    @Override // p067l.C14146
    /* JADX INFO: renamed from: ֡֫ */
    public final int mo27915() {
        return this.f33813;
    }

    /* JADX INFO: renamed from: ᩸ */
    public final void m27946(int i) {
        if (i != -1) {
            i |= 33554432;
        }
        this.f33817 = i;
        if (isAttachedToWindow() && hasFocus()) {
            m32444();
        }
    }

    @Override // p067l.C14146
    /* JADX INFO: renamed from: ᩵֫ */
    public final int mo27942() {
        int i = this.f33817;
        if (i != -1) {
            return i;
        }
        if (this.f33806) {
            return focusSearch(130) != null ? 33554437 : 33554438;
        }
        return 33554433;
    }

    @Override // p067l.C14146
    /* JADX INFO: renamed from: ֫ܽ */
    public final boolean mo27920() {
        return this.f33806;
    }

    /* JADX INFO: renamed from: ֨ */
    public final void m27916(boolean z) {
        if (this.f33806 != z) {
            this.f33806 = z;
            m32427();
            int i = this.f33813;
            if ((i & 15) == 1) {
                if (z) {
                    this.f33813 = (-131073) & i;
                } else {
                    this.f33813 = 131072 | i;
                }
            }
            if (isAttachedToWindow() && hasFocus()) {
                m32444();
            }
        }
    }

    /* JADX INFO: renamed from: ᩶ */
    public final void m27943(int i) {
        this.f33815 = i;
        this.f33809 = i;
        if (isAttachedToWindow()) {
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ۢᩳ */
    public final int m27931() {
        return this.f33815;
    }

    /* JADX INFO: renamed from: ۗ */
    public final void m27923(int i) {
        this.f33815 = i;
        if (i > this.f33809) {
            this.f33809 = i;
        }
        if (isAttachedToWindow()) {
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ᩷ᩳ */
    public final int m27945() {
        return this.f33809;
    }

    /* JADX INFO: renamed from: ۙ */
    public final void m27925(int i) {
        this.f33809 = i;
        if (i < this.f33815) {
            this.f33815 = i;
        }
        if (isAttachedToWindow()) {
            requestLayout();
        }
    }

    @Override // p067l.C14146
    /* JADX INFO: renamed from: ۧ */
    public final void mo27932(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        InterfaceC9768 interfaceC9768M32500 = m32500();
        interfaceC9768M32500.replace(0, interfaceC9768M32500.length(), charSequence);
        mo27941(0);
    }

    /* JADX INFO: renamed from: ۫ */
    public final void m27934(int i) {
        this.f40262.m53014(Integer.valueOf(i));
        invalidate();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m27933(Integer num) {
        this.f40262.m53014(num);
        invalidate();
    }

    /* JADX INFO: renamed from: ܶ */
    public final void m27937(int i) {
        this.f40262.m53011(Integer.valueOf(i));
        invalidate();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m27917(Integer num) {
        this.f40262.m53011(num);
        invalidate();
    }

    @Override // p067l.C14146
    /* JADX INFO: renamed from: ۖ֫ */
    public final int mo27921() {
        Drawable background = getBackground();
        if (background instanceof C14107) {
            return ((C14107) background).f40027;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m27919(InputFilter[] inputFilterArr) {
        if (inputFilterArr == null) {
            throw new IllegalArgumentException();
        }
        this.f33811 = inputFilterArr;
        NumberKeyListener numberKeyListener = this.f33812;
        if (numberKeyListener == null) {
            m32500().setFilters(inputFilterArr);
            return;
        }
        InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
        inputFilterArr2[0] = numberKeyListener;
        System.arraycopy(inputFilterArr, 0, inputFilterArr2, 1, inputFilterArr.length);
        m32500().setFilters(inputFilterArr2);
    }

    /* JADX INFO: renamed from: ۖᩳ */
    public final void m27922() {
        mo27944(0, m32590());
    }

    @Override // p067l.C14146
    /* JADX INFO: renamed from: ᩴ */
    public final void mo27941(int i) {
        super.mo27941(i);
        m32413(i, false);
    }

    @Override // p067l.C14146
    /* JADX INFO: renamed from: ᩷ */
    public final void mo27944(int i, int i2) {
        super.mo27944(i, i2);
        m32494(false);
    }

    @Override // p067l.C14146
    /* JADX INFO: renamed from: ۬ۧ */
    public boolean mo27936() {
        return SharedPreferencesOnSharedPreferenceChangeListenerC23180.m51637();
    }

    @Override // android.view.View
    public final int getBaseline() {
        return getPaddingTop() + ((int) this.f40262.m26513());
    }
}
