package p067l;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/* JADX INFO: renamed from: l.۟ᩳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: NAVX */
/* JADX INFO: loaded from: classes3.dex */
public final class C9628 implements InterfaceC21029 {
    @Override // p067l.InterfaceC21029
    /* JADX INFO: renamed from: ֫ */
    public final void mo22410(EditText editText, TextView textView, Button button, C12962 c12962) {
        mo22409(editText, textView, button);
    }

    @Override // p067l.InterfaceC21029
    /* JADX INFO: renamed from: ֫ */
    public final void mo22409(EditText editText, TextView textView, Button button) {
        editText.setVisibility(8);
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
        return new C12962(i);
    }
}
