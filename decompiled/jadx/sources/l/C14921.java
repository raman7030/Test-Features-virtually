package l;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: renamed from: l.ܶ֫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1599 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14921 implements TextWatcher {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6807 f45496;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f45497;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f45498;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C14921(EditText editText, EditText editText2, C6807 c6807) {
        this.f45497 = editText;
        this.f45498 = editText2;
        this.f45496 = c6807;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C21273.m48295(this.f45497, this.f45498, this.f45496.f21109.m27415());
    }
}
