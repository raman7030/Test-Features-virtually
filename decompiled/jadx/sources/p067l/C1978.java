package p067l;

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
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩺ۢ */
/* JADX INFO: compiled from: S4UO */
/* JADX INFO: loaded from: classes.dex */
public class C1978 extends EditText implements InterfaceC1701, InterfaceC13859 {
    public final C1523 mAppCompatEmojiEditTextHelper;
    public final C1943 mBackgroundTintHelper;
    public final C5142 mDefaultOnReceiveContentListener;
    public C1418 mSuperCaller;
    public final C1452 mTextClassifierHelper;
    public final C0937 mTextHelper;

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        if (Build.VERSION.SDK_INT < 31 && C1717.m43563(this) != null && (i == 16908322 || i == 16908337)) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                C1553 c1553 = new C1553(primaryClip, 1);
                c1553.m36331(i == 16908322 ? 0 : 1);
                C1717.m43543(this, c1553.m36330());
            }
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i = Build.VERSION.SDK_INT;
        boolean zM24625 = false;
        if (i < 31 && i >= 24 && dragEvent.getLocalState() == null && C1717.m43563(this) != null) {
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
                zM24625 = C1277.m24625(dragEvent, (TextView) this, activity);
            }
        }
        if (zM24625) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    public C1978(Context context) {
        this(context, null);
    }

    public C1978(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1978(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C1340.m27224(context);
        C1480.m33375(getContext(), this);
        C1943 c1943 = new C1943(this);
        this.mBackgroundTintHelper = c1943;
        c1943.m52166(attributeSet, i);
        C0937 c0937 = new C0937(this);
        this.mTextHelper = c0937;
        c0937.m8494(attributeSet, i);
        c0937.m8487();
        this.mTextClassifierHelper = new C1452(this);
        this.mDefaultOnReceiveContentListener = new C5142();
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
        String[] strArrM43563;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 && inputConnectionOnCreateInputConnection != null) {
            C1835.m48466(editorInfo, getText());
        }
        C0927.m7951(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionOnCreateInputConnection != null && i <= 30 && (strArrM43563 = C1717.m43563(this)) != null) {
            C1835.m48468(editorInfo, strArrM43563);
            inputConnectionOnCreateInputConnection = C1485.m33612(this, inputConnectionOnCreateInputConnection, editorInfo);
        }
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

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    /* JADX INFO: renamed from: ֫ */
    private C1418 m53373() {
        if (this.mSuperCaller == null) {
            this.mSuperCaller = new C1418(this);
        }
        return this.mSuperCaller;
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C1452 c1452;
        if (Build.VERSION.SDK_INT >= 28 || (c1452 = this.mTextClassifierHelper) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c1452.m31886(textClassifier);
        }
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C1452 c1452;
        if (Build.VERSION.SDK_INT >= 28 || (c1452 = this.mTextClassifierHelper) == null) {
            return super.getTextClassifier();
        }
        return c1452.m31885();
    }

    @Override // p067l.InterfaceC1701
    public C1028 onReceiveContent(C1028 c1028) {
        return this.mDefaultOnReceiveContentListener.mo10982(this, c1028);
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
