package p067l;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۛۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4D9 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7962 implements Iterable, Serializable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ᩶ */
    public static final InterfaceC21374 f20934;

    /* JADX INFO: renamed from: ᩹ */
    public static final AbstractC7962 f20935 = new C13997(C15671.f44805);

    /* JADX INFO: renamed from: ᩸ */
    public int f20936 = 0;

    public abstract boolean equals(Object obj);

    public abstract int size();

    /* JADX INFO: renamed from: ֫ */
    public abstract byte mo18419(int i);

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo18420(int i, int i2, int i3);

    /* JADX INFO: renamed from: ֫ */
    public abstract String mo18421(Charset charset);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo18422(int i, byte[] bArr, int i2, int i3);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo18423(AbstractC16402 abstractC16402);

    /* JADX INFO: renamed from: ۧ */
    public abstract byte mo18424(int i);

    /* JADX INFO: renamed from: ۧ */
    public abstract AbstractC7962 mo18425(int i, int i2);

    /* JADX INFO: renamed from: ۧ */
    public abstract boolean mo18426();

    /* JADX INFO: renamed from: ܽ */
    public abstract AbstractC9303 mo18428();

    static {
        InterfaceC21374 c22715;
        if (C2597.m3899()) {
            c22715 = new C11986();
        } else {
            c22715 = new C22715();
        }
        f20934 = c22715;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new C9974(this);
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC7962 m18416(int i, int i2, byte[] bArr) {
        m18418(i, i + i2, bArr.length);
        return new C13997(f20934.mo27423(i, i2, bArr));
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC7962 m18417(String str) {
        return new C13997(str.getBytes(C15671.f44807));
    }

    /* JADX INFO: renamed from: ܿ */
    public final byte[] m18429() {
        int size = size();
        if (size == 0) {
            return C15671.f44805;
        }
        byte[] bArr = new byte[size];
        mo18422(0, bArr, 0, size);
        return bArr;
    }

    /* JADX INFO: renamed from: ܳ */
    public final String m18427() {
        return size() == 0 ? "" : mo18421(C15671.f44807);
    }

    public final int hashCode() {
        int iMo18420 = this.f20936;
        if (iMo18420 == 0) {
            int size = size();
            iMo18420 = mo18420(size, 0, size);
            if (iMo18420 == 0) {
                iMo18420 = 1;
            }
            this.f20936 = iMo18420;
        }
        return iMo18420;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m18430() {
        return this.f20936;
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m18418(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(C19768.m44906(i, "Beginning index: ", " < 0"));
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException(C19768.m44907("Beginning index larger than ending index: ", i, i2, ", "));
        }
        throw new IndexOutOfBoundsException(C19768.m44907("End index: ", i2, i3, " >= "));
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        String strM7389 = size() <= 50 ? C3781.m7389(this) : C10965.m25286(new StringBuilder(), C3781.m7389(mo18425(0, 47)), "...");
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(size);
        sb.append(" contents=\"");
        return C10965.m25286(sb, strM7389, "\">");
    }
}
