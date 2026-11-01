package p067l;

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

/* JADX INFO: renamed from: l.ܿۡ */
/* JADX INFO: compiled from: A4VT */
/* JADX INFO: loaded from: classes5.dex */
public class C1697 extends MultiAutoCompleteTextView implements InterfaceC13859 {

    /* JADX INFO: renamed from: ۙ */
    public static final int[] f56030 = {R.attr.popupBackground};

    /* JADX INFO: renamed from: ᩶ */
    public final C0937 f56031;

    /* JADX INFO: renamed from: ᩸ */
    public final C1523 f56032;

    /* JADX INFO: renamed from: ᩹ */
    public final C1943 f56033;

    public C1697(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, bin.p000mt.plus.R.attr.MT_Protector);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1697(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C1340.m27224(context);
        C1480.m33375(getContext(), this);
        C1970 c1970M53129 = C1970.m53129(getContext(), attributeSet, f56030, i, 0);
        if (c1970M53129.m53135(0)) {
            setDropDownBackgroundDrawable(c1970M53129.m53148(0));
        }
        c1970M53129.m53146();
        C1943 c1943 = new C1943(this);
        this.f56033 = c1943;
        c1943.m52166(attributeSet, i);
        C0937 c0937 = new C0937(this);
        this.f56031 = c0937;
        c0937.m8494(attributeSet, i);
        c0937.m8487();
        C1523 c1523 = new C1523(this);
        this.f56032 = c1523;
        c1523.m35138(attributeSet, i);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerM35136 = c1523.m35136(keyListener);
        if (keyListenerM35136 == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerM35136);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C22622.m50680(getContext(), i));
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1943 c1943 = this.f56033;
        if (c1943 != null) {
            c1943.m52163(i);
        }
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1943 c1943 = this.f56033;
        if (c1943 != null) {
            c1943.m52170();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1943 c1943 = this.f56033;
        if (c1943 != null) {
            c1943.m52162();
        }
        C0937 c0937 = this.f56031;
        if (c0937 != null) {
            c0937.m8487();
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0937 c0937 = this.f56031;
        if (c0937 != null) {
            c0937.m8491(context, i);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0927.m7951(inputConnectionOnCreateInputConnection, editorInfo, this);
        return this.f56032.m35137(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.widget.TextView
    public final void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f56032.m35136(keyListener));
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0937 c0937 = this.f56031;
        if (c0937 != null) {
            c0937.m8487();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0937 c0937 = this.f56031;
        if (c0937 != null) {
            c0937.m8487();
        }
    }

    @Override // p067l.InterfaceC13859
    public final void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0937 c0937 = this.f56031;
        c0937.m8492(colorStateList);
        c0937.m8487();
    }

    @Override // p067l.InterfaceC13859
    public final void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0937 c0937 = this.f56031;
        c0937.m8493(mode);
        c0937.m8487();
    }
}
