package l;

import java.math.BigInteger;
import java.text.Collator;

/* JADX INFO: renamed from: l.ۛ۬ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M2AR */
/* JADX INFO: loaded from: classes2.dex */
public final class C6078 implements Comparable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public String f18644;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public BigInteger f18645;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f18646;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f18647;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Collator f18648;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f18649;

    public C6078(Collator collator, String str, boolean z) {
        this.f18648 = collator;
        if (str.isEmpty() || str.charAt(0) < 128) {
            this.f18647 = 0;
        } else {
            this.f18647 = 1;
        }
        this.f18649 = z;
        if (z) {
            try {
                this.f18645 = new BigInteger(str);
            } catch (NumberFormatException unused) {
                this.f18645 = BigInteger.ZERO;
            }
        }
        this.f18644 = str;
        this.f18646 = str.toLowerCase();
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0074 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C6078 c6078) {
        int iCompare;
        int iCompareTo;
        int i = c6078.f18647;
        int i2 = this.f18647;
        if (i2 != i) {
            return i2 - i;
        }
        if (this.f18649 && c6078.f18649 && (iCompareTo = this.f18645.compareTo(c6078.f18645)) != 0) {
            return iCompareTo;
        }
        String str = c6078.f18646;
        int i3 = C7489.f23073;
        String str2 = this.f18646;
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
                    iCompare = this.f18648.compare(String.valueOf(cCharAt), String.valueOf(cCharAt2));
                    if (iCompare != 0) {
                    }
                }
                if (iCompare != 0) {
                    return iCompare;
                }
                return this.f18644.compareTo(c6078.f18644);
            }
        }
        iCompare = Integer.compare(length, length2);
        if (iCompare != 0) {
            return iCompare;
        }
        return this.f18644.compareTo(c6078.f18644);
    }

    public final String toString() {
        return this.f18646;
    }
}
