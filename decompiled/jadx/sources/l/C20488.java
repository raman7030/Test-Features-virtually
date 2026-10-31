package l;

import com.google.android.material.motion.MotionUtils;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import net.sf.sevenzipjbinding.IInStream;
import net.sf.sevenzipjbinding.IOutStream;
import net.sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.᩶᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: RB61 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20488 implements IInStream, IOutStream {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f66047;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f66048;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f66049;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f66050;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f66051;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f66053;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f66052 = new ArrayList();

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f66046 = 1024;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized byte[] m46943() {
        byte[] bArr;
        bArr = new byte[this.f66048];
        int i = 0;
        for (byte[] bArr2 : this.f66052) {
            int length = bArr2.length + i;
            int i2 = this.f66048;
            int length2 = length > i2 ? i2 - i : bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i, length2);
            i += length2;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized void m46944() {
        m46942();
    }

    @Override // net.sf.sevenzipjbinding.ISeekableStream
    public final synchronized long seek(long j, int i) {
        int i2;
        try {
            if (i != 0) {
                if (i == 1) {
                    i2 = this.f66049;
                    if (i2 == -1) {
                        i2 = this.f66051;
                    }
                } else if (i == 2) {
                    i2 = this.f66048;
                } else {
                    throw new SevenZipException("Seek: unknown origin: " + i);
                }
                j += (long) i2;
            }
            if (j > this.f66050) {
                throw new RuntimeException("Maximal size of the byte array stream was reached by seek to " + j + ", maximal size is " + this.f66050 + " bytes");
            }
            this.f66049 = (int) j;
        } catch (Throwable th) {
            throw th;
        }
        return j;
    }

    public C20488(int i) {
        if (i < 0) {
            throw new IllegalStateException("Maximal size of the byte array stream should be >0");
        }
        this.f66050 = i;
        m46942();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m46942() {
        this.f66052.clear();
        this.f66051 = 0;
        this.f66047 = 0;
        this.f66053 = -1;
        this.f66048 = 0;
        this.f66049 = -1;
    }

    @Override // net.sf.sevenzipjbinding.ISequentialInStream
    public final int read(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        synchronized (this) {
            try {
                if (iRemaining < 0) {
                    throw new IllegalStateException("Invalid start position (0) and length (" + iRemaining + MotionUtils.EASING_TYPE_FORMAT_END);
                }
                if (this.f66049 <= this.f66048) {
                    m46941();
                    int i = this.f66051;
                    int i2 = i + iRemaining;
                    int i3 = this.f66048;
                    int i4 = i2 > i3 ? i3 - i : iRemaining;
                    int i5 = 0;
                    int i6 = i4;
                    while (i6 > 0) {
                        int length = ((byte[]) this.f66052.get(this.f66053)).length;
                        int i7 = length - this.f66047;
                        if (i6 <= i7) {
                            i7 = i6;
                        }
                        System.arraycopy(this.f66052.get(this.f66053), this.f66047, bArr, i5, i7);
                        i5 += i7;
                        int i8 = this.f66047 + i7;
                        this.f66047 = i8;
                        i6 -= i7;
                        if (i8 >= length && this.f66053 < this.f66052.size() - 1) {
                            int i9 = this.f66053 + 1;
                            this.f66053 = i9;
                            this.f66047 = 0;
                            int length2 = ((byte[]) this.f66052.get(i9)).length;
                        }
                    }
                    this.f66051 += i4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        byteBuffer.put(bArr);
        return iRemaining;
    }

    @Override // net.sf.sevenzipjbinding.IOutStream
    public final synchronized void setSize(long j) {
        m46940(j, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private synchronized void m46940(long j, boolean z) {
        try {
            if (j == 0) {
                m46944();
                return;
            }
            if (j > this.f66050) {
                throw new RuntimeException("Maximal size of the byte array stream was reached by setSize(" + j + "). Maximal size is " + this.f66050 + " bytes");
            }
            int i = this.f66048;
            if (j > i) {
                if (i == 0) {
                    int i2 = (int) j;
                    this.f66052.add(new byte[i2]);
                    this.f66053 = 0;
                    this.f66048 = i2;
                }
                int i3 = (int) (j - ((long) this.f66048));
                int length = 0;
                for (int i4 = 0; i4 < this.f66052.size(); i4++) {
                    length += ((byte[]) this.f66052.get(i4)).length;
                }
                int i5 = this.f66048;
                int i6 = length - i5;
                if (i6 < i3) {
                    this.f66048 = i5 + i6;
                    int i7 = i3 - i6;
                    m46939(i7);
                    if (z) {
                        this.f66047 = i7;
                    }
                } else if (z) {
                    ArrayList arrayList = this.f66052;
                    this.f66047 = (((byte[]) arrayList.get(arrayList.size() - 1)).length - i6) + i3;
                }
                if (z) {
                    this.f66053 = this.f66052.size() - 1;
                    this.f66051 = (int) j;
                }
                this.f66048 = (int) j;
            }
            if (j < this.f66048) {
                int length2 = 0;
                for (int i8 = 0; i8 < this.f66052.size(); i8++) {
                    length2 += ((byte[]) this.f66052.get(i8)).length;
                    if (length2 >= j) {
                        int size = this.f66052.size();
                        while (true) {
                            size--;
                            if (size <= i8) {
                                break;
                            } else {
                                this.f66052.remove(size);
                            }
                        }
                        int i9 = this.f66049;
                        if (i9 != -1 && i9 > j) {
                            this.f66049 = (int) j;
                        } else if (this.f66051 > j) {
                            int i10 = (int) j;
                            this.f66051 = i10;
                            this.f66047 = (i10 - length2) + ((byte[]) this.f66052.get(i8)).length;
                            this.f66053 = i8;
                        }
                        this.f66048 = (int) j;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // net.sf.sevenzipjbinding.ISequentialOutStream
    public final int write(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.get(bArr);
        synchronized (this) {
            try {
                if (iRemaining < 0) {
                    throw new IllegalStateException("Invalid start position (0) and length (" + iRemaining + MotionUtils.EASING_TYPE_FORMAT_END);
                }
                if (iRemaining == 0) {
                    return 0;
                }
                m46941();
                int i = this.f66053;
                if (i == -1 || this.f66047 >= ((byte[]) this.f66052.get(i)).length) {
                    m46939(-1);
                }
                int i2 = 0;
                int i3 = iRemaining;
                do {
                    byte[] bArr2 = (byte[]) this.f66052.get(this.f66053);
                    int length = bArr2.length;
                    int i4 = this.f66047;
                    int i5 = length - i4;
                    if (i5 >= i3) {
                        i5 = i3;
                    }
                    System.arraycopy(bArr, i2, bArr2, i4, i5);
                    int i6 = this.f66047 + i5;
                    this.f66047 = i6;
                    this.f66051 += i5;
                    i2 += i5;
                    i3 -= i5;
                    if (i6 >= bArr2.length) {
                        this.f66047 = 0;
                        int i7 = this.f66053 + 1;
                        this.f66053 = i7;
                        if (i7 >= this.f66052.size()) {
                            m46939(-1);
                        }
                    }
                } while (i3 > 0);
                int i8 = this.f66051;
                if (i8 > this.f66048) {
                    this.f66048 = i8;
                }
                ArrayList arrayList = this.f66052;
                if (this.f66048 == i8 && this.f66047 == 0) {
                    int i9 = this.f66053;
                    if (i9 == 0) {
                        m46942();
                    } else {
                        this.f66053 = i9 - 1;
                        arrayList.remove(i9);
                        this.f66047 = ((byte[]) arrayList.get(this.f66053)).length;
                    }
                }
                return iRemaining;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m46941() {
        int i = this.f66049;
        if (i == -1) {
            return;
        }
        if (this.f66051 == i) {
            this.f66049 = -1;
            return;
        }
        if (i > this.f66048) {
            m46940(i, true);
            this.f66049 = -1;
            return;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f66052;
            if (i2 < arrayList.size()) {
                int length = ((byte[]) arrayList.get(i2)).length;
                i3 += length;
                int i4 = this.f66049;
                if (i3 > i4) {
                    this.f66053 = i2;
                    this.f66047 = length - (i3 - i4);
                    this.f66051 = i4;
                    this.f66049 = -1;
                    return;
                }
                i2++;
            } else {
                int size = arrayList.size() - 1;
                this.f66053 = size;
                this.f66047 = ((byte[]) arrayList.get(size)).length;
                this.f66051 = this.f66048;
                this.f66049 = -1;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m46939(int i) {
        int i2 = this.f66053;
        ArrayList arrayList = this.f66052;
        if (i2 == -1 || (i2 == arrayList.size() - 1 && ((byte[]) arrayList.get(this.f66053)).length == this.f66047)) {
            this.f66047 = 0;
            this.f66053++;
        }
        int i3 = this.f66048;
        int i4 = this.f66050;
        if (i3 >= i4) {
            throw new RuntimeException(C18307.m42645(i4, "Maximal size of the byte array stream was reached. (Max size = ", MotionUtils.EASING_TYPE_FORMAT_END));
        }
        int size = arrayList.size() - 1;
        int length = size == -1 ? this.f66046 : ((byte[]) arrayList.get(size)).length << 1;
        if (length < 0 || length > 1048576) {
            length = 1048576;
        }
        int i5 = this.f66048;
        if (i5 + length > i4) {
            length = i4 - i5;
        }
        if (i == -1 || length >= i) {
            i = length;
        } else if (i5 + i >= i4) {
            throw new RuntimeException(C18307.m42645(i4, "Maximal size of the byte array stream was reached. (Max size = ", MotionUtils.EASING_TYPE_FORMAT_END));
        }
        arrayList.add(new byte[i]);
    }
}
