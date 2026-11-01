package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩶۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21543 {

    /* JADX INFO: renamed from: a */
    public final String f67946a;

    /* JADX INFO: renamed from: b */
    public final String f67947b;

    /* JADX INFO: renamed from: c */
    public final String f67948c;

    /* JADX INFO: renamed from: d */
    public String[] f67949d;

    /* JADX INFO: renamed from: e */
    public int f67950e;

    /* JADX INFO: renamed from: f */
    public int f67951f;

    public C21543(CharSequence charSequence) {
        this(charSequence, "", "");
    }

    public C21543(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        C12826.requireNonNull(charSequence2, "The prefix must not be null");
        C12826.requireNonNull(charSequence, "The delimiter must not be null");
        C12826.requireNonNull(charSequence3, "The suffix must not be null");
        this.f67946a = charSequence2.toString();
        this.f67947b = charSequence.toString();
        this.f67948c = charSequence3.toString();
    }

    /* JADX INFO: renamed from: b */
    public static int m48725b(String str, char[] cArr, int i) {
        int length = str.length();
        str.getChars(0, length, cArr, i);
        return length;
    }

    public String toString() {
        String[] strArr = this.f67949d;
        int i = this.f67950e;
        String str = this.f67946a;
        int length = str.length();
        String str2 = this.f67948c;
        int length2 = str2.length() + length;
        if (length2 == 0) {
            m48726a();
            return i == 0 ? "" : strArr[0];
        }
        char[] cArr = new char[this.f67951f + length2];
        int iM48725b = m48725b(str, cArr, 0);
        if (i > 0) {
            int iM48725b2 = m48725b(strArr[0], cArr, iM48725b) + iM48725b;
            for (int i2 = 1; i2 < i; i2++) {
                int iM48725b3 = m48725b(this.f67947b, cArr, iM48725b2) + iM48725b2;
                iM48725b2 = m48725b(strArr[i2], cArr, iM48725b3) + iM48725b3;
            }
            iM48725b = iM48725b2;
        }
        m48725b(str2, cArr, iM48725b);
        return new String(cArr);
    }

    public C21543 add(CharSequence charSequence) {
        String strValueOf = String.valueOf(charSequence);
        String[] strArr = this.f67949d;
        if (strArr == null) {
            this.f67949d = new String[8];
        } else {
            int i = this.f67950e;
            if (i == strArr.length) {
                this.f67949d = (String[]) Arrays.copyOf(strArr, i * 2);
            }
            this.f67951f = this.f67947b.length() + this.f67951f;
        }
        this.f67951f = strValueOf.length() + this.f67951f;
        String[] strArr2 = this.f67949d;
        int i2 = this.f67950e;
        this.f67950e = i2 + 1;
        strArr2[i2] = strValueOf;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final void m48726a() {
        String[] strArr;
        if (this.f67950e > 1) {
            char[] cArr = new char[this.f67951f];
            int iM48725b = m48725b(this.f67949d[0], cArr, 0);
            int i = 1;
            do {
                int iM48725b2 = m48725b(this.f67947b, cArr, iM48725b) + iM48725b;
                iM48725b = m48725b(this.f67949d[i], cArr, iM48725b2) + iM48725b2;
                strArr = this.f67949d;
                strArr[i] = null;
                i++;
            } while (i < this.f67950e);
            this.f67950e = 1;
            strArr[0] = new String(cArr);
        }
    }
}
