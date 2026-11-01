package p067l;

import com.alipay.sdk.p010m.p041p.C0184a;

/* JADX INFO: renamed from: l.ܰۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: L3BC */
/* JADX INFO: loaded from: classes4.dex */
public final class C15483 extends C4401 {
    public C15483(String str, String str2) {
        this(new C13473(str, str2.toCharArray()), Character.valueOf(C0184a.f880h));
    }

    public C15483(C13473 c13473, Character ch) {
        super(c13473, ch);
        C6194.m14030(c13473.f37821.length == 64);
    }

    @Override // p067l.C4401, p067l.AbstractC13119
    /* JADX INFO: renamed from: ֫ */
    public final void mo9159(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        C6194.m14024(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = i2 + 2;
            int i5 = ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2] & 255) << 16);
            i2 += 3;
            int i6 = i5 | (bArr[i4] & 255);
            C13473 c13473 = this.f9888;
            sb.append(c13473.m30616(i6 >>> 18));
            sb.append(c13473.m30616((i6 >>> 12) & 63));
            sb.append(c13473.m30616((i6 >>> 6) & 63));
            sb.append(c13473.m30616(i6 & 63));
        }
        if (i2 < i) {
            m9160(sb, bArr, i2, i - i2);
        }
    }

    @Override // p067l.C4401, p067l.AbstractC13119
    /* JADX INFO: renamed from: ֫ */
    public final int mo9155(byte[] bArr, CharSequence charSequence) throws C9449 {
        CharSequence charSequenceMo9156 = mo9156(charSequence);
        int length = charSequenceMo9156.length();
        C13473 c13473 = this.f9888;
        if (!c13473.m30620(length)) {
            throw new C9449("Invalid input length " + charSequenceMo9156.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequenceMo9156.length()) {
            int i3 = i + 2;
            int iM30617 = (c13473.m30617(charSequenceMo9156.charAt(i + 1)) << 12) | (c13473.m30617(charSequenceMo9156.charAt(i)) << 18);
            int i4 = i2 + 1;
            bArr[i2] = (byte) (iM30617 >>> 16);
            if (i3 < charSequenceMo9156.length()) {
                int i5 = i + 3;
                int iM30618 = iM30617 | (c13473.m30617(charSequenceMo9156.charAt(i3)) << 6);
                int i6 = i2 + 2;
                bArr[i4] = (byte) ((iM30618 >>> 8) & 255);
                if (i5 < charSequenceMo9156.length()) {
                    i += 4;
                    i2 += 3;
                    bArr[i6] = (byte) ((iM30618 | c13473.m30617(charSequenceMo9156.charAt(i5))) & 255);
                } else {
                    i2 = i6;
                    i = i5;
                }
            } else {
                i2 = i4;
                i = i3;
            }
        }
        return i2;
    }

    @Override // p067l.C4401
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC13119 mo9158(C13473 c13473, Character ch) {
        return new C15483(c13473, ch);
    }
}
