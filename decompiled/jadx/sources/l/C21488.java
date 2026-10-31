package l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* JADX INFO: renamed from: l.᩸ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 168V */
/* JADX INFO: loaded from: classes5.dex */
public class C21488 extends AutoCompleteTextView implements InterfaceC12091 {
    public static final int[] TINT_ATTRS = {R.attr.popupBackground};
    public final C13725 mAppCompatEmojiEditTextHelper;
    public final C22193 mBackgroundTintHelper;
    public final C1916 mTextHelper;

    public C21488(Context context) {
        this(context, null);
    }

    public C21488(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, bin.mt.plus.R.attr.MT_Protector);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21488(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C10034.m25207(context);
        C12855.m31289(getContext(), this);
        C22733 c22733M50796 = C22733.m50796(getContext(), attributeSet, TINT_ATTRS, i, 0);
        if (c22733M50796.m50802(0)) {
            setDropDownBackgroundDrawable(c22733M50796.m50815(0));
        }
        c22733M50796.m50813();
        C22193 c22193 = new C22193(this);
        this.mBackgroundTintHelper = c22193;
        c22193.m49839(attributeSet, i);
        C1916 c1916 = new C1916(this);
        this.mTextHelper = c1916;
        c1916.m6321(attributeSet, i);
        c1916.m6314();
        C13725 c13725 = new C13725(this);
        this.mAppCompatEmojiEditTextHelper = c13725;
        c13725.m33024(attributeSet, i);
        initEmojiKeyListener(c13725);
    }

    public void initEmojiKeyListener(C13725 c13725) {
        KeyListener keyListener = getKeyListener();
        c13725.getClass();
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
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C21311.m48345(getContext(), i));
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C22193 c22193 = this.mBackgroundTintHelper;
        if (c22193 != null) {
            c22193.m49836(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C22193 c22193 = this.mBackgroundTintHelper;
        if (c22193 != null) {
            c22193.m49843();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C22193 c22193 = this.mBackgroundTintHelper;
        if (c22193 != null) {
            c22193.m49841(colorStateList);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C22193 c22193 = this.mBackgroundTintHelper;
        if (c22193 != null) {
            return c22193.m49840();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C22193 c22193 = this.mBackgroundTintHelper;
        if (c22193 != null) {
            c22193.m49838(mode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C22193 c22193 = this.mBackgroundTintHelper;
        if (c22193 != null) {
            return c22193.m49842();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C22193 c22193 = this.mBackgroundTintHelper;
        if (c22193 != null) {
            c22193.m49835();
        }
        C1916 c1916 = this.mTextHelper;
        if (c1916 != null) {
            c1916.m6314();
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1916 c1916 = this.mTextHelper;
        if (c1916 != null) {
            c1916.m6318(context, i);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C1711.m5725(inputConnectionOnCreateInputConnection, editorInfo, this);
        return this.mAppCompatEmojiEditTextHelper.m33023(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C4330.m12987(callback, this));
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C4330.m12986(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.mAppCompatEmojiEditTextHelper.m33022(keyListener));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.mAppCompatEmojiEditTextHelper.m33025(z);
    }

    public boolean isEmojiCompatEnabled() {
        return this.mAppCompatEmojiEditTextHelper.m33026();
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1916 c1916 = this.mTextHelper;
        if (c1916 != null) {
            c1916.m6314();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1916 c1916 = this.mTextHelper;
        if (c1916 != null) {
            c1916.m6314();
        }
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.m6325();
    }

    @Override // l.InterfaceC12091
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.m6319(colorStateList);
        this.mTextHelper.m6314();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.m6332();
    }

    @Override // l.InterfaceC12091
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.m6320(mode);
        this.mTextHelper.m6314();
    }
}
