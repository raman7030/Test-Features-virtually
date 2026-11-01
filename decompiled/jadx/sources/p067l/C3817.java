package p067l;

import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.֫֫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: CAJV */
/* JADX INFO: loaded from: classes2.dex */
public final class C3817 implements TextWatcher {

    /* JADX INFO: renamed from: ۙ */
    public int f8177;

    /* JADX INFO: renamed from: ᩶ */
    public final int f8178;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f8179;

    /* JADX INFO: renamed from: ᩹ */
    public final boolean f8180;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C3817(boolean z) {
        this.f8180 = z;
        this.f8178 = z ? 19 : 16;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (i2 == 0 && i3 == 1) {
            this.f8179 = true;
            this.f8177 = i;
        } else {
            this.f8179 = false;
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        char cCharAt;
        boolean z = this.f8179;
        int i = this.f8178;
        if (z) {
            if (editable.length() >= this.f8177 + 2 && editable.length() > i) {
                char cCharAt2 = editable.charAt(this.f8177 + 1);
                if (cCharAt2 < '0' || cCharAt2 > '9') {
                    int i2 = this.f8177;
                    editable.delete(i2, i2 + 1);
                    Selection.setSelection(editable, this.f8177 + 1);
                } else {
                    int i3 = this.f8177;
                    editable.delete(i3 + 1, i3 + 2);
                    int length = editable.length();
                    int i4 = this.f8177;
                    if (length >= i4 + 2 && ((cCharAt = editable.charAt(i4 + 1)) < '0' || cCharAt > '9')) {
                        Selection.setSelection(editable, this.f8177 + 2);
                    }
                }
            } else if ((this.f8177 == 3 && editable.length() == 4) || (this.f8177 == 6 && editable.length() == 7)) {
                editable.append('-');
            } else if (this.f8177 == 9 && editable.length() == 10) {
                editable.append(' ');
            } else if ((this.f8177 == 12 && editable.length() == 13) || (this.f8180 && this.f8177 == 15 && editable.length() == 16)) {
                editable.append(':');
            }
        }
        if (editable.length() > i) {
            editable.delete(i, editable.length());
        }
    }
}
