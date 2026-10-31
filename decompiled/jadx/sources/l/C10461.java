package l;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۤᩳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: J7R3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10461 implements InterfaceC19634 {
    @Override // l.InterfaceC19634
    /* JADX INFO: renamed from: ֫ */
    public final void mo20431(EditText editText, TextView textView, Button button, C11146 c11146) {
        button.setTag(R.id.MT_Protector, c11146);
        mo20430(editText, textView, button);
    }

    @Override // l.InterfaceC19634
    /* JADX INFO: renamed from: ֫ */
    public final void mo20430(EditText editText, TextView textView, Button button) {
        editText.setVisibility(8);
        button.setVisibility(0);
        Object tag = button.getTag(R.id.MT_Protector);
        if (tag instanceof C11872) {
            textView.setVisibility(0);
            textView.setText(((C11872) tag).m28998());
        } else {
            textView.setVisibility(8);
        }
    }

    @Override // l.InterfaceC19634
    /* JADX INFO: renamed from: ֫ */
    public final void mo20429(Button button, ActivityC0477 activityC0477) {
        new C12577(button, activityC0477).m20274();
    }

    @Override // l.InterfaceC19634
    /* JADX INFO: renamed from: ֫ */
    public final C11146 mo20428(int i, EditText editText, Button button) {
        C11146 c11146 = (C11146) button.getTag(R.id.MT_Protector);
        if (c11146 != null) {
            return c11146;
        }
        ActivityC0477.m2112(button);
        return null;
    }
}
