package p067l;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.۫ۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4D9 */
/* JADX INFO: loaded from: classes4.dex */
public class C13997 extends AbstractC14667 {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ۙ */
    public final byte[] f39501;

    /* JADX INFO: renamed from: ᩻ */
    public int mo31801() {
        return 0;
    }

    public C13997(byte[] bArr) {
        bArr.getClass();
        this.f39501 = bArr;
    }

    @Override // p067l.AbstractC7962
    /* JADX INFO: renamed from: ֫ */
    public byte mo18419(int i) {
        return this.f39501[i];
    }

    @Override // p067l.AbstractC7962
    /* JADX INFO: renamed from: ۧ */
    public byte mo18424(int i) {
        return this.f39501[i];
    }

    @Override // p067l.AbstractC7962
    public int size() {
        return this.f39501.length;
    }

    @Override // p067l.AbstractC7962
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC7962 mo18425(int i, int i2) {
        int iM18418 = AbstractC7962.m18418(i, i2, size());
        if (iM18418 == 0) {
            return AbstractC7962.f20935;
        }
        return new C23385(this.f39501, mo31801() + i, iM18418);
    }

    @Override // p067l.AbstractC7962
    /* JADX INFO: renamed from: ֫ */
    public void mo18422(int i, byte[] bArr, int i2, int i3) {
        System.arraycopy(this.f39501, i, bArr, i2, i3);
    }

    @Override // p067l.AbstractC7962
    /* JADX INFO: renamed from: ֫ */
    public final void mo18423(AbstractC16402 abstractC16402) {
        abstractC16402.mo5685(mo31801(), size(), this.f39501);
    }

    @Override // p067l.AbstractC7962
    /* JADX INFO: renamed from: ֫ */
    public final String mo18421(Charset charset) {
        return new String(this.f39501, mo31801(), size(), charset);
    }

    @Override // p067l.AbstractC7962
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo18426() {
        int iMo31801 = mo31801();
        return C13840.m31518(iMo31801, size() + iMo31801, this.f39501);
    }

    @Override // p067l.AbstractC7962
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7962) || size() != ((AbstractC7962) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C13997)) {
            return obj.equals(this);
        }
        C13997 c13997 = (C13997) obj;
        int iM18430 = m18430();
        int iM18431 = c13997.m18430();
        if (iM18430 != 0 && iM18431 != 0 && iM18430 != iM18431) {
            return false;
        }
        int size = size();
        if (size > c13997.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        int i = 0 + size;
        if (i > c13997.size()) {
            StringBuilder sbM49005 = C21720.m49005("Ran off end of other: ", 0, ", ", ", ", size);
            sbM49005.append(c13997.size());
            throw new IllegalArgumentException(sbM49005.toString());
        }
        if (!(c13997 instanceof C13997)) {
            return c13997.mo18425(0, i).equals(mo18425(0, size));
        }
        byte[] bArr = c13997.f39501;
        int iMo31801 = mo31801() + size;
        int iMo31802 = mo31801();
        int iMo31803 = c13997.mo31801() + 0;
        while (iMo31802 < iMo31801) {
            if (this.f39501[iMo31802] != bArr[iMo31803]) {
                return false;
            }
            iMo31802++;
            iMo31803++;
        }
        return true;
    }

    @Override // p067l.AbstractC7962
    /* JADX INFO: renamed from: ֫ */
    public final int mo18420(int i, int i2, int i3) {
        int iMo31801 = mo31801() + i2;
        byte[] bArr = C15671.f44805;
        for (int i4 = iMo31801; i4 < iMo31801 + i3; i4++) {
            i = (i * 31) + this.f39501[i4];
        }
        return i;
    }

    @Override // p067l.AbstractC7962
    /* JADX INFO: renamed from: ܽ */
    public final AbstractC9303 mo18428() {
        return AbstractC9303.m21516(true, mo31801(), size(), this.f39501);
    }
}
