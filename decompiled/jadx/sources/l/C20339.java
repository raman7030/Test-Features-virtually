package l;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩶ᩳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7PV */
/* JADX INFO: loaded from: classes5.dex */
public final class C20339 implements InterfaceC19634 {
    @Override // l.InterfaceC19634
    /* JADX INFO: renamed from: ֫ */
    public final void mo20431(EditText editText, TextView textView, Button button, C11146 c11146) {
        editText.setText(c11146.mo14039());
        mo20430(editText, textView, button);
    }

    @Override // l.InterfaceC19634
    /* JADX INFO: renamed from: ֫ */
    public final void mo20430(EditText editText, TextView textView, Button button) {
        editText.setVisibility(0);
        button.setVisibility(8);
        textView.setVisibility(8);
    }

    @Override // l.InterfaceC19634
    /* JADX INFO: renamed from: ֫ */
    public final void mo20429(Button button, ActivityC0477 activityC0477) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC19634
    /* JADX INFO: renamed from: ֫ */
    public final C11146 mo20428(int i, EditText editText, Button button) {
        String string = editText.getText().toString();
        if (string.isEmpty()) {
            editText.requestFocus();
            ActivityC0477.m2112(editText);
            C21374.m48457(R.string.MT_Protector);
            return null;
        }
        return new C4816(string);
    }
}
