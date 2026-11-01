package p067l;

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

/* JADX INFO: renamed from: l.᩸ۢ */
/* JADX INFO: compiled from: 168V */
/* JADX INFO: loaded from: classes5.dex */
public class C1908 extends AutoCompleteTextView implements InterfaceC13859 {
    public static final int[] TINT_ATTRS = {R.attr.popupBackground};
    public final C1523 mAppCompatEmojiEditTextHelper;
    public final C1943 mBackgroundTintHelper;
    public final C0937 mTextHelper;

    public C1908(Context context) {
        this(context, null);
    }

    public C1908(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, bin.p000mt.plus.R.attr.MT_Protector);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1908(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C1340.m27224(context);
        C1480.m33375(getContext(), this);
        C1970 c1970M53129 = C1970.m53129(getContext(), attributeSet, TINT_ATTRS, i, 0);
        if (c1970M53129.m53135(0)) {
            setDropDownBackgroundDrawable(c1970M53129.m53148(0));
        }
        c1970M53129.m53146();
        C1943 c1943 = new C1943(this);
        this.mBackgroundTintHelper = c1943;
        c1943.m52166(attributeSet, i);
        C0937 c0937 = new C0937(this);
        this.mTextHelper = c0937;
        c0937.m8494(attributeSet, i);
        c0937.m8487();
        C1523 c1523 = new C1523(this);
        this.mAppCompatEmojiEditTextHelper = c1523;
        c1523.m35138(attributeSet, i);
        initEmojiKeyListener(c1523);
    }

    public void initEmojiKeyListener(C1523 c1523) {
        KeyListener keyListener = getKeyListener();
        c1523.getClass();
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
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C22622.m50680(getContext(), i));
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1943 c1943 = this.mBackgroundTintHelper;
        if (c1943 != null) {
            c1943.m52163(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1943 c1943 = this.mBackgroundTintHelper;
        if (c1943 != null) {
            c1943.m52170();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1943 c1943 = this.mBackgroundTintHelper;
        if (c1943 != null) {
            c1943.m52168(colorStateList);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1943 c1943 = this.mBackgroundTintHelper;
        if (c1943 != null) {
            return c1943.m52167();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1943 c1943 = this.mBackgroundTintHelper;
        if (c1943 != null) {
            c1943.m52165(mode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1943 c1943 = this.mBackgroundTintHelper;
        if (c1943 != null) {
            return c1943.m52169();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1943 c1943 = this.mBackgroundTintHelper;
        if (c1943 != null) {
            c1943.m52162();
        }
        C0937 c0937 = this.mTextHelper;
        if (c0937 != null) {
            c0937.m8487();
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0937 c0937 = this.mTextHelper;
        if (c0937 != null) {
            c0937.m8491(context, i);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0927.m7951(inputConnectionOnCreateInputConnection, editorInfo, this);
        return this.mAppCompatEmojiEditTextHelper.m35137(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C6483.m14851(callback, this));
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C6483.m14850(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.mAppCompatEmojiEditTextHelper.m35136(keyListener));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.mAppCompatEmojiEditTextHelper.m35139(z);
    }

    public boolean isEmojiCompatEnabled() {
        return this.mAppCompatEmojiEditTextHelper.m35140();
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0937 c0937 = this.mTextHelper;
        if (c0937 != null) {
            c0937.m8487();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0937 c0937 = this.mTextHelper;
        if (c0937 != null) {
            c0937.m8487();
        }
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.m8498();
    }

    @Override // p067l.InterfaceC13859
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.m8492(colorStateList);
        this.mTextHelper.m8487();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.m8505();
    }

    @Override // p067l.InterfaceC13859
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.m8493(mode);
        this.mTextHelper.m8487();
    }
}
