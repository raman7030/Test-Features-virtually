package p067l;

/* JADX INFO: renamed from: l.᩺ۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: L3BC */
/* JADX INFO: loaded from: classes.dex */
public final class C24201 extends C4401 {

    /* JADX INFO: renamed from: ܳ */
    public final char[] f76708;

    public C24201() {
        this(new C13473("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public C24201(C13473 c13473) {
        super(c13473, (Character) null);
        this.f76708 = new char[512];
        C6194.m14030(c13473.f37821.length == 16);
        for (int i = 0; i < 256; i++) {
            this.f76708[i] = c13473.m30616(i >>> 4);
            this.f76708[i | 256] = c13473.m30616(i & 15);
        }
    }

    @Override // p067l.C4401, p067l.AbstractC13119
    /* JADX INFO: renamed from: ֫ */
    public final void mo9159(StringBuilder sb, byte[] bArr, int i) {
        C6194.m14024(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            char[] cArr = this.f76708;
            sb.append(cArr[i3]);
            sb.append(cArr[i3 | 256]);
        }
    }

    @Override // p067l.C4401, p067l.AbstractC13119
    /* JADX INFO: renamed from: ֫ */
    public final int mo9155(byte[] bArr, CharSequence charSequence) throws C9449 {
        if (charSequence.length() % 2 == 1) {
            throw new C9449("Invalid input length " + charSequence.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            C13473 c13473 = this.f9888;
            bArr[i2] = (byte) ((c13473.m30617(cCharAt) << 4) | c13473.m30617(charSequence.charAt(i + 1)));
            i += 2;
            i2++;
        }
        return i2;
    }

    @Override // p067l.C4401
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC13119 mo9158(C13473 c13473, Character ch) {
        return new C24201(c13473);
    }
}
