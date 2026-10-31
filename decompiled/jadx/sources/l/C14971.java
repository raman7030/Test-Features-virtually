package l;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import bin.mt.plus.R;
import org.bouncycastle.crypto.params.DHParameters;

/* JADX INFO: renamed from: l.ܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5JQ */
/* JADX INFO: loaded from: classes5.dex */
public class C14971 extends C21488 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f45630;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C22028 f45631;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f45632;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Runnable f45633;

    @Override // android.widget.AutoCompleteTextView
    public final void performCompletion() {
    }

    @Override // android.widget.AutoCompleteTextView
    public final void replaceText(CharSequence charSequence) {
    }

    public C14971(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    public C14971(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f45633 = new RunnableC7916(this);
        this.f45630 = getThreshold();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        int i;
        super.onFinishInflate();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Configuration configuration = getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (i2 < 960 || i3 < 720 || configuration.orientation != 2) {
            i = (i2 >= 600 || (i2 >= 640 && i3 >= 480)) ? 192 : DHParameters.DEFAULT_MINIMUM_LENGTH;
        } else {
            i = 256;
        }
        setMinWidth((int) TypedValue.applyDimension(1, i, displayMetrics));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35454(C22028 c22028) {
        this.f45631 = c22028;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setThreshold(int i) {
        super.setThreshold(i);
        this.f45630 = i;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z && this.f45631.hasFocus() && getVisibility() == 0) {
            this.f45632 = true;
            Context context = getContext();
            C0154 c0154 = C22028.f70591;
            if (context.getResources().getConfiguration().orientation == 2) {
                if (Build.VERSION.SDK_INT >= 29) {
                    C19206.m44273(this, 1);
                    if (enoughToFilter()) {
                        showDropDown();
                        return;
                    }
                    return;
                }
                C22028.f70591.m1255(this);
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        this.f45631.m49573();
    }

    @Override // android.widget.AutoCompleteTextView
    public final boolean enoughToFilter() {
        return this.f45630 <= 0 || super.enoughToFilter();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(keyEvent);
                }
                if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                    this.f45631.clearFocus();
                    m35455(false);
                    return true;
                }
            }
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    @Override // l.C21488, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (this.f45632) {
            Runnable runnable = this.f45633;
            removeCallbacks(runnable);
            post(runnable);
        }
        return inputConnectionOnCreateInputConnection;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35453() {
        if (this.f45632) {
            ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
            this.f45632 = false;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35455(boolean z) {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        Runnable runnable = this.f45633;
        if (!z) {
            this.f45632 = false;
            removeCallbacks(runnable);
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        } else {
            if (inputMethodManager.isActive(this)) {
                this.f45632 = false;
                removeCallbacks(runnable);
                inputMethodManager.showSoftInput(this, 0);
                return;
            }
            this.f45632 = true;
        }
    }
}
