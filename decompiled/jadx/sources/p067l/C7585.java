package p067l;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ۚܿ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 7AZT */
/* JADX INFO: loaded from: classes2.dex */
public final class C7585 implements InputFilter {

    /* JADX INFO: renamed from: ᩸ */
    public AbstractC18333 f19873;

    /* JADX INFO: renamed from: ᩹ */
    public final TextView f19874;

    public C7585(TextView textView) {
        this.f19874 = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        TextView textView = this.f19874;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iM20667 = C8946.m20666().m20667();
        if (iM20667 != 0) {
            if (iM20667 == 1) {
                if ((i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i2 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return C8946.m20666().m20668(0, charSequence.length(), charSequence);
            }
            if (iM20667 != 3) {
                return charSequence;
            }
        }
        C8946 c8946M20666 = C8946.m20666();
        if (this.f19873 == null) {
            this.f19873 = new C2890(textView, this);
        }
        c8946M20666.m20671(this.f19873);
        return charSequence;
    }
}
