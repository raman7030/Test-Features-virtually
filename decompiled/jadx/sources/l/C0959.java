package l;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.֨ۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05XT */
/* JADX INFO: loaded from: classes2.dex */
public final class C0959 implements TextWatcher {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC8015 f3614;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C0959(ViewOnClickListenerC8015 viewOnClickListenerC8015) {
        this.f3614 = viewOnClickListenerC8015;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int iM24993;
        String string = editable.toString();
        boolean zM24990 = C9896.m24990(string);
        ViewOnClickListenerC8015 viewOnClickListenerC8015 = this.f3614;
        String strM46622 = (!zM24990 || (iM24993 = C9896.m24993(string)) >= viewOnClickListenerC8015.f24747.f75574.mo2878()) ? null : viewOnClickListenerC8015.f24747.f75574.m46622(iM24993);
        if (strM46622 != null && !strM46622.isEmpty()) {
            viewOnClickListenerC8015.f24745.setText(strM46622);
            viewOnClickListenerC8015.f24745.setEnabled(false);
            viewOnClickListenerC8015.f24745.setAlpha(0.5f);
        } else {
            viewOnClickListenerC8015.f24745.setEnabled(true);
            viewOnClickListenerC8015.f24745.setAlpha(1.0f);
        }
    }
}
