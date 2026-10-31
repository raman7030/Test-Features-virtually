package l;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

/* JADX INFO: renamed from: l.ۗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5WL */
/* JADX INFO: loaded from: classes2.dex */
public class C3122 extends Spinner {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    @SuppressLint({"ResourceType"})
    public static final int[] f9746 = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final Context f9747;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC4533 f9748;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Rect f9749;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public SpinnerAdapter f9750;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean f9751;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractViewOnTouchListenerC13909 f9752;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C22193 f9753;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f9754;

    public C3122(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, bin.mt.plus.R.attr.MT_Protector);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    /* JADX WARN: Code duplicated, block: B:27:0x008c  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ba  */
    public C3122(Context context, AttributeSet attributeSet, int i) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] charSequenceArrM50805;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, i);
        this.f9749 = new Rect();
        C12855.m31289(getContext(), this);
        int[] iArr = C3390.f10719;
        C22733 c22733M50796 = C22733.m50796(context, attributeSet, iArr, i, 0);
        this.f9753 = new C22193(this);
        int iM50806 = c22733M50796.m50806(4, 0);
        if (iM50806 != 0) {
            this.f9747 = new C12729(context, iM50806);
        } else {
            this.f9747 = context;
        }
        int i2 = -1;
        TypedArray typedArray = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f9746, i, 0);
            try {
                if (typedArrayObtainStyledAttributes.hasValue(0)) {
                    i2 = typedArrayObtainStyledAttributes.getInt(0, 0);
                }
            } catch (Exception unused) {
                if (typedArrayObtainStyledAttributes != null) {
                }
                if (i2 != 0) {
                    DialogInterfaceOnClickListenerC0299 dialogInterfaceOnClickListenerC0299 = new DialogInterfaceOnClickListenerC0299(this);
                    this.f9748 = dialogInterfaceOnClickListenerC0299;
                    dialogInterfaceOnClickListenerC0299.mo1655(c22733M50796.m50807(2));
                } else if (i2 == 1) {
                    C21467 c21467 = new C21467(this, this.f9747, attributeSet, i);
                    C22733 c22733M50797 = C22733.m50796(this.f9747, attributeSet, iArr, i, 0);
                    this.f9754 = c22733M50797.m50811(3, -2);
                    c21467.setBackgroundDrawable(c22733M50797.m50815(1));
                    c21467.mo1655(c22733M50796.m50807(2));
                    c22733M50797.m50813();
                    this.f9748 = c21467;
                    this.f9752 = new C3828(this, this, c21467);
                }
                charSequenceArrM50805 = c22733M50796.m50805();
                if (charSequenceArrM50805 != null) {
                    ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, charSequenceArrM50805);
                    arrayAdapter.setDropDownViewResource(bin.mt.plus.R.layout.MT_Protector);
                    setAdapter((SpinnerAdapter) arrayAdapter);
                }
                c22733M50796.m50813();
                this.f9751 = true;
                spinnerAdapter = this.f9750;
                if (spinnerAdapter != null) {
                    setAdapter(spinnerAdapter);
                    this.f9750 = null;
                }
                this.f9753.m49839(attributeSet, i);
            } catch (Throwable th) {
                th = th;
                typedArray = typedArrayObtainStyledAttributes;
                if (typedArray != null) {
                    typedArray.recycle();
                }
                throw th;
            }
        } catch (Exception unused2) {
            typedArrayObtainStyledAttributes = null;
        } catch (Throwable th2) {
            th = th2;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (i2 != 0) {
            DialogInterfaceOnClickListenerC0299 dialogInterfaceOnClickListenerC02910 = new DialogInterfaceOnClickListenerC0299(this);
            this.f9748 = dialogInterfaceOnClickListenerC02910;
            dialogInterfaceOnClickListenerC02910.mo1655(c22733M50796.m50807(2));
        } else if (i2 == 1) {
            C21467 c21468 = new C21467(this, this.f9747, attributeSet, i);
            C22733 c22733M50798 = C22733.m50796(this.f9747, attributeSet, iArr, i, 0);
            this.f9754 = c22733M50798.m50811(3, -2);
            c21468.setBackgroundDrawable(c22733M50798.m50815(1));
            c21468.mo1655(c22733M50796.m50807(2));
            c22733M50798.m50813();
            this.f9748 = c21468;
            this.f9752 = new C3828(this, this, c21468);
        }
        charSequenceArrM50805 = c22733M50796.m50805();
        if (charSequenceArrM50805 != null) {
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, charSequenceArrM50805);
            arrayAdapter2.setDropDownViewResource(bin.mt.plus.R.layout.MT_Protector);
            setAdapter((SpinnerAdapter) arrayAdapter2);
        }
        c22733M50796.m50813();
        this.f9751 = true;
        spinnerAdapter = this.f9750;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f9750 = null;
        }
        this.f9753.m49839(attributeSet, i);
    }

    @Override // android.widget.Spinner
    public final Context getPopupContext() {
        return this.f9747;
    }

    @Override // android.widget.Spinner
    public final void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C21311.m48345(this.f9747, i));
    }

    @Override // android.widget.Spinner
    public final void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC4533 interfaceC4533 = this.f9748;
        if (interfaceC4533 != null) {
            interfaceC4533.setBackgroundDrawable(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public final Drawable getPopupBackground() {
        InterfaceC4533 interfaceC4533 = this.f9748;
        if (interfaceC4533 != null) {
            return interfaceC4533.getBackground();
        }
        return super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public final void setDropDownVerticalOffset(int i) {
        InterfaceC4533 interfaceC4533 = this.f9748;
        if (interfaceC4533 != null) {
            interfaceC4533.mo1657(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public final int getDropDownVerticalOffset() {
        InterfaceC4533 interfaceC4533 = this.f9748;
        if (interfaceC4533 != null) {
            return interfaceC4533.mo1658();
        }
        return super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public final void setDropDownHorizontalOffset(int i) {
        InterfaceC4533 interfaceC4533 = this.f9748;
        if (interfaceC4533 != null) {
            interfaceC4533.mo1659(i);
            interfaceC4533.mo1652(i);
        } else {
            super.setDropDownHorizontalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public final int getDropDownHorizontalOffset() {
        InterfaceC4533 interfaceC4533 = this.f9748;
        if (interfaceC4533 != null) {
            return interfaceC4533.mo1651();
        }
        return super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public final void setDropDownWidth(int i) {
        if (this.f9748 != null) {
            this.f9754 = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public final int getDropDownWidth() {
        if (this.f9748 != null) {
            return this.f9754;
        }
        return super.getDropDownWidth();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f9751) {
            this.f9750 = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC4533 interfaceC4533 = this.f9748;
        if (interfaceC4533 != null) {
            Context context = this.f9747;
            if (context == null) {
                context = getContext();
            }
            interfaceC4533.mo1654(new C5239(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC4533 interfaceC4533 = this.f9748;
        if (interfaceC4533 == null || !interfaceC4533.isShowing()) {
            return;
        }
        interfaceC4533.dismiss();
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewOnTouchListenerC13909 abstractViewOnTouchListenerC13909 = this.f9752;
        if (abstractViewOnTouchListenerC13909 == null || !abstractViewOnTouchListenerC13909.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f9748 == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m9499(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        InterfaceC4533 interfaceC4533 = this.f9748;
        if (interfaceC4533 != null) {
            if (interfaceC4533.isShowing()) {
                return true;
            }
            m9501();
            return true;
        }
        return super.performClick();
    }

    @Override // android.widget.Spinner
    public final void setPrompt(CharSequence charSequence) {
        InterfaceC4533 interfaceC4533 = this.f9748;
        if (interfaceC4533 != null) {
            interfaceC4533.mo1655(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // android.widget.Spinner
    public final CharSequence getPrompt() {
        InterfaceC4533 interfaceC4533 = this.f9748;
        return interfaceC4533 != null ? interfaceC4533.mo1656() : super.getPrompt();
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C22193 c22193 = this.f9753;
        if (c22193 != null) {
            c22193.m49836(i);
        }
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C22193 c22193 = this.f9753;
        if (c22193 != null) {
            c22193.m49843();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C22193 c22193 = this.f9753;
        if (c22193 != null) {
            c22193.m49835();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m9499(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        int iMax2 = 0;
        View view = null;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.f9749;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC4533 m9500() {
        return this.f9748;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m9501() {
        this.f9748.mo1653(getTextDirection(), getTextAlignment());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        C20056 c20056 = new C20056(super.onSaveInstanceState());
        InterfaceC4533 interfaceC4533 = this.f9748;
        c20056.f64973 = interfaceC4533 != null && interfaceC4533.isShowing();
        return c20056;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C20056 c20056 = (C20056) parcelable;
        super.onRestoreInstanceState(c20056.getSuperState());
        if (!c20056.f64973 || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC18645(this));
    }
}
