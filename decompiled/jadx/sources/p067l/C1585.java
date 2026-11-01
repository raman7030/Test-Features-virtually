package p067l;

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
import bin.p000mt.plus.R;
import org.bouncycastle.crypto.params.DHParameters;

/* JADX INFO: renamed from: l.ܶۘ */
/* JADX INFO: compiled from: N5JQ */
/* JADX INFO: loaded from: classes5.dex */
public class C1585 extends C1908 {

    /* JADX INFO: renamed from: ۙ */
    public int f48743;

    /* JADX INFO: renamed from: ᩶ */
    public C1935 f48744;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f48745;

    /* JADX INFO: renamed from: ᩹ */
    public final Runnable f48746;

    @Override // android.widget.AutoCompleteTextView
    public final void performCompletion() {
    }

    @Override // android.widget.AutoCompleteTextView
    public final void replaceText(CharSequence charSequence) {
    }

    public C1585(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    public C1585(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f48746 = new RunnableC1235(this);
        this.f48743 = getThreshold();
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

    /* JADX INFO: renamed from: ֫ */
    public final void m37610(C1935 c1935) {
        this.f48744 = c1935;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setThreshold(int i) {
        super.setThreshold(i);
        this.f48743 = i;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z && this.f48744.hasFocus() && getVisibility() == 0) {
            this.f48745 = true;
            Context context = getContext();
            C0850 c0850 = C1935.f73308;
            if (context.getResources().getConfiguration().orientation == 2) {
                if (Build.VERSION.SDK_INT >= 29) {
                    C1795.m46568(this, 1);
                    if (enoughToFilter()) {
                        showDropDown();
                        return;
                    }
                    return;
                }
                C1935.f73308.m3663(this);
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        this.f48744.m51909();
    }

    @Override // android.widget.AutoCompleteTextView
    public final boolean enoughToFilter() {
        return this.f48743 <= 0 || super.enoughToFilter();
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
                    this.f48744.clearFocus();
                    m37611(false);
                    return true;
                }
            }
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    @Override // p067l.C1908, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (this.f48745) {
            Runnable runnable = this.f48746;
            removeCallbacks(runnable);
            post(runnable);
        }
        return inputConnectionOnCreateInputConnection;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37609() {
        if (this.f48745) {
            ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
            this.f48745 = false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37611(boolean z) {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        Runnable runnable = this.f48746;
        if (!z) {
            this.f48745 = false;
            removeCallbacks(runnable);
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        } else {
            if (inputMethodManager.isActive(this)) {
                this.f48745 = false;
                removeCallbacks(runnable);
                inputMethodManager.showSoftInput(this, 0);
                return;
            }
            this.f48745 = true;
        }
    }
}
