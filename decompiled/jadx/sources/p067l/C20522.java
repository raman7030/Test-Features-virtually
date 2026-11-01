package p067l;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ᩴ᩻᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AG9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20522 implements TextWatcher {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ EditText f63394;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Function f63395;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C20522(EditText editText, Function function) {
        this.f63394 = editText;
        this.f63395 = function;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f63394.setHint(((CharSequence) this.f63395.apply(editable)).toString());
    }
}
