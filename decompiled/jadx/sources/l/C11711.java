package l;

import android.text.Editable;
import android.widget.EditText;
import bin.mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: l.ۨ۫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11711 extends AbstractC3253 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f34926;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC12436 f34927;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextInputLayout f34928;

    public C11711(TextInputLayout textInputLayout, RunnableC12436 runnableC12436, EditText editText) {
        this.f34928 = textInputLayout;
        this.f34927 = runnableC12436;
        this.f34926 = editText;
    }

    @Override // l.AbstractC3253, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f34928;
        RunnableC12436 runnableC12436 = this.f34927;
        textInputLayout.removeCallbacks(runnableC12436);
        runnableC12436.run();
        Integer numM48346 = C21311.m48346(this.f34926.getText().toString());
        boolean z = false;
        if (numM48346 == null) {
            textInputLayout.setError(C4925.m14327(R.string.MT_Protector));
        } else {
            textInputLayout.setError(null);
            textInputLayout.setErrorEnabled(false);
        }
        if (numM48346 != null && numM48346.intValue() != C21404.m48499()) {
            z = true;
        }
        textInputLayout.setEndIconVisible(z);
    }
}
