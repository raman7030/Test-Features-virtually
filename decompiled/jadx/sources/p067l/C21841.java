package p067l;

import com.google.android.material.motion.MotionUtils;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import net.p069sf.sevenzipjbinding.IInStream;
import net.p069sf.sevenzipjbinding.IOutStream;
import net.p069sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.᩶᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: RB61 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21841 implements IInStream, IOutStream {

    /* JADX INFO: renamed from: ۙ */
    public int f68726;

    /* JADX INFO: renamed from: ۤ */
    public int f68727;

    /* JADX INFO: renamed from: ۫ */
    public int f68728;

    /* JADX INFO: renamed from: ۬ */
    public final int f68729;

    /* JADX INFO: renamed from: ᩶ */
    public int f68730;

    /* JADX INFO: renamed from: ᩹ */
    public int f68732;

    /* JADX INFO: renamed from: ᩸ */
    public final ArrayList f68731 = new ArrayList();

    /* JADX INFO: renamed from: ۗ */
    public final int f68725 = 1024;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized byte[] m49266() {
        byte[] bArr;
        bArr = new byte[this.f68727];
        int i = 0;
        for (byte[] bArr2 : this.f68731) {
            int length = bArr2.length + i;
            int i2 = this.f68727;
            int length2 = length > i2 ? i2 - i : bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i, length2);
            i += length2;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ܽ */
    public final synchronized void m49267() {
        m49265();
    }

    @Override // net.p069sf.sevenzipjbinding.ISeekableStream
    public final synchronized long seek(long j, int i) {
        int i2;
        try {
            if (i != 0) {
                if (i == 1) {
                    i2 = this.f68728;
                    if (i2 == -1) {
                        i2 = this.f68730;
                    }
                } else if (i == 2) {
                    i2 = this.f68727;
                } else {
                    throw new SevenZipException("Seek: unknown origin: " + i);
                }
                j += (long) i2;
            }
            if (j > this.f68729) {
                throw new RuntimeException("Maximal size of the byte array stream was reached by seek to " + j + ", maximal size is " + this.f68729 + " bytes");
            }
            this.f68728 = (int) j;
        } catch (Throwable th) {
            throw th;
        }
        return j;
    }

    public C21841(int i) {
        if (i < 0) {
            throw new IllegalStateException("Maximal size of the byte array stream should be >0");
        }
        this.f68729 = i;
        m49265();
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m49265() {
        this.f68731.clear();
        this.f68730 = 0;
        this.f68726 = 0;
        this.f68732 = -1;
        this.f68727 = 0;
        this.f68728 = -1;
    }

    @Override // net.p069sf.sevenzipjbinding.ISequentialInStream
    public final int read(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        synchronized (this) {
            try {
                if (iRemaining < 0) {
                    throw new IllegalStateException("Invalid start position (0) and length (" + iRemaining + MotionUtils.EASING_TYPE_FORMAT_END);
                }
                if (this.f68728 <= this.f68727) {
                    m49264();
                    int i = this.f68730;
                    int i2 = i + iRemaining;
                    int i3 = this.f68727;
                    int i4 = i2 > i3 ? i3 - i : iRemaining;
                    int i5 = 0;
                    int i6 = i4;
                    while (i6 > 0) {
                        int length = ((byte[]) this.f68731.get(this.f68732)).length;
                        int i7 = length - this.f68726;
                        if (i6 <= i7) {
                            i7 = i6;
                        }
                        System.arraycopy(this.f68731.get(this.f68732), this.f68726, bArr, i5, i7);
                        i5 += i7;
                        int i8 = this.f68726 + i7;
                        this.f68726 = i8;
                        i6 -= i7;
                        if (i8 >= length && this.f68732 < this.f68731.size() - 1) {
                            int i9 = this.f68732 + 1;
                            this.f68732 = i9;
                            this.f68726 = 0;
                            int length2 = ((byte[]) this.f68731.get(i9)).length;
                        }
                    }
                    this.f68730 += i4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        byteBuffer.put(bArr);
        return iRemaining;
    }

    @Override // net.p069sf.sevenzipjbinding.IOutStream
    public final synchronized void setSize(long j) {
        m49263(j, false);
    }

    /* JADX INFO: renamed from: ֫ */
    private synchronized void m49263(long j, boolean z) {
        try {
            if (j == 0) {
                m49267();
                return;
            }
            if (j > this.f68729) {
                throw new RuntimeException("Maximal size of the byte array stream was reached by setSize(" + j + "). Maximal size is " + this.f68729 + " bytes");
            }
            int i = this.f68727;
            if (j > i) {
                if (i == 0) {
                    int i2 = (int) j;
                    this.f68731.add(new byte[i2]);
                    this.f68732 = 0;
                    this.f68727 = i2;
                }
                int i3 = (int) (j - ((long) this.f68727));
                int length = 0;
                for (int i4 = 0; i4 < this.f68731.size(); i4++) {
                    length += ((byte[]) this.f68731.get(i4)).length;
                }
                int i5 = this.f68727;
                int i6 = length - i5;
                if (i6 < i3) {
                    this.f68727 = i5 + i6;
                    int i7 = i3 - i6;
                    m49262(i7);
                    if (z) {
                        this.f68726 = i7;
                    }
                } else if (z) {
                    ArrayList arrayList = this.f68731;
                    this.f68726 = (((byte[]) arrayList.get(arrayList.size() - 1)).length - i6) + i3;
                }
                if (z) {
                    this.f68732 = this.f68731.size() - 1;
                    this.f68730 = (int) j;
                }
                this.f68727 = (int) j;
            }
            if (j < this.f68727) {
                int length2 = 0;
                for (int i8 = 0; i8 < this.f68731.size(); i8++) {
                    length2 += ((byte[]) this.f68731.get(i8)).length;
                    if (length2 >= j) {
                        int size = this.f68731.size();
                        while (true) {
                            size--;
                            if (size <= i8) {
                                break;
                            } else {
                                this.f68731.remove(size);
                            }
                        }
                        int i9 = this.f68728;
                        if (i9 != -1 && i9 > j) {
                            this.f68728 = (int) j;
                        } else if (this.f68730 > j) {
                            int i10 = (int) j;
                            this.f68730 = i10;
                            this.f68726 = (i10 - length2) + ((byte[]) this.f68731.get(i8)).length;
                            this.f68732 = i8;
                        }
                        this.f68727 = (int) j;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // net.p069sf.sevenzipjbinding.ISequentialOutStream
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
                m49264();
                int i = this.f68732;
                if (i == -1 || this.f68726 >= ((byte[]) this.f68731.get(i)).length) {
                    m49262(-1);
                }
                int i2 = 0;
                int i3 = iRemaining;
                do {
                    byte[] bArr2 = (byte[]) this.f68731.get(this.f68732);
                    int length = bArr2.length;
                    int i4 = this.f68726;
                    int i5 = length - i4;
                    if (i5 >= i3) {
                        i5 = i3;
                    }
                    System.arraycopy(bArr, i2, bArr2, i4, i5);
                    int i6 = this.f68726 + i5;
                    this.f68726 = i6;
                    this.f68730 += i5;
                    i2 += i5;
                    i3 -= i5;
                    if (i6 >= bArr2.length) {
                        this.f68726 = 0;
                        int i7 = this.f68732 + 1;
                        this.f68732 = i7;
                        if (i7 >= this.f68731.size()) {
                            m49262(-1);
                        }
                    }
                } while (i3 > 0);
                int i8 = this.f68730;
                if (i8 > this.f68727) {
                    this.f68727 = i8;
                }
                ArrayList arrayList = this.f68731;
                if (this.f68727 == i8 && this.f68726 == 0) {
                    int i9 = this.f68732;
                    if (i9 == 0) {
                        m49265();
                    } else {
                        this.f68732 = i9 - 1;
                        arrayList.remove(i9);
                        this.f68726 = ((byte[]) arrayList.get(this.f68732)).length;
                    }
                }
                return iRemaining;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ܳ */
    private void m49264() {
        int i = this.f68728;
        if (i == -1) {
            return;
        }
        if (this.f68730 == i) {
            this.f68728 = -1;
            return;
        }
        if (i > this.f68727) {
            m49263(i, true);
            this.f68728 = -1;
            return;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f68731;
            if (i2 < arrayList.size()) {
                int length = ((byte[]) arrayList.get(i2)).length;
                i3 += length;
                int i4 = this.f68728;
                if (i3 > i4) {
                    this.f68732 = i2;
                    this.f68726 = length - (i3 - i4);
                    this.f68730 = i4;
                    this.f68728 = -1;
                    return;
                }
                i2++;
            } else {
                int size = arrayList.size() - 1;
                this.f68732 = size;
                this.f68726 = ((byte[]) arrayList.get(size)).length;
                this.f68730 = this.f68727;
                this.f68728 = -1;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m49262(int i) {
        int i2 = this.f68732;
        ArrayList arrayList = this.f68731;
        if (i2 == -1 || (i2 == arrayList.size() - 1 && ((byte[]) arrayList.get(this.f68732)).length == this.f68726)) {
            this.f68726 = 0;
            this.f68732++;
        }
        int i3 = this.f68727;
        int i4 = this.f68729;
        if (i3 >= i4) {
            throw new RuntimeException(C19768.m44906(i4, "Maximal size of the byte array stream was reached. (Max size = ", MotionUtils.EASING_TYPE_FORMAT_END));
        }
        int size = arrayList.size() - 1;
        int length = size == -1 ? this.f68725 : ((byte[]) arrayList.get(size)).length << 1;
        if (length < 0 || length > 1048576) {
            length = 1048576;
        }
        int i5 = this.f68727;
        if (i5 + length > i4) {
            length = i4 - i5;
        }
        if (i == -1 || length >= i) {
            i = length;
        } else if (i5 + i >= i4) {
            throw new RuntimeException(C19768.m44906(i4, "Maximal size of the byte array stream was reached. (Max size = ", MotionUtils.EASING_TYPE_FORMAT_END));
        }
        arrayList.add(new byte[i]);
    }
}
