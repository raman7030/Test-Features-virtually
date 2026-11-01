package p067l;

import java.math.BigInteger;
import java.text.Collator;

/* JADX INFO: renamed from: l.ۛ۬ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M2AR */
/* JADX INFO: loaded from: classes2.dex */
public final class C8145 implements Comparable {

    /* JADX INFO: renamed from: ۗ */
    public String f21500;

    /* JADX INFO: renamed from: ۙ */
    public BigInteger f21501;

    /* JADX INFO: renamed from: ۬ */
    public String f21502;

    /* JADX INFO: renamed from: ᩶ */
    public int f21503;

    /* JADX INFO: renamed from: ᩸ */
    public Collator f21504;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f21505;

    public C8145(Collator collator, String str, boolean z) {
        this.f21504 = collator;
        if (str.isEmpty() || str.charAt(0) < 128) {
            this.f21503 = 0;
        } else {
            this.f21503 = 1;
        }
        this.f21505 = z;
        if (z) {
            try {
                this.f21501 = new BigInteger(str);
            } catch (NumberFormatException unused) {
                this.f21501 = BigInteger.ZERO;
            }
        }
        this.f21500 = str;
        this.f21502 = str.toLowerCase();
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0074 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C8145 c8145) {
        int iCompare;
        int iCompareTo;
        int i = c8145.f21503;
        int i2 = this.f21503;
        if (i2 != i) {
            return i2 - i;
        }
        if (this.f21505 && c8145.f21505 && (iCompareTo = this.f21501.compareTo(c8145.f21501)) != 0) {
            return iCompareTo;
        }
        String str = c8145.f21502;
        int i3 = C9486.f25986;
        String str2 = this.f21502;
        int length = str2.length();
        int length2 = str.length();
        int iMin = Math.min(str2.length(), length2);
        for (int i4 = 0; i4 < iMin; i4++) {
            char cCharAt = str2.charAt(i4);
            char cCharAt2 = str.charAt(i4);
            if (cCharAt != cCharAt2) {
                iCompare = 1;
                boolean z = cCharAt <= 127;
                boolean z2 = cCharAt2 <= 127;
                if (z && z2) {
                    iCompare = cCharAt - cCharAt2;
                } else if (z) {
                    iCompare = -1;
                } else if (!z2) {
                    iCompare = this.f21504.compare(String.valueOf(cCharAt), String.valueOf(cCharAt2));
                    if (iCompare != 0) {
                    }
                }
                if (iCompare != 0) {
                    return iCompare;
                }
                return this.f21500.compareTo(c8145.f21500);
            }
        }
        iCompare = Integer.compare(length, length2);
        if (iCompare != 0) {
            return iCompare;
        }
        return this.f21500.compareTo(c8145.f21500);
    }

    public final String toString() {
        return this.f21502;
    }
}
