package p067l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.᩶ۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17JK */
/* JADX INFO: loaded from: classes5.dex */
public final class C21267 implements InterfaceC4502 {

    /* JADX INFO: renamed from: ۗ */
    public final String f66893;

    /* JADX INFO: renamed from: ۙ */
    public int f66894;

    /* JADX INFO: renamed from: ۛ */
    public IOException f66895;

    /* JADX INFO: renamed from: ۤ */
    public final boolean f66896;

    /* JADX INFO: renamed from: ۨ */
    public final long f66897;

    /* JADX INFO: renamed from: ۬ */
    public final Map f66899;

    /* JADX INFO: renamed from: ᩶ */
    public final InterfaceC23278 f66900;

    /* JADX INFO: renamed from: ᩹ */
    public final C6517 f66902;

    /* JADX INFO: renamed from: ᩺ */
    public long f66903;

    /* JADX INFO: renamed from: ۫ */
    public long f66898 = 0;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f66901 = false;

    @Override // p067l.InterfaceC4502
    /* JADX INFO: renamed from: ֫ܽ */
    public final /* synthetic */ FileChannel mo9518() {
        return null;
    }

    @Override // p067l.InterfaceC4502
    /* JADX INFO: renamed from: ᩻ܽ */
    public final /* synthetic */ boolean mo9523() {
        return false;
    }

    @Override // p067l.InterfaceC4502
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC4502 mo9520(long j, long j2) {
        return new C21937(mo9519(), j, j2);
    }

