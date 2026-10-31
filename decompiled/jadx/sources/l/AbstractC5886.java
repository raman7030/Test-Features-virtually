package l;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۛۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4D9 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5886 implements Iterable, Serializable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final InterfaceC19998 f18079;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final AbstractC5886 f18080 = new C12236(C13997.f41722);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f18081 = 0;

    public abstract boolean equals(Object obj);

    public abstract int size();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract byte mo16493(int i);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract int mo16494(int i, int i2, int i3);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract String mo16495(Charset charset);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo16496(int i, byte[] bArr, int i2, int i3);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo16497(AbstractC14766 abstractC14766);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract byte mo16498(int i);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract AbstractC5886 mo16499(int i, int i2);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract boolean mo16500();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public abstract AbstractC7297 mo16502();

    static {
        InterfaceC19998 c21409;
        if (C0241.m1501()) {
            c21409 = new C10120();
        } else {
            c21409 = new C21409();
        }
        f18079 = c21409;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new C8003(this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC5886 m16490(int i, int i2, byte[] bArr) {
        m16492(i, i + i2, bArr.length);
        return new C12236(f18079.mo25403(i, i2, bArr));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC5886 m16491(String str) {
        return new C12236(str.getBytes(C13997.f41724));
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final byte[] m16503() {
        int size = size();
        if (size == 0) {
            return C13997.f41722;
        }
        byte[] bArr = new byte[size];
        mo16496(0, bArr, 0, size);
        return bArr;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m16501() {
        return size() == 0 ? "" : mo16495(C13997.f41724);
    }

    public final int hashCode() {
        int iMo16494 = this.f18081;
        if (iMo16494 == 0) {
            int size = size();
            iMo16494 = mo16494(size, 0, size);
            if (iMo16494 == 0) {
                iMo16494 = 1;
            }
            this.f18081 = iMo16494;
        }
        return iMo16494;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m16504() {
        return this.f18081;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m16492(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(C18307.m42645(i, "Beginning index: ", " < 0"));
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException(C18307.m42646("Beginning index larger than ending index: ", i, i2, ", "));
        }
        throw new IndexOutOfBoundsException(C18307.m42646("End index: ", i2, i3, " >= "));
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        String strM5147 = size() <= 50 ? C1487.m5147(this) : C9045.m23341(new StringBuilder(), C1487.m5147(mo16499(0, 47)), "...");
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(size);
        sb.append(" contents=\"");
        return C9045.m23341(sb, strM5147, "\">");
    }
}
