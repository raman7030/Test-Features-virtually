package p067l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ܰۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 97S2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15292 implements InterfaceC21152 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ char[] f43628;

    @Override // p067l.InterfaceC21152
    /* JADX INFO: renamed from: ֫ */
    public final Object mo9100(Object obj, Object obj2) {
        int iIndexOf;
        CharSequence charSequence = (CharSequence) obj;
        int iIntValue = ((Integer) obj2).intValue();
        C13045.m29867(charSequence, "$this$DelimitedRangesSequence");
        C13045.m29867(charSequence, "<this>");
        char[] cArr = this.f43628;
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
            int iM21362 = C9258.m21362(charSequence);
            if (iIntValue > iM21362) {
                iIndexOf = -1;
                break;
            }
            loop0: while (true) {
                char cCharAt = charSequence.charAt(iIntValue);
                for (char c : cArr) {
                    if (C3223.m5571(c, cCharAt, false)) {
                        iIndexOf = iIntValue;
                        break loop0;
                    }
                }
                if (iIntValue == iM21362) {
                    iIndexOf = -1;
                    break;
                }
                iIntValue++;
            }
        }
        if (iIndexOf < 0) {
            return null;
        }
        return new C17402(Integer.valueOf(iIndexOf), 1);
    }
}
