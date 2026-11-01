package p067l;

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
public class C10886 extends AbstractDialogInterfaceOnClickListenerC16429 {

    /* JADX INFO: renamed from: ۛ */
    public EditText f30159;

    /* JADX INFO: renamed from: ܰ */
    public CharSequence f30161;

    /* JADX INFO: renamed from: ᩺ */
    public final Runnable f30162 = new RunnableC11557(this);

    /* JADX INFO: renamed from: ۨ */
    public long f30160 = -1;

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC16429, p067l.DialogInterfaceOnCancelListenerC12199, p067l.ComponentCallbacksC11117
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f30161 = ((C8874) m37326()).m20478();
        } else {
            this.f30161 = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC16429, p067l.DialogInterfaceOnCancelListenerC12199, p067l.ComponentCallbacksC11117
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.f30161);
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC16429
    /* JADX INFO: renamed from: ֫ */
    public final void mo25078(View view) {
        super.mo25078(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.f30159 = editText;
        if (editText == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText.requestFocus();
        this.f30159.setText(this.f30161);
        EditText editText2 = this.f30159;
        editText2.setSelection(editText2.getText().length());
        ((C8874) m37326()).getClass();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m25080() {
        long j = this.f30160;
        if (j == -1 || j + 1000 <= SystemClock.currentThreadTimeMillis()) {
            return;
        }
        EditText editText = this.f30159;
        if (editText == null || !editText.isFocused()) {
            this.f30160 = -1L;
            return;
        }
        if (((InputMethodManager) this.f30159.getContext().getSystemService("input_method")).showSoftInput(this.f30159, 0)) {
            this.f30160 = -1L;
            return;
        }
        EditText editText2 = this.f30159;
        Runnable runnable = this.f30162;
        editText2.removeCallbacks(runnable);
        this.f30159.postDelayed(runnable, 50L);
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC16429
    /* JADX INFO: renamed from: ܽ */
    public final void mo25079() {
        this.f30160 = SystemClock.currentThreadTimeMillis();
        m25080();
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC16429
    /* JADX INFO: renamed from: ֫ */
    public final void mo23822(boolean z) {
        if (z) {
            String string = this.f30159.getText().toString();
            C8874 c8874 = (C8874) m37326();
            c8874.m9019((Serializable) string);
            c8874.m20477(string);
        }
    }
}
