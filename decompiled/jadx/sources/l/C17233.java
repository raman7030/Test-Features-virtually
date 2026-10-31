package l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* JADX INFO: renamed from: l.ܿۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4VT */
/* JADX INFO: loaded from: classes5.dex */
public class C17233 extends MultiAutoCompleteTextView implements InterfaceC12091 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int[] f52847 = {R.attr.popupBackground};

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C1916 f52848;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C13725 f52849;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C22193 f52850;

    public C17233(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, bin.mt.plus.R.attr.MT_Protector);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17233(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C10034.m25207(context);
        C12855.m31289(getContext(), this);
        C22733 c22733M50796 = C22733.m50796(getContext(), attributeSet, f52847, i, 0);
        if (c22733M50796.m50802(0)) {
            setDropDownBackgroundDrawable(c22733M50796.m50815(0));
        }
        c22733M50796.m50813();
        C22193 c22193 = new C22193(this);
        this.f52850 = c22193;
        c22193.m49839(attributeSet, i);
        C1916 c1916 = new C1916(this);
        this.f52848 = c1916;
        c1916.m6321(attributeSet, i);
        c1916.m6314();
        C13725 c13725 = new C13725(this);
        this.f52849 = c13725;
        c13725.m33024(attributeSet, i);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerM33022 = c13725.m33022(keyListener);
        if (keyListenerM33022 == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerM33022);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C21311.m48345(getContext(), i));
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C22193 c22193 = this.f52850;
        if (c22193 != null) {
            c22193.m49836(i);
        }
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C22193 c22193 = this.f52850;
        if (c22193 != null) {
            c22193.m49843();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C22193 c22193 = this.f52850;
        if (c22193 != null) {
            c22193.m49835();
        }
        C1916 c1916 = this.f52848;
        if (c1916 != null) {
            c1916.m6314();
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1916 c1916 = this.f52848;
        if (c1916 != null) {
            c1916.m6318(context, i);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C1711.m5725(inputConnectionOnCreateInputConnection, editorInfo, this);
        return this.f52849.m33023(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.widget.TextView
    public final void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f52849.m33022(keyListener));
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1916 c1916 = this.f52848;
        if (c1916 != null) {
            c1916.m6314();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1916 c1916 = this.f52848;
        if (c1916 != null) {
            c1916.m6314();
        }
    }

    @Override // l.InterfaceC12091
    public final void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1916 c1916 = this.f52848;
        c1916.m6319(colorStateList);
        c1916.m6314();
    }

    @Override // l.InterfaceC12091
    public final void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1916 c1916 = this.f52848;
        c1916.m6320(mode);
        c1916.m6314();
    }
}
