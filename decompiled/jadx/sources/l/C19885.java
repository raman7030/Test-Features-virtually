package l;

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
public final class C19885 implements InterfaceC2245 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String f64257;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f64258;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public IOException f64259;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f64260;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f64261;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Map f64263;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC22001 f64264;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C4365 f64266;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public long f64267;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f64262 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f64265 = false;

    @Override // l.InterfaceC2245
    /* JADX INFO: renamed from: ֫ܽ */
    public final /* synthetic */ FileChannel mo7436() {
        return null;
    }

    @Override // l.InterfaceC2245
    /* JADX INFO: renamed from: ᩻ܽ */
    public final /* synthetic */ boolean mo7441() {
        return false;
    }

    @Override // l.InterfaceC2245
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC2245 mo7438(long j, long j2) {
        return new C20590(mo7437(), j, j2);
    }

    @Override // l.InterfaceC2245
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC2245 mo7440(long j, long j2) {
        return new C20590(this, j, j2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C19885 m45717(String str, long[] jArr, InterfaceC22001 interfaceC22001) {
        return new C19885(str, true, -1L, jArr, interfaceC22001);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C19885 m45716(String str, long j, InterfaceC22001 interfaceC22001) {
        return new C19885(str, false, j, null, interfaceC22001);
    }

    public C19885(String str, boolean z, long j, long[] jArr, InterfaceC22001 interfaceC22001) {
        this.f64267 = 0L;
        C4365 c4365 = new C4365();
        this.f64266 = c4365;
        this.f64258 = 0;
        if (str == null) {
            throw new IllegalArgumentException("name cannot be null");
        }
        if (!z && j <= 0) {
            throw new IllegalArgumentException(C16014.m37865(j, "splitSize must be positive: "));
        }
        if (interfaceC22001 == null) {
            throw new IllegalArgumentException("factory cannot be null");
        }
        this.f64257 = str;
        this.f64260 = z;
        this.f64261 = z ? -1L : j;
        this.f64264 = interfaceC22001;
        if (jArr != null) {
            long j2 = 0;
            for (long j3 : jArr) {
                if (j3 < 0) {
                    throw new IllegalArgumentException(C16014.m37865(j3, "Negative length: "));
                }
                j2 += j3;
                this.f64266.add(j2);
            }
            this.f64267 = j2;
        } else {
            c4365.add(0L);
        }
        this.f64263 = new C21296(this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45723(int i, InterfaceC2245 interfaceC2245) {
        C4365 c4365 = this.f64266;
        if (i < 0 || i >= c4365.size()) {
            StringBuilder sbM32308 = C13325.m32308(i, "index = ", ", size = ");
            sbM32308.append(c4365.size());
            throw new IndexOutOfBoundsException(sbM32308.toString());
        }
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = (HashMap) this.f64263;
        if (map.containsKey(numValueOf)) {
            throw new IllegalStateException();
        }
        if (interfaceC2245.isClosed()) {
            throw new IllegalArgumentException("Data is closed");
        }
        map.put(numValueOf, interfaceC2245);
    }

    @Override // l.InterfaceC2245
    public final void seek(long j) throws IOException {
        if (this.f64265) {
            throw new IOException("Closed");
        }
        if (j < 0) {
            throw new IOException(C16014.m37865(j, "Negative position: "));
        }
        if (j <= this.f64267) {
            this.f64262 = j;
        } else {
            StringBuilder sbM31106 = C12803.m31106("Cannot seek beyond total length: ", " > ", j);
            sbM31106.append(this.f64267);
            throw new IOException(sbM31106.toString());
        }
    }

    @Override // l.InterfaceC2245
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f64265) {
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
        long j = this.f64262;
        long j2 = this.f64267;
        if (j == j2) {
            return -1;
        }
        if (j > j2) {
            StringBuilder sb = new StringBuilder("Invalid position: ");
            sb.append(this.f64262);
            sb.append(" (exceeds length ");
            throw new IOException(C15942.m37718(sb, this.f64267, MotionUtils.EASING_TYPE_FORMAT_END));
        }
        int iMin = (int) Math.min(i2, j2 - j);
        int iM45719 = m45719(this.f64262);
        int size = this.f64266.size();
        while (i3 < iMin) {
            long jM45724 = m45724(iM45719);
            long jM45721 = m45721(iM45719) - this.f64262;
            if (jM45721 == 0) {
                iM45719++;
                if (iM45719 >= size) {
                    break;
                }
                this.f64258 = iM45719;
            } else {
                int iMin2 = (int) Math.min(iMin - i3, jM45721);
                InterfaceC2245 interfaceC2245M45720 = m45720(iM45719);
                interfaceC2245M45720.seek(this.f64262 - jM45724);
                int i4 = interfaceC2245M45720.read(bArr, i, iMin2);
                if (i4 <= 0) {
                    break;
                }
                i3 += i4;
                i += i4;
                this.f64262 += (long) i4;
                if (i4 != iMin2) {
                    continue;
                } else {
                    iM45719++;
                    if (iM45719 >= size) {
                        break;
                    }
                    this.f64258 = iM45719;
                }
            }
        }
        if (i3 > 0) {
            return i3;
        }
        return -1;
    }

    @Override // l.InterfaceC2245
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (this.f64265) {
            throw new IOException("Closed");
        }
        if (this.f64260) {
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
        int iM45719 = m45719(this.f64262);
        while (true) {
            long jM45724 = m45724(iM45719);
            long jM45721 = m45721(iM45719);
            long j = this.f64262 - jM45724;
            long j2 = jM45721 - jM45724;
            C4365 c4365 = this.f64266;
            if (iM45719 == c4365.size() - 1) {
                long j3 = this.f64261;
                if (j2 < j3) {
                    j2 = j3;
                }
            }
            int iMin = (int) Math.min(i2, j2 - j);
            if (iMin <= 0) {
                iM45719++;
                if (iM45719 == c4365.size()) {
                    long j4 = this.f64262;
                    if (j4 != this.f64267) {
                        throw new IllegalStateException();
                    }
                    c4365.add(j4);
                }
                this.f64258 = iM45719;
            } else {
                InterfaceC2245 interfaceC2245M45720 = m45720(iM45719);
                interfaceC2245M45720.seek(j);
                interfaceC2245M45720.write(bArr, i, iMin);
                long j5 = this.f64262 + ((long) iMin);
                this.f64262 = j5;
                i += iMin;
                i2 -= iMin;
                if (j5 > this.f64267) {
                    this.f64267 = j5;
                    if (iM45719 != c4365.size() - 1) {
                        throw new IllegalStateException("???");
                    }
                    c4365.set(iM45719, this.f64262);
                }
                if (i2 <= 0) {
                    return;
                }
                iM45719++;
                if (iM45719 == c4365.size()) {
                    long j6 = this.f64262;
                    if (j6 != this.f64267) {
                        throw new IllegalStateException();
                    }
                    c4365.add(j6);
                }
                this.f64258 = iM45719;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45722() throws IOException {
        if (this.f64265) {
            throw new IOException("Closed");
        }
        if (this.f64262 != this.f64267) {
            throw new IOException("Can only break at the end: pos=" + this.f64262 + ", totalLength=" + this.f64267);
        }
        C4365 c4365 = this.f64266;
        int size = c4365.size();
        int i = size - 1;
        if (i < 0 || i >= c4365.size()) {
            StringBuilder sbM32308 = C13325.m32308(i, "Fragment index out of bounds: index = ", ", size = ");
            sbM32308.append(c4365.size());
            throw new IndexOutOfBoundsException(sbM32308.toString());
        }
        if ((i == 0 ? c4365.getLong(0) : c4365.getLong(i) - c4365.getLong(size - 2)) == 0) {
            return;
        }
        c4365.add(this.f64262);
        this.f64258 = c4365.size() - 1;
    }

    @Override // l.InterfaceC2245
    public final long length() throws IOException {
        if (this.f64265) {
            throw new IOException("Closed");
        }
        return this.f64267;
    }

    @Override // l.InterfaceC2245
    public final void setLength(long j) throws IOException {
        if (this.f64265) {
            throw new IOException("Closed");
        }
        if (this.f64260) {
            throw new IOException("Read only");
        }
        if (j < 0) {
            throw new IOException(C16014.m37865(j, "Negative length: "));
        }
        long j2 = this.f64267;
        if (j == j2) {
            return;
        }
        C4365 c4365 = this.f64266;
        if (j < j2) {
            int i = 0;
            while (true) {
                if (i >= c4365.size()) {
                    i = -1;
                    break;
                } else if (j <= c4365.getLong(i)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                throw new IllegalStateException(C16014.m37865(j, "Cannot find fragment for new length: "));
            }
            m45720(i).setLength(j - m45724(i));
            c4365.set(i, j);
            int size = c4365.size();
            while (true) {
                size--;
                if (size <= i) {
                    break;
                }
                Integer numValueOf = Integer.valueOf(size);
                Map map = this.f64263;
                InterfaceC2245 interfaceC2245 = (InterfaceC2245) ((LinkedHashMap) map).get(numValueOf);
                if (interfaceC2245 != null) {
                    interfaceC2245.setLength(0L);
                    ((HashMap) map).remove(numValueOf);
                    interfaceC2245.close();
                } else {
                    try {
                        InterfaceC2245 interfaceC2245Mo17661 = this.f64264.mo17661(size);
                        if (interfaceC2245Mo17661 != null) {
                            interfaceC2245Mo17661.setLength(0L);
                            interfaceC2245Mo17661.close();
                        }
                    } catch (IOException unused) {
                    }
                }
                c4365.mo7545(size);
            }
            if (this.f64258 > i) {
                this.f64258 = i;
            }
        } else {
            long j3 = j - j2;
            int size2 = c4365.size() - 1;
            long jM45724 = m45724(size2);
            long jM45721 = m45721(size2);
            long j4 = jM45721 - jM45724;
            long j5 = this.f64261;
            long j6 = j5 - j4;
            if (j3 <= j6) {
                m45720(size2).setLength(j4 + j3);
                c4365.set(size2, j);
            } else {
                if (j6 > 0) {
                    m45720(size2).setLength(j5);
                    c4365.set(size2, jM45721 + j6);
                    j3 -= j6;
                }
                while (j3 > 0) {
                    long j7 = c4365.getLong(c4365.size() - 1);
                    long jMin = Math.min(j3, j5);
                    c4365.add(j7 + jMin);
                    m45720(c4365.size() - 1).setLength(jMin);
                    j3 -= jMin;
                }
            }
        }
        this.f64267 = j;
        if (this.f64262 > j) {
            this.f64262 = j;
        }
    }

    @Override // l.InterfaceC2245
    public final long position() throws IOException {
        if (this.f64265) {
            throw new IOException("Closed");
        }
        return this.f64262;
    }

    @Override // l.InterfaceC2245
    /* JADX INFO: renamed from: ܺ */
    public final void mo7439() throws IOException {
        if (this.f64265) {
            throw new IOException("Closed");
        }
        Iterator it = ((LinkedHashMap) this.f64263).values().iterator();
        while (it.hasNext()) {
            ((InterfaceC2245) it.next()).mo7439();
        }
    }

    @Override // l.InterfaceC2245
    public final String getName() {
        return this.f64257;
    }

    @Override // l.InterfaceC2245
    /* JADX INFO: renamed from: ۡ */
    public final InterfaceC2245 mo7437() throws IOException {
        if (!this.f64260) {
            throw new IOException("Unsupported");
        }
        C19885 c19885 = new C19885(this.f64257, true, -1L, null, this.f64264);
        C4365 c4365 = c19885.f64266;
        c4365.clear();
        c4365.mo7542(c4365.size(), (InterfaceC2289) this.f64266);
        c19885.f64267 = this.f64267;
        return c19885;
    }

    @Override // l.InterfaceC2245
    public final boolean isClosed() {
        return this.f64265;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f64265) {
            return;
        }
        this.f64265 = true;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f64263;
        Iterator it = linkedHashMap.values().iterator();
        IOException iOException = null;
        while (it.hasNext()) {
            try {
                ((InterfaceC2245) it.next()).close();
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

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m45719(long j) {
        int i = this.f64258;
        C4365 c4365 = this.f64266;
        int size = c4365.size();
        if (i >= 0 && i < size) {
            long jM45724 = m45724(i);
            long jM45721 = m45721(i);
            if (jM45724 <= j && j < jM45721) {
                return i;
            }
            int i2 = i + 1;
            if (i2 < size) {
                long jM45725 = m45724(i2);
                long jM45722 = m45721(i2);
                if (jM45725 <= j && j < jM45722) {
                    this.f64258 = i2;
                    return i2;
                }
            }
        }
        for (int i3 = 0; i3 < size; i3++) {
            if (j < c4365.getLong(i3)) {
                this.f64258 = i3;
                return i3;
            }
        }
        int i4 = size - 1;
        this.f64258 = i4;
        return i4;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m45724(int i) {
        C4365 c4365 = this.f64266;
        if (i < 0 || i >= c4365.size()) {
            StringBuilder sbM32308 = C13325.m32308(i, "Fragment index out of bounds: index = ", ", size = ");
            sbM32308.append(c4365.size());
            throw new IndexOutOfBoundsException(sbM32308.toString());
        }
        if (i == 0) {
            return 0L;
        }
        return c4365.getLong(i - 1);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m45721(int i) {
        C4365 c4365 = this.f64266;
        if (i >= 0 && i < c4365.size()) {
            return c4365.getLong(i);
        }
        StringBuilder sbM32308 = C13325.m32308(i, "Fragment index out of bounds: index = ", ", size = ");
        sbM32308.append(c4365.size());
        throw new IndexOutOfBoundsException(sbM32308.toString());
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private InterfaceC2245 m45720(int i) throws IOException {
        Integer numValueOf = Integer.valueOf(i);
        Map map = this.f64263;
        InterfaceC2245 interfaceC2245 = (InterfaceC2245) ((LinkedHashMap) map).get(numValueOf);
        if (interfaceC2245 != null) {
            return interfaceC2245;
        }
        if (this.f64265) {
            throw new IOException("Closed");
        }
        InterfaceC2245 interfaceC2245Mo17661 = this.f64264.mo17661(i);
        if (interfaceC2245Mo17661 == null) {
            throw new IOException(C19370.m44628(i, "Failed to create fragment at index: "));
        }
        ((HashMap) map).put(Integer.valueOf(i), interfaceC2245Mo17661);
        IOException iOException = this.f64259;
        if (iOException == null) {
            return interfaceC2245Mo17661;
        }
        this.f64259 = null;
        throw iOException;
    }
}
