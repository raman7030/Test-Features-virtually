package p067l;

import com.alipay.sdk.p010m.p041p.C0184a;

/* JADX INFO: renamed from: l.֫᩺ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: L3BC */
/* JADX INFO: loaded from: classes2.dex */
public class C4401 extends AbstractC13119 {

    /* JADX INFO: renamed from: ܽ */
    public final C13473 f9888;

    /* JADX INFO: renamed from: ܿ */
    public final Character f9889;

    /* JADX INFO: renamed from: ᩳ */
    public volatile AbstractC13119 f9890;

    public C4401(C13473 c13473, Character ch) {
        c13473.getClass();
        this.f9888 = c13473;
        C6194.m14027(ch, "Padding character %s was already in alphabet", ch == null || !c13473.m30619(ch.charValue()));
        this.f9889 = ch;
    }

    public C4401(String str, String str2) {
        this(new C13473(str, str2.toCharArray()), Character.valueOf(C0184a.f880h));
    }

    @Override // p067l.AbstractC13119
    /* JADX INFO: renamed from: ֫ */
    public void mo9159(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        C6194.m14024(0, i, bArr.length);
        while (i2 < i) {
            C13473 c13473 = this.f9888;
            m9160(sb, bArr, i2, Math.min(c13473.f37819, i - i2));
            i2 += c13473.f37819;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9160(StringBuilder sb, byte[] bArr, int i, int i2) {
        C6194.m14024(i, i + i2, bArr.length);
        C13473 c13473 = this.f9888;
        int i3 = c13473.f37819;
        int i4 = c13473.f37817;
        int i5 = 0;
        C6194.m14030(i2 <= i3);
        long j = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            j = (j | ((long) (bArr[i + i6] & 255))) << 8;
        }
        int i7 = ((i2 + 1) * 8) - i4;
        while (i5 < i2 * 8) {
            sb.append(c13473.m30616(((int) (j >>> (i7 - i5))) & c13473.f37825));
            i5 += i4;
        }
        Character ch = this.f9889;
        if (ch != null) {
            while (i5 < c13473.f37819 * 8) {
                sb.append(ch.charValue());
                i5 += i4;
            }
        }
    }

    @Override // p067l.AbstractC13119
    /* JADX INFO: renamed from: ֫ */
    public int mo9155(byte[] bArr, CharSequence charSequence) throws C9449 {
        CharSequence charSequenceMo9156 = mo9156(charSequence);
        int length = charSequenceMo9156.length();
        C13473 c13473 = this.f9888;
        boolean zM30620 = c13473.m30620(length);
        int i = c13473.f37817;
        int i2 = c13473.f37823;
        if (!zM30620) {
            throw new C9449("Invalid input length " + charSequenceMo9156.length());
        }
        int i3 = 0;
        for (int i4 = 0; i4 < charSequenceMo9156.length(); i4 += i2) {
            long jM30617 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                jM30617 <<= i;
                if (i4 + i6 < charSequenceMo9156.length()) {
                    jM30617 |= (long) c13473.m30617(charSequenceMo9156.charAt(i5 + i4));
                    i5++;
                }
            }
            int i7 = c13473.f37819;
            int i8 = (i7 * 8) - (i5 * i);
            int i9 = (i7 - 1) * 8;
            while (i9 >= i8) {
                bArr[i3] = (byte) ((jM30617 >>> i9) & 255);
                i9 -= 8;
                i3++;
            }
        }
        return i3;
    }

    @Override // p067l.AbstractC13119
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC13119 mo9161() {
        return this.f9889 == null ? this : mo9158(this.f9888, (Character) null);
    }

    @Override // p067l.AbstractC13119
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC13119 mo9157() {
        AbstractC13119 abstractC13119Mo9158 = this.f9890;
        if (abstractC13119Mo9158 == null) {
            C13473 c13473M30618 = this.f9888.m30618();
            abstractC13119Mo9158 = c13473M30618 == this.f9888 ? this : mo9158(c13473M30618, this.f9889);
            this.f9890 = abstractC13119Mo9158;
        }
        return abstractC13119Mo9158;
    }

    @Override // p067l.AbstractC13119
    /* JADX INFO: renamed from: ֫ */
    public final CharSequence mo9156(CharSequence charSequence) {
        charSequence.getClass();
        Character ch = this.f9889;
        if (ch == null) {
            return charSequence;
        }
        char cCharValue = ch.charValue();
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == cCharValue);
        return charSequence.subSequence(0, length + 1);
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC13119 mo9158(C13473 c13473, Character ch) {
        return new C4401(c13473, ch);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        C13473 c13473 = this.f9888;
        sb.append(c13473);
        if (8 % c13473.f37817 != 0) {
            Character ch = this.f9889;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4401) {
            C4401 c4401 = (C4401) obj;
            if (this.f9888.equals(c4401.f9888) && C12826.equals(this.f9889, c4401.f9889)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f9888.hashCode() ^ C12826.hashCode(this.f9889);
    }
}
