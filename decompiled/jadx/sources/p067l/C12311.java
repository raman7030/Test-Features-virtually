package p067l;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۤᩳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: J7R3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12311 implements InterfaceC21029 {
    @Override // p067l.InterfaceC21029
    /* JADX INFO: renamed from: ֫ */
    public final void mo22410(EditText editText, TextView textView, Button button, C12962 c12962) {
        button.setTag(R.id.MT_Protector, c12962);
        mo22409(editText, textView, button);
    }

    @Override // p067l.InterfaceC21029
    /* JADX INFO: renamed from: ֫ */
    public final void mo22409(EditText editText, TextView textView, Button button) {
        editText.setVisibility(8);
        button.setVisibility(0);
        Object tag = button.getTag(R.id.MT_Protector);
        if (tag instanceof C13652) {
            textView.setVisibility(0);
            textView.setText(((C13652) tag).m31049());
        } else {
            textView.setVisibility(8);
        }
    }

    @Override // p067l.InterfaceC21029
    /* JADX INFO: renamed from: ֫ */
    public final void mo22408(Button button, ActivityC2822 activityC2822) {
        new C14322(button, activityC2822).m22250();
    }

    @Override // p067l.InterfaceC21029
    /* JADX INFO: renamed from: ֫ */
    public final C12962 mo22407(int i, EditText editText, Button button) {
        C12962 c12962 = (C12962) button.getTag(R.id.MT_Protector);
        if (c12962 != null) {
            return c12962;
        }
        ActivityC2822.m4493(button);
        return null;
    }
}
