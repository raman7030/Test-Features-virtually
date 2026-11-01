package p067l;

/* JADX INFO: renamed from: l.ۤܶ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: V42A */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12224 implements InterfaceC16446, InterfaceC22798 {

    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC14235 f34165;

    @Override // p067l.InterfaceC22798
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5861(C8374 c8374) {
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract byte[] mo5096();

    @Override // p067l.InterfaceC22798
    /* JADX INFO: renamed from: ۘ */
    public final int mo3348() {
        return 1;
    }

    /* JADX INFO: renamed from: ۧ */
    public abstract byte mo5097(int i);

    /* JADX INFO: renamed from: ۧ */
    public abstract int mo5098();

    /* JADX INFO: renamed from: ܿ */
    public abstract int mo5099();

    /* JADX INFO: renamed from: ᩳ */
    public abstract int mo5100();

    public AbstractC12224(AbstractC14235 abstractC14235) {
        this.f34165 = abstractC14235;
    }

    @Override // p067l.InterfaceC16446
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo28204(String str) {
        return toString().equals(str.toString());
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return toString().length();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return toString().charAt(i);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return toString().subSequence(i, i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC12224 m28202(AbstractC12224 abstractC12224) {
        int iMo5098 = mo5098();
        int iMo5099 = abstractC12224.mo5098() + iMo5098;
        byte[] bArr = new byte[iMo5099];
        m28203(0, bArr);
        abstractC12224.m28203(iMo5098, bArr);
        return this.f34165.mo17847(0, iMo5099, bArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC12224 m28200(char c, AbstractC12224 abstractC12224) {
        int iMo5098 = mo5098();
        int i = iMo5098 + 1;
        int iMo5099 = abstractC12224.mo5098() + i;
        byte[] bArr = new byte[iMo5099];
        m28203(0, bArr);
        bArr[iMo5098] = (byte) c;
        abstractC12224.m28203(i, bArr);
        return this.f34165.mo17847(0, iMo5099, bArr);
    }

    public final boolean isEmpty() {
        return mo5098() == 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m28199(byte b) {
        byte[] bArrMo5096 = mo5096();
        int iMo5100 = mo5100();
        int iMo5098 = mo5098();
        do {
            iMo5098--;
            if (iMo5098 < 0) {
                break;
            }
        } while (bArrMo5096[iMo5100 + iMo5098] != b);
        return iMo5098;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m28205(AbstractC12224 abstractC12224) {
        byte[] bArrMo5096 = mo5096();
        int iMo5100 = mo5100();
        int iMo5098 = mo5098();
        byte[] bArrMo5097 = abstractC12224.mo5096();
        int iMo5101 = abstractC12224.mo5100();
        int iMo5099 = abstractC12224.mo5098();
        if (iMo5098 >= iMo5099) {
            int i = 0;
            while (i < iMo5099 && bArrMo5096[iMo5100 + i] == bArrMo5097[iMo5101 + i]) {
                i++;
            }
            if (i == iMo5099) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC12224 m28201(int i, int i2) {
        if (i2 < i) {
            i2 = i;
        }
        byte[] bArrMo5096 = mo5096();
        return this.f34165.mo17847(mo5100() + i, i2 - i, bArrMo5096);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return C14514.m33173(mo5100(), mo5098(), mo5096());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28203(int i, byte[] bArr) {
        System.arraycopy(mo5096(), mo5100(), bArr, i, mo5098());
    }
}
