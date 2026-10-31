package l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.ܶܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: E1N7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15283 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC1173 m36291(CharSequence charSequence) {
        C15859 c15859 = new C15859();
        int i = 0;
        while (true) {
            int iIndexOf = TextUtils.indexOf(charSequence, '\n', i);
            if (iIndexOf != -1) {
                c15859.add(iIndexOf);
                i = iIndexOf + 1;
            } else {
                c15859.add(charSequence.length());
                int[] iArrMo3586 = c15859.mo3586();
                charSequence.length();
                return new C8229(iArrMo3586);
            }
        }
    }
}
