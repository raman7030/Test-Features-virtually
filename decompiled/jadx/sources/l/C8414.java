package l;

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
public final class C8414 extends AbstractC19704 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public ArrayList f25767;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C1358 f25768;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f25769;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public long f25770;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final byte[] f25771;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f25772;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public boolean f25773;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public HashMap f25774;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f25775;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f25776;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] f25777;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC23230 f25778;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f25779;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final ArrayList f25780;

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

    public C8414(InputStream inputStream, int i, String str) {
        super(inputStream, str);
        this.f25771 = new byte[256];
        this.f25774 = new HashMap();
        this.f25780 = new ArrayList();
        this.f25778 = AbstractC14057.m33658(str);
        this.f25777 = new byte[512];
        this.f25769 = i;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m22021() {
        this.f25773 = true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        if (isDirectory()) {
            return 0;
        }
        long jM4765 = this.f25768.m4765() - this.f25772;
        if (jM4765 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) jM4765;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m22017() throws IOException {
        this.f25776 = -1;
        this.f25767 = new ArrayList();
        List<C4886> listM4764 = this.f25768.m4764();
        C20409 c20409 = new C20409();
        long jM14237 = 0;
        for (C4886 c4886 : listM4764) {
            long jM14238 = c4886.m14237() - jM14237;
            if (jM14238 < 0) {
                throw new IOException("Corrupted struct sparse detected");
            }
            if (jM14238 > 0) {
                this.f25767.add(new C10906(c4886.m14237() - jM14237, c20409));
            }
            if (c4886.m14236() > 0) {
                this.f25767.add(new C10906(c4886.m14236(), ((FilterInputStream) this).in));
            }
            jM14237 = c4886.m14237() + c4886.m14236();
        }
        if (this.f25767.isEmpty()) {
            return;
        }
        this.f25776 = 0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ArrayList arrayList = this.f25767;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InputStream) it.next()).close();
            }
        }
        ((FilterInputStream) this).in.close();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C1358 m22023() {
        return this.f25768;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final byte[] m22024() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            byte[] bArr = this.f25771;
            int i = read(bArr);
            if (i < 0) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
        m22022();
        if (this.f25768 == null) {
            return null;
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        while (length > 0 && byteArray[length - 1] == 0) {
            length--;
        }
        return length != byteArray.length ? Arrays.copyOf(byteArray, length) : byteArray;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private byte[] m22018() throws IOException {
        boolean z;
        byte[] bArrM22025 = m22025();
        boolean z2 = false;
        if (bArrM22025 == null) {
            z = true;
            break;
        }
        int length = this.f25777.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = true;
                break;
            }
            if (bArrM22025[i] != 0) {
                z = false;
                break;
            }
            i++;
        }
        this.f25779 = z;
        if (!z || bArrM22025 == null) {
            return bArrM22025;
        }
        this.f25775 = true;
        boolean zMarkSupported = ((FilterInputStream) this).in.markSupported();
        if (zMarkSupported) {
            ((FilterInputStream) this).in.mark(this.f25777.length);
        }
        try {
            byte[] bArrM22026 = m22025();
            if (bArrM22026 == null) {
                z2 = true;
                break;
            }
            int length2 = this.f25777.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    z2 = true;
                    break;
                }
                if (bArrM22026[i2] != 0) {
                    break;
                }
                i2++;
            }
            if (!z2 && zMarkSupported) {
                m45396(this.f25777.length);
                ((FilterInputStream) this).in.reset();
            }
            long jM45393 = m45393() % ((long) this.f25769);
            if (jM45393 <= 0) {
                return null;
            }
            m45395(C22194.m49845(((long) this.f25769) - jM45393, ((FilterInputStream) this).in));
            return null;
        } catch (Throwable th) {
            if (zMarkSupported) {
                m45396(this.f25777.length);
                ((FilterInputStream) this).in.reset();
            }
            throw th;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int iM22019;
        if (i2 == 0) {
            return 0;
        }
        if (!this.f25779 && !isDirectory()) {
            C1358 c1358 = this.f25768;
            if (c1358 == null) {
                throw new IllegalStateException("No current tar entry");
            }
            if (this.f25772 < c1358.m4765()) {
                int iMin = Math.min(i2, available());
                if (this.f25768.m4753()) {
                    iM22019 = m22019(i, iMin, bArr);
                } else {
                    iM22019 = ((FilterInputStream) this).in.read(bArr, i, iMin);
                }
                if (iM22019 != -1) {
                    m45394(iM22019);
                    this.f25772 += (long) iM22019;
                    return iM22019;
                }
                if (iMin > 0) {
                    throw new IOException("Truncated TAR archive");
                }
                this.f25779 = true;
                return iM22019;
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
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C1358 m22022() throws IOException {
        byte[] bArrM22018;
        C22525 c22525;
        byte[] bArrM22024;
        String strMo29129;
        if (!this.f25779) {
            if (this.f25768 != null) {
                C22194.m49845(C13132.FOREVER_NS, this);
                if (!isDirectory()) {
                    long j = this.f25770;
                    if (j > 0 && j % ((long) this.f25777.length) != 0) {
                        long jAvailable = ((FilterInputStream) this).in.available();
                        long j2 = this.f25770;
                        byte[] bArr = this.f25777;
                        long length = (((j2 / ((long) bArr.length)) + 1) * ((long) bArr.length)) - j2;
                        long jM49845 = C22194.m49845(length, ((FilterInputStream) this).in);
                        if (((FilterInputStream) this).in instanceof FileInputStream) {
                            jM49845 = Math.min(jM49845, jAvailable);
                        }
                        if (jM49845 != length) {
                            throw new IOException("Truncated TAR archive");
                        }
                        m45395(jM49845);
                    }
                }
            }
            byte[] bArrM22019 = m22018();
            if (bArrM22019 == null) {
                if (this.f25773 && !this.f25775) {
                    throw new IOException("Missing TAR end marker");
                }
                this.f25768 = null;
                return null;
            }
            try {
                C1358 c1358 = new C1358(this.f25774, bArrM22019, this.f25778);
                this.f25768 = c1358;
                if (this.f25773 && !c1358.m4757()) {
                    throw new IOException("Invalid TAR header checksum (" + this.f25768.m4741() + MotionUtils.EASING_TYPE_FORMAT_END);
                }
                this.f25772 = 0L;
                this.f25770 = this.f25768.m4729();
                if (this.f25768.m4742()) {
                    byte[] bArrM22025 = m22024();
                    if (bArrM22025 == null) {
                        if (this.f25773) {
                            throw new IOException("Missing TAR entry after GNU long link header");
                        }
                    } else {
                        this.f25768.m4752(this.f25778.mo29129(0, bArrM22025.length, bArrM22025));
                        if (this.f25768.m4740()) {
                            bArrM22024 = m22024();
                            if (bArrM22024 == null) {
                                if (this.f25773) {
                                    throw new IOException("Missing TAR entry after GNU long name header");
                                }
                            } else {
                                strMo29129 = this.f25778.mo29129(0, bArrM22024.length, bArrM22024);
                                this.f25768.m4760(strMo29129);
                                if (this.f25768.m4768()) {
                                    this.f25768.m4760(strMo29129.concat("/"));
                                }
                            }
                        }
                        if (this.f25768.m4755()) {
                            this.f25774 = C6297.m17334(this, this.f25780, this.f25774, this.f25770);
                            m22022();
                            if (this.f25768 == null) {
                                throw new IOException("Error detected parsing the pax header");
                            }
                        }
                        if (this.f25768.m4744()) {
                            m22020();
                        } else if (!this.f25774.isEmpty()) {
                            HashMap map = this.f25774;
                            ArrayList arrayList = this.f25780;
                            this.f25768.m4736(map);
                            this.f25768.m4735(arrayList);
                        }
                        if (this.f25768.m4754()) {
                            if (this.f25768.m4769()) {
                                do {
                                    bArrM22018 = m22018();
                                    if (bArrM22018 != null) {
                                        throw new IOException("premature end of tar archive. Didn't find extended_header after header with extended flag.");
                                    }
                                    c22525 = new C22525(bArrM22018);
                                    this.f25768.m4743().addAll(c22525.m50520());
                                } while (c22525.m50521());
                            }
                            m22017();
                        }
                        this.f25770 = this.f25768.m4729();
                        return this.f25768;
                    }
                } else {
                    if (this.f25768.m4740()) {
                        bArrM22024 = m22024();
                        if (bArrM22024 == null) {
                            if (this.f25773) {
                                throw new IOException("Missing TAR entry after GNU long name header");
                            }
                        } else {
                            strMo29129 = this.f25778.mo29129(0, bArrM22024.length, bArrM22024);
                            this.f25768.m4760(strMo29129);
                            if (this.f25768.m4768() && !strMo29129.endsWith("/")) {
                                this.f25768.m4760(strMo29129.concat("/"));
                            }
                        }
                    }
                    if (this.f25768.m4755()) {
                        this.f25774 = C6297.m17334(this, this.f25780, this.f25774, this.f25770);
                        m22022();
                        if (this.f25768 == null) {
                            throw new IOException("Error detected parsing the pax header");
                        }
                    }
                    try {
                        if (this.f25768.m4744()) {
                            m22020();
                        } else if (!this.f25774.isEmpty()) {
                            HashMap map2 = this.f25774;
                            ArrayList arrayList2 = this.f25780;
                            this.f25768.m4736(map2);
                            this.f25768.m4735(arrayList2);
                        }
                        if (this.f25768.m4754()) {
                            if (this.f25768.m4769()) {
                                do {
                                    bArrM22018 = m22018();
                                    if (bArrM22018 != null) {
                                        throw new IOException("premature end of tar archive. Didn't find extended_header after header with extended flag.");
                                    }
                                    c22525 = new C22525(bArrM22018);
                                    this.f25768.m4743().addAll(c22525.m50520());
                                } while (c22525.m50521());
                            }
                            m22017();
                        }
                        this.f25770 = this.f25768.m4729();
                        return this.f25768;
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
        C1358 c1358 = this.f25768;
        return c1358 != null && c1358.m4768();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m22020() throws IOException {
        ArrayList arrayList = new ArrayList();
        HashMap mapM17334 = C6297.m17334(this, arrayList, this.f25774, this.f25770);
        if (mapM17334.containsKey("GNU.sparse.map")) {
            arrayList = new ArrayList(C6297.m17335((String) mapM17334.get("GNU.sparse.map")));
        }
        m22022();
        C1358 c1358 = this.f25768;
        if (c1358 != null) {
            c1358.m4736(mapM17334);
            this.f25768.m4735(arrayList);
            if (this.f25768.m4749()) {
                this.f25768.m4735(C6297.m17333(((FilterInputStream) this).in, this.f25777.length));
            }
            m22017();
            return;
        }
        throw new IOException("premature end of tar archive. Didn't find any entry after PAX header.");
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final byte[] m22025() throws IOException {
        InputStream inputStream = ((FilterInputStream) this).in;
        byte[] bArr = this.f25777;
        int length = bArr.length;
        if (length < 0 || length > bArr.length || length < 0) {
            throw new IndexOutOfBoundsException();
        }
        int iM49844 = C22194.m49844(inputStream, bArr, length);
        m45394(iM49844);
        byte[] bArr2 = this.f25777;
        if (iM49844 == bArr2.length) {
            return bArr2;
        }
        if (!this.f25773) {
            return null;
        }
        if (iM49844 > 0 || m45393() == 0) {
            throw new IOException("Truncated TAR archive");
        }
        return null;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private int m22019(int i, int i2, byte[] bArr) throws IOException {
        ArrayList arrayList = this.f25767;
        if (arrayList == null || arrayList.isEmpty()) {
            return ((FilterInputStream) this).in.read(bArr, i, i2);
        }
        if (this.f25776 >= this.f25767.size()) {
            return -1;
        }
        int i3 = ((InputStream) this.f25767.get(this.f25776)).read(bArr, i, i2);
        if (this.f25776 == this.f25767.size() - 1) {
            return i3;
        }
        if (i3 == -1) {
            this.f25776++;
            return m22019(i, i2, bArr);
        }
        if (i3 >= i2) {
            return i3;
        }
        this.f25776++;
        int iM22019 = m22019(i + i3, i2 - i3, bArr);
        return iM22019 == -1 ? i3 : i3 + iM22019;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = 0;
        if (j > 0 && !isDirectory()) {
            long jAvailable = ((FilterInputStream) this).in.available();
            long jMin = Math.min(j, this.f25768.m4765() - this.f25772);
            if (!this.f25768.m4753()) {
                jSkip = C22194.m49845(jMin, ((FilterInputStream) this).in);
                if (((FilterInputStream) this).in instanceof FileInputStream) {
                    jSkip = Math.min(jSkip, jAvailable);
                }
                if (jSkip != jMin) {
                    throw new IOException("Truncated TAR archive");
                }
            } else {
                ArrayList arrayList = this.f25767;
                if (arrayList == null || arrayList.isEmpty()) {
                    jSkip = ((FilterInputStream) this).in.skip(jMin);
                } else {
                    while (jSkip < jMin && this.f25776 < this.f25767.size()) {
                        jSkip += ((InputStream) this.f25767.get(this.f25776)).skip(jMin - jSkip);
                        if (jSkip < jMin) {
                            this.f25776++;
                        }
                    }
                }
            }
            m45395(jSkip);
            this.f25772 += jSkip;
        }
        return jSkip;
    }
}
