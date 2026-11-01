package p067l;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: renamed from: l.ܶ֫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1599 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16549 implements TextWatcher {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C8838 f48611;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ EditText f48612;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ EditText f48613;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C16549(EditText editText, EditText editText2, C8838 c8838) {
        this.f48612 = editText;
        this.f48613 = editText2;
        this.f48611 = c8838;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C22586.m50626(this.f48612, this.f48613, this.f48611.f23986.m29477());
    }
}
