package p067l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.ܶܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: E1N7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16893 {
    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC3483 m38452(CharSequence charSequence) {
        C17441 c17441 = new C17441();
        int i = 0;
        while (true) {
            int iIndexOf = TextUtils.indexOf(charSequence, '\n', i);
            if (iIndexOf != -1) {
                c17441.add(iIndexOf);
                i = iIndexOf + 1;
            } else {
                c17441.add(charSequence.length());
                int[] iArrMo5873 = c17441.mo5873();
                charSequence.length();
                return new C10189(iArrMo5873);
            }
        }
    }
}
