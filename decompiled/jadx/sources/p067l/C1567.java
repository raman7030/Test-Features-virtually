package p067l;

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

/* JADX INFO: renamed from: l.ܳܺ */
/* JADX INFO: compiled from: 254T */
/* JADX INFO: loaded from: classes4.dex */
public class C1567 extends TextView implements InterfaceC13859 {
    public final C1943 mBackgroundTintHelper;
    public C1208 mEmojiTextViewHelper;
    public boolean mIsSetTypefaceProcessing;
    public Future mPrecomputedTextFuture;
    public InterfaceC1392 mSuperCaller;
    public final C1452 mTextClassifierHelper;
    public final C0937 mTextHelper;

    public C1567(Context context) {
        this(context, null);
    }

    public C1567(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1567(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C1340.m27224(context);
        this.mIsSetTypefaceProcessing = false;
        this.mSuperCaller = null;
        C1480.m33375(getContext(), this);
        C1943 c1943 = new C1943(this);
        this.mBackgroundTintHelper = c1943;
        c1943.m52166(attributeSet, i);
        C0937 c0937 = new C0937(this);
        this.mTextHelper = c0937;
        c0937.m8494(attributeSet, i);
        c0937.m8487();
        this.mTextClassifierHelper = new C1452(this);
        m37037().m21799(attributeSet, i);
    }

    /* JADX INFO: renamed from: ᩳ */
    private C1208 m37037() {
        if (this.mEmojiTextViewHelper == null) {
            this.mEmojiTextViewHelper = new C1208(this);
        }
        return this.mEmojiTextViewHelper;
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

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0937 c0937 = this.mTextHelper;
        if (c0937 != null) {
            c0937.m8491(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(m37037().m21802(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        m37037().m21800(z);
    }

    public void setEmojiCompatEnabled(boolean z) {
        m37037().m21803(z);
    }

    public boolean isEmojiCompatEnabled() {
        return m37037().m21801();
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

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0937 c0937 = this.mTextHelper;
        if (c0937 == null || C1956.f75467) {
            return;
        }
        c0937.m8500();
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (C1956.f75467) {
            super.setTextSize(i, f);
            return;
        }
        C0937 c0937 = this.mTextHelper;
        if (c0937 != null) {
            c0937.m8489(i, f);
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0937 c0937 = this.mTextHelper;
        if (c0937 == null || C1956.f75467 || !c0937.m8499()) {
            return;
        }
        this.mTextHelper.m8500();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C1956.f75467) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0937 c0937 = this.mTextHelper;
        if (c0937 != null) {
            c0937.m8488(i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (C1956.f75467) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0937 c0937 = this.mTextHelper;
        if (c0937 != null) {
            c0937.m8490(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (C1956.f75467) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0937 c0937 = this.mTextHelper;
        if (c0937 != null) {
            c0937.m8497(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (C1956.f75467) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0937 c0937 = this.mTextHelper;
        if (c0937 != null) {
            return c0937.m8506();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (C1956.f75467) {
            return super.getAutoSizeStepGranularity();
        }
        C0937 c0937 = this.mTextHelper;
        if (c0937 != null) {
            return c0937.m8503();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (C1956.f75467) {
            return super.getAutoSizeMinTextSize();
        }
        C0937 c0937 = this.mTextHelper;
        if (c0937 != null) {
            return c0937.m8504();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (C1956.f75467) {
            return super.getAutoSizeMaxTextSize();
        }
        C0937 c0937 = this.mTextHelper;
        if (c0937 != null) {
            return c0937.m8502();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (C1956.f75467) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0937 c0937 = this.mTextHelper;
        return c0937 != null ? c0937.m8501() : new int[0];
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.getClass();
        if (Build.VERSION.SDK_INT < 30 && inputConnectionOnCreateInputConnection != null) {
            C1835.m48466(editorInfo, getText());
        }
        C0927.m7951(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo29580(i);
        } else {
            C6483.m14853(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo29578(i);
        } else {
            C6483.m14859(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        C6483.m14860(this, i);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i, float f) {
        if (Build.VERSION.SDK_INT >= 34) {
            getSuperCaller().mo29579(i, f);
        } else {
            C6483.m14854(this, i, f);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C6483.m14851(callback, this));
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C6483.m14850(super.getCustomSelectionActionModeCallback());
    }

    public C0894 getTextMetricsParamsCompat() {
        return C6483.m14852(this);
    }

    public void setTextMetricsParamsCompat(C0894 c0894) {
        C6483.m14857(this, c0894);
    }

    public void setPrecomputedText(C1244 c1244) {
        C6483.m14858(this, c1244);
    }

    /* JADX INFO: renamed from: ܽ */
    private void m37034() {
        Future future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                C6483.m14858(this, (C1244) future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        m37034();
        return super.getText();
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

    public void setTextFuture(Future future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        m37034();
        super.onMeasure(i, i2);
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

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0937 c0937 = this.mTextHelper;
        if (c0937 != null) {
            c0937.m8487();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? C22622.m50680(context, i) : null, i2 != 0 ? C22622.m50680(context, i2) : null, i3 != 0 ? C22622.m50680(context, i3) : null, i4 != 0 ? C22622.m50680(context, i4) : null);
        C0937 c0937 = this.mTextHelper;
        if (c0937 != null) {
            c0937.m8487();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0937 c0937 = this.mTextHelper;
        if (c0937 != null) {
            c0937.m8487();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? C22622.m50680(context, i) : null, i2 != 0 ? C22622.m50680(context, i2) : null, i3 != 0 ? C22622.m50680(context, i3) : null, i4 != 0 ? C22622.m50680(context, i4) : null);
        C0937 c0937 = this.mTextHelper;
        if (c0937 != null) {
            c0937.m8487();
        }
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.m8498();
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
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
            int i2 = C1178.f23904;
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

    public InterfaceC1392 getSuperCaller() {
        if (this.mSuperCaller == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.mSuperCaller = new C1707(this);
            } else if (i >= 28) {
                this.mSuperCaller = new C1742(this);
            } else if (i >= 26) {
                this.mSuperCaller = new C1672(this);
            }
        }
        return this.mSuperCaller;
    }
}
