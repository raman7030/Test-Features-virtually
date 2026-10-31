package l;

import android.R;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import java.io.Serializable;

/* JADX INFO: renamed from: l.᩷ܶۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: S4SM */
/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class DialogFragmentC20957 extends AbstractDialogFragmentC18323 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public EditText f67728;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public CharSequence f67729;

    @Deprecated
    public DialogFragmentC20957() {
    }

    @Override // l.AbstractDialogFragmentC18323, android.app.DialogFragment, android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f67729 = ((C6845) m42702()).m18529();
        } else {
            this.f67729 = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // l.AbstractDialogFragmentC18323, android.app.DialogFragment, android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.f67729);
    }

    @Override // l.AbstractDialogFragmentC18323
    /* JADX INFO: renamed from: ֫ */
    public final void mo42703(View view) {
        super.mo42703(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.f67728 = editText;
        editText.requestFocus();
        EditText editText2 = this.f67728;
        if (editText2 == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText2.setText(this.f67729);
        EditText editText3 = this.f67728;
        editText3.setSelection(editText3.getText().length());
    }

    @Override // l.AbstractDialogFragmentC18323
    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public final void mo13844(boolean z) {
        if (z) {
            String string = this.f67728.getText().toString();
            ((C6845) m42702()).m6893((Serializable) string);
            ((C6845) m42702()).m18528(string);
        }
    }
}
