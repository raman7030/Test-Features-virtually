package l;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.۫ۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4D9 */
/* JADX INFO: loaded from: classes4.dex */
public class C12236 extends AbstractC12941 {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f36484;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int mo29739() {
        return 0;
    }

    public C12236(byte[] bArr) {
        bArr.getClass();
        this.f36484 = bArr;
    }

    @Override // l.AbstractC5886
    /* JADX INFO: renamed from: ֫ */
    public byte mo16493(int i) {
        return this.f36484[i];
    }

    @Override // l.AbstractC5886
    /* JADX INFO: renamed from: ۧ */
    public byte mo16498(int i) {
        return this.f36484[i];
    }

    @Override // l.AbstractC5886
    public int size() {
        return this.f36484.length;
    }

    @Override // l.AbstractC5886
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC5886 mo16499(int i, int i2) {
        int iM16492 = AbstractC5886.m16492(i, i2, size());
        if (iM16492 == 0) {
            return AbstractC5886.f18080;
        }
        return new C22114(this.f36484, mo29739() + i, iM16492);
    }

    @Override // l.AbstractC5886
    /* JADX INFO: renamed from: ֫ */
    public void mo16496(int i, byte[] bArr, int i2, int i3) {
        System.arraycopy(this.f36484, i, bArr, i2, i3);
    }

    @Override // l.AbstractC5886
    /* JADX INFO: renamed from: ֫ */
    public final void mo16497(AbstractC14766 abstractC14766) {
        abstractC14766.mo3366(mo29739(), size(), this.f36484);
    }

    @Override // l.AbstractC5886
    /* JADX INFO: renamed from: ֫ */
    public final String mo16495(Charset charset) {
        return new String(this.f36484, mo29739(), size(), charset);
    }

    @Override // l.AbstractC5886
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo16500() {
        int iMo29739 = mo29739();
        return C12071.m29456(iMo29739, size() + iMo29739, this.f36484);
    }

    @Override // l.AbstractC5886
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5886) || size() != ((AbstractC5886) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C12236)) {
            return obj.equals(this);
        }
        C12236 c12236 = (C12236) obj;
        int iM16504 = m16504();
        int iM16505 = c12236.m16504();
        if (iM16504 != 0 && iM16505 != 0 && iM16504 != iM16505) {
            return false;
        }
        int size = size();
        if (size > c12236.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        int i = 0 + size;
        if (i > c12236.size()) {
            StringBuilder sbM46682 = C20361.m46682("Ran off end of other: ", 0, ", ", ", ", size);
            sbM46682.append(c12236.size());
            throw new IllegalArgumentException(sbM46682.toString());
        }
        if (!(c12236 instanceof C12236)) {
            return c12236.mo16499(0, i).equals(mo16499(0, size));
        }
        byte[] bArr = c12236.f36484;
        int iMo29739 = mo29739() + size;
        int iMo297310 = mo29739();
        int iMo297311 = c12236.mo29739() + 0;
        while (iMo297310 < iMo29739) {
            if (this.f36484[iMo297310] != bArr[iMo297311]) {
                return false;
            }
            iMo297310++;
            iMo297311++;
        }
        return true;
    }

    @Override // l.AbstractC5886
    /* JADX INFO: renamed from: ֫ */
    public final int mo16494(int i, int i2, int i3) {
        int iMo29739 = mo29739() + i2;
        byte[] bArr = C13997.f41722;
        for (int i4 = iMo29739; i4 < iMo29739 + i3; i4++) {
            i = (i * 31) + this.f36484[i4];
        }
        return i;
    }

    @Override // l.AbstractC5886
    /* JADX INFO: renamed from: ܽ */
    public final AbstractC7297 mo16502() {
        return AbstractC7297.m19548(true, mo29739(), size(), this.f36484);
    }
}
