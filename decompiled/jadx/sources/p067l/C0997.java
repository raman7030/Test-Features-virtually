package p067l;

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

/* JADX INFO: renamed from: l.ۗۡ */
/* JADX INFO: compiled from: N5WL */
/* JADX INFO: loaded from: classes2.dex */
public class C0997 extends Spinner {

    /* JADX INFO: renamed from: ۛ */
    @SuppressLint({"ResourceType"})
    public static final int[] f12549 = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: ۗ */
    public final Context f12550;

    /* JADX INFO: renamed from: ۙ */
    public InterfaceC1067 f12551;

    /* JADX INFO: renamed from: ۤ */
    public final Rect f12552;

    /* JADX INFO: renamed from: ۫ */
    public SpinnerAdapter f12553;

    /* JADX INFO: renamed from: ۬ */
    public final boolean f12554;

    /* JADX INFO: renamed from: ᩶ */
    public AbstractViewOnTouchListenerC1532 f12555;

    /* JADX INFO: renamed from: ᩸ */
    public final C1943 f12556;

    /* JADX INFO: renamed from: ᩹ */
    public int f12557;

    public C0997(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, bin.p000mt.plus.R.attr.MT_Protector);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    /* JADX WARN: Code duplicated, block: B:27:0x008c  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ba  */
    public C0997(Context context, AttributeSet attributeSet, int i) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] charSequenceArrM53138;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, i);
        this.f12552 = new Rect();
        C1480.m33375(getContext(), this);
        int[] iArr = C1010.f13526;
        C1970 c1970M53129 = C1970.m53129(context, attributeSet, iArr, i, 0);
        this.f12556 = new C1943(this);
        int iM53139 = c1970M53129.m53139(4, 0);
        if (iM53139 != 0) {
            this.f12550 = new C1473(context, iM53139);
        } else {
            this.f12550 = context;
        }
        int i2 = -1;
        TypedArray typedArray = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f12549, i, 0);
            try {
                if (typedArrayObtainStyledAttributes.hasValue(0)) {
                    i2 = typedArrayObtainStyledAttributes.getInt(0, 0);
                }
            } catch (Exception unused) {
                if (typedArrayObtainStyledAttributes != null) {
                }
                if (i2 != 0) {
                    DialogInterfaceOnClickListenerC0857 dialogInterfaceOnClickListenerC0857 = new DialogInterfaceOnClickListenerC0857(this);
                    this.f12551 = dialogInterfaceOnClickListenerC0857;
                    dialogInterfaceOnClickListenerC0857.mo4053(c1970M53129.m53140(2));
                } else if (i2 == 1) {
                    C1907 c1907 = new C1907(this, this.f12550, attributeSet, i);
                    C1970 c1970M531210 = C1970.m53129(this.f12550, attributeSet, iArr, i, 0);
                    this.f12557 = c1970M531210.m53144(3, -2);
                    c1907.setBackgroundDrawable(c1970M531210.m53148(1));
                    c1907.mo4053(c1970M53129.m53140(2));
                    c1970M531210.m53146();
                    this.f12551 = c1907;
                    this.f12555 = new C1032(this, this, c1907);
                }
                charSequenceArrM53138 = c1970M53129.m53138();
                if (charSequenceArrM53138 != null) {
                    ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, charSequenceArrM53138);
                    arrayAdapter.setDropDownViewResource(bin.p000mt.plus.R.layout.MT_Protector);
                    setAdapter((SpinnerAdapter) arrayAdapter);
                }
                c1970M53129.m53146();
                this.f12554 = true;
                spinnerAdapter = this.f12553;
                if (spinnerAdapter != null) {
                    setAdapter(spinnerAdapter);
                    this.f12553 = null;
                }
                this.f12556.m52166(attributeSet, i);
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
            DialogInterfaceOnClickListenerC0857 dialogInterfaceOnClickListenerC0858 = new DialogInterfaceOnClickListenerC0857(this);
            this.f12551 = dialogInterfaceOnClickListenerC0858;
            dialogInterfaceOnClickListenerC0858.mo4053(c1970M53129.m53140(2));
        } else if (i2 == 1) {
            C1907 c1908 = new C1907(this, this.f12550, attributeSet, i);
            C1970 c1970M531211 = C1970.m53129(this.f12550, attributeSet, iArr, i, 0);
            this.f12557 = c1970M531211.m53144(3, -2);
            c1908.setBackgroundDrawable(c1970M531211.m53148(1));
            c1908.mo4053(c1970M53129.m53140(2));
            c1970M531211.m53146();
            this.f12551 = c1908;
            this.f12555 = new C1032(this, this, c1908);
        }
        charSequenceArrM53138 = c1970M53129.m53138();
        if (charSequenceArrM53138 != null) {
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, charSequenceArrM53138);
            arrayAdapter2.setDropDownViewResource(bin.p000mt.plus.R.layout.MT_Protector);
            setAdapter((SpinnerAdapter) arrayAdapter2);
        }
        c1970M53129.m53146();
        this.f12554 = true;
        spinnerAdapter = this.f12553;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f12553 = null;
        }
        this.f12556.m52166(attributeSet, i);
    }

    @Override // android.widget.Spinner
    public final Context getPopupContext() {
        return this.f12550;
    }

    @Override // android.widget.Spinner
    public final void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C22622.m50680(this.f12550, i));
    }

    @Override // android.widget.Spinner
    public final void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC1067 interfaceC1067 = this.f12551;
        if (interfaceC1067 != null) {
            interfaceC1067.setBackgroundDrawable(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public final Drawable getPopupBackground() {
        InterfaceC1067 interfaceC1067 = this.f12551;
        if (interfaceC1067 != null) {
            return interfaceC1067.getBackground();
        }
        return super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public final void setDropDownVerticalOffset(int i) {
        InterfaceC1067 interfaceC1067 = this.f12551;
        if (interfaceC1067 != null) {
            interfaceC1067.mo4055(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public final int getDropDownVerticalOffset() {
        InterfaceC1067 interfaceC1067 = this.f12551;
        if (interfaceC1067 != null) {
            return interfaceC1067.mo4056();
        }
        return super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public final void setDropDownHorizontalOffset(int i) {
        InterfaceC1067 interfaceC1067 = this.f12551;
        if (interfaceC1067 != null) {
            interfaceC1067.mo4057(i);
            interfaceC1067.mo4050(i);
        } else {
            super.setDropDownHorizontalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public final int getDropDownHorizontalOffset() {
        InterfaceC1067 interfaceC1067 = this.f12551;
        if (interfaceC1067 != null) {
            return interfaceC1067.mo4049();
        }
        return super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public final void setDropDownWidth(int i) {
        if (this.f12551 != null) {
            this.f12557 = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public final int getDropDownWidth() {
        if (this.f12551 != null) {
            return this.f12557;
        }
        return super.getDropDownWidth();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f12554) {
            this.f12553 = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC1067 interfaceC1067 = this.f12551;
        if (interfaceC1067 != null) {
            Context context = this.f12550;
            if (context == null) {
                context = getContext();
            }
            interfaceC1067.mo4052(new C1102(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC1067 interfaceC1067 = this.f12551;
        if (interfaceC1067 == null || !interfaceC1067.isShowing()) {
            return;
        }
        interfaceC1067.dismiss();
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewOnTouchListenerC1532 abstractViewOnTouchListenerC1532 = this.f12555;
        if (abstractViewOnTouchListenerC1532 == null || !abstractViewOnTouchListenerC1532.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f12551 == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m11542(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        InterfaceC1067 interfaceC1067 = this.f12551;
        if (interfaceC1067 != null) {
            if (interfaceC1067.isShowing()) {
                return true;
            }
            m11544();
            return true;
        }
        return super.performClick();
    }

    @Override // android.widget.Spinner
    public final void setPrompt(CharSequence charSequence) {
        InterfaceC1067 interfaceC1067 = this.f12551;
        if (interfaceC1067 != null) {
            interfaceC1067.mo4053(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // android.widget.Spinner
    public final CharSequence getPrompt() {
        InterfaceC1067 interfaceC1067 = this.f12551;
        return interfaceC1067 != null ? interfaceC1067.mo4054() : super.getPrompt();
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1943 c1943 = this.f12556;
        if (c1943 != null) {
            c1943.m52163(i);
        }
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1943 c1943 = this.f12556;
        if (c1943 != null) {
            c1943.m52170();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1943 c1943 = this.f12556;
        if (c1943 != null) {
            c1943.m52162();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m11542(SpinnerAdapter spinnerAdapter, Drawable drawable) {
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
        Rect rect = this.f12552;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC1067 m11543() {
        return this.f12551;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m11544() {
        this.f12551.mo4051(getTextDirection(), getTextAlignment());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        C1837 c1837 = new C1837(super.onSaveInstanceState());
        InterfaceC1067 interfaceC1067 = this.f12551;
        c1837.f67614 = interfaceC1067 != null && interfaceC1067.isShowing();
        return c1837;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C1837 c1837 = (C1837) parcelable;
        super.onRestoreInstanceState(c1837.getSuperState());
        if (!c1837.f67614 || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC1767(this));
    }
}
