package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ܰۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 97S2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13598 implements InterfaceC19763 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ char[] f40550;

    @Override // l.InterfaceC19763
    /* JADX INFO: renamed from: ֫ */
    public final Object mo6973(Object obj, Object obj2) {
        int iIndexOf;
        CharSequence charSequence = (CharSequence) obj;
        int iIntValue = ((Integer) obj2).intValue();
        C11233.m27805(charSequence, "$this$DelimitedRangesSequence");
        C11233.m27805(charSequence, "<this>");
        char[] cArr = this.f40550;
        if (cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length != 1) {
                throw new IllegalArgumentException("Array has more than one element.");
            }
            iIndexOf = ((String) charSequence).indexOf(cArr[0], iIntValue);
        } else {
            if (iIntValue < 0) {
                iIntValue = 0;
            }
            int iM19396 = C7249.m19396(charSequence);
            if (iIntValue > iM19396) {
                iIndexOf = -1;
                break;
            }
            loop0: while (true) {
                char cCharAt = charSequence.charAt(iIntValue);
                for (char c : cArr) {
                    if (C0899.m3252(c, cCharAt, false)) {
                        iIndexOf = iIntValue;
                        break loop0;
                    }
                }
                if (iIntValue == iM19396) {
                    iIndexOf = -1;
                    break;
                }
                iIntValue++;
            }
        }
        if (iIndexOf < 0) {
            return null;
        }
        return new C15818(Integer.valueOf(iIndexOf), 1);
    }
}
