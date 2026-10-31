package l;

/* JADX INFO: renamed from: l.ۤܶ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: V42A */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10370 implements InterfaceC14812, InterfaceC21496 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC12486 f31203;

    @Override // l.InterfaceC21496
    /* JADX INFO: renamed from: ֫ */
    public final Object mo3574(C6319 c6319) {
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract byte[] mo2757();

    @Override // l.InterfaceC21496
    /* JADX INFO: renamed from: ۘ */
    public final int mo953() {
        return 1;
    }

    /* JADX INFO: renamed from: ۧ */
    public abstract byte mo2758(int i);

    /* JADX INFO: renamed from: ۧ */
    public abstract int mo2759();

    /* JADX INFO: renamed from: ܿ */
    public abstract int mo2760();

    /* JADX INFO: renamed from: ᩳ */
    public abstract int mo2761();

    public AbstractC10370(AbstractC12486 abstractC12486) {
        this.f31203 = abstractC12486;
    }

    @Override // l.InterfaceC14812
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo26175(String str) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC10370 m26173(AbstractC10370 abstractC10370) {
        int iMo2759 = mo2759();
        int iMo27510 = abstractC10370.mo2759() + iMo2759;
        byte[] bArr = new byte[iMo27510];
        m26174(0, bArr);
        abstractC10370.m26174(iMo2759, bArr);
        return this.f31203.mo15926(0, iMo27510, bArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC10370 m26171(char c, AbstractC10370 abstractC10370) {
        int iMo2759 = mo2759();
        int i = iMo2759 + 1;
        int iMo27510 = abstractC10370.mo2759() + i;
        byte[] bArr = new byte[iMo27510];
        m26174(0, bArr);
        bArr[iMo2759] = (byte) c;
        abstractC10370.m26174(i, bArr);
        return this.f31203.mo15926(0, iMo27510, bArr);
    }

    public final boolean isEmpty() {
        return mo2759() == 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m26170(byte b) {
        byte[] bArrMo2757 = mo2757();
        int iMo2761 = mo2761();
        int iMo2759 = mo2759();
        do {
            iMo2759--;
            if (iMo2759 < 0) {
                break;
            }
        } while (bArrMo2757[iMo2761 + iMo2759] != b);
        return iMo2759;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m26176(AbstractC10370 abstractC10370) {
        byte[] bArrMo2757 = mo2757();
        int iMo2761 = mo2761();
        int iMo2759 = mo2759();
        byte[] bArrMo2758 = abstractC10370.mo2757();
        int iMo2762 = abstractC10370.mo2761();
        int iMo27510 = abstractC10370.mo2759();
        if (iMo2759 >= iMo27510) {
            int i = 0;
            while (i < iMo27510 && bArrMo2757[iMo2761 + i] == bArrMo2758[iMo2762 + i]) {
                i++;
            }
            if (i == iMo27510) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC10370 m26172(int i, int i2) {
        if (i2 < i) {
            i2 = i;
        }
        byte[] bArrMo2757 = mo2757();
        return this.f31203.mo15926(mo2761() + i, i2 - i, bArrMo2757);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return C12780.m31089(mo2761(), mo2759(), mo2757());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26174(int i, byte[] bArr) {
        System.arraycopy(mo2757(), mo2761(), bArr, i, mo2759());
    }
}
