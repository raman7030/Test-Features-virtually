package l;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩺ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: S4UO */
/* JADX INFO: loaded from: classes.dex */
public class C22898 extends EditText implements InterfaceC17316, InterfaceC12091 {
    public final C13725 mAppCompatEmojiEditTextHelper;
    public final C22193 mBackgroundTintHelper;
    public final C2919 mDefaultOnReceiveContentListener;
    public C11610 mSuperCaller;
    public final C12294 mTextClassifierHelper;
    public final C1916 mTextHelper;

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        if (Build.VERSION.SDK_INT < 31 && C17648.m41317(this) != null && (i == 16908322 || i == 16908337)) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                C14328 c14328 = new C14328(primaryClip, 1);
                c14328.m34198(i == 16908322 ? 0 : 1);
                C17648.m41297(this, c14328.m34197());
            }
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i = Build.VERSION.SDK_INT;
        boolean zM22655 = false;
        if (i < 31 && i >= 24 && dragEvent.getLocalState() == null && C17648.m41317(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                toString();
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zM22655 = C8767.m22655(dragEvent, (TextView) this, activity);
            }
        }
        if (zM22655) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    public C22898(Context context) {
        this(context, null);
    }

    public C22898(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22898(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C10034.m25207(context);
        C12855.m31289(getContext(), this);
        C22193 c22193 = new C22193(this);
        this.mBackgroundTintHelper = c22193;
        c22193.m49839(attributeSet, i);
        C1916 c1916 = new C1916(this);
        this.mTextHelper = c1916;
        c1916.m6321(attributeSet, i);
        c1916.m6314();
        this.mTextClassifierHelper = new C12294(this);
        this.mDefaultOnReceiveContentListener = new C2919();
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

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
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
        String[] strArrM41317;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 && inputConnectionOnCreateInputConnection != null) {
            C20015.m46151(editorInfo, getText());
        }
        C1711.m5725(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionOnCreateInputConnection != null && i <= 30 && (strArrM41317 = C17648.m41317(this)) != null) {
            C20015.m46153(editorInfo, strArrM41317);
            inputConnectionOnCreateInputConnection = C12958.m31526(this, inputConnectionOnCreateInputConnection, editorInfo);
        }
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

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C11610 m50982() {
        if (this.mSuperCaller == null) {
            this.mSuperCaller = new C11610(this);
        }
        return this.mSuperCaller;
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C12294 c12294;
        if (Build.VERSION.SDK_INT >= 28 || (c12294 = this.mTextClassifierHelper) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c12294.m29826(textClassifier);
        }
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C12294 c12294;
        if (Build.VERSION.SDK_INT >= 28 || (c12294 = this.mTextClassifierHelper) == null) {
            return super.getTextClassifier();
        }
        return c12294.m29825();
    }

    @Override // l.InterfaceC17316
    public C3746 onReceiveContent(C3746 c3746) {
        return this.mDefaultOnReceiveContentListener.mo8914(this, c3746);
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
