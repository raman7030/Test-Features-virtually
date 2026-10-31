package l;

import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.۬᩺ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: H6NE */
/* JADX INFO: loaded from: classes3.dex */
public final class C13429 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final Runnable f40129;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f40130;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final Supplier f40131;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public long f40132;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f40133;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C3532 f40134;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f40135;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final char[] f40136 = new char[256];

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C7744 f40137;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f40138;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public StringBuilder f40139;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f40140;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C6374 f40141;

    public C13429(C6374 c6374, C7744 c7744, Runnable runnable, Supplier supplier) {
        this.f40141 = c6374;
        this.f40137 = c7744;
        this.f40129 = runnable;
        this.f40131 = supplier;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32457(int i, int i2, CharSequence charSequence) {
        C6374 c6374 = this.f40141;
        if (c6374.f19722 == 0) {
            c6374.f19716 = i;
        }
        c6374.f19722++;
        c6374.f19715 = i2;
        c6374.f19720 = (((long) charSequence.length()) - ((long) (i2 - i))) + c6374.f19720;
        if (i == i2 && charSequence.length() == 0) {
            return;
        }
        this.f40133 = (((long) i2) - ((long) i)) + ((long) charSequence.length()) + this.f40133;
        if (!c6374.f19719 && c6374.f19722 <= 128 && this.f40133 <= 65536) {
            c6374.f19717.add(new C10608(i, i2, charSequence.toString()));
            return;
        }
        if (!c6374.f19719) {
            c6374.f19719 = true;
            ArrayList<C10608> arrayList = new ArrayList(c6374.f19717);
            c6374.f19717.clear();
            for (C10608 c10608 : arrayList) {
                m32459(c10608.f31869, c10608.f31865, c10608.f31868);
            }
        }
        m32459(i, i2, charSequence);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0052  */
    /* JADX WARN: Code duplicated, block: B:19:0x0057  */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m32459(int i, int i2, CharSequence charSequence) {
        StringBuilder sb;
        this.f40129.run();
        int i3 = this.f40139 == null ? 0 : i - this.f40140;
        long j = i2;
        long length = (j - ((long) i)) + ((long) charSequence.length());
        StringBuilder sb2 = this.f40139;
        if (sb2 != null) {
            if (i3 > 256 || j - ((long) this.f40138) > 65536) {
                sb = this.f40139;
                if (sb != null) {
                    m32458(new C10608(this.f40138, this.f40140, sb.toString()));
                    this.f40139 = null;
                }
            } else {
                long j2 = i3;
                if (((long) sb2.length()) + j2 + ((long) charSequence.length()) > 65536 || this.f40135 + j2 > (this.f40130 + length) * 4) {
                    sb = this.f40139;
                    if (sb != null) {
                        m32458(new C10608(this.f40138, this.f40140, sb.toString()));
                        this.f40139 = null;
                    }
                }
            }
        }
        if (this.f40139 == null) {
            if (i2 - i > 65536 || charSequence.length() > 65536) {
                m32458(new C10608(i, i2, charSequence.toString()));
                return;
            }
            this.f40139 = new StringBuilder();
            this.f40138 = i;
            this.f40140 = i;
            this.f40130 = 0L;
            this.f40135 = 0L;
        }
        int i4 = this.f40140;
        int i5 = i - i4;
        if (i5 != 0) {
            C7744 c7744 = this.f40137;
            char[] cArr = this.f40136;
            c7744.getChars(i4, i, cArr, 0);
            this.f40139.append(cArr, 0, i5);
        }
        this.f40139.append(charSequence);
        this.f40135 += (long) i5;
        this.f40130 += length;
        this.f40140 = i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32458(C10608 c10608) {
        long j = this.f40132;
        int i = c10608.f31866;
        long j2 = j + ((long) i);
        this.f40132 = j2;
        C3532 c3532 = this.f40134;
        C6374 c6374 = this.f40141;
        if (c3532 == null && j2 > 524288) {
            this.f40134 = (C3532) this.f40131.get();
            for (C10608 c10609 : c6374.f19717) {
                c10609.f31867 = this.f40134.length();
                m32456(this.f40134, c10609.f31868, 0, c10609.f31866);
                c10609.f31868 = null;
            }
        }
        C3532 c3533 = this.f40134;
        if (c3533 != null) {
            c10608.f31867 = c3533.length();
            m32456(this.f40134, c10608.f31868, 0, i);
            c10608.f31868 = null;
        }
        c6374.f19717.add(c10608);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m32456(C3532 c3532, CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            this.f40129.run();
            int iMin = Math.min(8192, i2 - i) + i;
            c3532.append(charSequence, i, iMin);
            i = iMin;
        }
    }

    public final void finish() {
        int i;
        long j;
        int i2;
        long j2;
        C10608 c10608;
        C7744 c7744 = this.f40137;
        long length = c7744.length();
        C6374 c6374 = this.f40141;
        long j3 = length + c6374.f19720;
        if (j3 < 0 || j3 > 2147483647L) {
            throw new IllegalArgumentException("Replacement result is too large");
        }
        StringBuilder sb = this.f40139;
        if (sb != null) {
            m32458(new C10608(this.f40138, this.f40140, sb.toString()));
            this.f40139 = null;
        }
        C3532 c3532 = this.f40134;
        if (c3532 != null) {
            c6374.f19718 = c3532.finish();
        }
        if (c6374.f19717.size() > 512) {
            Runnable runnable = this.f40129;
            runnable.run();
            ArrayList arrayList = c6374.f19717;
            int length2 = 0;
            long j4 = ((C10608) arrayList.get(0)).f31869;
            long jMax = Math.max(65536L, (((((long) ((C10608) C18566.m43105(arrayList, 1)).f31865) - j4) + this.f40132) + 511) / 512);
            ArrayList arrayList2 = new ArrayList(512);
            CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
            C3532 c3533 = (C3532) this.f40131.get();
            try {
                Iterator it = arrayList.iterator();
                long j5 = -1;
                long j6 = 0;
                int i3 = 0;
                int i4 = 0;
                while (it.hasNext()) {
                    C10608 c10609 = (C10608) it.next();
                    runnable.run();
                    int i5 = c10609.f31869;
                    Iterator it2 = it;
                    int i6 = c10609.f31866;
                    C6374 c6375 = c6374;
                    long j7 = ((((long) i5) - j4) + j6) / jMax;
                    if (j7 != j5) {
                        j = 0;
                        if (j5 >= 0) {
                            long j8 = jMax;
                            int i7 = i3;
                            j2 = j8;
                            arrayList2.add(new C10608(i7, i4, length2, c3533.length() - length2));
                        } else {
                            j2 = jMax;
                        }
                        length2 = c3533.length();
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
                        c7744.getChars(i, iMin, charBufferAllocate.array(), 0);
                        c3533.append((CharSequence) charBufferAllocate, 0, iMin - i);
                        i = iMin;
                        i5 = i5;
                    }
                    if (c6375.f19718 == null) {
                        c10608 = c10609;
                        m32456(c3533, c10608.f31868, 0, i6);
                    } else {
                        c10608 = c10609;
                        CharSequence charSequence = c6375.f19718;
                        int i8 = c10608.f31867;
                        m32456(c3533, charSequence, i8, i8 + i6);
                    }
                    j6 += (long) i6;
                    it = it2;
                    long j10 = j2;
                    i4 = c10608.f31865;
                    i3 = i2;
                    jMax = j10;
                    c6374 = c6375;
                }
                C6374 c6376 = c6374;
                arrayList2.add(new C10608(i3, i4, length2, c3533.length() - length2));
                runnable.run();
                C13409 c13409 = c6376.f19718;
                c6376.f19718 = c3533.finish();
                c6376.f19717 = arrayList2;
                if (c13409 != null) {
                    c13409.close();
                }
                c3533.close();
            } catch (Throwable th) {
                if (c3533 == null) {
                    throw th;
                }
                try {
                    c3533.close();
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
        C3532 c3532 = this.f40134;
        if (c3532 != null) {
            c3532.close();
        }
    }
}
