package p067l;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩶ᩳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7PV */
/* JADX INFO: loaded from: classes5.dex */
public final class C21699 implements InterfaceC21029 {
    @Override // p067l.InterfaceC21029
    /* JADX INFO: renamed from: ֫ */
    public final void mo22410(EditText editText, TextView textView, Button button, C12962 c12962) {
        editText.setText(c12962.mo15919());
        mo22409(editText, textView, button);
    }

    @Override // p067l.InterfaceC21029
    /* JADX INFO: renamed from: ֫ */
    public final void mo22409(EditText editText, TextView textView, Button button) {
        editText.setVisibility(0);
        button.setVisibility(8);
        textView.setVisibility(8);
    }

    @Override // p067l.InterfaceC21029
    /* JADX INFO: renamed from: ֫ */
    public final void mo22408(Button button, ActivityC2822 activityC2822) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC21029
    /* JADX INFO: renamed from: ֫ */
    public final C12962 mo22407(int i, EditText editText, Button button) {
        String string = editText.getText().toString();
        if (string.isEmpty()) {
            editText.requestFocus();
            ActivityC2822.m4493(editText);
            C22682.m50793(R.string.MT_Protector);
            return null;
        }
        return new C6946(string);
    }
}
