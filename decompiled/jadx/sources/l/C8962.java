package l;

import android.R;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ۡܶۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 766I */
/* JADX INFO: loaded from: classes4.dex */
public class C8962 extends AbstractDialogInterfaceOnClickListenerC14794 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public EditText f27225;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public CharSequence f27227;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final Runnable f27228 = new RunnableC9668(this);

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f27226 = -1;

    @Override // l.AbstractDialogInterfaceOnClickListenerC14794, l.DialogInterfaceOnCancelListenerC10344, l.ComponentCallbacksC9205
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f27227 = ((C6845) m35179()).m18529();
        } else {
            this.f27227 = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC14794, l.DialogInterfaceOnCancelListenerC10344, l.ComponentCallbacksC9205
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.f27227);
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC14794
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo23104(View view) {
        super.mo23104(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.f27225 = editText;
        if (editText == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText.requestFocus();
        this.f27225.setText(this.f27227);
        EditText editText2 = this.f27225;
        editText2.setSelection(editText2.getText().length());
        ((C6845) m35179()).getClass();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m23106() {
        long j = this.f27226;
        if (j == -1 || j + 1000 <= SystemClock.currentThreadTimeMillis()) {
            return;
        }
        EditText editText = this.f27225;
        if (editText == null || !editText.isFocused()) {
            this.f27226 = -1L;
            return;
        }
        if (((InputMethodManager) this.f27225.getContext().getSystemService("input_method")).showSoftInput(this.f27225, 0)) {
            this.f27226 = -1L;
            return;
        }
        EditText editText2 = this.f27225;
        Runnable runnable = this.f27228;
        editText2.removeCallbacks(runnable);
        this.f27225.postDelayed(runnable, 50L);
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC14794
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo23105() {
        this.f27226 = SystemClock.currentThreadTimeMillis();
        m23106();
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC14794
    /* JADX INFO: renamed from: ֫ */
    public final void mo21852(boolean z) {
        if (z) {
            String string = this.f27225.getText().toString();
            C6845 c6845 = (C6845) m35179();
            c6845.m6893((Serializable) string);
            c6845.m18528(string);
        }
    }
}
