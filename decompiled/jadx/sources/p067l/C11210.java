package p067l;

import android.text.Editable;
import android.text.Spannable;
import android.text.TextWatcher;
import android.text.style.UpdateAppearance;

/* JADX INFO: renamed from: l.ۢۖᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: U5MD */
/* JADX INFO: loaded from: classes3.dex */
public final class C11210 implements TextWatcher {
    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence instanceof Spannable) {
            Spannable spannable = (Spannable) charSequence;
            UpdateAppearance[] updateAppearanceArr = (UpdateAppearance[]) spannable.getSpans(i, i3 + i, UpdateAppearance.class);
            if (updateAppearanceArr == null || updateAppearanceArr.length <= 0) {
                return;
            }
            for (UpdateAppearance updateAppearance : updateAppearanceArr) {
                spannable.removeSpan(updateAppearance);
            }
        }
    }
}
