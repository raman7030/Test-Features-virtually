package p067l;

import com.google.android.material.motion.MotionUtils;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۠᩷֡, reason: contains not printable characters */
/* JADX INFO: compiled from: V8EI */
/* JADX INFO: loaded from: classes4.dex */
public final class C10365 extends AbstractC21095 {

    /* JADX INFO: renamed from: ֫֫ */
    public ArrayList f28681;

    /* JADX INFO: renamed from: ۗ */
    public C3659 f28682;

    /* JADX INFO: renamed from: ۙ */
    public final int f28683;

    /* JADX INFO: renamed from: ۛ */
    public long f28684;

    /* JADX INFO: renamed from: ۟ */
    public final byte[] f28685;

    /* JADX INFO: renamed from: ۤ */
    public long f28686;

    /* JADX INFO: renamed from: ۧ֫ */
    public boolean f28687;

    /* JADX INFO: renamed from: ۨ */
    public HashMap f28688;

    /* JADX INFO: renamed from: ۫ */
    public boolean f28689;

    /* JADX INFO: renamed from: ۬ */
    public int f28690;

    /* JADX INFO: renamed from: ܰ */
    public final byte[] f28691;

    /* JADX INFO: renamed from: ܽ֫ */
    public final InterfaceC24446 f28692;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f28693;

