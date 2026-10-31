package l;

import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.֫֫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: CAJV */
/* JADX INFO: loaded from: classes2.dex */
public final class C1524 implements TextWatcher {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f5395;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f5396;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f5397;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f5398;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C1524(boolean z) {
        this.f5398 = z;
        this.f5396 = z ? 19 : 16;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (i2 == 0 && i3 == 1) {
            this.f5397 = true;
            this.f5395 = i;
        } else {
            this.f5397 = false;
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        char cCharAt;
        boolean z = this.f5397;
        int i = this.f5396;
        if (z) {
            if (editable.length() >= this.f5395 + 2 && editable.length() > i) {
                char cCharAt2 = editable.charAt(this.f5395 + 1);
                if (cCharAt2 < '0' || cCharAt2 > '9') {
                    int i2 = this.f5395;
                    editable.delete(i2, i2 + 1);
                    Selection.setSelection(editable, this.f5395 + 1);
                } else {
                    int i3 = this.f5395;
                    editable.delete(i3 + 1, i3 + 2);
                    int length = editable.length();
                    int i4 = this.f5395;
                    if (length >= i4 + 2 && ((cCharAt = editable.charAt(i4 + 1)) < '0' || cCharAt > '9')) {
                        Selection.setSelection(editable, this.f5395 + 2);
                    }
                }
            } else if ((this.f5395 == 3 && editable.length() == 4) || (this.f5395 == 6 && editable.length() == 7)) {
                editable.append('-');
            } else if (this.f5395 == 9 && editable.length() == 10) {
                editable.append(' ');
            } else if ((this.f5395 == 12 && editable.length() == 13) || (this.f5398 && this.f5395 == 15 && editable.length() == 16)) {
                editable.append(':');
            }
        }
        if (editable.length() > i) {
            editable.delete(i, editable.length());
        }
    }
}
