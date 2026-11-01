package p067l;

import android.R;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import java.io.Serializable;

/* JADX INFO: renamed from: l.᩷ܶۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: S4SM */
/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class DialogFragmentC22286 extends AbstractDialogFragmentC19783 {

    /* JADX INFO: renamed from: ۛ */
    public EditText f70413;

    /* JADX INFO: renamed from: ۨ */
    public CharSequence f70414;

    @Deprecated
    public DialogFragmentC22286() {
    }

    @Override // p067l.AbstractDialogFragmentC19783, android.app.DialogFragment, android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f70414 = ((C8874) m44964()).m20478();
        } else {
            this.f70414 = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // p067l.AbstractDialogFragmentC19783, android.app.DialogFragment, android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.f70414);
    }

    @Override // p067l.AbstractDialogFragmentC19783
    /* JADX INFO: renamed from: ֫ */
    public final void mo44965(View view) {
        super.mo44965(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.f70413 = editText;
        editText.requestFocus();
        EditText editText2 = this.f70413;
        if (editText2 == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText2.setText(this.f70414);
        EditText editText3 = this.f70413;
        editText3.setSelection(editText3.getText().length());
    }

    @Override // p067l.AbstractDialogFragmentC19783
    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public final void mo15724(boolean z) {
        if (z) {
            String string = this.f70413.getText().toString();
            ((C8874) m44964()).m9019((Serializable) string);
            ((C8874) m44964()).m20477(string);
        }
    }
}
