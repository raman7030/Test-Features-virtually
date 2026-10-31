package l;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ᩴ᩻᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AG9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19100 implements TextWatcher {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f60161;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Function f60162;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C19100(EditText editText, Function function) {
        this.f60161 = editText;
        this.f60162 = function;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f60161.setHint(((CharSequence) this.f60162.apply(editable)).toString());
    }
}
