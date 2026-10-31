package l;

import com.alipay.sdk.m.p.a;

/* JADX INFO: renamed from: l.֫᩺ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: L3BC */
/* JADX INFO: loaded from: classes2.dex */
public class C2138 extends AbstractC11311 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C11684 f7102;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Character f7103;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public volatile AbstractC11311 f7104;

    public C2138(C11684 c11684, Character ch) {
        c11684.getClass();
        this.f7102 = c11684;
        C4025.m12107(ch, "Padding character %s was already in alphabet", ch == null || !c11684.m28571(ch.charValue()));
        this.f7103 = ch;
    }

    public C2138(String str, String str2) {
        this(new C11684(str, str2.toCharArray()), Character.valueOf(a.h));
    }

    @Override // l.AbstractC11311
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo7064(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        C4025.m12104(0, i, bArr.length);
        while (i2 < i) {
            C11684 c11684 = this.f7102;
            m7065(sb, bArr, i2, Math.min(c11684.f34820, i - i2));
            i2 += c11684.f34820;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7065(StringBuilder sb, byte[] bArr, int i, int i2) {
        C4025.m12104(i, i + i2, bArr.length);
        C11684 c11684 = this.f7102;
        int i3 = c11684.f34820;
        int i4 = c11684.f34818;
        int i5 = 0;
        C4025.m12110(i2 <= i3);
        long j = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            j = (j | ((long) (bArr[i + i6] & 255))) << 8;
        }
        int i7 = ((i2 + 1) * 8) - i4;
        while (i5 < i2 * 8) {
            sb.append(c11684.m28568(((int) (j >>> (i7 - i5))) & c11684.f34826));
            i5 += i4;
        }
        Character ch = this.f7103;
        if (ch != null) {
            while (i5 < c11684.f34820 * 8) {
                sb.append(ch.charValue());
                i5 += i4;
            }
        }
    }

    @Override // l.AbstractC11311
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int mo7060(byte[] bArr, CharSequence charSequence) throws C7450 {
        CharSequence charSequenceMo7061 = mo7061(charSequence);
        int length = charSequenceMo7061.length();
        C11684 c11684 = this.f7102;
        boolean zM28572 = c11684.m28572(length);
        int i = c11684.f34818;
        int i2 = c11684.f34824;
        if (!zM28572) {
            throw new C7450("Invalid input length " + charSequenceMo7061.length());
        }
        int i3 = 0;
        for (int i4 = 0; i4 < charSequenceMo7061.length(); i4 += i2) {
            long jM28569 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                jM28569 <<= i;
                if (i4 + i6 < charSequenceMo7061.length()) {
                    jM28569 |= (long) c11684.m28569(charSequenceMo7061.charAt(i5 + i4));
                    i5++;
                }
            }
            int i7 = c11684.f34820;
            int i8 = (i7 * 8) - (i5 * i);
            int i9 = (i7 - 1) * 8;
            while (i9 >= i8) {
                bArr[i3] = (byte) ((jM28569 >>> i9) & 255);
                i9 -= 8;
                i3++;
            }
        }
        return i3;
    }

    @Override // l.AbstractC11311
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC11311 mo7066() {
        return this.f7103 == null ? this : mo7063(this.f7102, (Character) null);
    }

    @Override // l.AbstractC11311
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC11311 mo7062() {
        AbstractC11311 abstractC11311Mo7063 = this.f7104;
        if (abstractC11311Mo7063 == null) {
            C11684 c11684M28570 = this.f7102.m28570();
            abstractC11311Mo7063 = c11684M28570 == this.f7102 ? this : mo7063(c11684M28570, this.f7103);
            this.f7104 = abstractC11311Mo7063;
        }
        return abstractC11311Mo7063;
    }

    @Override // l.AbstractC11311
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final CharSequence mo7061(CharSequence charSequence) {
        charSequence.getClass();
        Character ch = this.f7103;
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC11311 mo7063(C11684 c11684, Character ch) {
        return new C2138(c11684, ch);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        C11684 c11684 = this.f7102;
        sb.append(c11684);
        if (8 % c11684.f34818 != 0) {
            Character ch = this.f7103;
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
        if (obj instanceof C2138) {
            C2138 c2138 = (C2138) obj;
            if (this.f7102.equals(c2138.f7102) && C11003.equals(this.f7103, c2138.f7103)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f7102.hashCode() ^ C11003.hashCode(this.f7103);
    }
}
