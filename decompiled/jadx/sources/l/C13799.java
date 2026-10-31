package l;

import com.alipay.sdk.m.p.a;

/* JADX INFO: renamed from: l.ܰۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: L3BC */
/* JADX INFO: loaded from: classes4.dex */
public final class C13799 extends C2138 {
    public C13799(String str, String str2) {
        this(new C11684(str, str2.toCharArray()), Character.valueOf(a.h));
    }

    public C13799(C11684 c11684, Character ch) {
        super(c11684, ch);
        C4025.m12110(c11684.f34822.length == 64);
    }

    @Override // l.C2138, l.AbstractC11311
    /* JADX INFO: renamed from: ֫ */
    public final void mo7064(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        C4025.m12104(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = i2 + 2;
            int i5 = ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2] & 255) << 16);
            i2 += 3;
            int i6 = i5 | (bArr[i4] & 255);
            C11684 c11684 = this.f7102;
            sb.append(c11684.m28568(i6 >>> 18));
            sb.append(c11684.m28568((i6 >>> 12) & 63));
            sb.append(c11684.m28568((i6 >>> 6) & 63));
            sb.append(c11684.m28568(i6 & 63));
        }
        if (i2 < i) {
            m7065(sb, bArr, i2, i - i2);
        }
    }

    @Override // l.C2138, l.AbstractC11311
    /* JADX INFO: renamed from: ֫ */
    public final int mo7060(byte[] bArr, CharSequence charSequence) throws C7450 {
        CharSequence charSequenceMo7061 = mo7061(charSequence);
        int length = charSequenceMo7061.length();
        C11684 c11684 = this.f7102;
        if (!c11684.m28572(length)) {
            throw new C7450("Invalid input length " + charSequenceMo7061.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequenceMo7061.length()) {
            int i3 = i + 2;
            int iM28569 = (c11684.m28569(charSequenceMo7061.charAt(i + 1)) << 12) | (c11684.m28569(charSequenceMo7061.charAt(i)) << 18);
            int i4 = i2 + 1;
            bArr[i2] = (byte) (iM28569 >>> 16);
            if (i3 < charSequenceMo7061.length()) {
                int i5 = i + 3;
                int iM285610 = iM28569 | (c11684.m28569(charSequenceMo7061.charAt(i3)) << 6);
                int i6 = i2 + 2;
                bArr[i4] = (byte) ((iM285610 >>> 8) & 255);
                if (i5 < charSequenceMo7061.length()) {
                    i += 4;
                    i2 += 3;
                    bArr[i6] = (byte) ((iM285610 | c11684.m28569(charSequenceMo7061.charAt(i5))) & 255);
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

    @Override // l.C2138
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC11311 mo7063(C11684 c11684, Character ch) {
        return new C13799(c11684, ch);
    }
}
