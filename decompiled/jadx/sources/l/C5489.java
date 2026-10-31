package l;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ۚܿ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 7AZT */
/* JADX INFO: loaded from: classes2.dex */
public final class C5489 implements InputFilter {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC16798 f17033;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final TextView f17034;

    public C5489(TextView textView) {
        this.f17034 = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        TextView textView = this.f17034;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iM18718 = C6921.m18717().m18718();
        if (iM18718 != 0) {
            if (iM18718 == 1) {
                if ((i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i2 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return C6921.m18717().m18719(0, charSequence.length(), charSequence);
            }
            if (iM18718 != 3) {
                return charSequence;
            }
        }
        C6921 c6921M18717 = C6921.m18717();
        if (this.f17033 == null) {
            this.f17033 = new C0549(textView, this);
        }
        c6921M18717.m18722(this.f17033);
        return charSequence;
    }
}
