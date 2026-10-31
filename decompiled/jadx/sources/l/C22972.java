package l;

/* JADX INFO: renamed from: l.᩺ۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: L3BC */
/* JADX INFO: loaded from: classes.dex */
public final class C22972 extends C2138 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final char[] f73977;

    public C22972() {
        this(new C11684("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public C22972(C11684 c11684) {
        super(c11684, (Character) null);
        this.f73977 = new char[512];
        C4025.m12110(c11684.f34822.length == 16);
        for (int i = 0; i < 256; i++) {
            this.f73977[i] = c11684.m28568(i >>> 4);
            this.f73977[i | 256] = c11684.m28568(i & 15);
        }
    }

    @Override // l.C2138, l.AbstractC11311
    /* JADX INFO: renamed from: ֫ */
    public final void mo7064(StringBuilder sb, byte[] bArr, int i) {
        C4025.m12104(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            char[] cArr = this.f73977;
            sb.append(cArr[i3]);
            sb.append(cArr[i3 | 256]);
        }
    }

    @Override // l.C2138, l.AbstractC11311
    /* JADX INFO: renamed from: ֫ */
    public final int mo7060(byte[] bArr, CharSequence charSequence) throws C7450 {
        if (charSequence.length() % 2 == 1) {
            throw new C7450("Invalid input length " + charSequence.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            C11684 c11684 = this.f7102;
            bArr[i2] = (byte) ((c11684.m28569(cCharAt) << 4) | c11684.m28569(charSequence.charAt(i + 1)));
            i += 2;
            i2++;
        }
        return i2;
    }

    @Override // l.C2138
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC11311 mo7063(C11684 c11684, Character ch) {
        return new C22972(c11684);
    }
}