    @Override // p067l.InterfaceC4502
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC4502 mo9522(long j, long j2) {
        return new C21937(this, j, j2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C21267 m48028(String str, long[] jArr, InterfaceC23278 interfaceC23278) {
        return new C21267(str, true, -1L, jArr, interfaceC23278);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C21267 m48027(String str, long j, InterfaceC23278 interfaceC23278) {
        return new C21267(str, false, j, null, interfaceC23278);
    }

    public C21267(String str, boolean z, long j, long[] jArr, InterfaceC23278 interfaceC23278) {
        this.f66903 = 0L;
        C6517 c6517 = new C6517();
        this.f66902 = c6517;
        this.f66894 = 0;
        if (str == null) {
            throw new IllegalArgumentException("name cannot be null");
        }
        if (!z && j <= 0) {
            throw new IllegalArgumentException(C17588.m40051(j, "splitSize must be positive: "));
        }
        if (interfaceC23278 == null) {
            throw new IllegalArgumentException("factory cannot be null");
        }
        this.f66893 = str;
        this.f66896 = z;
        this.f66897 = z ? -1L : j;
        this.f66900 = interfaceC23278;
        if (jArr != null) {
            long j2 = 0;
            for (long j3 : jArr) {
                if (j3 < 0) {
                    throw new IllegalArgumentException(C17588.m40051(j3, "Negative length: "));
                }
                j2 += j3;
                this.f66902.add(j2);
            }
            this.f66903 = j2;
        } else {
            c6517.add(0L);
        }
        this.f66899 = new C22608(this);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48034(int i, InterfaceC4502 interfaceC4502) {
        C6517 c6517 = this.f66902;
        if (i < 0 || i >= c6517.size()) {
            StringBuilder sbM34408 = C15033.m34408(i, "index = ", ", size = ");
            sbM34408.append(c6517.size());
            throw new IndexOutOfBoundsException(sbM34408.toString());
        }
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = (HashMap) this.f66899;
        if (map.containsKey(numValueOf)) {
            throw new IllegalStateException();
        }
        if (interfaceC4502.isClosed()) {
            throw new IllegalArgumentException("Data is closed");
        }
        map.put(numValueOf, interfaceC4502);
    }

    @Override // p067l.InterfaceC4502
    public final void seek(long j) throws IOException {
        if (this.f66901) {
            throw new IOException("Closed");
        }
        if (j < 0) {
            throw new IOException(C17588.m40051(j, "Negative position: "));
        }
        if (j <= this.f66903) {
            this.f66898 = j;
        } else {
            StringBuilder sbM33191 = C14536.m33191("Cannot seek beyond total length: ", " > ", j);
            sbM33191.append(this.f66903);
            throw new IOException(sbM33191.toString());
        }
    }

    @Override // p067l.InterfaceC4502
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f66901) {
            throw new IOException("Closed");
        }
        if (bArr == null) {
            throw new NullPointerException("data is null");
        }
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        long j = this.f66898;
        long j2 = this.f66903;
        if (j == j2) {
            return -1;
        }
        if (j > j2) {
            StringBuilder sb = new StringBuilder("Invalid position: ");
            sb.append(this.f66898);
            sb.append(" (exceeds length ");
            throw new IOException(C17520.m39893(sb, this.f66903, MotionUtils.EASING_TYPE_FORMAT_END));
        }
        int iMin = (int) Math.min(i2, j2 - j);
        int iM48030 = m48030(this.f66898);
        int size = this.f66902.size();
        while (i3 < iMin) {
            long jM48035 = m48035(iM48030);
            long jM48032 = m48032(iM48030) - this.f66898;
            if (jM48032 == 0) {
                iM48030++;
                if (iM48030 >= size) {
                    break;
                }
                this.f66894 = iM48030;
            } else {
                int iMin2 = (int) Math.min(iMin - i3, jM48032);
                InterfaceC4502 interfaceC4502M48031 = m48031(iM48030);
                interfaceC4502M48031.seek(this.f66898 - jM48035);
                int i4 = interfaceC4502M48031.read(bArr, i, iMin2);
                if (i4 <= 0) {
                    break;
                }
                i3 += i4;
                i += i4;
                this.f66898 += (long) i4;
                if (i4 != iMin2) {
                    continue;
                } else {
                    iM48030++;
                    if (iM48030 >= size) {
                        break;
                    }
                    this.f66894 = iM48030;
                }
            }
        }
        if (i3 > 0) {
            return i3;
        }
        return -1;
    }

    @Override // p067l.InterfaceC4502
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (this.f66901) {
            throw new IOException("Closed");
        }
        if (this.f66896) {
            throw new IOException("Read only");
        }
        if (bArr == null) {
            throw new NullPointerException("data is null");
        }
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return;
        }
        int iM48030 = m48030(this.f66898);
        while (true) {
            long jM48035 = m48035(iM48030);
            long jM48032 = m48032(iM48030);
            long j = this.f66898 - jM48035;
            long j2 = jM48032 - jM48035;
            C6517 c6517 = this.f66902;
            if (iM48030 == c6517.size() - 1) {
                long j3 = this.f66897;
                if (j2 < j3) {
                    j2 = j3;
                }
            }
            int iMin = (int) Math.min(i2, j2 - j);
            if (iMin <= 0) {
                iM48030++;
                if (iM48030 == c6517.size()) {
                    long j4 = this.f66898;
                    if (j4 != this.f66903) {
                        throw new IllegalStateException();
                    }
                    c6517.add(j4);
                }
                this.f66894 = iM48030;
            } else {
                InterfaceC4502 interfaceC4502M48031 = m48031(iM48030);
                interfaceC4502M48031.seek(j);
                interfaceC4502M48031.write(bArr, i, iMin);
                long j5 = this.f66898 + ((long) iMin);
                this.f66898 = j5;
                i += iMin;
                i2 -= iMin;
                if (j5 > this.f66903) {
                    this.f66903 = j5;
                    if (iM48030 != c6517.size() - 1) {
                        throw new IllegalStateException("???");
                    }
                    c6517.set(iM48030, this.f66898);
                }
                if (i2 <= 0) {
                    return;
                }
                iM48030++;
                if (iM48030 == c6517.size()) {
                    long j6 = this.f66898;
                    if (j6 != this.f66903) {
                        throw new IllegalStateException();
                    }
                    c6517.add(j6);
                }
                this.f66894 = iM48030;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48033() throws IOException {
        if (this.f66901) {
            throw new IOException("Closed");
        }
        if (this.f66898 != this.f66903) {
            throw new IOException("Can only break at the end: pos=" + this.f66898 + ", totalLength=" + this.f66903);
        }
        C6517 c6517 = this.f66902;
        int size = c6517.size();
        int i = size - 1;
        if (i < 0 || i >= c6517.size()) {
            StringBuilder sbM34408 = C15033.m34408(i, "Fragment index out of bounds: index = ", ", size = ");
            sbM34408.append(c6517.size());
            throw new IndexOutOfBoundsException(sbM34408.toString());
        }
        if ((i == 0 ? c6517.getLong(0) : c6517.getLong(i) - c6517.getLong(size - 2)) == 0) {
            return;
        }
        c6517.add(this.f66898);
        this.f66894 = c6517.size() - 1;
    }

    @Override // p067l.InterfaceC4502
    public final long length() throws IOException {
        if (this.f66901) {
            throw new IOException("Closed");
        }
        return this.f66903;
    }

    @Override // p067l.InterfaceC4502
    public final void setLength(long j) throws IOException {
        if (this.f66901) {
            throw new IOException("Closed");
        }
        if (this.f66896) {
            throw new IOException("Read only");
        }
        if (j < 0) {
            throw new IOException(C17588.m40051(j, "Negative length: "));
        }
        long j2 = this.f66903;
        if (j == j2) {
            return;
        }
        C6517 c6517 = this.f66902;
        if (j < j2) {
            int i = 0;
            while (true) {
                if (i >= c6517.size()) {
                    i = -1;
                    break;
                } else if (j <= c6517.getLong(i)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                throw new IllegalStateException(C17588.m40051(j, "Cannot find fragment for new length: "));
            }
            m48031(i).setLength(j - m48035(i));
            c6517.set(i, j);
            int size = c6517.size();
            while (true) {
                size--;
                if (size <= i) {
                    break;
                }
                Integer numValueOf = Integer.valueOf(size);
                Map map = this.f66899;
                InterfaceC4502 interfaceC4502 = (InterfaceC4502) ((LinkedHashMap) map).get(numValueOf);
                if (interfaceC4502 != null) {
                    interfaceC4502.setLength(0L);
                    ((HashMap) map).remove(numValueOf);
                    interfaceC4502.close();
                } else {
                    try {
                        InterfaceC4502 interfaceC4502Mo19606 = this.f66900.mo19606(size);
                        if (interfaceC4502Mo19606 != null) {
                            interfaceC4502Mo19606.setLength(0L);
                            interfaceC4502Mo19606.close();
                        }
                    } catch (IOException unused) {
                    }
                }
                c6517.mo9613(size);
            }
            if (this.f66894 > i) {
                this.f66894 = i;
            }
        } else {
            long j3 = j - j2;
            int size2 = c6517.size() - 1;
            long jM48035 = m48035(size2);
            long jM48032 = m48032(size2);
            long j4 = jM48032 - jM48035;
            long j5 = this.f66897;
            long j6 = j5 - j4;
            if (j3 <= j6) {
                m48031(size2).setLength(j4 + j3);
                c6517.set(size2, j);
            } else {
                if (j6 > 0) {
                    m48031(size2).setLength(j5);
                    c6517.set(size2, jM48032 + j6);
                    j3 -= j6;
                }
                while (j3 > 0) {
                    long j7 = c6517.getLong(c6517.size() - 1);
                    long jMin = Math.min(j3, j5);
                    c6517.add(j7 + jMin);
                    m48031(c6517.size() - 1).setLength(jMin);
                    j3 -= jMin;
                }
            }
        }
        this.f66903 = j;
        if (this.f66898 > j) {
            this.f66898 = j;
        }
    }

    @Override // p067l.InterfaceC4502
    public final long position() throws IOException {
        if (this.f66901) {
            throw new IOException("Closed");
        }
        return this.f66898;
    }

    @Override // p067l.InterfaceC4502
    /* JADX INFO: renamed from: ܺ */
    public final void mo9521() throws IOException {
        if (this.f66901) {
            throw new IOException("Closed");
        }
        Iterator it = ((LinkedHashMap) this.f66899).values().iterator();
        while (it.hasNext()) {
            ((InterfaceC4502) it.next()).mo9521();
        }
    }

    @Override // p067l.InterfaceC4502
    public final String getName() {
        return this.f66893;
    }

    @Override // p067l.InterfaceC4502
    /* JADX INFO: renamed from: ۡ */
    public final InterfaceC4502 mo9519() throws IOException {
        if (!this.f66896) {
            throw new IOException("Unsupported");
        }
        C21267 c21267 = new C21267(this.f66893, true, -1L, null, this.f66900);
        C6517 c6517 = c21267.f66902;
        c6517.clear();
        c6517.mo9610(c6517.size(), (InterfaceC4544) this.f66902);
        c21267.f66903 = this.f66903;
        return c21267;
    }

    @Override // p067l.InterfaceC4502
    public final boolean isClosed() {
        return this.f66901;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f66901) {
            return;
        }
        this.f66901 = true;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f66899;
        Iterator it = linkedHashMap.values().iterator();
        IOException iOException = null;
        while (it.hasNext()) {
            try {
                ((InterfaceC4502) it.next()).close();
            } catch (IOException e) {
                if (iOException == null) {
                    iOException = e;
                } else {
                    iOException.addSuppressed(e);
                }
            }
        }
        linkedHashMap.clear();
        if (iOException != null) {
            throw iOException;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private int m48030(long j) {
        int i = this.f66894;
        C6517 c6517 = this.f66902;
        int size = c6517.size();
        if (i >= 0 && i < size) {
            long jM48035 = m48035(i);
            long jM48032 = m48032(i);
            if (jM48035 <= j && j < jM48032) {
                return i;
            }
            int i2 = i + 1;
            if (i2 < size) {
                long jM48036 = m48035(i2);
                long jM48033 = m48032(i2);
                if (jM48036 <= j && j < jM48033) {
                    this.f66894 = i2;
                    return i2;
                }
            }
        }
        for (int i3 = 0; i3 < size; i3++) {
            if (j < c6517.getLong(i3)) {
                this.f66894 = i3;
                return i3;
            }
        }
        int i4 = size - 1;
        this.f66894 = i4;
        return i4;
    }

    /* JADX INFO: renamed from: ۧ */
    public final long m48035(int i) {
        C6517 c6517 = this.f66902;
        if (i < 0 || i >= c6517.size()) {
            StringBuilder sbM34408 = C15033.m34408(i, "Fragment index out of bounds: index = ", ", size = ");
            sbM34408.append(c6517.size());
            throw new IndexOutOfBoundsException(sbM34408.toString());
        }
        if (i == 0) {
            return 0L;
        }
        return c6517.getLong(i - 1);
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m48032(int i) {
        C6517 c6517 = this.f66902;
        if (i >= 0 && i < c6517.size()) {
            return c6517.getLong(i);
        }
        StringBuilder sbM34408 = C15033.m34408(i, "Fragment index out of bounds: index = ", ", size = ");
        sbM34408.append(c6517.size());
        throw new IndexOutOfBoundsException(sbM34408.toString());
    }

    /* JADX INFO: renamed from: ܽ */
    private InterfaceC4502 m48031(int i) throws IOException {
        Integer numValueOf = Integer.valueOf(i);
        Map map = this.f66899;
        InterfaceC4502 interfaceC4502 = (InterfaceC4502) ((LinkedHashMap) map).get(numValueOf);
        if (interfaceC4502 != null) {
            return interfaceC4502;
        }
        if (this.f66901) {
            throw new IOException("Closed");
        }
        InterfaceC4502 interfaceC4502Mo19606 = this.f66900.mo19606(i);
        if (interfaceC4502Mo19606 == null) {
            throw new IOException(C20778.m46922(i, "Failed to create fragment at index: "));
        }
        ((HashMap) map).put(Integer.valueOf(i), interfaceC4502Mo19606);
        IOException iOException = this.f66895;
        if (iOException == null) {
            return interfaceC4502Mo19606;
        }
        this.f66895 = null;
        throw iOException;
    }
}
