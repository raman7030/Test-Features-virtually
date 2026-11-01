package p067l;

import android.os.Build;
import android.text.InputFilter;
import android.text.Spanned;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۙ۬ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y91P */
/* JADX INFO: loaded from: classes2.dex */
public final class C6801 implements InputFilter {

    /* JADX INFO: renamed from: ᩸ */
    public static final InputFilter f17659;

    static {
        InputFilter c6801;
        if (Build.VERSION.SDK_INT >= 27) {
            Locale locale = Locale.ENGLISH;
            c6801 = C23565.m52376();
        } else {
            c6801 = new C6801();
        }
        f17659 = c6801;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        for (int i5 = i; i5 < i2; i5++) {
            if (Character.isLowerCase(charSequence.charAt(i5))) {
                if (charSequence instanceof Spanned) {
                    return new C21554((Spanned) charSequence, i, i2);
                }
                return charSequence.subSequence(i, i2).toString().toLowerCase();
            }
        }
        return charSequence;
    }
}
