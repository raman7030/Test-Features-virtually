package l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: l.ܳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 254T */
/* JADX INFO: loaded from: classes4.dex */
public class C14615 extends TextView implements InterfaceC12091 {
    public final C22193 mBackgroundTintHelper;
    public C7376 mEmojiTextViewHelper;
    public boolean mIsSetTypefaceProcessing;
    public Future mPrecomputedTextFuture;
    public InterfaceC11089 mSuperCaller;
    public final C12294 mTextClassifierHelper;
    public final C1916 mTextHelper;

    public C14615(Context context) {
        this(context, null);
    }

    public C14615(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14615(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C10034.m25207(context);
        this.mIsSetTypefaceProcessing = false;
        this.mSuperCaller = null;
        C12855.m31289(getContext(), this);
        C22193 c22193 = new C22193(this);
        this.mBackgroundTintHelper = c22193;
        c22193.m49839(attributeSet, i);
        C1916 c1916 = new C1916(this);
        this.mTextHelper = c1916;
        c1916.m6321(attributeSet, i);
        c1916.m6314();
        this.mTextClassifierHelper = new C12294(this);
        m34890().m19826(attributeSet, i);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private C7376 m34890() {
        if (this.mEmojiTextViewHelper == null) {
            this.mEmojiTextViewHelper = new C7376(this);
        }
        return this.mEmojiTextViewHelper;
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

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1916 c1916 = this.mTextHelper;
        if (c1916 != null) {
            c1916.m6318(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(m34890().m19829(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        m34890().m19827(z);
    }

    public void setEmojiCompatEnabled(boolean z) {
        m34890().m19830(z);
    }

    public boolean isEmojiCompatEnabled() {
        return m34890().m19828();
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

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C1916 c1916 = this.mTextHelper;
        if (c1916 == null || C22461.f72739) {
            return;
        }
        c1916.m6327();
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (C22461.f72739) {
            super.setTextSize(i, f);
            return;
        }
        C1916 c1916 = this.mTextHelper;
        if (c1916 != null) {
            c1916.m6316(i, f);
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C1916 c1916 = this.mTextHelper;
        if (c1916 == null || C22461.f72739 || !c1916.m6326()) {
            return;
        }
        this.mTextHelper.m6327();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C22461.f72739) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C1916 c1916 = this.mTextHelper;
        if (c1916 != null) {
            c1916.m6315(i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (C22461.f72739) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C1916 c1916 = this.mTextHelper;
        if (c1916 != null) {
            c1916.m6317(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (C22461.f72739) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C1916 c1916 = this.mTextHelper;
        if (c1916 != null) {
            c1916.m6324(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (C22461.f72739) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C1916 c1916 = this.mTextHelper;
        if (c1916 != null) {
            return c1916.m6333();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (C22461.f72739) {
            return super.getAutoSizeStepGranularity();
        }
        C1916 c1916 = this.mTextHelper;
        if (c1916 != null) {
            return c1916.m6330();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (C22461.f72739) {
            return super.getAutoSizeMinTextSize();
        }
        C1916 c1916 = this.mTextHelper;
        if (c1916 != null) {
            return c1916.m6331();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (C22461.f72739) {
            return super.getAutoSizeMaxTextSize();
        }
        C1916 c1916 = this.mTextHelper;
        if (c1916 != null) {
            return c1916.m6329();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (C22461.f72739) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C1916 c1916 = this.mTextHelper;
        return c1916 != null ? c1916.m6328() : new int[0];
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.getClass();
        if (Build.VERSION.SDK_INT < 30 && inputConnectionOnCreateInputConnection != null) {
            C20015.m46151(editorInfo, getText());
        }
        C1711.m5725(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo27518(i);
        } else {
            C4330.m12989(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo27516(i);
        } else {
            C4330.m12995(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        C4330.m12996(this, i);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i, float f) {
        if (Build.VERSION.SDK_INT >= 34) {
            getSuperCaller().mo27517(i, f);
        } else {
            C4330.m12990(this, i, f);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C4330.m12987(callback, this));
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C4330.m12986(super.getCustomSelectionActionModeCallback());
    }

    public C1047 getTextMetricsParamsCompat() {
        return C4330.m12988(this);
    }

    public void setTextMetricsParamsCompat(C1047 c1047) {
        C4330.m12993(this, c1047);
    }

    public void setPrecomputedText(C8103 c8103) {
        C4330.m12994(this, c8103);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m34887() {
        Future future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                C4330.m12994(this, (C8103) future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        m34887();
        return super.getText();
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

    public void setTextFuture(Future future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        m34887();
        super.onMeasure(i, i2);
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

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C1916 c1916 = this.mTextHelper;
        if (c1916 != null) {
            c1916.m6314();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? C21311.m48345(context, i) : null, i2 != 0 ? C21311.m48345(context, i2) : null, i3 != 0 ? C21311.m48345(context, i3) : null, i4 != 0 ? C21311.m48345(context, i4) : null);
        C1916 c1916 = this.mTextHelper;
        if (c1916 != null) {
            c1916.m6314();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C1916 c1916 = this.mTextHelper;
        if (c1916 != null) {
            c1916.m6314();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? C21311.m48345(context, i) : null, i2 != 0 ? C21311.m48345(context, i2) : null, i3 != 0 ? C21311.m48345(context, i3) : null, i4 != 0 ? C21311.m48345(context, i4) : null);
        C1916 c1916 = this.mTextHelper;
        if (c1916 != null) {
            c1916.m6314();
        }
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.m6325();
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
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

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i) {
        Typeface typefaceCreate;
        if (this.mIsSetTypefaceProcessing) {
            return;
        }
        if (typeface == null || i <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            int i2 = C6773.f21030;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i);
        }
        this.mIsSetTypefaceProcessing = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.mIsSetTypefaceProcessing = false;
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    public InterfaceC11089 getSuperCaller() {
        if (this.mSuperCaller == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.mSuperCaller = new C17438(this);
            } else if (i >= 28) {
                this.mSuperCaller = new C18144(this);
            } else if (i >= 26) {
                this.mSuperCaller = new C16732(this);
            }
        }
        return this.mSuperCaller;
    }
}