    /* JADX INFO: renamed from: ᩺ */
    public final ArrayList f28694;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
    }

    public C10365(InputStream inputStream, int i, String str) {
        super(inputStream, str);
        this.f28685 = new byte[256];
        this.f28688 = new HashMap();
        this.f28694 = new ArrayList();
        this.f28692 = AbstractC15728.m35783(str);
        this.f28691 = new byte[512];
        this.f28683 = i;
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m23991() {
        this.f28687 = true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        if (isDirectory()) {
            return 0;
        }
        long jM7003 = this.f28682.m7003() - this.f28686;
        if (jM7003 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) jM7003;
    }

    /* JADX INFO: renamed from: ۖ */
    private void m23987() throws IOException {
        this.f28690 = -1;
        this.f28681 = new ArrayList();
        List<C7012> listM7002 = this.f28682.m7002();
        C21765 c21765 = new C21765();
        long jM16134 = 0;
        for (C7012 c7012 : listM7002) {
            long jM16135 = c7012.m16134() - jM16134;
            if (jM16135 < 0) {
                throw new IOException("Corrupted struct sparse detected");
            }
            if (jM16135 > 0) {
                this.f28681.add(new C12733(c7012.m16134() - jM16134, c21765));
            }
            if (c7012.m16133() > 0) {
                this.f28681.add(new C12733(c7012.m16133(), ((FilterInputStream) this).in));
            }
            jM16134 = c7012.m16134() + c7012.m16133();
        }
        if (this.f28681.isEmpty()) {
            return;
        }
        this.f28690 = 0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ArrayList arrayList = this.f28681;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InputStream) it.next()).close();
            }
        }
        ((FilterInputStream) this).in.close();
    }

    /* JADX INFO: renamed from: ܽ */
    public final C3659 m23993() {
        return this.f28682;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final byte[] m23994() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            byte[] bArr = this.f28685;
            int i = read(bArr);
            if (i < 0) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
        m23992();
        if (this.f28682 == null) {
            return null;
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        while (length > 0 && byteArray[length - 1] == 0) {
            length--;
        }
        return length != byteArray.length ? Arrays.copyOf(byteArray, length) : byteArray;
    }

    /* JADX INFO: renamed from: ۘ */
    private byte[] m23988() throws IOException {
        boolean z;
        byte[] bArrM23995 = m23995();
        boolean z2 = false;
        if (bArrM23995 == null) {
            z = true;
            break;
        }
        int length = this.f28691.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = true;
                break;
            }
            if (bArrM23995[i] != 0) {
                z = false;
                break;
            }
            i++;
        }
        this.f28693 = z;
        if (!z || bArrM23995 == null) {
            return bArrM23995;
        }
        this.f28689 = true;
        boolean zMarkSupported = ((FilterInputStream) this).in.markSupported();
        if (zMarkSupported) {
            ((FilterInputStream) this).in.mark(this.f28691.length);
        }
        try {
            byte[] bArrM23996 = m23995();
            if (bArrM23996 == null) {
                z2 = true;
                break;
            }
            int length2 = this.f28691.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    z2 = true;
                    break;
                }
                if (bArrM23996[i2] != 0) {
                    break;
                }
                i2++;
            }
            if (!z2 && zMarkSupported) {
                m47700(this.f28691.length);
                ((FilterInputStream) this).in.reset();
            }
            long jM47697 = m47697() % ((long) this.f28683);
            if (jM47697 <= 0) {
                return null;
            }
            m47699(C23461.m52172(((long) this.f28683) - jM47697, ((FilterInputStream) this).in));
            return null;
        } catch (Throwable th) {
            if (zMarkSupported) {
                m47700(this.f28691.length);
                ((FilterInputStream) this).in.reset();
            }
            throw th;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int iM23989;
        if (i2 == 0) {
            return 0;
        }
        if (!this.f28693 && !isDirectory()) {
            C3659 c3659 = this.f28682;
            if (c3659 == null) {
                throw new IllegalStateException("No current tar entry");
            }
            if (this.f28686 < c3659.m7003()) {
                int iMin = Math.min(i2, available());
                if (this.f28682.m6991()) {
                    iM23989 = m23989(i, iMin, bArr);
                } else {
                    iM23989 = ((FilterInputStream) this).in.read(bArr, i, iMin);
                }
                if (iM23989 != -1) {
                    m47698(iM23989);
                    this.f28686 += (long) iM23989;
                    return iM23989;
                }
                if (iMin > 0) {
                    throw new IOException("Truncated TAR archive");
                }
                this.f28693 = true;
                return iM23989;
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0197 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:66:0x012c  */
    /* JADX WARN: Code duplicated, block: B:69:0x0140  */
    /* JADX WARN: Code duplicated, block: B:73:0x014e A[Catch: NumberFormatException -> 0x01ad, TryCatch #1 {NumberFormatException -> 0x01ad, blocks: (B:71:0x0146, B:73:0x014e, B:74:0x0152, B:76:0x015a), top: B:99:0x0146 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0152 A[Catch: NumberFormatException -> 0x01ad, TryCatch #1 {NumberFormatException -> 0x01ad, blocks: (B:71:0x0146, B:73:0x014e, B:74:0x0152, B:76:0x015a), top: B:99:0x0146 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x015a A[Catch: NumberFormatException -> 0x01ad, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x01ad, blocks: (B:71:0x0146, B:73:0x014e, B:74:0x0152, B:76:0x015a), top: B:99:0x0146 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0170  */
    /* JADX WARN: Code duplicated, block: B:81:0x0178 A[LOOP:0: B:81:0x0178->B:102:?, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:83:0x017e  */
    @Deprecated
    /* JADX INFO: renamed from: ܳ */
    public final C3659 m23992() throws IOException {
        byte[] bArrM23988;
        C23776 c23776;
        byte[] bArrM23994;
        String strMo31183;
        if (!this.f28693) {
            if (this.f28682 != null) {
                C23461.m52172(C14849.FOREVER_NS, this);
                if (!isDirectory()) {
                    long j = this.f28684;
                    if (j > 0 && j % ((long) this.f28691.length) != 0) {
                        long jAvailable = ((FilterInputStream) this).in.available();
                        long j2 = this.f28684;
                        byte[] bArr = this.f28691;
                        long length = (((j2 / ((long) bArr.length)) + 1) * ((long) bArr.length)) - j2;
                        long jM52172 = C23461.m52172(length, ((FilterInputStream) this).in);
                        if (((FilterInputStream) this).in instanceof FileInputStream) {
                            jM52172 = Math.min(jM52172, jAvailable);
                        }
                        if (jM52172 != length) {
                            throw new IOException("Truncated TAR archive");
                        }
                        m47699(jM52172);
                    }
                }
            }
            byte[] bArrM23989 = m23988();
            if (bArrM23989 == null) {
                if (this.f28687 && !this.f28689) {
                    throw new IOException("Missing TAR end marker");
                }
                this.f28682 = null;
                return null;
            }
            try {
                C3659 c3659 = new C3659(this.f28688, bArrM23989, this.f28692);
                this.f28682 = c3659;
                if (this.f28687 && !c3659.m6995()) {
                    throw new IOException("Invalid TAR header checksum (" + this.f28682.m6979() + MotionUtils.EASING_TYPE_FORMAT_END);
                }
                this.f28686 = 0L;
                this.f28684 = this.f28682.m6967();
                if (this.f28682.m6980()) {
                    byte[] bArrM23995 = m23994();
                    if (bArrM23995 == null) {
                        if (this.f28687) {
                            throw new IOException("Missing TAR entry after GNU long link header");
                        }
                    } else {
                        this.f28682.m6990(this.f28692.mo31183(0, bArrM23995.length, bArrM23995));
                        if (this.f28682.m6978()) {
                            bArrM23994 = m23994();
                            if (bArrM23994 == null) {
                                if (this.f28687) {
                                    throw new IOException("Missing TAR entry after GNU long name header");
                                }
                            } else {
                                strMo31183 = this.f28692.mo31183(0, bArrM23994.length, bArrM23994);
                                this.f28682.m6998(strMo31183);
                                if (this.f28682.m7006()) {
                                    this.f28682.m6998(strMo31183.concat("/"));
                                }
                            }
                        }
                        if (this.f28682.m6993()) {
                            this.f28688 = C8353.m19274(this, this.f28694, this.f28688, this.f28684);
                            m23992();
                            if (this.f28682 == null) {
                                throw new IOException("Error detected parsing the pax header");
                            }
                        }
                        if (this.f28682.m6982()) {
                            m23990();
                        } else if (!this.f28688.isEmpty()) {
                            HashMap map = this.f28688;
                            ArrayList arrayList = this.f28694;
                            this.f28682.m6974(map);
                            this.f28682.m6973(arrayList);
                        }
                        if (this.f28682.m6992()) {
                            if (this.f28682.m7007()) {
                                do {
                                    bArrM23988 = m23988();
                                    if (bArrM23988 != null) {
                                        throw new IOException("premature end of tar archive. Didn't find extended_header after header with extended flag.");
                                    }
                                    c23776 = new C23776(bArrM23988);
                                    this.f28682.m6981().addAll(c23776.m52862());
                                } while (c23776.m52863());
                            }
                            m23987();
                        }
                        this.f28684 = this.f28682.m6967();
                        return this.f28682;
                    }
                } else {
                    if (this.f28682.m6978()) {
                        bArrM23994 = m23994();
                        if (bArrM23994 == null) {
                            if (this.f28687) {
                                throw new IOException("Missing TAR entry after GNU long name header");
                            }
                        } else {
                            strMo31183 = this.f28692.mo31183(0, bArrM23994.length, bArrM23994);
                            this.f28682.m6998(strMo31183);
                            if (this.f28682.m7006() && !strMo31183.endsWith("/")) {
                                this.f28682.m6998(strMo31183.concat("/"));
                            }
                        }
                    }
                    if (this.f28682.m6993()) {
                        this.f28688 = C8353.m19274(this, this.f28694, this.f28688, this.f28684);
                        m23992();
                        if (this.f28682 == null) {
                            throw new IOException("Error detected parsing the pax header");
                        }
                    }
                    try {
                        if (this.f28682.m6982()) {
                            m23990();
                        } else if (!this.f28688.isEmpty()) {
                            HashMap map2 = this.f28688;
                            ArrayList arrayList2 = this.f28694;
                            this.f28682.m6974(map2);
                            this.f28682.m6973(arrayList2);
                        }
                        if (this.f28682.m6992()) {
                            if (this.f28682.m7007()) {
                                do {
                                    bArrM23988 = m23988();
                                    if (bArrM23988 != null) {
                                        throw new IOException("premature end of tar archive. Didn't find extended_header after header with extended flag.");
                                    }
                                    c23776 = new C23776(bArrM23988);
                                    this.f28682.m6981().addAll(c23776.m52862());
                                } while (c23776.m52863());
                            }
                            m23987();
                        }
                        this.f28684 = this.f28682.m6967();
                        return this.f28682;
                    } catch (NumberFormatException e) {
                        throw new IOException("Error detected parsing the pax header", e);
                    }
                }
            } catch (IllegalArgumentException e2) {
                throw new IOException("Error detected parsing the header", e2);
            }
        }
        return null;
    }

    private boolean isDirectory() {
        C3659 c3659 = this.f28682;
        return c3659 != null && c3659.m7006();
    }

    /* JADX INFO: renamed from: ᩴ */
    private void m23990() throws IOException {
        ArrayList arrayList = new ArrayList();
        HashMap mapM19274 = C8353.m19274(this, arrayList, this.f28688, this.f28684);
        if (mapM19274.containsKey("GNU.sparse.map")) {
            arrayList = new ArrayList(C8353.m19275((String) mapM19274.get("GNU.sparse.map")));
        }
        m23992();
        C3659 c3659 = this.f28682;
        if (c3659 != null) {
            c3659.m6974(mapM19274);
            this.f28682.m6973(arrayList);
            if (this.f28682.m6987()) {
                this.f28682.m6973(C8353.m19273(((FilterInputStream) this).in, this.f28691.length));
            }
            m23987();
            return;
        }
        throw new IOException("premature end of tar archive. Didn't find any entry after PAX header.");
    }

    /* JADX INFO: renamed from: ᩻ */
    public final byte[] m23995() throws IOException {
        InputStream inputStream = ((FilterInputStream) this).in;
        byte[] bArr = this.f28691;
        int length = bArr.length;
        if (length < 0 || length > bArr.length || length < 0) {
            throw new IndexOutOfBoundsException();
        }
        int iM52171 = C23461.m52171(inputStream, bArr, length);
        m47698(iM52171);
        byte[] bArr2 = this.f28691;
        if (iM52171 == bArr2.length) {
            return bArr2;
        }
        if (!this.f28687) {
            return null;
        }
        if (iM52171 > 0 || m47697() == 0) {
            throw new IOException("Truncated TAR archive");
        }
        return null;
    }

    /* JADX INFO: renamed from: ܿ */
    private int m23989(int i, int i2, byte[] bArr) throws IOException {
        ArrayList arrayList = this.f28681;
        if (arrayList == null || arrayList.isEmpty()) {
            return ((FilterInputStream) this).in.read(bArr, i, i2);
        }
        if (this.f28690 >= this.f28681.size()) {
            return -1;
        }
        int i3 = ((InputStream) this.f28681.get(this.f28690)).read(bArr, i, i2);
        if (this.f28690 == this.f28681.size() - 1) {
            return i3;
        }
        if (i3 == -1) {
            this.f28690++;
            return m23989(i, i2, bArr);
        }
        if (i3 >= i2) {
            return i3;
        }
        this.f28690++;
        int iM23989 = m23989(i + i3, i2 - i3, bArr);
        return iM23989 == -1 ? i3 : i3 + iM23989;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = 0;
        if (j > 0 && !isDirectory()) {
            long jAvailable = ((FilterInputStream) this).in.available();
            long jMin = Math.min(j, this.f28682.m7003() - this.f28686);
            if (!this.f28682.m6991()) {
                jSkip = C23461.m52172(jMin, ((FilterInputStream) this).in);
                if (((FilterInputStream) this).in instanceof FileInputStream) {
                    jSkip = Math.min(jSkip, jAvailable);
                }
                if (jSkip != jMin) {
                    throw new IOException("Truncated TAR archive");
                }
            } else {
                ArrayList arrayList = this.f28681;
                if (arrayList == null || arrayList.isEmpty()) {
                    jSkip = ((FilterInputStream) this).in.skip(jMin);
                } else {
                    while (jSkip < jMin && this.f28690 < this.f28681.size()) {
                        jSkip += ((InputStream) this.f28681.get(this.f28690)).skip(jMin - jSkip);
                        if (jSkip < jMin) {
                            this.f28690++;
                        }
                    }
                }
            }
            m47699(jSkip);
            this.f28686 += jSkip;
        }
        return jSkip;
    }
}
