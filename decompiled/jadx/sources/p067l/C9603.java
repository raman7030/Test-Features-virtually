package p067l;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

/* JADX INFO: renamed from: l.۟ܿۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5HP */
/* JADX INFO: loaded from: classes3.dex */
public final class C9603 implements TextWatcher {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ ViewOnClickListenerC18240 f26467;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C9603(ViewOnClickListenerC18240 viewOnClickListenerC18240) {
        this.f26467 = viewOnClickListenerC18240;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ViewOnClickListenerC18240 viewOnClickListenerC18240 = this.f26467;
        View view = viewOnClickListenerC18240.f54460;
        boolean z = true;
        if (editable.length() != 0 && (editable.length() != 1 || editable.charAt(0) != '/')) {
            z = false;
        }
        view.setEnabled(z);
        viewOnClickListenerC18240.f54461.setEnabled(viewOnClickListenerC18240.f54460.isEnabled());
    }
}
