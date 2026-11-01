package p067l;

import android.text.Editable;
import android.widget.EditText;
import bin.p000mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: l.ۨ۫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13499 extends AbstractC5460 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ EditText f37926;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ RunnableC14188 f37927;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ TextInputLayout f37928;

    public C13499(TextInputLayout textInputLayout, RunnableC14188 runnableC14188, EditText editText) {
        this.f37928 = textInputLayout;
        this.f37927 = runnableC14188;
        this.f37926 = editText;
    }

    @Override // p067l.AbstractC5460, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f37928;
        RunnableC14188 runnableC14188 = this.f37927;
        textInputLayout.removeCallbacks(runnableC14188);
        runnableC14188.run();
        Integer numM50681 = C22622.m50681(this.f37926.getText().toString());
        boolean z = false;
        if (numM50681 == null) {
            textInputLayout.setError(C7050.m16224(R.string.MT_Protector));
        } else {
            textInputLayout.setError(null);
            textInputLayout.setErrorEnabled(false);
        }
        if (numM50681 != null && numM50681.intValue() != C22711.m50835()) {
            z = true;
        }
        textInputLayout.setEndIconVisible(z);
    }
}
