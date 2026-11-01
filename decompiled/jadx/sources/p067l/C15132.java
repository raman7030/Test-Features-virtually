package p067l;

import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.۬᩺ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: H6NE */
/* JADX INFO: loaded from: classes3.dex */
public final class C15132 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ */
    public final Runnable f43198;

    /* JADX INFO: renamed from: ۙ */
    public long f43199;

    /* JADX INFO: renamed from: ۛ */
    public final Supplier f43200;

    /* JADX INFO: renamed from: ۟ */
    public long f43201;

    /* JADX INFO: renamed from: ۤ */
    public long f43202;

    /* JADX INFO: renamed from: ۨ */
    public C5726 f43203;

    /* JADX INFO: renamed from: ۫ */
    public long f43204;

    /* JADX INFO: renamed from: ۬ */
    public final char[] f43205 = new char[256];

    /* JADX INFO: renamed from: ܰ */
    public final C9729 f43206;

    /* JADX INFO: renamed from: ᩶ */
    public int f43207;

    /* JADX INFO: renamed from: ᩸ */
    public StringBuilder f43208;

    /* JADX INFO: renamed from: ᩹ */
    public int f43209;

    /* JADX INFO: renamed from: ᩺ */
    public final C8427 f43210;

    public C15132(C8427 c8427, C9729 c9729, Runnable runnable, Supplier supplier) {
        this.f43210 = c8427;
        this.f43206 = c9729;
        this.f43198 = runnable;
        this.f43200 = supplier;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34559(int i, int i2, CharSequence charSequence) {
        C8427 c8427 = this.f43210;
        if (c8427.f22595 == 0) {
            c8427.f22589 = i;
        }
        c8427.f22595++;
        c8427.f22588 = i2;
        c8427.f22593 = (((long) charSequence.length()) - ((long) (i2 - i))) + c8427.f22593;
        if (i == i2 && charSequence.length() == 0) {
            return;
        }
        this.f43202 = (((long) i2) - ((long) i)) + ((long) charSequence.length()) + this.f43202;
        if (!c8427.f22592 && c8427.f22595 <= 128 && this.f43202 <= 65536) {
            c8427.f22590.add(new C12451(i, i2, charSequence.toString()));
            return;
        }
        if (!c8427.f22592) {
            c8427.f22592 = true;
            ArrayList<C12451> arrayList = new ArrayList(c8427.f22590);
            c8427.f22590.clear();
            for (C12451 c12451 : arrayList) {
                m34561(c12451.f34840, c12451.f34836, c12451.f34839);
            }
        }
        m34561(i, i2, charSequence);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0052  */
    /* JADX WARN: Code duplicated, block: B:19:0x0057  */
    /* JADX INFO: renamed from: ۧ */
    public final void m34561(int i, int i2, CharSequence charSequence) {
        StringBuilder sb;
        this.f43198.run();
        int i3 = this.f43208 == null ? 0 : i - this.f43209;
        long j = i2;
        long length = (j - ((long) i)) + ((long) charSequence.length());
        StringBuilder sb2 = this.f43208;
        if (sb2 != null) {
            if (i3 > 256 || j - ((long) this.f43207) > 65536) {
                sb = this.f43208;
                if (sb != null) {
                    m34560(new C12451(this.f43207, this.f43209, sb.toString()));
                    this.f43208 = null;
                }
            } else {
                long j2 = i3;
                if (((long) sb2.length()) + j2 + ((long) charSequence.length()) > 65536 || this.f43204 + j2 > (this.f43199 + length) * 4) {
                    sb = this.f43208;
                    if (sb != null) {
                        m34560(new C12451(this.f43207, this.f43209, sb.toString()));
                        this.f43208 = null;
                    }
                }
            }
        }
        if (this.f43208 == null) {
            if (i2 - i > 65536 || charSequence.length() > 65536) {
                m34560(new C12451(i, i2, charSequence.toString()));
                return;
            }
            this.f43208 = new StringBuilder();
            this.f43207 = i;
            this.f43209 = i;
            this.f43199 = 0L;
            this.f43204 = 0L;
        }
        int i4 = this.f43209;
        int i5 = i - i4;
        if (i5 != 0) {
            C9729 c9729 = this.f43206;
            char[] cArr = this.f43205;
            c9729.getChars(i4, i, cArr, 0);
            this.f43208.append(cArr, 0, i5);
        }
        this.f43208.append(charSequence);
        this.f43204 += (long) i5;
        this.f43199 += length;
        this.f43209 = i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34560(C12451 c12451) {
        long j = this.f43201;
        int i = c12451.f34837;
        long j2 = j + ((long) i);
        this.f43201 = j2;
        C5726 c5726 = this.f43203;
        C8427 c8427 = this.f43210;
        if (c5726 == null && j2 > 524288) {
            this.f43203 = (C5726) this.f43200.get();
            for (C12451 c12452 : c8427.f22590) {
                c12452.f34838 = this.f43203.length();
                m34558(this.f43203, c12452.f34839, 0, c12452.f34837);
                c12452.f34839 = null;
            }
        }
        C5726 c5727 = this.f43203;
        if (c5727 != null) {
            c12451.f34838 = c5727.length();
            m34558(this.f43203, c12451.f34839, 0, i);
            c12451.f34839 = null;
        }
        c8427.f22590.add(c12451);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m34558(C5726 c5726, CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            this.f43198.run();
            int iMin = Math.min(8192, i2 - i) + i;
            c5726.append(charSequence, i, iMin);
            i = iMin;
        }
    }

    public final void finish() {
        int i;
        long j;
        int i2;
        long j2;
        C12451 c12451;
        C9729 c9729 = this.f43206;
        long length = c9729.length();
        C8427 c8427 = this.f43210;
        long j3 = length + c8427.f22593;
        if (j3 < 0 || j3 > 2147483647L) {
            throw new IllegalArgumentException("Replacement result is too large");
        }
        StringBuilder sb = this.f43208;
        if (sb != null) {
            m34560(new C12451(this.f43207, this.f43209, sb.toString()));
            this.f43208 = null;
        }
        C5726 c5726 = this.f43203;
        if (c5726 != null) {
            c8427.f22591 = c5726.finish();
        }
        if (c8427.f22590.size() > 512) {
            Runnable runnable = this.f43198;
            runnable.run();
            ArrayList arrayList = c8427.f22590;
            int length2 = 0;
            long j4 = ((C12451) arrayList.get(0)).f34840;
            long jMax = Math.max(65536L, (((((long) ((C12451) C20013.m45383(arrayList, 1)).f34836) - j4) + this.f43201) + 511) / 512);
            ArrayList arrayList2 = new ArrayList(512);
            CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
            C5726 c5727 = (C5726) this.f43200.get();
            try {
                Iterator it = arrayList.iterator();
                long j5 = -1;
                long j6 = 0;
                int i3 = 0;
                int i4 = 0;
                while (it.hasNext()) {
                    C12451 c12452 = (C12451) it.next();
                    runnable.run();
                    int i5 = c12452.f34840;
                    Iterator it2 = it;
                    int i6 = c12452.f34837;
                    C8427 c8428 = c8427;
                    long j7 = ((((long) i5) - j4) + j6) / jMax;
                    if (j7 != j5) {
                        j = 0;
                        if (j5 >= 0) {
                            long j8 = jMax;
                            int i7 = i3;
                            j2 = j8;
                            arrayList2.add(new C12451(i7, i4, length2, c5727.length() - length2));
                        } else {
                            j2 = jMax;
                        }
                        length2 = c5727.length();
                        i = i5;
                        i2 = i;
                        j5 = j7;
                    } else {
                        i = i4;
                        j = 0;
                        long j9 = jMax;
                        i2 = i3;
                        j2 = j9;
                    }
                    while (i < i5) {
                        runnable.run();
                        int iMin = Math.min(charBufferAllocate.capacity(), i5 - i) + i;
                        c9729.getChars(i, iMin, charBufferAllocate.array(), 0);
                        c5727.append((CharSequence) charBufferAllocate, 0, iMin - i);
                        i = iMin;
                        i5 = i5;
                    }
                    if (c8428.f22591 == null) {
                        c12451 = c12452;
                        m34558(c5727, c12451.f34839, 0, i6);
                    } else {
                        c12451 = c12452;
                        CharSequence charSequence = c8428.f22591;
                        int i8 = c12451.f34838;
                        m34558(c5727, charSequence, i8, i8 + i6);
                    }
                    j6 += (long) i6;
                    it = it2;
                    long j10 = j2;
                    i4 = c12451.f34836;
                    i3 = i2;
                    jMax = j10;
                    c8427 = c8428;
                }
                C8427 c8429 = c8427;
                arrayList2.add(new C12451(i3, i4, length2, c5727.length() - length2));
                runnable.run();
                C15113 c15113 = c8429.f22591;
                c8429.f22591 = c5727.finish();
                c8429.f22590 = arrayList2;
                if (c15113 != null) {
                    c15113.close();
                }
                c5727.close();
            } catch (Throwable th) {
                if (c5727 == null) {
                    throw th;
                }
                try {
                    c5727.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C5726 c5726 = this.f43203;
        if (c5726 != null) {
            c5726.close();
        }
    }
}
